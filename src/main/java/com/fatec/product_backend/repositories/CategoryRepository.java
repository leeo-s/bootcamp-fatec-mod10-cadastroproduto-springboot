package com.fatec.product_backend.repositories;
import com.fatec.product_backend.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository < Category , Integer >{
    
}
