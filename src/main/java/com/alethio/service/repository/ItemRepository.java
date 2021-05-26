package com.alethio.service.repository;


import com.alethio.service.entity.items.Category;
import com.alethio.service.entity.items.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ItemRepository {
    private final EntityManager em;

    public void save(Item item) {
        if (item.getId()==null) {
            em.persist(item);
        } else {
            em.merge(item);
        }
    }
    public static void save(List<Item> items){
        for(Item i : items){
            save((List<Item>) i);
        }
    }

    public Item findItem(Long id, Category category) {
        return em.find(Item.class, id);
    }


}
