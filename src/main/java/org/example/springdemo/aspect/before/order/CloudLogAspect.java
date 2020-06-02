package org.example.springdemo.aspect.before.order;

import org.aspectj.lang.annotation.Before;

//@Aspect
//@Order(1)
//@Component
public class CloudLogAspect {
    @Before("org.example.springdemo.aspect.before.order.PointcutExpression.forDaoPackageNoGetterSetter()")
    public void beforeLogToCloudAdvice() {
        System.out.println("--------> Logging to Cloud");
    }
}