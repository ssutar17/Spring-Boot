package com.searchApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.searchApi.entity.Product;
import com.searchApi.service.ProductService;

@RestController
@RequestMapping("/search-api/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	public ProductController() {
		super();
		// TODO Auto-generated constructor stub
	}


	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Product>> searchProducts(@RequestParam("name") String name){
		return ResponseEntity.ok(productService.searchproducts(name));
	}
}
