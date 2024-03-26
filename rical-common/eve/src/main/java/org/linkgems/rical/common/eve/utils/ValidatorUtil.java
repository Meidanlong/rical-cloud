package org.linkgems.rical.common.eve.utils;

import org.linkgems.rical.common.adam.exception.ValidateException;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * 类名称：ValidatorUtil
 * 类描述：校验工具类
 *
 * @author meidanlong
 * @date 上午8:49
 */
public class ValidatorUtil {

    /**
     * 校验器
     */
    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    /**
     * 参数校验
     * @param object
     * @param groups
     * @param <T>
     */
    public static <T> void validate(T object, Class... groups) {
        Set<ConstraintViolation<T>> validateResultSet = validator.validate(object, groups);

        // 如果校验结果不为空
        if (!CollectionUtils.isEmpty(validateResultSet)) {
            validateResultSet.stream().findFirst().ifPresent(vr -> {
                // 只返回第一个不合法信息
                throw new ValidateException(vr.getMessage());
            });
        }
    }

    /**
     * 参数校验
     * @param bindingResult
     */
    public static void validate(BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            throw new ValidateException(bindingResult.getFieldError().getDefaultMessage());
        }
    }

}
