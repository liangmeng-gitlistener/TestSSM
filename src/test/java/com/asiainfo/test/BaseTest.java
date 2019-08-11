package com.asiainfo.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * 项目名称：TestSSM
 * 文件名称：BaseTest.java 
 * @author LM
 * @date 2017年12月18日 下午5:11:02 
 * @version 1.0 
 * @since JDK 1.8.0_91
 */
/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class BaseTest {

}
