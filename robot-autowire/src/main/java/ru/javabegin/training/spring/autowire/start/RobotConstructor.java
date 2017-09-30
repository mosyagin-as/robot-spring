package ru.javabegin.training.spring.autowire.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring.autowire.impls.robot.ModelT1000;


public class RobotConstructor {
    static Logger logger = LoggerFactory.getLogger(RobotConstructor.class);

    public static void main(String[] args) {
        logger.info("START RobotConstructor");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        ModelT1000 t1000Simple = (ModelT1000) context.getBean("model1");
        t1000Simple.action();
    }
}
