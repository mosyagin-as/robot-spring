package ru.javabegin.training.spring.autowire.impls.toshiba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.autowire.interfaces.Leg;

@Component
public class ToshibaLeg implements Leg {
    private static final Logger logger = LoggerFactory.getLogger(ToshibaLeg.class);

    public void go() {
        logger.info("Go to Toshiba!");
    }

}
