package com.mytests.spring.mvcMultiModule.jpa.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
/**
 * *
 * <p>Created by irina on 29.10.2021.</p>
 * <p>Project: springboot-mvc-multimodule</p>
 * *
 */
@Service
public class UseEntityManager {
  @Autowired EntityManager em;

    public void testQuery(String arg) {
        String myquery = "select p.id from Positions p where p.title='oranges' and p.amount>0";
        em.createQuery(myquery);
        System.out.println(arg);
    }

    ;
}
