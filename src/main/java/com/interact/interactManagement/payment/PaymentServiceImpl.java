package com.interact.interactManagement.payment;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    ObjectMapper objectMapper;


    @Value("${razorpay.api.key}")
    private String razorpayKey;
    @Value("${razorpay.api.secret}")
    private String razorpaySecret;

    public ResponseEntity<Map<String, Object>> CreateOrder(OrderPojo order) throws RazorpayException {

        try {
            RazorpayClient razorpay = new RazorpayClient(razorpayKey, razorpaySecret);

            JSONObject options = new JSONObject();
            options.put("amount", order.getAmount() * 100);
            options.put("currency", order.getCurrency());
            options.put("receipt", order.getId());
            options.put("payment_capture", 1);

            Order razorOrder = razorpay.orders.create(options);

            Map<String, Object> orderMap = new ObjectMapper().readValue(
                    razorOrder.toString(),
                    new TypeReference<Map<String, Object>>() {
                    }
            );

            return ResponseEntity.ok(orderMap);

        } catch (Exception e) {
            return ResponseEntity.status(500).body(Map.of("error", e.getMessage()));
        }
    }
}
