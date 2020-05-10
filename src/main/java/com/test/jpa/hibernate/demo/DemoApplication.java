package com.test.jpa.hibernate.demo;

import com.test.jpa.hibernate.demo.entity.*;
import com.test.jpa.hibernate.demo.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private Logger logger= LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		employeeRepository.insertEmplyee(new FullTimeEmployee("Jack",new BigDecimal(1000)));
		employeeRepository.insertEmplyee(new PartTimeEmployee("Kiko", new BigDecimal(12)));
		logger.info("retrieve all employee {}",employeeRepository.retrieveAllEmployee());


	}
}
