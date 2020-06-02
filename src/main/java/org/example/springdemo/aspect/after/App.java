package org.example.springdemo.aspect.after;

import org.example.springdemo.config.SpringConfig;
import org.example.springdemo.dao.AccountDAO;
import org.example.springdemo.model.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountDAO accountDAO = context.getBean(AccountDAO.class);
        List<Account> accounts = null;

        try {
            accounts = accountDAO.getAccounts(false);
            accounts = accountDAO.getAccounts(true);
        } catch (Exception e) {
            System.out.println("Main App caught an exception: " + e.getMessage());
        }

        System.out.println("-----------> Main App");
        System.out.println(accounts);

        context.close();
    }
}