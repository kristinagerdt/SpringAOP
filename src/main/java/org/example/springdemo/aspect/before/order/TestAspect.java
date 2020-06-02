package org.example.springdemo.aspect.before.order;

import org.aspectj.lang.annotation.Before;

//@Aspect
//@Order(3)
//@Component
public class TestAspect {
    @Before("org.example.springdemo.aspect.before.order.PointcutExpression.forDaoPackageNoGetterSetter()")
    public void beforeTestAspect() {
        System.out.println("--------> Executing @Before advice in test aspect");
    }
}