package com.demo.domain.test.services;

import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

@RequestScoped
@Getter
@Setter
public class HelloService {

    private String userName;
    private String userLastName;

    public String call() {
        return "Hello world";
    }
}
