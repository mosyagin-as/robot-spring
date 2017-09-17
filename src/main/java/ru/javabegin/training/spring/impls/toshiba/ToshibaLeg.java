package ru.javabegin.training.spring.impls.toshiba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javabegin.training.spring.interfaces.Leg;

public class ToshibaLeg implements Leg {
	private static Logger logger = LoggerFactory.getLogger(ToshibaLeg.class);
	
	public void go(){
		logger.info("Go to Toshiba!");
	}

}
