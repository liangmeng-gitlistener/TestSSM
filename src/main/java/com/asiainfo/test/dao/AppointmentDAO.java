package com.asiainfo.test.dao;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.test.entity.Appointment;

/** 
 * 项目名称：TestSSM
 * 文件名称：AppointmentDAO.java 
 * @author LM
 * @date 2017年12月18日 下午4:25:10 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
public interface AppointmentDAO {
	/**
	 * @Title: insertAppointment 
	 * @Description: TODO(插入预约图书记录) 
	 * @param bookId
	 * @param studentId
	 * @return 插入的行数
	 */
	public int insertAppointment(@Param("bookId") long bookId, @Param("studentId") long studentId);
	/**
	 * @Title: queryByKeyWithBook 
	 * @Description: TODO(通过主键查询预约图书记录，并且携带图书实体) 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	public Appointment queryByKeyWithBook(@Param("bookId") long bookId, @Param("studentId") long studentId);
}
