package com.poly.shop.repository;

import java.util.List;

import com.poly.shop.domain.Category;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	List<Category> findByNameContaining(String name);
	Page<Category> findByNameContaining(String name, Pageable pageable);
}
