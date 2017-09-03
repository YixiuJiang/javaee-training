package com.jiangren.javaee.repositories;

import com.jiangren.javaee.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by seabookchen on 3/09/2017.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
