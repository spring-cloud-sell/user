package com.cczhilie.edu.user.vo;

import lombok.Data;

/**
 * @author: GZC
 * @create: 2020-04-13 15:05
 * @description:
 **/
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
