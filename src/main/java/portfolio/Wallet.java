package portfolio;

import java.util.ArrayList;

public class Wallet {
    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }

    public Wallet() {
        this.balance = 0;
        this.transactionList = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private ArrayList<Transaction> transactionList;

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }
    public Transaction getTransaction(int index){
        if (index < 0 || index >= transactionList.size()) {
            return null;
        }else {
            return transactionList.get(index);
        }
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }
}

