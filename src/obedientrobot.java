import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	static Robot rob = new Robot();
public static void main(String[] args) {
	
String question = JOptionPane.showInputDialog("Which shape do you want?");{
	
if (question.equals("square")) {
drawSquare();
}

if(question.equals("triangle")) {
	drawTriangle();
}

if(question.contentEquals("circle")) {
drawCircle();
}

}
}







	static void drawSquare(){
		rob.setSpeed(100);
		rob.penDown();
		for (int i = 0; i < 4; i++) {
			
		
		rob.move(100);
		rob.turn(90);
		}
	}
	
	
	static void drawTriangle() {
		rob.setSpeed(100);
		rob.penDown();
		
		rob.turn(-90);
		for (int i = 0; i < 3; i++) {
			
		
			rob.turn(120);
			rob.move(100);
		}
	}
	
	
	static void drawCircle() {
		rob.setSpeed(200);
		rob.penDown();
		
		for (int i = 0; i < 360; i++) {
			
		rob.turn(1);
		rob.move(1);
		
		
		}
		
		
		
		
	}
	
	
	
	
	
	

}
