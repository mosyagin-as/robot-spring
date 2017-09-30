package ru.javabegin.training.spring.core.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Ajantis on 16.09.2017.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    private static Logger logger = LoggerFactory.getLogger(MyBeanPostProcessor.class);

    public Object postProcessBeforeInitialization(Object object, String s) throws BeansException {
        logger.info(object + " - postProcessBeforeInitialization");
        return object;
    }

    public Object postProcessAfterInitialization(Object object, String s) throws BeansException {
        logger.info(object + " - postProcessAfterInitialization");
        return object;
    }
}
