package com.dhanu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhanu.modal.Document;

public interface StudentRepository extends JpaRepository<Document, Integer>{
	
}
