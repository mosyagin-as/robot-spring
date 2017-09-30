package ru.javabegin.training.spring.core.impls.toshiba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javabegin.training.spring.core.interfaces.Hand;

public class ToshibaHand implements Hand{
	private static Logger logger = LoggerFactory.getLogger(ToshibaHand.class);
	
	public void catchSomething(){
		logger.info("Catched from Toshiba!");
	}

}
