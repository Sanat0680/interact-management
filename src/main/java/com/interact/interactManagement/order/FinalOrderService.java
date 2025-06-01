package com.interact.interactManagement.order;

import com.interact.interactManagement.entities.FinalOrder;
import com.razorpay.Order;

import java.util.Optional;

public interface FinalOrderService {
    Optional<FinalOrder> getOrderById(String id) ;

     OrderPojo createOrder(OrderPojo finalOrder) ;
}

