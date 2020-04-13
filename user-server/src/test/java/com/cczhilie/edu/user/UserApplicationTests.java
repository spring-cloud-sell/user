package com.cczhilie.edu.user;

import com.cczhilie.edu.user.dataobject.UserInfo;
import com.cczhilie.edu.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        UserInfo userInfo = userService.findByOpenid("123");
        System.out.println(userInfo.toString());
    }

    @Test
    public void contextLoads2() {
        UserInfo userInfo = userService.findByIdIs("1");
        System.out.println(userInfo.toString());
    }

}
