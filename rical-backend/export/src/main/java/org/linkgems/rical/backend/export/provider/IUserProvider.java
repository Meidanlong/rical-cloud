package org.linkgems.rical.backend.export.provider;

import org.linkgems.rical.backend.export.UserBaseModel;
import org.linkgems.rical.common.adam.domain.BaseResponse;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/7/18 4:50 PM
 */
public interface IUserProvider {

    BaseResponse<UserBaseModel> queryUser(Long userId);
}
