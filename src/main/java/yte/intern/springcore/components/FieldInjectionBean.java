package yte.intern.springcore.components;

import org.springframework.stereotype.Component;

@Component
public class FieldInjectionBean {
    public void print() {
        System.out.println( "Field Injecton");
    }
}
