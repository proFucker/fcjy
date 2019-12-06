package com.fcjy;

import com.alibaba.druid.pool.DruidPooledConnection;
//import com.fcjy.mybatis.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;

@Controller
public class TestController {

    RequestContextHolder holder;
    RequestAttributes shit;

    @Autowired
    DataSource dataSource;

    int count = 0;

    @RequestMapping("/main")
    @ResponseBody
    public String hello() throws ServletException {
        return "hello world";
    }

    @RequestMapping("/sql")
    @ResponseBody
    public String sql() throws ServletException {
        System.out.println("sql" + count++);
        try{
            Connection connection = dataSource.getConnection();
            connection.prepareStatement("show tables;").execute();
//            TimeUnit.SECONDS.sleep(10);
//            System.out.println(connection.getClass());
            ((DruidPooledConnection)connection).close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "test end";
    }

//    @Resource
//    TeacherDao teacherDao;
//
//    @RequestMapping("/mybatis")
//    @ResponseBody
//    public String mybatis() throws ServletException {
//        return teacherDao.findAll().toString();
//    }

    @Bean
    public String bea(){
        return "shit";
    }
}
