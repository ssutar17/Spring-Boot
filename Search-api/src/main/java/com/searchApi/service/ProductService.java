package com.searchApi.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.searchApi.entity.Product;

public interface ProductService {
	
 Product addProduct(Product product);
 
 List<Product> searchproducts(@Param("name") String name);

}
