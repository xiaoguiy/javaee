package com.ldzy.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private long id;
    private String userCode;//用户名
    private String userPassword;
    private String userName;//用户昵称
    private String email;
    private short avatarNum;
    private int contribution;
    private Date creationDate;
}
