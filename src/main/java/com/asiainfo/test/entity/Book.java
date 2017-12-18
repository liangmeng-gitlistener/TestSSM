package com.asiainfo.test.entity;
/** 
 * 项目名称：TestSSM
 * 文件名称：Book.java 
 * @author LM
 * @date 2017年12月18日 下午3:36:35 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class Book {
	private long bookId;
	private String name;
	private int number;
	
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", number=" + number + "]";
	}	
}
