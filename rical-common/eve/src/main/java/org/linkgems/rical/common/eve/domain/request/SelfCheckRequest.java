package org.linkgems.rical.common.eve.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.linkgems.rical.common.adam.domain.BaseObject;

import javax.validation.constraints.NotNull;

/**
 * @Author： Luzelong
 * @Created： 2023/2/1 10:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SelfCheckRequest extends BaseObject {

    /**
     * 目标服务的appname
     */
    @NotNull
    private String appName;

    /**
     * 目标服务的ip
     */
    private String ip;

    /**
     * 目标的bean的类名
     */
    @NotNull
    private String beanClazzName;


    /**
     * 目标的方法名
     */
    @NotNull
    private String methodName;


    /**
     * 方法参数类型列表
     */
    private String[] parameterTypes;

    /**
     * 方法参数数组
     */
    private Object[] parameters;


}

