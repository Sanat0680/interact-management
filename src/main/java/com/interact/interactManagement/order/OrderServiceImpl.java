package com.interact.interactManagement.order;

import com.interact.interactManagement.entities.FinalOrder;
import com.interact.interactManagement.entities.OrderItem;
import com.interact.interactManagement.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderServiceImpl implements FinalOrderService {

    @Autowired
    private FinalOrderRepository finalOrderRepository;
    @Autowired
    private OrderItemRepository orderItemRepository;
    @Autowired
    OrderMapper orderMapper;

    @Autowired
    OrderItemMapper orderItemMapper;

    public OrderPojo createOrder(OrderPojo finalOrder) {
//        finalOrder.setTotalAmount(new BigDecimal(String.valueOf(finalOrder.getTotalAmount())));
        FinalOrder order = orderMapper.pojoToEntity(finalOrder);
        order.setId(UUID.randomUUID().toString());
        order.setOrderDate(new Date());
        FinalOrder placedOrder = finalOrderRepository.save(order);

        for (OrderItemPojo item : finalOrder.getItems()) {
            OrderItem orderItem= new OrderItem();
            orderItem = orderItemMapper.pojoToEntity(item);
            orderItem.setId(UUID.randomUUID().toString());
            orderItem.setParentId(order.getId());
            orderItemRepository.save(orderItem);
        }
        OrderPojo response = orderMapper.entityToPojo(placedOrder);
        response.setItems(orderItemRepository.findAllByParentId(response.getId()).stream().map(e->orderItemMapper.entityToPojo(e) ).toList());
        return response;



    }

    public Optional<FinalOrder> getOrderById(String id) {
        return finalOrderRepository.findById(id);
    }
}
