package com.interact.interactManagement.order;

import com.interact.interactManagement.entities.FinalOrder;
import com.interact.interactManagement.payment.PaymentPojo;
import com.interact.interactManagement.payment.PaymentService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
@RequestMapping("/dev")
public class OrderController {

    protected final Log logger = LogFactory.getLog(this.getClass());
    @Autowired
    private FinalOrderService service;

    @PostMapping("/api/create/order")
    public OrderPojo createPaymentIntent(@RequestBody OrderPojo request) {
logger.info(request);
        return service.createOrder(request);

    }
}
