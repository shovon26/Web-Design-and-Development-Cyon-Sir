package edu.weblab.diandwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class DiandwebappApplication {   //DI=Dependency Injection

    public static void main(String[] args) {
        ConfigurableApplicationContext context;
        context = SpringApplication.run(DiandwebappApplication.class, args);

        Student st;
        st = context.getBean(Student.class);
        st.show();

    }

}
