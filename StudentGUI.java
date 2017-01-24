/*
* Name: Amos Gichero
* Class: Java 2
* Quarter: Spring 2016
* Instructor: Ron Enz
* Description: Lab # 1
* * Due: 01/20/2016
*/

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;


public class StudentGUI  extends JFrame implements Student{


		
		// Create properties
		
		
		private JLabel Jlbl = new JLabel("Student Information");
		
		private JLabel Jlbl1 = new JLabel("ID:");
		private JTextField Jtxf = new JTextField(6);
		private JLabel Jlbl2 = new JLabel("First Name:");
		private JTextField Jtxf1 = new JTextField(50);
		private JLabel Jlbl3 = new JLabel("Last Name:");
		private JTextField Jtxf2 = new JTextField(50);
		private JLabel Jlbl4 = new JLabel("Email:");
		private JTextField Jtxf3 = new JTextField(50);
		private JLabel Jlbl5 = new JLabel("GPA:");
		private JTextField Jtxf4 = new JTextField(4);
		
		private JButton JbtnFind = new JButton("Find");
		private JButton JbtnInsert = new JButton("Insert");
		private JButton JbtnDelete = new JButton("Delete");
		private JButton JbtnUpdate = new JButton("Update");
		private JButton JbtnExit = new JButton("Exit");
		
		
		public static void main(String[] args) {
       
		JFrame frame = new StudentGUI();
		frame.setTitle("Student GUI");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);  
		
	}
		
		public StudentGUI() {
		
		//Add Jlbl to panel1

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 6, 6));
		panel1.add(Jlbl);
		panel1.setBorder(new LineBorder(Color.RED, 2));
		add(panel1, BorderLayout.NORTH);
		
		
		//Add labels and text fields to panel2
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(5, 2, 2, 2));
		panel2.add(Jlbl1);
		panel2.add(Jtxf);
		panel2.add(Jlbl2);
		panel2.add(Jtxf1);
		panel2.add(Jlbl3);
		panel2.add(Jtxf2);
		panel2.add(Jlbl4);
		panel2.add(Jtxf3);
		panel2.add(Jlbl5);
		panel2.add(Jtxf4);
		panel2.setBorder(new LineBorder(Color.BLACK, 2));
		add(panel2, BorderLayout.CENTER);
		
		//Add buttons to panel3
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT, 4, 4));
		panel3.add(JbtnFind);
		panel3.add(JbtnInsert);
		panel3.add(JbtnDelete);
		panel3.add(JbtnUpdate);
		panel3.add(JbtnExit);
		JbtnFind.setToolTipText("Find student information");
		JbtnInsert.setToolTipText("Insert Student data");
		JbtnDelete.setToolTipText("Delete student");
		JbtnUpdate.setToolTipText("Update student information");
		panel3.setBorder(new LineBorder(Color.GREEN, 2));
		add(panel3, BorderLayout.SOUTH);		
			
		    
//Activate listeners and events
	
	JbtnExit.addActionListener(new ActionListener() {
@Override
 public void actionPerformed(ActionEvent e) {
 
 
 int confirm = JOptionPane.showOptionDialog(JbtnExit, "Are You Sure to Close this Application?",
 "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(1);
            }
 
   }
});

JbtnInsert.addActionListener(new ActionListener() { 
@Override
public void actionPerformed(ActionEvent e) {
      
      int ID = Integer.parseInt(Jtxf.getText());
      String FirstName = Jtxf1.getText();
      String LastName = Jtxf2.getText();
      String Email = Jtxf3.getText();
      double GPA = Double.parseDouble(Jtxf4.getText());
      
    }
});

JbtnFind.addActionListener(new ActionListener() { 
@Override
public void actionPerformed(ActionEvent e) { 
      
      int ID = Integer.parseInt(Jtxf.getText());
      String LastName = Jtxf2.getText();
      
      
    }
});

JbtnUpdate.addActionListener(new ActionListener() { 
@Override
public void actionPerformed(ActionEvent e) {
      
      int ID = Integer.parseInt(Jtxf.getText());
      String FirstName = Jtxf1.getText();
      String LastName = Jtxf2.getText();
      String Email = Jtxf3.getText();
      double GPA = Double.parseDouble(Jtxf4.getText());
    }
});

JbtnDelete.addActionListener(new ActionListener() { 
@Override
public void actionPerformed(ActionEvent e) {
       
      int ID = Integer.parseInt(Jtxf.getText());
      String FirstName = Jtxf1.getText();
      String LastName = Jtxf2.getText();
      String Email = Jtxf3.getText();
      double GPA = Double.parseDouble(Jtxf4.getText());
      
    }
});


}

}


