package com.kelgwiin.demoaop.service.api;

import com.kelgwiin.demoaop.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DemoServiceImpl implements DemoService {
    @Override
    public Person getPerson() {
        return new Person("Pepe", "Suarez", 22);
    }
}
