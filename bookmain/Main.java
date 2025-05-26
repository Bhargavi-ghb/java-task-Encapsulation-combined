package com.bookmain;

import com.book.Book;

import com.publisher.Publisher;

public class Main {

	public static void main(String[] args) {
		
		Publisher publisherObject=Publisher.getPublisherObject("BOOKPublisher","hyd","PUB789ui");
		
		Book bookObject=Book.getBookObject("story", "ram",publisherObject, 100);
		
		System.out.println(bookObject);
		if( publisherObject==null) {
			System.out.println("invalid book details/publisher details");
		}
	}
	
}
