package org.linkgems.rical.backend.provider;

import org.linkgems.rical.backend.biz.IUserBiz;
import org.linkgems.rical.backend.domain.adapter.UserAdapter;
import org.linkgems.rical.backend.domain.dto.UserBaseDTO;
import org.linkgems.rical.backend.export.UserBaseModel;
import org.linkgems.rical.backend.export.provider.IUserProvider;
import org.apache.dubbo.config.annotation.Service;
import org.linkgems.rical.common.adam.domain.BaseResponse;

import javax.annotation.Resource;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/7/18 4:51 PM
 */
@Service(version = "${provider.linkgems.rical.backend.ITestProvider}")
public class UserProvider implements IUserProvider {

    @Resource
    private IUserBiz userBiz;

    @Override
    public BaseResponse<UserBaseModel> queryUser(Long userId) {
        UserBaseDTO userBaseDTO = userBiz.queryUser(userId);
        UserBaseModel userBaseModel = UserAdapter.dto2mo(userBaseDTO);
        if(userBaseModel != null){
            return BaseResponse.success(userBaseModel);
        }else{
            return BaseResponse.failure();
        }
    }
}
