package _03_method_writing._4_calculator;

import java.net.URI;

import javax.swing.JOptionPane;

public class Calculator {

	// GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int rickRoll = 4;
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add", "rickRoll" }, null);
		System.out.println(task);
		// 3) Call the correct method depending on what option the user chooses
		int result = 0;
		if (task == 0) {
			result = divide(number1, number2);
			
		} else if (task == 1) {
			result = multiply(number1, number2);
		} else if (task == 2) {

			result = subtract(number1, number2);
			
		} else if (task == 3) {
			result = add(number1, number2);
			
	// 4) Call the result() method and put the answer in a pop-up
		}
		else if (task==rickRoll) {
			playVideo("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
		}
		System.out.println(result(result));
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	// They should each take 2 numbers as parameters
	// and return the answer.
	static int add(int number1, int number2) {
		return number2 + number1;

	}

	static int subtract(int number1, int number2) {
		return number2 - number1;

	}

	static int multiply(int number1, int number2) {
		return number2 * number1;

	}

	static int divide(int number1, int number2) {
		return number2 / number1;

	}
	 
	// 2) Make a static method called " result" that takes a number
	// as a parameter and returns the number in a string
	// EX: "Your answer is " + number;
	static String result(int number1) {
		return "Your answer is " + number1;
		
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

