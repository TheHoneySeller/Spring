package yte.intern.springcore.components;

import org.springframework.stereotype.Component;

@Component
public class SetterInjectionBean {
    public void print() {
        System.out.println( "Setter Injection");
    }
}
