package com.sportyshoes.webservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoes.webservice.model.Products;


@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {
		
	public List<Products> findByProductType(String ProductType);
	public List<Products> findByProductName(String ProductName);

}