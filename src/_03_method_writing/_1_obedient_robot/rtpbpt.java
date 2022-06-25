package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class rtpbpt {
	static Robot myRobot = new Robot();

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "WHAT SHAPE WOULD U LIKE THE ROBOT TO DRAWWWWWWWW!");
		if (answer.equals("drawSquare")) {
			drawSquare();
		} else {
			if (answer.equals("drawTriangle")) {
				drawTriangle();
			}
			else {
				if(answer.equals("drawCircle")) {
					drawCircle();
				}
			
			}
		}

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

	public static void drawTriangle() {
		System.out.println("drawTriangle");
		myRobot.penDown();
		myRobot.turn(120);
		myRobot.move(100);
		myRobot.turn(120);
		myRobot.move(100);
		myRobot.turn(120);
		myRobot.move(100);
	}

public static void drawCircle() {
 myRobot.penDown();
for ( int i = 0; i < 360; i++){
	myRobot.turn(1);
	myRobot.move(50);
}
	

		
	




}
}
