# Payflow-transaction-contracts

This repo holds the shared **contract classes** (Java records) for PayFlow transactions.
It is used by **[PayFlow-Inbound-Pipeline](https://github.com/kostaskara21/my-package-tracking-system)**, which maps incoming transaction data to these models.

- **Group:** `com.example.payflow`
- **Artifact:** `payflow-transaction-contracts`
- **Version:** `1.0.0`
- **Java:** 17
- **Package:** `com.example.payflow.contracts`

## Classes

### `Transaction`
The root object. It holds the other contracts.

| Attribute         | Type                             |
|-------------------|----------------------------------|
| `transactionId`   | `String`                         |
| `transactionType` | `String`                         |
| `amount`          | `BigDecimal`                     |
| `currency`        | `String`                         |
| `status`          | `String`                         |
| `merchant`        | `Merchant`                       |
| `customer`        | `Customer`                       |
| `payment`         | `Payment`                        |
| `adjustments`     | `List<Adjustment>`               |
| `statusHistory`   | `List<TransactionStatusHistory>` |

### `Merchant`
| Attribute      | Type     |
|----------------|----------|
| `merchantCode` | `String` |
| `name`         | `String` |
| `country`      | `String` |

### `Customer`
| Attribute      | Type     |
|----------------|----------|
| `customerCode` | `String` |
| `name`         | `String` |
| `email`        | `String` |

### `Payment`
| Attribute           | Type     |
|---------------------|----------|
| `method`            | `String` |
| `cardBrand`         | `String` |
| `cardLast4`         | `String` |
| `authorizationCode` | `String` |

### `Adjustment`
| Attribute  | Type         |
|------------|--------------|
| `type`     | `String`     |
| `amount`   | `BigDecimal` |
| `currency` | `String`     |

### `TransactionStatusHistory`
| Attribute   | Type      |
|-------------|-----------|
| `status`    | `String`  |
| `timestamp` | `Instant` |

## Structure

```
Transaction
├── Merchant
├── Customer
├── Payment
├── List<Adjustment>
└── List<TransactionStatusHistory>
```

## Using it in PayFlow-Inbound-Pipeline

### 1. Clone the repositories

Clone both repos side by side in the same folder:

```bash
git clone https://github.com/kostaskara21/payflow-transaction-contracts.git
git clone https://github.com/kostaskara21/PayFlow-Inbound-Pipeline.git
```

### 2. Install the contracts into your local Maven repository

```bash
cd payflow-transaction-contracts
mvn clean install
```

This builds the jar and installs it into `~/.m2/repository/com/example/payflow/payflow-transaction-contracts/1.0.0/`.

### 3. Add the dependency to the `pom.xml` of PayFlow-Inbound-Pipeline

```xml
<dependency>
    <groupId>com.example.payflow</groupId>
    <artifactId>payflow-transaction-contracts</artifactId>
    <version>1.0.0</version>
</dependency>
```

### 4. Build or run the pipeline

```bash
cd ../PayFlow-Inbound-Pipeline
mvn clean install
mvn spring-boot:run
```

### 5. Import the classes

```java
import com.example.payflow.contracts.Transaction;
import com.example.payflow.contracts.Merchant;
// ...
```

> When you change the contracts, bump `<version>` in this repo's `pom.xml`, run `mvn clean install` again, and update the version in the pipeline's `pom.xml`.
