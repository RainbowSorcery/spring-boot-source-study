package com.lyra.spring.boot;


public class TomcatServer implements WebServer {
    @Override
    public void start() {
        System.out.println("run tomcat");
    }
}
