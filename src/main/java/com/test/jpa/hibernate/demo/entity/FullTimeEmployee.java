package com.test.jpa.hibernate.demo.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
public class FullTimeEmployee extends Employee{
    protected FullTimeEmployee(){
    }

    private BigDecimal salary;

    public FullTimeEmployee(String name, BigDecimal salary) {
        super(name);
        this.salary = salary;
    }
}
