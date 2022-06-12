package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
       public static void main(String[] args) {
	
		Random ran = new Random();    //This will be used below to make a random number. 
		int cat = ran.nextInt(4); 
		// 2. Make a variable that will hold a random whole number
	          
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	
		// 3. Print your variable to the console
	      System.out.println(cat);
		// 4. Get the user to enter something that they think is awesome
	          String awsome = JOptionPane.showInputDialog("eating is awesome");
		// 5. If your variable is  0
	          if(cat == 0) {}
	          // -- tell the user whatever they entered is awesome!
	              String awesome = JOptionPane.showInputDialog("whatever you entered is awsome");
		// 6. If your variable is  1
	         if(cat == 1) {}
			// -- tell the user whatever they entered is ok.
	            String okay = JOptionPane.showInputDialog("whatever you entered is okay");
		// 7. If your variable is  2
	       if(cat == 2) {}
			// -- tell the user whatever they entered is boring.
	            String boring = JOptionPane.showInputDialog("whatever you entered is very boring");
		// 8. If your variable is  3
	       if(cat == 3) {}
			// -- invent your own message to give to the user (be nice).

       }
       }
