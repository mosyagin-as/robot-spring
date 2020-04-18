package ru.javabegin.training.spring.autowire.impls.sony;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javabegin.training.spring.autowire.interfaces.Hand;

public class SonyHand implements Hand {
    private static final Logger logger = LoggerFactory.getLogger(SonyHand.class);

    public void catchSomething() {
        logger.info("Catched from Sony!!");
    }

}
