package com.lagou.edu.mvcframework.annotations;

import java.lang.annotation.*;

/**
 * @author: fengyibo
 * @date: 2020/4/18 19:56
 * @description: 权限过滤注解
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Security {
    String[] value() default "";
}
