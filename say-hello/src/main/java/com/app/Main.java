package com.app;

import com.lyra.annotation.LyraSpringBoot;
import com.lyra.spring.boot.AutoConfigSPI;
import com.lyra.spring.boot.SpringBoot;
import com.lyra.spring.boot.WenServerAutoConfiguration;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.context.annotation.Import;

import java.util.ServiceLoader;

@LyraSpringBoot
public class Main {
    public static void main(String[] args) {
        SpringBoot.run(Main.class);
    }
}