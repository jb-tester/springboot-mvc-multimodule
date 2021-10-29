package com.mytests.spring.mvcMultiModule.data.superentities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * *
 * <p>Created by irina on 29.10.2021.</p>
 * <p>Project: springboot-mvc-multimodule</p>
 * *
 */
@MappedSuperclass
public class AbstractEntity {
    protected Integer id;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
