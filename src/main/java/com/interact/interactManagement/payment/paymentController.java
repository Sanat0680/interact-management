package com.interact.interactManagement.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/dev")// Allow frontend access
public class paymentController {

    @Autowired
    private PaymentService stripeService;

    @PostMapping("/api/payments")
    public ResponseEntity<Map<String, Object>> createPaymentIntent(@RequestBody PaymentPojo request) {
        try {
            ResponseEntity<Map<String, Object>> response = stripeService.CreateOrder(request);
            return ResponseEntity.ok(response.getBody());
        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("error", e.getMessage()));
        }
    }
}
