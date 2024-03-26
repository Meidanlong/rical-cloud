package org.linkgems.rical.backend.service.Impl;

import org.linkgems.rical.backend.dao.mapper.user.UserBaseMapper;
import org.linkgems.rical.backend.domain.adapter.UserAdapter;
import org.linkgems.rical.backend.domain.dto.UserBaseDTO;
import org.linkgems.rical.backend.domain.po.user.UserBase;
import org.linkgems.rical.backend.service.IUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/11/28 7:38 PM
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserBaseMapper userBaseMapper;


    @Override
    public UserBaseDTO queryUser(Long userId) {
        // 自定义条件搜索对象 Example
        Example userBaseExample = new Example(UserBase.class);
        Example.Criteria criteria = userBaseExample.createCriteria();
        criteria.andEqualTo("userId", userId)
                .andEqualTo("deleted", 0);
        UserBase userBase = userBaseMapper.selectOneByExample(userBaseExample);
        return UserAdapter.po2dto(userBase);
    }
}
