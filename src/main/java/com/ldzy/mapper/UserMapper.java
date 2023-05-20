package com.ldzy.mapper;

import com.ldzy.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from user where userCode=#{0}")
    public User getUserByUserCode(String userCode);
}
