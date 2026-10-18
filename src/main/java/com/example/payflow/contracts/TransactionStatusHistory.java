package com.example.payflow.contracts;

import java.time.Instant;

public record TransactionStatusHistory(
        String status,
        Instant timestamp
) {}
