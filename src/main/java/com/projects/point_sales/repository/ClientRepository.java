package com.projects.point_sales.repository;

import java.util.List;

import com.projects.point_sales.model.Client;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {

    public Client findClientById(Integer id);

    public List<Client> findAll();

}
