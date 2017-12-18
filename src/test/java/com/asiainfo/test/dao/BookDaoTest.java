package com.asiainfo.test.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.asiainfo.test.BaseTest;
import com.asiainfo.test.entity.Book;

/** 
 * 项目名称：TestSSM
 * 文件名称：BookDaoTest.java 
 * @author LM
 * @date 2017年12月18日 下午5:14:59 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public class BookDaoTest extends BaseTest{

	@Autowired
	private BookDAO bookDao;
	
	@Test
	public void testQueryById() throws Exception {
		long bookId = 1000;
		Book book = bookDao.queryById(bookId);
		System.out.println(book);
	}

	@Test
	public void testQueryAll() throws Exception {
		List<Book> books = bookDao.queryAll(0, 4);
		for (Book book : books) {
			System.out.println(book);
		}
	}

	@Test
	public void testReduceNumber() throws Exception {
		long bookId = 1000;
		int update = bookDao.reduceNumber(bookId);
		System.out.println("update=" + update);
	}
}
