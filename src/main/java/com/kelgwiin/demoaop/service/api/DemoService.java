package com.kelgwiin.demoaop.service.api;

import com.kelgwiin.demoaop.model.Person;
import io.reactivex.Observable;
import io.reactivex.Single;

public interface DemoService {
    Person getPerson();
}
