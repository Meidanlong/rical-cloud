package org.linkgems.rical.backend.api.controller;

import org.linkgems.rical.backend.export.provider.IUserProvider;
import org.linkgems.rical.backend.export.UserBaseModel;
import org.linkgems.rical.common.adam.domain.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: 用户Http接口
 * @author: meidanlong
 * @date: 2021/7/18 5:04 PM
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private IUserProvider userProvider;

    @GetMapping("query")
    public BaseResponse<UserBaseModel> queryUser(Long userId){
//        return userProvider.queryUser(userId);
        UserBaseModel userBaseModel = new UserBaseModel();
        userBaseModel.setUserId(userId);
        return BaseResponse.success(userBaseModel);
    }
}
