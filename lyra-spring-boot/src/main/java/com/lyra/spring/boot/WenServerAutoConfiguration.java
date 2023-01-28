package com.lyra.spring.boot;

import com.lyra.annotation.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WenServerAutoConfiguration {
    @Bean
    @ConditionalOnClass(value = "org.apache.catalina.startup.Tomcat")
    public WebServer tomcatServer() {
        return new TomcatServer();
    }

//    @Bean
    public WebServer jettyServer() {
        return new JettyServer();
    }
}
