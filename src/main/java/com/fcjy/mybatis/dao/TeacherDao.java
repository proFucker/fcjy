package com.fcjy.mybatis.dao;


import com.fcjy.mybatis.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherDao {

    List<Teacher> findAll();

}
