package ru.javabegin.training.spring.impls.sony;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javabegin.training.spring.interfaces.Head;

public class SonyHead implements Head {
	private static Logger logger = LoggerFactory.getLogger(SonyHead.class);
	
	public void calc(){
		logger.info("Thinking about Sony...");
	}

}
