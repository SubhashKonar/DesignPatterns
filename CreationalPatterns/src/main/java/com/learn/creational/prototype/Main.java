package com.learn.creational.prototype;

import java.util.Arrays;

public class Main 
{
    public static void main( String[] args )
    {
       BookStore bs=new BookStore();
       bs.setStorename("BookStore1");
       bs.loadBooks();
       System.out.println(Arrays.asList(bs.getBooklist()));
      BookStore newBS=bs.clone();
      System.out.println(Arrays.asList(newBS.getBooklist()));
    }
}
