package com.interact.interactManagement.order;

import com.interact.interactManagement.entities.FinalOrder;
import com.interact.interactManagement.entities.OrderItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {
    OrderItemPojo entityToPojo(OrderItem order);
    OrderItem pojoToEntity(OrderItemPojo pojo);
}

