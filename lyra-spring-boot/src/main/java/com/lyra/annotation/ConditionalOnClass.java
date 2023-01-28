package com.lyra.annotation;

import com.lyra.spring.boot.WebCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Conditional(WebCondition.class)
public @interface ConditionalOnClass {
    String value();
}
