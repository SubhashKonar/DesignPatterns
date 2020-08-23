package com.learn.adapter;

public class FileEditorIml implements FileEditor {
	 
	FileEditorAdapter adaptor;
	public void edit(String fileName, String fileType) {
		// TODO Auto-generated method stub
		if("txt".equalsIgnoreCase(fileType)  || "doc".equalsIgnoreCase(fileType))
		{
			System.out.println("Editing "+fileName+" document of type"+fileType );
		}
		else
		{
			adaptor=new FileEditorAdapter(fileType);
			adaptor.edit(fileName, fileType);
		}
			
	}

}
