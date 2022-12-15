package com.buseozbaytekin.bookStore.repository;

import com.buseozbaytekin.bookStore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer>{
}
