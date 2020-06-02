package org.example.springdemo.aspect.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class AroundAdviceAspect {
    private static Logger logger = Logger.getLogger(AroundAdviceAspect.class.getName());

    @Around(value = "execution(* org.example.springdemo.service.TrafficFortuneService.getFortune())")
    public Object aroundGetFortuneAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().toShortString();
        logger.info("-----------> Executing @Around on method " + methodName);
        long begin = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        logger.info("Duration: " + (end - begin) / 1000.0 + " seconds");
        return result;
    }

    @Around(value = "execution(* org.example.springdemo.service.TrafficFortuneService.getFortune(*))")
    public Object aroundGetFortuneBooleanArgWithExceptionAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().toShortString();
        logger.info("-----------> Executing @Around on method " + methodName);
        long begin = System.currentTimeMillis();
        Object result;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            logger.warning("@Around advice: We have a problem " + e);
            result = "Major accident! But no worries!";
        }
        long end = System.currentTimeMillis();
        logger.info("Duration: " + (end - begin) / 1000.0 + " seconds");
        return result;
    }

    @Around(value = "execution(* org.example.springdemo.service.TrafficFortuneService.getFortune(*))")
    public Object aroundGetFortuneBooleanArgWithRethrowingExceptionAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().toShortString();
        logger.info("-----------> Executing @Around on method " + methodName);
        long begin = System.currentTimeMillis();
        Object result;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            logger.warning("@Around advice: We have a problem " + e);
            throw e;
        }
        long end = System.currentTimeMillis();
        logger.info("Duration: " + (end - begin) / 1000.0 + " seconds");
        return result;
    }
}