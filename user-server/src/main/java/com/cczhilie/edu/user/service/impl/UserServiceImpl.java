package com.cczhilie.edu.user.service.impl;

import com.cczhilie.edu.user.dataobject.UserInfo;
import com.cczhilie.edu.user.repository.UserInfoRepository;
import com.cczhilie.edu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: GZC
 * @create: 2020-04-13 14:57
 * @description:
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoRepository.findByOpenid(openid);
    }

    @Override
    public UserInfo findByIdIs(String id) {
        return userInfoRepository.findByIdIs(id);
    }
}
