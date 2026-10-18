package com.example.payflow.contracts;

import java.math.BigDecimal;
import java.util.List;

public record Transaction(
        String transactionId,
        String transactionType,
        BigDecimal amount,
        String currency,
        String status,
        Merchant merchant,
        Customer customer,
        Payment payment,
        List<Adjustment> adjustments,
        List<TransactionStatusHistory> statusHistory
) {}
