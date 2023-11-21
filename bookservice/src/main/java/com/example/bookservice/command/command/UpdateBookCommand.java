package com.example.bookservice.command.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class UpdateBookCommand {
	@TargetAggregateIdentifier
	private String bookId;
	private String name;
	private String author;
	private Boolean isReady;
	private String imageUrl;

	private Integer price;

	
	
	public UpdateBookCommand(String bookId, String name, String author, Boolean isReady, String imageUrl, Integer price) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.isReady = isReady;
		this.imageUrl = imageUrl;
		this.price = price;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Boolean getIsReady() {
		return isReady;
	}
	public void setIsReady(Boolean isReady) {
		this.isReady = isReady;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
