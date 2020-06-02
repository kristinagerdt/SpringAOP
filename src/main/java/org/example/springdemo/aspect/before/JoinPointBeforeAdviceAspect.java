package org.example.springdemo.aspect.before;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class JoinPointBeforeAdviceAspect {
    @Before(value = "execution(* org.example.springdemo.dao.*.*(..))")
    public void beforeDaoPackageAnyMethodsAnyArgsAdvice(JoinPoint joinPoint) {
        System.out.println("-----------> Executing @Before advice in dao package on any method (args) in any class");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method: " + methodSignature);

        Object[] args = joinPoint.getArgs();
        System.out.println("Args: ");
        for (Object arg : args) {
            System.out.println(arg);

            if (arg instanceof String) {
                String string = (String) arg;
                System.out.println(string.toUpperCase());
            }
        }
    }
}