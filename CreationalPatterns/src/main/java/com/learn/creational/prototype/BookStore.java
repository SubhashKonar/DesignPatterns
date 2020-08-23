package com.learn.creational.prototype;


import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable{
	private String storename;
	private List<Book> booklist=new ArrayList<Book>();
	
	public List<Book> getBooklist() {
		return booklist;
	}
	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	
	public void loadBooks()
	{
		for(int i=0;i<10;i++)
		{
			Book b=new Book();
		b.setBookCode(String.valueOf(i));
		b.setBookName(String.valueOf(i));
		getBooklist().add(b);
		
		}
	}
	
	public BookStore clone()
	{
		BookStore bs=new BookStore();
		for(Book b:getBooklist())
		{
			bs.getBooklist().add(b);
		}
		return bs;
		
	}
}
