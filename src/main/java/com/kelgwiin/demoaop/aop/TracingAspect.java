package com.kelgwiin.demoaop.aop;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/**
 * Class: TracingAspect
 *
 * @author: Kelwin Gamez
 * Date: 7/12/2019 4:49 PM
 */
@Slf4j
@Component
@Aspect
public class TracingAspect {
    @Getter
    private boolean enteringCalled;

    public TracingAspect(){
        this.enteringCalled = false;
    }

    @Before(" execution(* com.kelgwiin.demoaop.service.api.DemoService.getPerson()) ")
    public void entering(JoinPoint joinPoint) {
        this.enteringCalled = true;
        log.info("Enter:  " + joinPoint.getStaticPart().getSignature().toString() );
    }
}
