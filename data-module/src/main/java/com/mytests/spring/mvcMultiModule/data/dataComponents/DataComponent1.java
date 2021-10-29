package com.mytests.spring.mvcMultiModule.data.dataComponents;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 06.07.2021.</p>
 * <p>Project: springboot-mvc-multimodule</p>
 * *
 */
@Component("dataModuleComponent1")
public class DataComponent1 {

    @Value("DataModuleCompo1")
    String id;

    public String getId() {
        return id;
    }
}
