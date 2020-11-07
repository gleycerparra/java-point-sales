package com.projects.point_sales.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

import com.projects.point_sales.constant.*;
import com.projects.point_sales.dto.ClientRequestDTO;
import com.projects.point_sales.dto.ClientRequestUpdateDTO;
import com.projects.point_sales.generic.CreateEntity;
import com.projects.point_sales.generic.UpdateEntity;
import com.projects.point_sales.model.Client;
import com.projects.point_sales.service.ClientService;
import com.projects.point_sales.util.Util;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(Constant.API_VERSION + Constant.RESOURCE_CLIENTS)
public class ClientController {

	@Autowired
	ClientService clientService;

	@PostMapping()
	public ResponseEntity<CreateEntity> save(@Valid @RequestBody ClientRequestDTO clientRequestDTO) {
		Client client = clientService.save(clientRequestDTO);
		return new ResponseEntity<>(Util.createHrefFromResource(client.getId()), HttpStatus.CREATED);
	}

	@GetMapping()
	public List<Client> getClients() {
		return clientService.getClients();
	}

	@PutMapping()
	public ResponseEntity<UpdateEntity<Client>> update(
			@Valid @RequestBody ClientRequestUpdateDTO clientRequestUpdateDTO) {
		Client client = clientService.update(clientRequestUpdateDTO);
		return new ResponseEntity<>(Util.updateHrefFromResource(client, client.getId()), HttpStatus.ACCEPTED);
	}

	@GetMapping("/{id}")
	public Client getClient(@PathVariable Integer id) {
		return clientService.getClient(id);
	}

	@DeleteMapping("/{id}")
	public void deleteClient(@PathVariable Integer id) {
		clientService.deleteById(id);
	}

}
