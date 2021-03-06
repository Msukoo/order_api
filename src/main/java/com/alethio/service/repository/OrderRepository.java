package com.alethio.service.repository;

import com.alethio.service.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    @Transactional
    public void save(Order order) {
        em.persist(order);
    }

}
