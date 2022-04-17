package com.API1.entity1;

public class BookEntity {
	
	private int book_id;
	private String book_name;
	private String book_author;
	


	public BookEntity(int book_id, String book_name, String book_author) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_author = book_author;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "BookEntity [book_id=" + book_id + ", book_name=" + book_name + ", book_author=" + book_author + "]";
	}
	
	
	

}
