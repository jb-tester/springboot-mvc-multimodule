package com.mytests.spring.mvcMultiModule.data.superentities;

import com.mytests.spring.mvcMultiModule.data.superentities.AbstractEntity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * *
 * <p>Created by irina on 29.10.2021.</p>
 * <p>Project: springboot-mvc-multimodule</p>
 * *
 */
@MappedSuperclass
public class AbstractPosition extends AbstractEntity {
    protected String title;
    protected Integer price;

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
