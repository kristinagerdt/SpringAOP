package org.example.springdemo.aspect.before.order;

import org.aspectj.lang.annotation.Before;

//@Aspect
//@Order(2)
//@Component
public class LoggingAspect {
    @Before("org.example.springdemo.aspect.before.order.PointcutExpression.forDaoPackageNoGetterSetter()")
    public void beforeDaoPackageNoGetterSetterAdvice() {
        System.out.println("--------> Executing @Before advice in dao package on any method without getters and setters");
    }
}