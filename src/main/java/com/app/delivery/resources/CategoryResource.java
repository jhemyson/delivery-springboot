package com.app.delivery.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.delivery.domain.Category;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Category> show() {
		Category cat = new Category(1, "Informática");
		Category cat2 = new Category(2, "Escritório");
		
		List<Category> categoryList = new ArrayList<Category>();
		
		categoryList.add(cat);
		categoryList.add(cat2);
		
		return categoryList;	
	}
}
