package com.projects.point_sales.repository;

import com.projects.point_sales.model.Client;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer>{
    
}
