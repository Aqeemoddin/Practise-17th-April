package com.API1.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.API1.entity1.BookEntity;

@Component
public class BookDao {

	private static List<BookEntity> list=new ArrayList<BookEntity>();
	
	
	 static{
		
		list.add(new BookEntity( 1002,"Java Spring Configration","Quazi Aqeemoddin"));
		list.add(new BookEntity( 1003,"Java Spring Boot Configration","Javed Ali"));
		list.add(new BookEntity( 1004,"Java MicroServices  Configration","Sayeed Anwar"));
		
		}
	 
	 public List<BookEntity> allBooks()
	 {
		 
		 return list;
	 }
	
	 // get the single value from the list.
	 public BookEntity singleBook(int id)
	 {
		 BookEntity be=null;
		 
		 be=list.stream().filter(e->e.getBook_id()==id).findFirst().get();
		 return be;
	 }

	public BookEntity addBooks(BookEntity b) {
		list.add(b);
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("*****************************Loop Out***************************************** ");
		return b;
	}
	 
	
}
