package yte.intern.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import yte.intern.springcore.components.DependencyInjectionTest;
import yte.intern.springcore.components.IoCTest;
import yte.intern.springcore.components.LifeCycleBean;

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringcoreApplication.class, args);
		LifeCycleBean bean = ctx.getBean(LifeCycleBean.class);
		bean.print();

	}

}
