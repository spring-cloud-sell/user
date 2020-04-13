package com.cczhilie.edu.user.repository;

import com.cczhilie.edu.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: GZC
 * @create: 2020-04-13 14:51
 * @description:
 **/
public interface UserInfoRepository extends JpaRepository<UserInfo,String> {


    /**
     * @param userId
     * @return
     */
    UserInfo findByOpenid(String userId);

    /**
     * @param userId
     * @return
     */
    UserInfo findByIdIs(String userId);

}
