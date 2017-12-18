package com.asiainfo.test.entity;

import java.util.Date;

/** 
 * 项目名称：TestSSM
 * 文件名称：Appointment.java 
 * @author LM
 * @date 2017年12月18日 下午3:40:24 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class Appointment {
	private long bookId;
	private long studentId;
	private Date appointTime;
	
	private Book book;

	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public Date getAppointTime() {
		return appointTime;
	}
	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	@Override
	public String toString() {
		return "Appointment [bookId=" + bookId + ", studentId=" + studentId + ", appointTime=" + appointTime + ", book="
				+ book + "]";
	}	
}
