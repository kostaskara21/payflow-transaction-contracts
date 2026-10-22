package com.example.payflow.contracts;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Transaction {

    private String transactionId;
    private String transactionType;
    private BigDecimal amount;
    private String currency;
    private String status;
    private Merchant merchant;
    private Customer customer;
    private Payment payment;
    private List<Adjustment> adjustments;
    private List<TransactionStatusHistory> statusHistory;

    public Transaction() {
    }

    public Transaction(String transactionId,
                       String transactionType,
                       BigDecimal amount,
                       String currency,
                       String status,
                       Merchant merchant,
                       Customer customer,
                       Payment payment,
                       List<Adjustment> adjustments,
                       List<TransactionStatusHistory> statusHistory) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.currency = currency;
        this.status = status;
        this.merchant = merchant;
        this.customer = customer;
        this.payment = payment;
        this.adjustments = adjustments;
        this.statusHistory = statusHistory;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Adjustment> getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(List<Adjustment> adjustments) {
        this.adjustments = adjustments;
    }

    public List<TransactionStatusHistory> getStatusHistory() {
        return statusHistory;
    }

    public void setStatusHistory(List<TransactionStatusHistory> statusHistory) {
        this.statusHistory = statusHistory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction that)) return false;
        return Objects.equals(transactionId, that.transactionId)
                && Objects.equals(transactionType, that.transactionType)
                && Objects.equals(amount, that.amount)
                && Objects.equals(currency, that.currency)
                && Objects.equals(status, that.status)
                && Objects.equals(merchant, that.merchant)
                && Objects.equals(customer, that.customer)
                && Objects.equals(payment, that.payment)
                && Objects.equals(adjustments, that.adjustments)
                && Objects.equals(statusHistory, that.statusHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, transactionType, amount, currency, status,
                merchant, customer, payment, adjustments, statusHistory);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                ", merchant=" + merchant +
                ", customer=" + customer +
                ", payment=" + payment +
                ", adjustments=" + adjustments +
                ", statusHistory=" + statusHistory +
                '}';
    }
}
