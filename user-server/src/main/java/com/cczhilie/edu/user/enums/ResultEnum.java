package com.cczhilie.edu.user.enums;

import lombok.Getter;

/**
 * @author: GZC
 * @create: 2020-04-13 15:07
 * @description:
 **/
@Getter
public enum  ResultEnum {

    /**
     * 登录失败
     */
    LOGIN_FAIL(1, "登录失败"),
    /**
     * 角色权限有误
     */
    ROLE_ERROR(2, "角色权限有误"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
