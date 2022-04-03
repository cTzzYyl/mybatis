package com.yyl.dao;

import com.yyl.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper {
    //插入数据

    int addBlog(Blog blog);


}
