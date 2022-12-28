package com.demo.springAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MerchantServiceAspect {
    @Before(value = "execution(* com.demo.springAOP.service.MerchantService.*(..)) and args(name,merchantId)")
    public void beforeAdvice(JoinPoint joinPoint, String name, String merchantId) {
        System.out.println("Before method:" + joinPoint.getSignature());

        System.out.println("Creating Merchant with name - " + name + " and id - " + merchantId);
    }

    @After(value = "execution(* com.demo.springAOP.service.MerchantService.*(..)) and args(name,merchantId)")
    public void afterAdvice(JoinPoint joinPoint, String name, String merchantId) {
        System.out.println("After method:" + joinPoint.getSignature());

        System.out.println("Successfully created Merchant with name - " + name + " and id - " + merchantId);
    }
}
