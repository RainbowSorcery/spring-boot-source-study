package com.lyra.spring.boot;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ServiceLoader;

public class SelectImport implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        ServiceLoader<AutoConfigSPI> load = ServiceLoader.load(AutoConfigSPI.class);

        List<String> list = new ArrayList<>();

        for (AutoConfigSPI autoConfigSPI : load) {
            list.add(autoConfigSPI.getClass().getName());
        }

        return list.toArray(String[]::new);
    }
}
