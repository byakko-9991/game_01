package edu.main;
import javax.swing.*;
import java.awt.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		
		String currentPath = System.getProperty("user.dir"); // Get absolute direction of the project
		Image appIcon = Toolkit.getDefaultToolkit().getImage(currentPath + "/assets/icon.jpg"); 
        ImageIcon imageIcon = new ImageIcon(currentPath + "/assets/image.jpg");

		
		String name = JOptionPane.showInputDialog("Enter your name!", "Mark Zuckenberg");		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age!"));
		boolean male = (JOptionPane.showConfirmDialog(window, "Are you male?") == 0) ? true : false;
		
		//System.out.printf("Gender: %b", male);
		
		String isMale = (male) ? "Male" : "Female";
		
		//window.setName("Best Game Ever!!! ");
		window.setSize(600, 800);
	    window.setIconImage(appIcon);
		window.setVisible(true);
		window.setTitle("Best Game Ever!!!");
		
		JLabel imageLabel = new JLabel(imageIcon);
        window.add(imageLabel);
		
		
		//JOptionPane.showMessageDialog(window, String.format("Your name is %s! \nAge: %d \nGender: %s" , name, age, isMale), name + "\'s Data", JOptionPane.WARNING_MESSAGE);
	}

}
