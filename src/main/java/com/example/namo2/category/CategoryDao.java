package com.example.namo2.category;

import com.example.namo2.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Long> {
    public List<Category> findCategoriesByUserIdAndStatus(Long userId, Boolean status);
}
