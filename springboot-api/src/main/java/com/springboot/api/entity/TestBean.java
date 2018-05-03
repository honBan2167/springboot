package com.springboot.api.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:book.properties")
public class TestBean {
	
	@Value("${book.author}")
	private String name;
	@Value("${book.name}")
    private String author;
	@Value("${book.pinyin}")
    private String price;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
    
}
