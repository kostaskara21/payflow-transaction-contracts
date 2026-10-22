package com.example.payflow.contracts;

import java.util.Objects;

public class Merchant {

    private String merchantCode;
    private String name;
    private String country;

    public Merchant() {
    }

    public Merchant(String merchantCode, String name, String country) {
        this.merchantCode = merchantCode;
        this.name = name;
        this.country = country;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Merchant that)) return false;
        return Objects.equals(merchantCode, that.merchantCode)
                && Objects.equals(name, that.name)
                && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(merchantCode, name, country);
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "merchantCode='" + merchantCode + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
