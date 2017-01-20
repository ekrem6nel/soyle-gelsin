package com.soylegelsin.repository;

import com.soylegelsin.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>{
    public Order findById(String id);
}
