package com.mytests.spring.mvcMultiModule.jpa.repositories;

import com.mytests.spring.mvcMultiModule.data.entities.Positions;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * *
 * <p>Created by irina on 06.07.2021.</p>
 * <p>Project: springboot-mvc-multimodule</p>
 * *
 */
public interface PositionsRepository extends CrudRepository<Positions,Integer> {
    
    List<Positions> getPositionsByAmountGreaterThan(Integer amount);
    @Query("select p.id from Positions p where p.title like %:title% and p.amount > :amount and p.available = true and p.price < :price")
    List<Integer> customQuery(@Param("amount") int a, @Param("title") String title, @Param("price") int price);
}
