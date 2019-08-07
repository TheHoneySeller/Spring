package yte.intern.springcore.components;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBean {

    public LifeCycleBean () {
        System.out.println( "Constructor");
    }

    @PostConstruct
    public void post() {
        System.out.println( "PostConstruct");
    }

    @PreDestroy
    public void pre() {
        System.out.println( "PreDestroy");
    }

    public void print() {
        System.out.println( "In print");
    }
}
