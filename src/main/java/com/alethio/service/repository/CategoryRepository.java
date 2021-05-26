package com.alethio.service.repository;

import com.alethio.service.entity.items.Category;
import com.alethio.service.entity.items.CategoryName;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class CategoryRepository {

    private final EntityManager em;

    public Category findName(CategoryName name) {
        return em.find(Category.class, name);
    }
}
