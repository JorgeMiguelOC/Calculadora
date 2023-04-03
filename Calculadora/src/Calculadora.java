
import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;

public class Calculadora implements ActionListener {

	
	JFrame frame;
	JTextField textField;
	JButton[] numeroButtons = new JButton[10];
	JButton[] funcaoButtons = new JButton[9];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton, negButton;
	JPanel panel;
	
	Font minhaFont = new Font("Ink Free", Font.BOLD, 30);
	
	double num1=0,num2=0,result=0;
	char operator;
	
	Calculadora(){
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(50,25,300,50);
		textField.setFont(minhaFont);
		textField.setEditable(false);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Del");
		clrButton = new JButton("Clr");
		negButton = new JButton("Neg");
		
		
		funcaoButtons[0] = addButton;
		funcaoButtons[1] = subButton;
		funcaoButtons[2] = mulButton;
		funcaoButtons[3] = divButton;
		funcaoButtons[4] = decButton;
		funcaoButtons[5] = equButton;
		funcaoButtons[6] = delButton;
		funcaoButtons[7] = clrButton;
		funcaoButtons[8] = negButton;
		
		for(int i=0; i<9;i++) {
			funcaoButtons[i].addActionListener(this);
			funcaoButtons[i].setFont(minhaFont);
			funcaoButtons[i].setFocusable(false);
		}
		
		for(int i=0; i<10;i++) {
			numeroButtons[i] = new JButton(String.valueOf(i));
			numeroButtons[i].addActionListener(this);
			numeroButtons[i].setFont(minhaFont);
			numeroButtons[i].setFocusable(false);
		}
		
		negButton.setBounds(50,430,100,50);
		delButton.setBounds(150,430,100,50);
		clrButton.setBounds(250,430,100,50);
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		
		panel.add(numeroButtons[1]);
		panel.add(numeroButtons[2]);
		panel.add(numeroButtons[3]);
		panel.add(addButton);
		panel.add(numeroButtons[4]);
		panel.add(numeroButtons[5]);
		panel.add(numeroButtons[6]);
		panel.add(subButton);
		panel.add(numeroButtons[7]);
		panel.add(numeroButtons[8]);
		panel.add(numeroButtons[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numeroButtons[0]);
		panel.add(equButton);
		panel.add(divButton);
		
		frame.add(panel);
		frame.add(negButton);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textField);
		frame.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<10;i++) {
			if(e.getSource() == numeroButtons[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==decButton) {
			textField.setText(textField.getText().concat("."));
		}
		if(e.getSource()==addButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '+';
			textField.setText("");
		}
		if(e.getSource()==subButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '-';
			textField.setText("");
		}
		if(e.getSource()==mulButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '*';
			textField.setText("");
		}
		if(e.getSource()==divButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '/';
			textField.setText("");
		}
		if(e.getSource()==equButton) {
			num2=Double.parseDouble(textField.getText());
			
			switch (operator) {
			case'+':
				result=num1+num2;
				break;
			case'-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
				result=num1/num2;
				break;
			}
			textField.setText(String.valueOf(result));
			num1=result;
		}
		if(e.getSource()==clrButton) {
			textField.setText("");
		}
		
		if(e.getSource()==delButton) {
			String string = textField.getText();
			textField.setText("");
			for(int i=0;i<string.length()-1;i++) {
				textField.setText(textField.getText()+string.charAt(i));
		}
	}
		if(e.getSource()==negButton) {
			double temp = Double.parseDouble(textField.getText());
			temp*=-1;
			textField.setText(String.valueOf(temp));
	}
}
}



