
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 10th";
		String dadsBirthday = "November 29th";
		String myBirthday = "April 26th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String question = JOptionPane.showInputDialog("Type in either, dad, mom, or me.");
		// 3. Print out what the user typed
		System.out.println(question);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(question.equalsIgnoreCase("Mom")) {
        System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(question.equalsIgnoreCase("Dad")) {
        System.out.println(dadsBirthday);
        }
		// 6. if user asked for your name
			// print myBirthday
		else if(question.equalsIgnoreCase("Me")) {
        System.out.println(myBirthday);
        }
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
        else {
        	System.out.println("Sorry, i don't remember that person's birthday!");
        }
	} 
}
