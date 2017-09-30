package ru.javabegin.training.spring.core.impls.conveyor;

import ru.javabegin.training.spring.core.interfaces.Robot;
import ru.javabegin.training.spring.core.interfaces.RobotConveyor;

/**
 * Created by Ajantis on 17.09.2017.
 */
public abstract class T1000Conveyor implements RobotConveyor {

    public abstract Robot createRobot();
}
