package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class rtpbpt {
	static Robot myRobot=new Robot();
public static void main(String[] args) {
drawSquare();


}

public static void drawSquare() {
	System.out.println("drawSquare");
	myRobot.penDown();
	myRobot.move(50);
	myRobot.turn(90);
	myRobot.move(50);
	myRobot.turn(90);
	myRobot.move(50);
	myRobot.turn(90);
	myRobot.move(50);

}
}
