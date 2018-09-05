package com.haomostudio.JuniorSpringMVCTemplate.dao;

import com.haomostudio.JuniorSpringMVCTemplate.po.UserInfo;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public interface DaoSupport {


    /**
     * 查询用户  /hm-user-controller/getHmUsersUseingGET_1
     *
     * @return
     * @throws Exception
     */
    List<UserInfo> selectByExampleWithRowbounds(UserInfo userInfo) throws SQLException;

    /**
     * 创建用户  /hm-user-controller/getHmUsersUseingPUT
     *
     * @return
     * @throws Exception
     */
    int insert(UserInfo userInfo) throws SQLException;

    /**
     * 更新用户  /hm-user-controller/createHmUsersUseingPOST_1
     *
     * @return
     * @throws Exception
     */
    int updateByPrimaryKey(UserInfo userInfo) throws SQLException;

}
