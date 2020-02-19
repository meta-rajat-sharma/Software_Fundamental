package com.metacube.assignmentREST;

public class Store 
{
//	public Store(int bookID, String title, String writer, String publisher, int publishedYear) {
////		super();
//		this.bookID = bookID;
//		this.title = title;
//		this.writer = writer;
//		this.publisher = publisher;
//		this.publishedYear = publishedYear;
//	}
	private int bookID;
	private String title;
	private String writer;
	private String publisher;
	private int publishedYear;
	
	
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
}
