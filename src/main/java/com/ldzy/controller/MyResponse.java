package com.ldzy.controller;


import lombok.Getter;

@Getter
public class MyResponse {
    private int code;
    private String msg;
    Object data;

    public MyResponse(ResultCode resultCode, Object data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }

    public MyResponse(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = null;
    }
}
