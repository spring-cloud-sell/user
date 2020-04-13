package com.cczhilie.edu.user.enums;

import lombok.Getter;

/**
 * @author: GZC
 * @create: 2020-04-13 15:07
 * @description:
 **/
@Getter
public enum RoleEnum {

    /**
     * 买家
     */
    BUYER(1, "买家"),
    /**
     * 卖家
     */
    SELLER(2, "卖家"),
    ;

    private Integer code;

    private String message;

    RoleEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
