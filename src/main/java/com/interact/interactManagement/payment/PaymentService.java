package com.interact.interactManagement.payment;

import com.razorpay.RazorpayException;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface PaymentService {
    ResponseEntity<Map<String, Object>> CreateOrder(PaymentPojo request) throws RazorpayException;
}
