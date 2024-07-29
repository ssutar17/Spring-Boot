package com.searchApi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.searchApi.Repositories.ProductRepository;
import com.searchApi.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	private ProductRepository productRepository;
    
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> searchproducts(String name) {
		List<Product> products= productRepository.searchproducts(name);
		return products;
	}
	
	

}
