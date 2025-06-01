package com.interact.interactManagement.repositories;

import com.interact.interactManagement.entities.OrderItem;
import com.interact.interactManagement.order.OrderItemPojo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, String> {



    List<OrderItem> findAllByParentId(String id);
}
