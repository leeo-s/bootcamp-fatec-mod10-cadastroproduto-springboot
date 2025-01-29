package com.fatec.product_backend.repositories;
import com.fatec.product_backend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository < Product , Integer >{
    
}
