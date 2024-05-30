package portfolio;

enum TransactionEnumType {
    BUY, SELL
}

public class Transaction {
    private TransactionEnumType transactionEnumType;
    private CryptoCurrency currency;
    private double quantity;
    private double price;

    public Transaction(TransactionEnumType transactionType, CryptoCurrency currency, double quantity, double price) {
        this.transactionEnumType = transactionType;
        this.currency = currency;
        this.quantity = quantity;
        this.price = price;


    }
    @Override
    public String toString() {
        return "Transaction: " + transactionEnumType + ", Cryptocurrency: " + currency.getName() +
                " (" + currency.getSymbol() + "), Quantity: " + quantity + ", Price: " + price;
    }
    public double getTransactionQuantity() {
        return quantity;
    }

    public TransactionEnumType getTransactionType() {
        return transactionEnumType;
    }
    public CryptoCurrency getCryptoCurrency() {
        return currency;
    }
}


