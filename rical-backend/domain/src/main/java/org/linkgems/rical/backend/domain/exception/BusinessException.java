package org.linkgems.rical.backend.domain.exception;


import org.linkgems.rical.backend.domain.enums.BusinessErrorEnum;
import org.linkgems.rical.common.adam.domain.BaseException;
import org.linkgems.rical.common.adam.enums.ErrorEnum;

/**
 * @description:
 * @author: meidanlong
 * @date: 2023/2/23 10:26
 */
public class BusinessException extends BaseException {

    public BusinessException(String error, String message) {
        super(error, message);
    }

    public BusinessException(String message) {
        super(ErrorEnum.XXX, message);
    }

    public BusinessException(BusinessErrorEnum error) {
        super(error.getCode(), error.getMessage());
    }
}
