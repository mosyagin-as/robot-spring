package ru.javabegin.training.spring.autowire.impls.sony;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javabegin.training.spring.autowire.interfaces.Leg;

public class SonyLeg implements Leg {
    private static final Logger logger = LoggerFactory.getLogger(SonyLeg.class);

    public void go() {
        logger.info("Go to Sony!");
    }

}
