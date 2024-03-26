package org.linkgems.rical.backend.biz.impl;

import org.linkgems.rical.backend.biz.IUserBiz;
import org.linkgems.rical.backend.domain.dto.UserBaseDTO;
import org.linkgems.rical.backend.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/11/28 7:37 PM
 */
@Service
public class UserBizImpl implements IUserBiz {

    @Resource
    private IUserService userService;

    @Override
    public UserBaseDTO queryUser(Long userId) {
        return userService.queryUser(userId);
    }
}
