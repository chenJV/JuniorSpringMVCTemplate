package com.haomostudio.JuniorSpringMVCTemplate.controller;

import com.haomostudio.JuniorSpringMVCTemplate.po.Parameters;
import com.haomostudio.JuniorSpringMVCTemplate.po.UserInfo;
import com.haomostudio.JuniorSpringMVCTemplate.servlet.UserCenter_infoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 第一步： 查询用户  /hm-user-controller/getHmUsersUseingGET_1
 * 第二步： 创建用户  /hm-user-controller/getHmUsersUseingPUT
 * 第三部： 更新用户  /hm-user-controller/createHmUsersUseingPOST_1
 */
@Controller
@RequestMapping("/hm-user-controller")
public class UserCenter_infoController {

    @Autowired
    private UserCenter_infoService userCenter_infoService;

    /**
     * 第一步： 查询用户
     *
     * @param parameters
     */
    @RequestMapping(value="/getHmUsersUseingGET_1", method = RequestMethod.GET)
    @ResponseBody
    public void getHmUsersUseingGET_1(@RequestBody Parameters<UserInfo> parameters) {
        UserInfo userInfo = parameters.getEntity(); //获取实体类数据信息
        try {
            userCenter_infoService.queryList(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 第二步： 创建用户
     *
     * @param userInfo
     */
    @RequestMapping(value="/createHmUsersUseingPOST_1", method = RequestMethod.GET)
    public void createHmUsersUseingPOST_1(@RequestBody UserInfo userInfo) {
        try {
            userCenter_infoService.inserUserInfo(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 第三步： 更新用户
     *
     * @param userInfo
     */
    @RequestMapping(value="/getHmUsersUseingPUT", method = RequestMethod.GET)
    public void getHmUsersUseingPUT(@RequestBody UserInfo userInfo) {
        try {
            userCenter_infoService.updateUserInfo(userInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
