package ru.javabegin.training.spring.autowire.impls.sony;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javabegin.training.spring.autowire.interfaces.Head;

public class SonyHead implements Head {
    private static final Logger logger = LoggerFactory.getLogger(SonyHead.class);

    public void calc() {
        logger.info("Thinking about Sony...");
    }

}
