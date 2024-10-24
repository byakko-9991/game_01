package edu.main;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		String name = JOptionPane.showInputDialog("Enter your name!", "Mark Zuckenberg");
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age!"));
		//System.out.print(JOptionPane.showConfirmDialog(window, "Test"));
		boolean male = (JOptionPane.showConfirmDialog(window, "Are you male?") == 0) ? true : false;
		System.out.printf("Gender: %b", male);
		
		String isMale = (male) ? "Male" : "Female";
		
		window.setSize(600, 800);
		window.setVisible(true);
		
		JOptionPane.showMessageDialog(window, String.format("Your name is %s! \nAge: %d \nGender: %s" , name, age, isMale), name + "\'s Data", JOptionPane.WARNING_MESSAGE);
	}

}
