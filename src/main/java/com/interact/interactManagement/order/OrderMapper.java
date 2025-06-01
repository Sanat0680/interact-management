package com.interact.interactManagement.order;

import com.interact.interactManagement.entities.FinalOrder;
import com.razorpay.Order;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderPojo entityToPojo(FinalOrder order);
    FinalOrder pojoToEntity(OrderPojo pojo);
}

