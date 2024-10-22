package edu.main;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		String name = JOptionPane.showInputDialog("Enter your name!", "Mark Zuckenberg");
		
		window.setSize(600, 800);
		window.setVisible(true);
		
		JOptionPane.showMessageDialog(window, String.format("Your name is %s!" , name), "Username", JOptionPane.WARNING_MESSAGE);
	}

}
