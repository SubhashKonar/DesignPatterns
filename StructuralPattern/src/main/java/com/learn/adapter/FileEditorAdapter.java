package com.learn.adapter;

public class FileEditorAdapter implements FileEditor {

	AdvanceEditor aeditor;
	
	FileEditorAdapter(String filetype)
	{
		if("xls".equalsIgnoreCase(filetype))
		{
			aeditor=new AdvanceXLSImpl();
		}
		else
		{
			aeditor=new AdvanceODocImpl();
		}
	}
	public void edit(String fileName, String fileType) {

		if("xls".equalsIgnoreCase(fileType))
		{
			aeditor.editXLS(fileName);
		}
		else
		{
			aeditor.editOtherFile(fileName, fileType);
		}
	}

}
