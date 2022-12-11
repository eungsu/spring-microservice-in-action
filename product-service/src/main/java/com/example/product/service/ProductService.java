package com.example.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	public Product getProduct(Long id) {
		return productRepository.getReferenceById(id);
	}
	
	public void updateProduct(Product product) {
		productRepository.save(product);
	}
}
