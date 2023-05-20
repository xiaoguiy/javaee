package com.ldzy.service.impl;

import com.ldzy.mapper.UserMapper;
import com.ldzy.pojo.User;
import com.ldzy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    //调用mapper层的方法，来读取数据库中user记录，再比较密码，正确返回user对象，不正确返回null
    public User getUserByUserCode(User user) {
        User user1=userMapper.getUserByUserCode(user.getUserCode());
        if (user1==null) return null;
        if (user1.getUserPassword().equals(user.getUserPassword())){
            return user1;
        }
        return null;
    }
}
