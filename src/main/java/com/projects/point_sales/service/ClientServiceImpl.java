package com.projects.point_sales.service;

import java.util.Date;
import java.util.List;

import com.projects.point_sales.model.Client;
import com.projects.point_sales.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public void save() {
    	try {
    	Client client =new Client();
    	client.setDocument("123223123");
    	client.setEmail("asdasdas");
    	client.setName("piratas");
    	client.setLastnames("cerpa");
    	client.setState(1);
        clientRepository.save(client);
    	}catch (Exception e) {
			System.out.println(e.toString());
		}
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
