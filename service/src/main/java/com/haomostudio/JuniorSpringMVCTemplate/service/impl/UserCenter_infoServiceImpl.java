package com.haomostudio.JuniorSpringMVCTemplate.service.impl;

import com.haomostudio.JuniorSpringMVCTemplate.dao.DaoSupport;
import com.haomostudio.JuniorSpringMVCTemplate.po.UserInfo;
import com.haomostudio.JuniorSpringMVCTemplate.service.UserCenter_infoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserCenter_infoServiceImpl implements UserCenter_infoService {
    @Autowired
    private DaoSupport dao;

    /**
     * 查询用户
     */
    public List<UserInfo> queryList(UserInfo userInfo) throws Exception {
        return dao.selectByExampleWithRowbounds(userInfo);
    }

    /**
     * 创建用户
     */
    @Transactional
    public int inserUserInfo(UserInfo userInfo) throws Exception {
       int i = dao.insert(userInfo);
        return i;
    }

    /**
     * 更新用户
     */
    @Transactional
    public int updateUserInfo(UserInfo userInfo) throws Exception {
        return dao.updateByPrimaryKey(userInfo);
    }
}
