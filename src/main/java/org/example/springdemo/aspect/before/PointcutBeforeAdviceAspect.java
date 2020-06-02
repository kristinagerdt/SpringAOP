package org.example.springdemo.aspect.before;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class PointcutBeforeAdviceAspect {
    @Pointcut(value = "execution(* org.example.springdemo.dao.*.*(..))")
    private void forDaoPackage() {
    }

    @Before("forDaoPackage()")
    public void beforeDaoPackageAnyMethodsAnyArgsAdvice() {
        System.out.println("-----------> Executing @Before advice in dao package on any method (args) in any class");
    }

    @Before("forDaoPackage()")
    public void beforePerformApiAnalyticsAdvice() {
        System.out.println("-----------> Executing @Before advice perform API Analytics");
    }

    @Pointcut(value = "execution(* org.example.springdemo.dao.*.get*(..))")
    private void getter() {
    }

    @Pointcut(value = "execution(* org.example.springdemo.dao.*.set*(..))")
    private void setter() {
    }

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void forDaoPackageNoGetterSetter() {
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeDaoPackageNoGetterSetterAdvice() {
        System.out.println("-----------> Executing @Before advice in dao package on any method without getters and setters");
    }
}