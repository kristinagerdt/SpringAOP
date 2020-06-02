package org.example.springdemo.dao;

import org.example.springdemo.model.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {
    public void addAccount() {
        System.out.println("[" + getClass() + "] doing work in DB... adding an Account");
    }

    public List<Account> getAccounts(boolean tripWire) {
        if (tripWire) {
            throw new RuntimeException("Runtime Exception!");
        }

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Alex", "Silver"));
        accounts.add(new Account("Ann", "Gold"));
        accounts.add(new Account("Max", "Platinum"));
        return accounts;
    }
}