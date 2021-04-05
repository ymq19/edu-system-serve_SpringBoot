package edu.system.serve.utils;

/**
 * 返回前端状态码
 */
public class StatusCode {
    // 响应成功
    public final static Integer SUCCESS_CODE = 1105;
    // 响应失败(用户名或密码错误)
    public final static Integer ERROR_CODE = 1100;
    // token过期
    public final static Integer TOKEN_EXPIRE_CODE = 10010;
    // OPTIONS请求返回200状态码
    public final static Integer OPTIONS_SUCCESS_CODE = 200;
}