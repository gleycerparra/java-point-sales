package com.projects.point_sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projects.point_sales.constants.*;
import com.projects.point_sales.service.ClientService;


@RestController
@RequestMapping(Constants.API_VERSION + Constants.PATH_CLIENTS)
public class ClientController {
	
	 @Autowired
	 ClientService clientService;

	    @GetMapping(Constants.PATH_CLIENT)
	    public void save() {
	        clientService.save();
	    }

}
