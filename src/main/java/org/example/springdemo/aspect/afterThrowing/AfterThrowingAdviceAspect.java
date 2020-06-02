package org.example.springdemo.aspect.afterThrowing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class AfterThrowingAdviceAspect {
    @AfterThrowing(
            pointcut = "execution(* org.example.springdemo.dao.AccountDAO.getAccounts(..))",
            throwing = "exception")
    public void afterThrowingGetAccountsAdvice(JoinPoint joinPoint, Throwable exception) {
        System.out.println("-----------> Executing @AfterThrowing on method " + joinPoint.getSignature().toShortString());
        System.out.println("The exception: " + exception);
    }
}