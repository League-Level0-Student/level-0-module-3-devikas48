//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bob = new Robot();
		//3. Ask the user what color they would like the robot to draw
		
		//5. Use an if/else statement to set the pen color that the user requested
		
for (int i = 0; i < 5; i++) {
	bob.penDown();
bob.setSpeed(50);
String question = JOptionPane.showInputDialog("What color do you want the robot to draw?(blue or green)");	

if(question.equals("blue")) {
	bob.setPenColor(Color.blue);

} 
else if (question.equals("green")){
	bob.setPenColor(Color.green);
}

else {
	bob.setPenColor(Color.red);
}
bob.setPenWidth(50);

bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);


}
        //6. If the user doesn’t enter anything, choose a random color


        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		




	}
}
