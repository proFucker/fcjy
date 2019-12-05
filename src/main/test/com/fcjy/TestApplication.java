package com.fcjy;

import com.alibaba.druid.filter.FilterManager;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplication {

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        FilterManager m;
        DruidDataSource d = (DruidDataSource)dataSource;
//        d.setExceptionSorter();
        System.out.println(d.getInitialSize());
        System.out.println("dataSource: " + dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("connection: " + connection);
//        PreparedStatement statement = connection.prepareStatement("create table Teacher(T varchar(10),Tname nvarchar(10));");
//        statement.execute();
        connection.close();
    }

}
