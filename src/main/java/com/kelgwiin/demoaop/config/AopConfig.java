package com.kelgwiin.demoaop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Class: AopConfig
 *
 * @author Kelwin Gamez (kelgwiin@gmail.com)
 * Date: 7/16/2019 1:41 PM
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.kelgwiin.demoaop.aop")
public class AopConfig {
}
