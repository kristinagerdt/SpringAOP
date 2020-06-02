package org.example.springdemo.aspect.before;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class BeforeAdviceAspect {
    @Before(value = "execution(public void org.example.springdemo.dao.AccountDAO.addAccount())")
    public void beforeAccountDaoPublicVoidAddAccountAdvice() {
        System.out.println("-----------> Executing @Before advice on public void method addAccount() in AccountDAO class");
    }

    @Before(value = "execution(public void addAccount())")
    public void beforeAnyClassPublicVoidAddAccountAdvice() {
        System.out.println("-----------> Executing @Before advice on public void method addAccount() in any class");
    }

    @Before(value = "execution(public void add*())")
    public void beforeAnyClassPublicVoidAddAdvice() {
        System.out.println("-----------> Executing @Before advice on public void method add*() in any class");
    }

    @Before(value = "execution(* add*())")
    public void beforeAnyClassAddAdvice() {
        System.out.println("-----------> Executing @Before advice on * * method add*() in any class");
    }

    @Before(value = "execution(* org.example.springdemo.dao.*.add*())")
    public void beforeDaoPackageAddAdvice() {
        System.out.println("-----------> Executing @Before advice in dao package method add*() in any class");
    }

    @Before(value = "execution(* org.example.springdemo.dao.*.add*(..))")
    public void beforeDaoPackageAddArgsAdvice() {
        System.out.println("-----------> Executing @Before advice in dao package method add*(args) in any class");
    }

    @Before(value = "execution(* org.example.springdemo.dao.*.add*(java.lang.String))")
    public void beforeDaoPackageAddStringArgAdvice() {
        System.out.println("-----------> Executing @Before advice in dao package method add*(String arg) in any class");
    }

    @Before(value = "execution(* org.example.springdemo.dao.*.add*(java.lang.String, ..))")
    public void beforeDaoPackageAddStringAndMoreArgsAdvice() {
        System.out.println("-----------> Executing @Before advice in dao package method add*(String arg, ..) in any class");
    }
}