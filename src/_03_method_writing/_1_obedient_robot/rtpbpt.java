package _03_method_writing._1_obedient_robot;

import java.net.URI;

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
				if(answer.equals("rickRoll")) {
					JOptionPane.showMessageDialog(null,"We're no strangers to love\n" + 
							"You know the rules and so do I (do I)\n" + 
							"A full commitment's what I'm thinking of\n" + 
							"You wouldn't get this from any other guy\n" + 
							"I just wanna tell you how I'm feeling\n" + 
							"Gotta make you understand\n" + 
							"Never gonna give you up\n" + 
							"Never gonna let you down\n" + 
							"Never gonna run around and desert you\n" + 
							"Never gonna make you cry\n" + 
							"Never gonna say goodbye\n" + 
							"Never gonna tell a lie and hurt you\n" + 
							"We've known each other for so long\n" + 
							"Your heart's been aching, but you're too shy to say it (say it)\n" + 
							"Inside, we both know what's been going on (going on)\n" + 
							"We know the game and we're gonna play it\n" + 
							"And if you ask me how I'm feeling\n" + 
							"Don't tell me you're too blind to see\n" + 
							"Never gonna give you up\n" + 
							"Never gonna let you down\n" + 
							"Never gonna run around and desert you\n" + 
							"Never gonna make you cry\n" + 
							"Never gonna say goodbye\n" + 
							"Never gonna tell a lie and hurt you\n" + 
							"Never gonna give you up\n" + 
							"Never gonna let you down\n" + 
							"Never gonna run around and desert you\n" + 
							"Never gonna make you cry\n" + 
							"Never gonna say goodbye\n" + 
							"Never gonna tell a lie and hurt you\n" + 
							"We've known each other for so long\n" + 
							"Your heart's been aching, but you're too shy to say it (to say it)\n" + 
							"Inside, we both know what's been going on (going on)\n" + 
							"We know the game and we're gonna play it\n" + 
							"I just wanna tell you how I'm feeling\n" + 
							"Gotta make you understand\n" + 
							"Never gonna give you up\n" + 
							"Never gonna let you down\n" + 
							"Never gonna run around and desert you\n" + 
							"Never gonna make you cry\n" + 
							"Never gonna say goodbye\n" + 
							"Never gonna tell a lie and hurt you\n" + 
							"Never gonna give you up\n" + 
							"Never gonna let you down\n" + 
							"Never gonna run around and desert you\n" + 
							"Never gonna make you cry\n" + 
							"Never gonna say goodbye\n" + 
							"Never gonna tell a lie and hurt you\n" + 
							"Never gonna give you up\n" + 
							"Never gonna let you down\n" + 
							"Never gonna run around and desert you\n" + 
							"Never gonna make you cry\n" + 
							"Never gonna say goodbye\n" + 
							"Never gonna tell a lie and hurt you");
							playVideo("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
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
System.out.println("drawCircle");
	myRobot.penDown();
for ( int i = 0; i < 360; i++){
	myRobot.turn(1);
	myRobot.move(1);
}
	

	
}
		
	

static void playVideo(String videoURL) {
	try {
		URI uri = new URI(videoURL);
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}


}

}

