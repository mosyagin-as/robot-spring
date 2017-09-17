package ru.javabegin.training.spring.impls.sony;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javabegin.training.spring.interfaces.Hand;

public class SonyHand implements Hand{
	private static Logger logger = LoggerFactory.getLogger(SonyHand.class);
	
	public void catchSomething(){
		logger.info("Catched from Sony!!");
	}

}
