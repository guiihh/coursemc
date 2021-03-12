package com.gomlek.coursemc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gomlek.coursemc.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Category> findAll() {
		
		Category cat1 = new Category (1, "Computing");
		Category cat2 = new Category (2, "Desk");
		
		List<Category> list = new ArrayList<>();
		
		list.add(cat1);
		list.add(cat2);
		
		return list;
	}
	
		
}