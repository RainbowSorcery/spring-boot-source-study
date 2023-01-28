package com.lyra.spring.boot;

import com.lyra.annotation.ConditionalOnClass;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class WebCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> conditionalOnClass = metadata.getAnnotationAttributes(ConditionalOnClass.class.getName());

        ClassLoader classLoader = context.getClassLoader();
        try {
            return classLoader.loadClass(conditionalOnClass.get("value").toString()) != null;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
