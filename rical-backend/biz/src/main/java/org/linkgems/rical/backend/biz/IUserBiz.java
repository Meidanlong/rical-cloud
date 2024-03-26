package org.linkgems.rical.backend.biz;

import org.linkgems.rical.backend.domain.dto.UserBaseDTO;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/11/28 7:36 PM
 */
public interface IUserBiz {

    UserBaseDTO queryUser(Long userId);
}
