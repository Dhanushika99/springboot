package com.dhanu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dhanu.modal.Document;
import com.dhanu.service.DocumentService;

@RestController
@RequestMapping(value= "/sms")
public class StudentController {
	
	@Autowired
	DocumentService documentservice;
	
	@RequestMapping(value="/document", method = RequestMethod.POST)
	public Document save(@RequestBody Document document) {
		
		return documentservice.save(document);
	}

	
	
}
