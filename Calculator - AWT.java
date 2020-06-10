import java.awt.*;
import java.awt.event.*;

class Test extends WindowAdapter implements ActionListener
{  
	Frame f;
	TextField tf;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bplus,bminus,bmul,bdiv,bequal,bclear;
	Test()
	{
		f= new Frame("GUI Calculator");
		
		tf = new TextField();
		tf.setBounds(5,30,300,20);  
		
		bclear = new Button("C");
		bclear.setBounds(5,50,75,50);
		bdiv = new Button("/");
		bdiv.setBounds(80,50,75,50);
		bmul = new Button("*");
		bmul.setBounds(155,50,75,50);
		bminus = new Button("-");
		bminus.setBounds(230,50,75,50);
		
		b1 = new Button("7");
		b1.setBounds(5,100,75,50);
		b2 = new Button("8");
		b2.setBounds(80,100,75,50);
		b3 = new Button("9");
		b3.setBounds(155,100,75,50);
		
		b4 = new Button("4");
		b4.setBounds(5,150,75,50);
		b5 = new Button("5");
		b5.setBounds(80,150,75,50);
		b6 = new Button("6");
		b6.setBounds(155,150,75,50);
		
		bplus = new Button("+");
		bplus.setBounds(230,100,75,100);
		
		b7 = new Button("1");
		b7.setBounds(5,200,75,50);
		b8 = new Button("2");
		b8.setBounds(80,200,75,50);
		b9 = new Button("3");
		b9.setBounds(155,200,75,50);
		
		b0 = new Button("0");
		b0.setBounds(5,250,150,50);
		bdot = new Button(".");
		bdot.setBounds(155,250,75,50);
		bequal = new Button("=");
		bequal.setBounds(230,200,75,100);
		
		f.add(tf); 
		f.add(b1); 
		f.add(b2); 
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b0);
		f.add(bdot);
		f.add(bplus);
		f.add(bminus);
		f.add(bmul);
		f.add(bdiv);
		f.add(bequal);
		f.add(bclear);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bdot.addActionListener(this);
		bplus.addActionListener(this);
		bminus.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bequal.addActionListener(this);
		bclear.addActionListener(this);
		
		f.setLayout(null);
		f.setSize(300,297);		
		f.setVisible(true);
		f.setResizable(false);
		f.addWindowListener(this);
	}
	public void windowClosing(WindowEvent we)
	{
		f.dispose();
	}
	
	Double first_var;
	String operator;
	
	public void actionPerformed(ActionEvent ae)
	{  
		String check = ae.getActionCommand();
		String text = tf.getText();
		try
		{
			Integer.parseInt(check);
			if("+-*/".contains(text))
			{
				operator=text;
				tf.setText(check);
			}
			else
			{
				try
				{
					Double.parseDouble(text);
					tf.setText(text+check);
				}
				catch(NumberFormatException nfe)  
				{  
					tf.setText(check);  
				} 
				
			}
			
		}
		catch(Exception e)
		{
			if(check==".")
			{
				if(!text.contains("."))
				{
					if(text.equals(""))
					{
						tf.setText("0"+check);
					}
					else if("+-*/".contains(text))
					{
						operator=text;
						tf.setText("0"+check);
					}
					else
					{
						tf.setText(text+check);
					}
				}
			}
			else if("+-*/".contains(check) && !"+-*/".contains(text))
			{
				try
				{
					first_var = Double.parseDouble(text);
					tf.setText(check);
				}
				catch(NumberFormatException nfe)  
				{  
					tf.setText(null);  
				} 
			}
			else if("+-*/".contains(check))
			{
				tf.setText(check);
			}
			else if("=".contains(check))
			{
				if(first_var!=null && operator!=null)
				{
					switch(operator)
					{
						case "+" : tf.setText(String.valueOf(first_var+Double.parseDouble(text)));first_var=first_var+Double.parseDouble(text);break;
						case "-" : tf.setText(String.valueOf(first_var-Double.parseDouble(text)));first_var=first_var-Double.parseDouble(text);break;
						case "*" : tf.setText(String.valueOf(first_var*Double.parseDouble(text)));first_var=first_var/Double.parseDouble(text);break;
						case "/" : tf.setText(String.valueOf(first_var/Double.parseDouble(text)));first_var=first_var*Double.parseDouble(text);break;
					}
				}
				else
				{
					tf.setText(text);
				}
			}
			else if("C".contains(check))
			{
				first_var=null;
				operator=null;
				tf.setText("0");
			}
		}
	}  
}

class awt
{
	public static void main(String args[])
	{
		new Test();
	}
}