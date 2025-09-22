package com.example.kafka;

public record Order(
        String orderId,
        String product,
        Integer quantity
) {
}
