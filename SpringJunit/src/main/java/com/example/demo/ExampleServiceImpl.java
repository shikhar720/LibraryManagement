package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl {

	@Autowired
	ExampleRepositoryImpl exampleRepository;

	public String get() {
		return exampleRepository.get();
	}
}
