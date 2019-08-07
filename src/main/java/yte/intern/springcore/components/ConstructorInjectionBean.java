package yte.intern.springcore.components;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {
    public void print() {
        System.out.println( "Constructor Injection");
    }
}
