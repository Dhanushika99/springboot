package com.dhanu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanu.modal.Document;
import com.dhanu.repository.StudentRepository;

@Service
public class DocumentServiceImpl implements DocumentService{

	@Autowired
	StudentRepository studentrepository;
	@Override
	public Document save(Document document) {
		return studentrepository.save(document);
	}

}
