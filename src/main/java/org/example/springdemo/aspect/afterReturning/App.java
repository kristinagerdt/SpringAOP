package org.example.springdemo.aspect.afterReturning;

import org.example.springdemo.config.SpringConfig;
import org.example.springdemo.dao.AccountDAO;
import org.example.springdemo.model.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountDAO accountDAO = context.getBean(AccountDAO.class);
        List<Account> accounts = accountDAO.getAccounts(false);

        System.out.println("-----------> Main App");
        System.out.println(accounts);

        context.close();
    }
}