package org.example5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("execution(* org.example5.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute!!!");
        Object returnedByMethod = joinPoint.proceed(); // Возвращается в аспекте

        logger.info("Method executed and returned " + returnedByMethod);
        return "FALLEN"; // Возвращается в main
    }

}
