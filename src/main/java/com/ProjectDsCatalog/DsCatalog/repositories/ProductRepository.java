package com.ProjectDsCatalog.DsCatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjectDsCatalog.DsCatalog.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
