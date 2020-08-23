package com.learn.creational.builder;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;

public class HttpConnectTest {
	public static void main(String args[]) throws ClientProtocolException, IOException
	{
		HttpClient http=new HttpConnectBuilder(false)
		            .setProxy("IP", Integer.parseInt("PORT"))
		            .setProxyAuthNTLM("User", "Pass", "", "")
		            .allowAllHost("TLSv1.2")
		            .build();
		org.apache.http.HttpResponse response = http.execute(null);
        
		 
	}

}
