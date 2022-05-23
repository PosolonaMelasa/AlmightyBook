package com.example.almightybook.orders.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum Delivery {
    SELF_PICKUP(BigDecimal.ZERO),
    COURIER(new BigDecimal("9.90"));

    private final BigDecimal price;
}
