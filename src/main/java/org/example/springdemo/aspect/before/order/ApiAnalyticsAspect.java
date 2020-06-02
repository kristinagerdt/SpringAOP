package org.example.springdemo.aspect.before.order;

import org.aspectj.lang.annotation.Before;

//@Aspect
//@Order(3)
//@Component
public class ApiAnalyticsAspect {
    @Before("org.example.springdemo.aspect.before.order.PointcutExpression.forDaoPackageNoGetterSetter()")
    public void beforePerformApiAnalyticsAdvice() {
        System.out.println("--------> Performing API analytics");
    }
}