package com.lyra.spring.boot;

public class JettyServer implements WebServer {

    @Override
    public void start() {
        System.out.println("jetty run");
    }
}
