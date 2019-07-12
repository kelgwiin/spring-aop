package com.kelgwiin.demoaop.aop;

import lombok.extern.slf4j.Slf4j;
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

    @Before(" execution(Person getPerson()) ")
    public void entering() {
        log.info("Enter: getPerson()" );
    }
}
