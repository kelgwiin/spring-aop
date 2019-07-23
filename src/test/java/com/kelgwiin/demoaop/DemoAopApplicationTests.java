package com.kelgwiin.demoaop;

import com.kelgwiin.demoaop.aop.TracingAspect;
import com.kelgwiin.demoaop.service.api.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoAopApplicationTests {

	@Autowired
	TracingAspect tracingAspect;

	@Autowired
	DemoService demoService;

	@Test
	public void aspectCalled() {
		assertFalse(tracingAspect.isEnteringCalled());
		demoService.getPerson();
		assertTrue(tracingAspect.isEnteringCalled());
	}

}
