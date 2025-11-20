package com.arjun.Arjun.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arjun.Arjun.models.product;

@Repository
public interface productRepository extends JpaRepository<product,Long>{  
 
}
