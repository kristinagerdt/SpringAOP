package org.example.springdemo.aspect.after;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class AfterFinallyAdviceAspect {
    @After("execution(* org.example.springdemo.dao.AccountDAO.getAccounts(..))")
    public void afterFinallyGetAccountsAdvice(JoinPoint joinPoint) {
        System.out.println("-----------> Executing @After (finally) on method " + joinPoint.getSignature().toShortString());
    }
}