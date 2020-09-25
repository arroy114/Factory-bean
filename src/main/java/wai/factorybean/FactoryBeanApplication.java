package wai.factorybean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import wai.factorybean.controllers.ListController;

@SpringBootApplication
public class FactoryBeanApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FactoryBeanApplication.class, args);

        ListController listController = (ListController) ctx.getBean("listController");

        System.out.println(listController.getList());
    }

}
