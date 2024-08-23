package org.spring.one.project3.repository;


import org.spring.one.project3.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository <Products,Integer> {
}
