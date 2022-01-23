package com.curso.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Double daily_Income;
    
    public Worker(){

    }

    public Double getDaily_income() {
        return daily_Income;
    }

    public void setDaily_income(Double daily_income) {
        this.daily_Income = daily_income;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
