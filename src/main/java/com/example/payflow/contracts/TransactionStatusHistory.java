package com.example.payflow.contracts;

import java.time.Instant;
import java.util.Objects;

public class TransactionStatusHistory {

    private String status;
    private Instant timestamp;

    public TransactionStatusHistory() {
    }

    public TransactionStatusHistory(String status, Instant timestamp) {
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionStatusHistory that)) return false;
        return Objects.equals(status, that.status)
                && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, timestamp);
    }

    @Override
    public String toString() {
        return "TransactionStatusHistory{" +
                "status='" + status + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
