package org.example.springdemo.aspect.afterReturning;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.example.springdemo.model.Account;
import org.springframework.stereotype.Component;

import java.util.List;

//@Aspect
//@Component
public class AfterReturningAdviceAspect {
    @AfterReturning(
            pointcut = "execution(* org.example.springdemo.dao.AccountDAO.getAccounts(..))",
            returning = "result")
    public void afterReturningGetAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
        System.out.println("-----------> Executing @AfterReturning on method " + joinPoint.getSignature().toShortString());
        System.out.println("Result: " + result);

        if (!result.isEmpty()) {
            Account account = result.get(0);
            account.setName("Daffy Duck");

            convertNameToUpperCase(result);
        }
    }

    private void convertNameToUpperCase(List<Account> result) {
        result.forEach(a -> a.setName(a.getName().toUpperCase()));
    }
}