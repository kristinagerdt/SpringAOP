package org.example.springdemo.aspect.before.order;

import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class PointcutExpression {
    @Pointcut("execution(* org.example.springdemo.dao.*.*(..))")
    public void forDaoPackage() {
    }

    @Pointcut("execution(* org.example.springdemo.dao.*.get*(..))")
    public void getter() {
    }

    @Pointcut("execution(* org.example.springdemo.dao.*.set*(..))")
    public void setter() {
    }

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {
    }
}