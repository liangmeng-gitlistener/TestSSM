package com.asiainfo.test.dao;

import java.util.List;

import com.asiainfo.test.entity.Book;
import org.apache.ibatis.annotations.Param;
/** 
 * 项目名称：TestSSM
 * 文件名称：BookDAO.java 
 * @author LM
 * @date 2017年12月18日 下午3:46:56 
 * @version 1.0 
 * @since JDK 1.8.0_91
 * 方法有两个或以上的参数，一定要加@Param，不然mybatis识别不了。
 * BookDao接口的queryById方法和reduceNumber方法只有一个参数book_id，所以可以不用加 @Param注解(也可加)
 */
public interface BookDAO {
	/**
	 * @Title: queryById 
	 * @Description: TODO(通过ID查询单本图书)
	 * @param id
	 * @return
	 */
	public Book queryById(long id);
	/**
	 * @Title: queryAll 
	 * @Description: TODO(查询所有图书) 
	 * @param offset
	 * @param limit
	 * @return
	 */
	public List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	/**
	 * @Title: reduceNumber 
	 * @Description: TODO(减少馆藏数量) 
	 * @param bookId
	 * @return 如果影响行数等于>1，表示更新的记录行数
	 */
	public int reduceNumber(long bookId);
}