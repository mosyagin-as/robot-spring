package ru.javabegin.training.spring.core.impls.toshiba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javabegin.training.spring.core.interfaces.Head;

public class ToshibaHead implements Head {
	private static Logger logger = LoggerFactory.getLogger(ToshibaHead.class);
	
	public void calc(){
		logger.info("Thinking about Toshiba...");
	}

}
