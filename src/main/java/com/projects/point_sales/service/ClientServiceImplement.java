package com.projects.point_sales.service;

import java.util.Date;
import java.util.List;

import com.projects.point_sales.model.Client;
import com.projects.point_sales.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImplement implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public void save() {
        Client client = new Client();
        client.setName("Test");
        client.setAddress("Test address");
        client.setDocument("12345678");
        client.setLastnames("Test lastnames");
        client.setState(1);

        clientRepository.save(client);
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub

    }

    @Override
    public Client getClient() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Client> getClients() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub

    }

}
