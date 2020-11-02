package com.projects.point_sales.service;

import java.util.List;

import com.projects.point_sales.model.Client;

public interface ClientService {

    public void save();

    public void update();

    public Client getClient();

    public List<Client> getClients();

    public void delete();
}
