package com.mytests.spring.mvcMultiModule.data.entities;

import com.mytests.spring.mvcMultiModule.data.superentities.AbstractPosition;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Positions extends AbstractPosition {
    private Integer amount;
    private boolean available;

    @Basic
    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    
    @Override
    public String toString() {
        return "Position: " +
                "id=" + getId() +
                ", title='" + getTitle() +
                ", price=" + getPrice() +
                ", amount=" + amount +
                ' ';
    }
}
