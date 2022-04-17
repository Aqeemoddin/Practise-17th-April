package com.API1.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API1.dao.BookDao;
import com.API1.entity1.BookEntity;

@RestController
public class BookControler {

	@Autowired
	private BookDao bookDao;
	
	int x=10;
	
	
	
	//bug 101
	String j1="Jobn1";
	
	
	
	// changes for bug 121
	String job="DM"; 
	
	@GetMapping("/allbooks")
	public List<BookEntity> getBooks()
	{
		return bookDao.allBooks();
		
		
	}
	
	@GetMapping("/allbooks/{id}")
	public BookEntity singleBook(@PathVariable("id") int id)
	{
		
		return bookDao.singleBook(id);
	}
	
	@PostMapping("/allbooks")
	public BookEntity addBooks(@RequestBody BookEntity b )
	{
		b = bookDao.addBooks(b);
		
		return b; 
	}
	
	@RequestMapping("/")
	public String view2()
	{
		//bug 101
		String n1="Java";
		return "java";
	}
	//121 bug
	@RequestMapping("/")
	public String view22()
	{
		
		return "net";
	}
	
	
	
	
	
	
	
}
