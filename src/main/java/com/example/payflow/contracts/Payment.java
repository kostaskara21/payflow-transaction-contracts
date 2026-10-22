package com.example.payflow.contracts;

import java.util.Objects;

public class Payment {

    private String method;
    private String cardBrand;
    private String cardLast4;
    private String authorizationCode;

    public Payment() {
    }

    public Payment(String method, String cardBrand, String cardLast4, String authorizationCode) {
        this.method = method;
        this.cardBrand = cardBrand;
        this.cardLast4 = cardLast4;
        this.authorizationCode = authorizationCode;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    public String getCardLast4() {
        return cardLast4;
    }

    public void setCardLast4(String cardLast4) {
        this.cardLast4 = cardLast4;
    }

    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment that)) return false;
        return Objects.equals(method, that.method)
                && Objects.equals(cardBrand, that.cardBrand)
                && Objects.equals(cardLast4, that.cardLast4)
                && Objects.equals(authorizationCode, that.authorizationCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, cardBrand, cardLast4, authorizationCode);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "method='" + method + '\'' +
                ", cardBrand='" + cardBrand + '\'' +
                ", cardLast4='" + cardLast4 + '\'' +
                ", authorizationCode='" + authorizationCode + '\'' +
                '}';
    }
}
