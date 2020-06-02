package org.example.springdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class BankAccountDAO {
    private String iban;

    public String getIban() {
        System.out.println("getIban()");
        return iban;
    }

    public void setIban(String iban) {
        System.out.println("setIban()");
        this.iban = iban;
    }

    public void addAccount(String message) {
        System.out.println("[" + message + "] doing work in DB... adding an BankAccount");
    }

    public void addBankAccount(String message, boolean flag) {
        System.out.println("[" + message + "] " + flag + " doing work in DB... adding an BankAccount");
    }
}