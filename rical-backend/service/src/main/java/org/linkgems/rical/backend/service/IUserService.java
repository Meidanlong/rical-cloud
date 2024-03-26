package org.linkgems.rical.backend.service;

import org.linkgems.rical.backend.domain.dto.UserBaseDTO;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/11/28 6:52 PM
 */
public interface IUserService {

    UserBaseDTO queryUser(Long userId);

}
