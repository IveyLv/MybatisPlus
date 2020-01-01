package com.Ivey.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Description 测试环境
 * @Author IveyLv
 * @Date 2020/1/1 10:13
 * @Version 1.0
 */
public class MybatisPlusTest {

    private ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-config.xml");

    @Test
    public void dataSourceTest() throws SQLException {
        DataSource dataSource = ioc.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
