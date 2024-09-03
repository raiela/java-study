package com.educandoweb.course.repositories;

import com.educandoweb.course.entitites.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
