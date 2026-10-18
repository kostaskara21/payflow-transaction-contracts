package com.example.payflow.contracts;

public record Payment(
        String method,
        String cardBrand,
        String cardLast4,
        String authorizationCode
) {}
