package ru.javabegin.training.spring.autowire.impls.robot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.autowire.interfaces.Hand;
import ru.javabegin.training.spring.autowire.interfaces.Head;
import ru.javabegin.training.spring.autowire.interfaces.Leg;
import ru.javabegin.training.spring.autowire.interfaces.Robot;

/**
 * Created by Ajantis
 * on 09.09.2017.
 */
@Component
public class ModelT1000 implements Robot {
    private static final Logger logger = LoggerFactory.getLogger(ModelT1000.class);

    private Hand hand;

    private Head head;

    private Leg leg;

    private String color;
    private int year;
    private boolean soundEnabled;

    @Autowired
    public ModelT1000(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model1() {
        return new ModelT1000();
    }

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Head head, Leg leg, String color, int year, boolean soundEnabled) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public void action() {
        logger.info("--------||---------");
        if (hand != null) {
            hand.catchSomething();
        } else {
            logger.info("hand is null");
        }
        if (head != null) {
            head.calc();
        } else {
            logger.info("head is null");
        }
        if (leg != null) {
            leg.go();
        } else {
            logger.info("leg is null");
        }

        logger.info("color='" + color);
        logger.info("year=" + year);
        logger.info("soundEnabled=" + soundEnabled);
        logger.info("-------------------");
    }


    public void dance() {
        logger.info("--------||---------");
        logger.info("T1000 is dancing");
        logger.info("-------------------");
    }

    public Hand getHand() {
        return hand;
    }

    //    @Required
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    //    @Required
    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    //    @Required
    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    public void initObject() {
        logger.info("init ModelT100");
    }

    public void destroyObject() {
        logger.info("destroy ModelT100");
    }
}
