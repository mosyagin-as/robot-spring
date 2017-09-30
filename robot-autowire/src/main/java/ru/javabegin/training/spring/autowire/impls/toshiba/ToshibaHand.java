package ru.javabegin.training.spring.autowire.impls.toshiba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.autowire.interfaces.Hand;

@Component
public class ToshibaHand implements Hand{
	private static Logger logger = LoggerFactory.getLogger(ToshibaHand.class);
	
	public void catchSomething(){
		logger.info("Catched from Toshiba!");
	}

}
