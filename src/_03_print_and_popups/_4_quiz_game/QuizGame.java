package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int unicorn = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
         String code = JOptionPane.showInputDialog("Do you like to fly?");
				// 2.  Ask the user a question 
				JOptionPane.showInputDialog("What is your favorite color");
				// 3.  Use an if statement to check if their answer is correct
         if(code.equals("yes")); {
				// 4.  if the user's answer was correct, add one to their score 
		           unicorn++;
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		  
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}}
