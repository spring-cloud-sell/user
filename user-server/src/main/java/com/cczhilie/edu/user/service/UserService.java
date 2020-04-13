package com.cczhilie.edu.user.service;

import com.cczhilie.edu.user.dataobject.UserInfo;

/**
 * @author: GZC
 * @create: 2020-04-13 14:56
 * @description:
 **/
public interface UserService {

    /**
     * 通过openid来查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);

    /**
     * 通过openid来查询用户信息
     * @param openid
     * @return
     */
    UserInfo findByIdIs(String openid);
}
