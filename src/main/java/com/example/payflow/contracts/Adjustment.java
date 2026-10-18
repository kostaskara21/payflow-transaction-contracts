package com.example.payflow.contracts;

import java.math.BigDecimal;

public record Adjustment(
        String type,
        BigDecimal amount,
        String currency
) {}
