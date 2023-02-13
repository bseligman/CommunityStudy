package pack;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class CommunityStudy extends Frame implements WindowListener, ActionListener  {
	
	// Create link
	StudyWindow stu = new StudyWindow();
	LinkHandler lin = new LinkHandler();
	
	// MAIN
	public CommunityStudy() throws Exception {
		
	// Main Details
	setSize(500,300);
	setTitle("Community Study V.1.0");
	setLayout(null);
	setVisible(true);
	
	// TEXT FIELD #1
	TextField t1 = new TextField("");
    t1.setBounds(50, 200, 200, 50); 
    add(t1);
	
	// BUTTON #1
	Button clicky = new Button("Add");
	clicky.setBounds(240,200,50,50); // x , y , width , height
	add(clicky);
	clicky.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String datain = t1.getText();
			t1.setText("");
			lin.UploadLink(datain);
			
			//stu.getValue();
			//stu.beVis();
			//setVisible(false);
		}
	});
	


	// Setup for reading CSV
	Scanner sc = new Scanner(new File(" "));  
	
	
	} // END OF MAIN

	// Call Main's GUI object
	public static void main(String[] args) throws Exception{
		new CommunityStudy();	
	}
}
