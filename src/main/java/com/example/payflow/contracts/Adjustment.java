package com.example.payflow.contracts;

import java.math.BigDecimal;
import java.util.Objects;

public class Adjustment {

    private String type;
    private BigDecimal amount;
    private String currency;

    public Adjustment() {
    }

    public Adjustment(String type, BigDecimal amount, String currency) {
        this.type = type;
        this.amount = amount;
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adjustment that)) return false;
        return Objects.equals(type, that.type)
                && Objects.equals(amount, that.amount)
                && Objects.equals(currency, that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, amount, currency);
    }

    @Override
    public String toString() {
        return "Adjustment{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
