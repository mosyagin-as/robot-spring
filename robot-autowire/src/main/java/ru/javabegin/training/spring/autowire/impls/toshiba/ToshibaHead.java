package ru.javabegin.training.spring.autowire.impls.toshiba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.autowire.interfaces.Head;

@Component
public class ToshibaHead implements Head {
    private static final Logger logger = LoggerFactory.getLogger(ToshibaHead.class);

    public void calc() {
        logger.info("Thinking about Toshiba...");
    }

}
