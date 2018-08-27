package com.haomostudio.JuniorSpringMVCTemplate.servlet;

import com.haomostudio.JuniorSpringMVCTemplate.dao.DaoSupport;
import com.haomostudio.JuniorSpringMVCTemplate.po.UserInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userCenter_infoService")
public class UserCenter_infoService {
    @Resource(name = "daoSupport")
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
        return dao.insert(userInfo);
    }

    /**
     * 更新用户
     */
    @Transactional
    public int updateUserInfo(UserInfo userInfo) throws Exception {
        return dao.updateByPrimaryKey(userInfo);
    }
}
