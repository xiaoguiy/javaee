package com.ldzy.controller;

public enum ResultCode implements StatusCode{

    SUCCESS(1000,"操作成功！"),
    SUCCESS_LOGIN(1001,"登录成功！！"),
    SUCCESS_ACTIVE(1002,"激活成功！"),
    SUCCESS_QUERY(1003,"查询成功！"),
    SUCCESS_ADD(1004,"新增成功！"),
    SUCCESS_UPDATE(1005,"编辑成功！"),
    SUCCESS_DELETE(1006,"删除成功！"),

    ERROR(2000,"操作失败！"),
    ERROR_DB(2001,"数据库发生异常"),
    NOT_ACTIVE(2002,"未激活"),
    ERROR_NAME_PASSWORD(2003,"用户名或密码错误"),
    NOT_PARAM(2004,"请求中没有携带参数"),
    ERROR_ACTIVE(2005,"激活用户失败"),
    NOT_LOGIN(2006,"未登录"),
    ERROR_EXPIRE(2007,"激活码过期"),
    ERROR_QUERY_GOODS(2008,"查询商品失败"),
    ERROR_ADD_GOODS(2009,"添加商品失败"),
    ERROR_PARAM(3000,"请求的参数项缺失或参数格式不对或类型不对");

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
