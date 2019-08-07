package yte.intern.springcore.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionTest {

    @Autowired
    public DependencyInjectionTest(ConstructorInjectionBean c) {
        this.c = c;
    }

    @Autowired
    private FieldInjectionBean f;
    private SetterInjectionBean s;
    private ConstructorInjectionBean c;


    @Autowired
    public void setS(SetterInjectionBean s) {
        this.s = s;
    }

    public void print() {
        s.print();
        f.print();
        c.print();
    }
}
