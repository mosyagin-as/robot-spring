package ru.javabegin.training.spring.core.impls.robot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by Ajantis on 17.09.2017.
 */
public class ActionReplacer implements MethodReplacer {
    private static final Logger logger = LoggerFactory.getLogger(ActionReplacer.class);

    public Object reimplement(Object o, Method method, Object[] objects) {
        logger.info("!!! Reimplemented method action() !!!");
        return null;
    }
}
