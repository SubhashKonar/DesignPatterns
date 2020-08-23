package com.learn.creational.builder;




import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;


public class HttpConnectBuilder {
	
	private boolean isProxy;
	private boolean isProxyAuth;
	private boolean isAllowAllHost;
	
	private HttpHost proxy;
	private AuthScope proxyAuthScope;
	private Credentials credentials;
	private String sslVersion;

	public HttpConnectBuilder() {
		
	}
	
	public HttpConnectBuilder(boolean logging) {
		if(logging) {
			System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
	        System.setProperty("org.apache.commons.logging.simplelog.showdatetime", "true");
	        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http", "DEBUG");
	        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.http.wire", "ERROR");
		}
	}
	
	public HttpConnectBuilder setProxy(String host, int port) {
		proxy = new HttpHost(host, port, "http");
		this.isProxy = true;
		return this;
	}
	
	public HttpConnectBuilder setProxyAuthBasic(String username, String password) {
		if(username == null || username.isEmpty()) {
			return this;
		}
		this.proxyAuthScope = new AuthScope(proxy.getHostName(), proxy.getPort());
		this.credentials =  new UsernamePasswordCredentials(username, password);
		this.isProxyAuth = true;
		return this;
	}
	
	public HttpConnectBuilder setProxyAuthNTLM(String username, String password, String workstation, String domain) {
		if(username == null || username.isEmpty()) {
			return this;
		}
		this.proxyAuthScope = new AuthScope(proxy.getHostName(), proxy.getPort());
		this.credentials =  new NTCredentials(username, password, workstation, domain);
		this.isProxyAuth = true;
		return this;
	}
	
	public HttpConnectBuilder allowAllHost(String sslVersion) {
		this.sslVersion = sslVersion;
		this.isAllowAllHost = true;
		return this;
	}
	
	public SSLContext getInsecureSSLFactory() throws KeyManagementException, NoSuchAlgorithmException {
		SSLContext sslContext = SSLContext.getInstance(sslVersion);
		try {
			sslContext.init(null, new TrustManager[] { new X509TrustManager() {
		            public X509Certificate[] getAcceptedIssuers() {
		                    return null;
		            }
		
		            public void checkClientTrusted(X509Certificate[] certs,
		                            String authType) {
		            }
		
		            public void checkServerTrusted(X509Certificate[] certs,
		                            String authType) {
		            }
			} }, new SecureRandom());
		} catch(Exception e) {
			e.printStackTrace();
		}
        return sslContext;
	}
	
	public HttpClient build() {
		HttpClientBuilder clientBuilder = HttpClients.custom();
		
		if(isProxyAuth) {
			CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
			credentialsProvider.setCredentials(proxyAuthScope, credentials);
			clientBuilder.setDefaultCredentialsProvider(credentialsProvider);
		}
		if(isProxy) {
			RequestConfig config = RequestConfig.custom().setProxy(this.proxy).build();
			clientBuilder.setDefaultRequestConfig(config);
		}
		if(isAllowAllHost) {
			
			try {
				clientBuilder.setSslcontext(getInsecureSSLFactory());
				} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (KeyManagementException e) {
				e.printStackTrace();
			}
		}
		
		return clientBuilder.build();
	}

}
