
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora implements ActionListener {

	
	JFrame frame;
	JTextField textField;
	JButton[] numeroButtons = new JButton[10];
	JButton[] funcaoButtons = new JButton[8];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton;
	JPanel panel;
	
	Font minhaFont = new Font("Ink Free", Font.BOLD, 30);
	
	double num1=0,num2=0,result=0;
	char operator;
	
	Calculadora(){
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 550);
		frame.setLayout(null);
		
		
		
		frame.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
