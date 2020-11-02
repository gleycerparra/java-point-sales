package com.projects.point_sales;

import com.projects.point_sales.model.Client;
import com.projects.point_sales.service.ClientService;
import com.projects.point_sales.service.ClientServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PointSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PointSalesApplication.class, args);
	}

}
