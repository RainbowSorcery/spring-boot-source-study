package com.lyra.spring.boot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBoot {
    public static void run(Class c) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(c);
        annotationConfigApplicationContext.refresh();

        // 创建web容器并启动
        WebServer webServer = getWebServer(annotationConfigApplicationContext);
        webServer.start();

//        DeferredImportSelector bean = annotationConfigApplicationContext.getBean(DeferredImportSelector.class);
    }

    private static WebServer getWebServer(AnnotationConfigApplicationContext annotationConfigApplicationContext) {
        return annotationConfigApplicationContext.getBean(WebServer.class);
    }
}
