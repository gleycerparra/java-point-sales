package com.projects.point_sales.service;

import java.util.List;

import com.projects.point_sales.dto.ClientRequestDTO;
import com.projects.point_sales.dto.ClientRequestUpdateDTO;
import com.projects.point_sales.model.Client;
import com.projects.point_sales.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client save(ClientRequestDTO clientRequestDTO) {
        try {
            Client client = new Client();
            client.setDocument(clientRequestDTO.getDocument());
            client.setName(clientRequestDTO.getName());
            client.setLastnames(clientRequestDTO.getLastnames());
            client.setState(clientRequestDTO.getState());
            return clientRepository.save(client);
        } catch (Exception e) {
            System.out.println(e.toString());

            return null;
        }
    }

    @Override
    public Client update(ClientRequestUpdateDTO clientRequestUpdateDO) {

        try {
            Client client = new Client();
            client.setId(clientRequestUpdateDO.getId());
            client.setDocument(clientRequestUpdateDO.getDocument());
            client.setName(clientRequestUpdateDO.getName());
            client.setLastnames(clientRequestUpdateDO.getLastnames());
            client.setState(clientRequestUpdateDO.getState());
            return clientRepository.save(client);
        } catch (Exception e) {
            System.out.println(e.toString());

            return null;
        }

    }

    @Override
    public Client getClient(Integer id) {
        return clientRepository.findClientById(id);
    }

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        clientRepository.deleteById(id);
    }

}
