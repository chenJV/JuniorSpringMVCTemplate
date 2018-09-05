package com.haomostudio.JuniorSpringMVCTemplate.service;

import com.haomostudio.JuniorSpringMVCTemplate.po.UserInfo;

import java.util.List;


public interface UserCenter_infoService {



    /**
     * 查询用户
     */
    List<UserInfo> queryList(UserInfo userInfo) throws Exception;

    /**
     * 创建用户
     */

    int inserUserInfo(UserInfo userInfo) throws Exception;

    /**
     * 更新用户
     */

    int updateUserInfo(UserInfo userInfo) throws Exception;
}
