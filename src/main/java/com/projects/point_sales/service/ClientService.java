package com.projects.point_sales.service;

import java.util.List;

import com.projects.point_sales.dto.ClientRequestDTO;
import com.projects.point_sales.dto.ClientRequestUpdateDTO;
import com.projects.point_sales.model.Client;

public interface ClientService {

    public Client save(ClientRequestDTO clientRequestDTO);

    public Client update(ClientRequestUpdateDTO clientRequestUpdateDTO);

    public Client getClient(Integer id);

    public List<Client> getClients();

    public void deleteById(Integer id);
}
