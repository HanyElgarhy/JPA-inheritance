package com.test.jpa.hibernate.demo.repository;

import com.test.jpa.hibernate.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeeRepository {

    @Autowired
    EntityManager entityManager;

    public void insertEmplyee(Employee employee){
        entityManager.persist(employee);
    }
    public List<Employee> retrieveAllEmployee(){
        return entityManager.createQuery("select e from FullTimeEmployee e",Employee.class).getResultList();
    }
}
