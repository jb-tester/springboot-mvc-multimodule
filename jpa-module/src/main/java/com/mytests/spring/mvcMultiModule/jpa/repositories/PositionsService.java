package com.mytests.spring.mvcMultiModule.jpa.repositories;

import com.mytests.spring.mvcMultiModule.data.dataComponents.DataComponent1;
import com.mytests.spring.mvcMultiModule.data.entities.Positions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * *
 * <p>Created by irina on 06.07.2021.</p>
 * <p>Project: springboot-mvc-multimodule</p>
 * *
 */
@Service
public class PositionsService {
    @Autowired 
    PositionsRepository repo;
    @Autowired
    DataComponent1 dataComponent1;

    public void customQueryTest() {
        System.out.println("*****************************");
        for (Integer position : repo.customQuery(10, "a", 100)) {
            System.out.println(position);
        }
        System.out.println("*****************************");
    }

    ;
    public void testResults(){
        System.out.println("**********************************");
        System.out.println(dataComponent1.getId());
        System.out.println("**********************************");
        List<Positions> positions = (List<Positions>) repo.findAll();
        for (Positions position : positions) {
            System.out.println(position.toString());
        }
    }
}
