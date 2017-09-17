package ru.javabegin.training.spring.impls.conveyor;

import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.RobotConveyor;

/**
 * Created by Ajantis on 17.09.2017.
 */
public abstract class T1000Conveyor implements RobotConveyor {

    public abstract Robot createRobot();
}
