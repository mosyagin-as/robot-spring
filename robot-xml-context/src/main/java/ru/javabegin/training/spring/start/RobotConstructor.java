package ru.javabegin.training.spring.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring.impls.conveyor.T1000Conveyor;
import ru.javabegin.training.spring.impls.robot.ModelT1000;
import ru.javabegin.training.spring.interfaces.Robot;


public class RobotConstructor {
    static Logger logger = LoggerFactory.getLogger(RobotConstructor.class);

    public static void main(String[] args) {
        logger.info("START RobotConstructor");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        ModelT1000 t1000Simple = (ModelT1000) context.getBean("t1000_simple");
        t1000Simple.action();

        ModelT1000 t1000Construct = (ModelT1000) context.getBean("t1000_construct");
        t1000Construct.action();

        ModelT1000 t1000PC = (ModelT1000) context.getBean("t1000_p_c");
        t1000PC.action();

        robotConveyorAction(context);

        ModelT1000 t1000Replacer = (ModelT1000) context.getBean("t1000_replacer");
        t1000Replacer.action();
    }

    private static void robotConveyorAction(ApplicationContext context) {
        T1000Conveyor t1000Conveyor = (T1000Conveyor) context.getBean("t1000Conveyor");

        Robot terminator1 = t1000Conveyor.createRobot();
        Robot terminator2 = t1000Conveyor.createRobot();
        Robot terminator3 = t1000Conveyor.createRobot();

        terminator1.action();
        terminator2.action();
        terminator3.action();
    }
}
