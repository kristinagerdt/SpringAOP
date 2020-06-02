package org.example.springdemo.aspect.before;

import org.example.springdemo.config.SpringConfig;
import org.example.springdemo.dao.AccountDAO;
import org.example.springdemo.dao.BankAccountDAO;
import org.example.springdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountDAO accountDAO = context.getBean(AccountDAO.class);
        accountDAO.addAccount();
        System.out.println();

        MembershipDAO membershipDAO = context.getBean(MembershipDAO.class);
        membershipDAO.addAccount();
        System.out.println();

        BankAccountDAO bankAccountDAO = context.getBean(BankAccountDAO.class);
        bankAccountDAO.addAccount("class org.example.springdemo.dao.BankAccountDAO");
        System.out.println();

        bankAccountDAO.addBankAccount("class org.example.springdemo.dao.BankAccountDAO", true);
        bankAccountDAO.getIban();

        context.close();
    }
}