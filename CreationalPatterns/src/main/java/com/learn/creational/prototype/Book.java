package com.learn.creational.prototype;

public class Book {
	
	private String bookName;
	private String bookCode;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookCode=" + bookCode + "]";
	}
}
