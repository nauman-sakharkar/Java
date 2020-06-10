import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.io.FileWriter;  

class CV extends WindowAdapter implements ActionListener
{
	Frame f;
	Label l,pd,name,dob,nat,rel,lang,gender,mobile,email,lobj,edu,qual,board,uni,per,ack;
	TextField tfname,tfdob,tfnat,tfrel,tflang,tfmobile,tfemail,tfqual1,tfboard1,tfuni1,tfper1,tfqual2,tfboard2,tfuni2,tfper2,tfqual3,tfboard3,tfuni3,tfper3;
	Choice cnat;
	CheckboxGroup cbgg;
	TextArea ta;
	Button print,clear;
	Checkbox male;
	
	CV()
	{
		f = new Frame("CV");
		f.setBackground(Color.GRAY);
		
		l = new Label("Stduent's Resume",Label.CENTER);
		l.setBackground(Color.WHITE);
		l.setForeground(Color.BLACK);
		l.setBounds(5,50,300,20);
		
		pd = new Label("   Personal Details",Label.LEFT);
		pd.setBounds(5,100,300,20);
		pd.setBackground(Color.WHITE);
		pd.setForeground(Color.BLACK);
		
		name = new Label("Full name : ",Label.RIGHT);
		name.setBounds(15,125,120,20);
		name.setBackground(Color.WHITE);
		name.setForeground(Color.BLACK);
		tfname = new TextField();
		tfname.setBounds(140,125,150,20);
		
		dob = new Label("Date of Birth : ",Label.RIGHT);
		dob.setBounds(15,150,120,20);
		dob.setBackground(Color.WHITE);
		dob.setForeground(Color.BLACK);
		tfdob = new TextField();
		tfdob.setBounds(140,150,150,20);
		
		nat = new Label("Nationality : ",Label.RIGHT);
		nat.setBounds(15,175,120,20);
		nat.setBackground(Color.WHITE);
		nat.setForeground(Color.BLACK);
		cnat = new Choice();
		cnat.setBounds(140,175,150,20);
		cnat.add("Indian");
		cnat.add("American");
		cnat.add("Japanese");
		cnat.add("Chinese");
		cnat.add("Arabian");
		
		rel = new Label("Religion : ",Label.RIGHT);
		rel.setBounds(15,200,120,20);
		rel.setBackground(Color.WHITE);
		rel.setForeground(Color.BLACK);
		tfrel = new TextField();
		tfrel.setBounds(140,200,150,20);
		
		lang = new Label("Languages known : ",Label.RIGHT);
		lang.setBounds(15,225,120,20);
		lang.setBackground(Color.WHITE);
		lang.setForeground(Color.BLACK);
		tflang = new TextField();
		tflang.setBounds(140,225,150,20);
		
		gender = new Label("Gender : ",Label.RIGHT);
		gender.setBounds(15,250,120,20);
		gender.setBackground(Color.WHITE);
		gender.setForeground(Color.BLACK);
		cbgg = new CheckboxGroup();  
		male = new Checkbox ("Male",cbgg,true);
		male.setBounds(140,250,150,20);
		Checkbox female = new Checkbox ("Female",cbgg,false);
		female.setBounds(140,270,150,20);
		
		mobile = new Label("Mobile number : ",Label.RIGHT);
		mobile.setBounds(15,295,120,20);
		mobile.setBackground(Color.WHITE);
		mobile.setForeground(Color.BLACK);
		tfmobile = new TextField();
		tfmobile.setBounds(140,295,150,20);
		
		email = new Label("Email : ",Label.RIGHT);
		email.setBounds(15,320,120,20);
		email.setBackground(Color.WHITE);
		email.setForeground(Color.BLACK);
		tfemail = new TextField();
		tfemail.setBounds(140,320,150,20);
		
		lobj = new Label("   Objectives",Label.LEFT);
		lobj.setBounds(5,350,300,20);
		lobj.setBackground(Color.WHITE);
		lobj.setForeground(Color.BLACK);
		
		ta = new TextArea();
		ta.setBounds(5,375,300,70);
		
		edu = new Label("   Education Details",Label.LEFT);
		edu.setBounds(5,450,300,20);
		edu.setBackground(Color.WHITE);
		edu.setForeground(Color.BLACK);
		
		qual = new Label(" Qualification",Label.CENTER);
		qual.setBounds(10,475,72,20);
		qual.setBackground(Color.WHITE);
		qual.setForeground(Color.BLACK);
		
		board = new Label("Board",Label.CENTER);
		board.setBounds(87,475,40,20);
		board.setBackground(Color.WHITE);
		board.setForeground(Color.BLACK);
		
		uni = new Label("Scools/College",Label.CENTER);
		uni.setBounds(135,475,90,20);
		uni.setBackground(Color.WHITE);
		uni.setForeground(Color.BLACK);
		
		per = new Label("Percentage",Label.CENTER);
		per.setBounds(230,475,75,20);
		per.setBackground(Color.WHITE);
		per.setForeground(Color.BLACK);
		
		tfqual1 = new TextField();
		tfqual1.setBounds(10,500,72,20);
		tfboard1 = new TextField();
		tfboard1.setBounds(87,500,40,20);
		tfuni1 = new TextField();
		tfuni1.setBounds(135,500,90,20);
		tfper1 = new TextField();
		tfper1.setBounds(230,500,75,20);
		
		tfqual2 = new TextField();
		tfqual2.setBounds(10,525,72,20);
		tfboard2 = new TextField();
		tfboard2.setBounds(87,525,40,20);
		tfuni2 = new TextField();
		tfuni2.setBounds(135,525,90,20);
		tfper2 = new TextField();
		tfper2.setBounds(230,525,75,20);
		
		tfqual3 = new TextField();
		tfqual3.setBounds(10,550,72,20);
		tfboard3 = new TextField();
		tfboard3.setBounds(87,550,40,20);
		tfuni3 = new TextField();
		tfuni3.setBounds(135,550,90,20);
		tfper3 = new TextField();
		tfper3.setBounds(230,550,75,20);
		
		print = new Button("Print");
		print.setBounds(70,580,75,20);
		print.addActionListener(this);
		clear = new Button("Clear");
		clear.setBounds(160,580,75,20);
		clear.addActionListener(this);
		
		ack = new Label("",Label.CENTER);
		ack.setBounds(150,605,125,20);
		
		f.add(l);
		f.add(lobj);
		f.add(pd);
		f.add(name);
		f.add(dob);
		f.add(nat);
		f.add(rel);
		f.add(lang);
		f.add(tfname);
		f.add(tfdob);
		f.add(cnat);
		f.add(tfrel);
		f.add(tflang);
		f.add(male);
		f.add(female);
		f.add(gender);
		f.add(mobile);
		f.add(tfmobile);
		f.add(tfemail);
		f.add(email);
		f.add(ta);
		f.add(edu);
		f.add(qual);
		f.add(board);
		f.add(uni);
		f.add(per);
		f.add(tfqual1);
		f.add(tfboard1);
		f.add(tfuni1);
		f.add(tfper1);
		f.add(tfqual2);
		f.add(tfboard2);
		f.add(tfuni2);
		f.add(tfper2);
		f.add(tfqual3);
		f.add(tfboard3);
		f.add(tfuni3);
		f.add(tfper3);
		f.add(print);
		f.add(clear);
		f.add(ack);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(300,625);
		f.setResizable(false);
		f.addWindowListener(this);
	}
	
	public void windowClosing(WindowEvent we)
	{
		f.dispose();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Clear")
		{
			String a = "";
			tfname.setText(" ");tfname.setText("");
			tfdob.setText(" ");tfdob.setText("");
			tfrel.setText(" ");tfrel.setText("");
			tflang.setText(" ");tflang.setText("");
			tfmobile.setText(" ");tfmobile.setText("");
			tfemail.setText(" ");tfemail.setText("");
			tfqual1.setText(" ");tfqual1.setText("");
			tfboard1.setText(" ");tfboard1.setText("");
			tfuni1.setText(" ");tfuni1.setText("");
			tfper1.setText(" ");tfper1.setText("");
			tfqual2.setText(" ");tfqual2.setText("");
			tfboard2.setText(" ");tfboard2.setText("");
			tfuni2.setText(" ");tfuni2.setText("");
			tfper2.setText(" ");tfper2.setText("");
			tfqual3.setText(" ");tfqual3.setText("");
			tfboard3.setText(" ");tfboard3.setText("");
			tfuni3.setText(" ");tfuni3.setText("");
			tfper3.setText(" ");tfper3.setText("");
			ta.setText(" ");ta.setText("");
			ack.setText("Cleared Successfully");
			ack.setBackground(Color.WHITE);
			ack.setForeground(Color.RED);
		}
		
		else if(ae.getActionCommand()=="Print")
		{
			try
			{    
				FileWriter fw=new FileWriter("Resume.txt"); 
				
				fw.write("Curriculum Vitae.".toUpperCase()); 
				fw.write(System.getProperty("line.separator"));
				fw.write("===========================================================");
				fw.write(System.getProperty("line.separator"));
				fw.write(System.getProperty("line.separator"));
				
				fw.write("-----------------------------------------------------------");
				fw.write(System.getProperty("line.separator"));
				fw.write(tfname.getText().toUpperCase());
				fw.write(System.getProperty("line.separator"));
				
				fw.write("Mobile Number : "+tfmobile.getText());
				fw.write(System.getProperty("line.separator"));
				
				fw.write("Email Id : "+tfemail.getText());
				fw.write(System.getProperty("line.separator"));
				fw.write("-----------------------------------------------------------");
				fw.write(System.getProperty("line.separator"));
				fw.write(System.getProperty("line.separator"));
				
				fw.write("Objectives : ".toUpperCase());
				fw.write(System.getProperty("line.separator"));
				fw.write("-----------------------------------------------------------");
				fw.write(System.getProperty("line.separator"));
				fw.write(ta.getText());
				fw.write(System.getProperty("line.separator"));
				fw.write(System.getProperty("line.separator"));
				
				fw.write("Academic Qualifications : ".toUpperCase());
				fw.write(System.getProperty("line.separator"));
				fw.write("-----------------------------------------------------------");
				fw.write(System.getProperty("line.separator"));
				fw.write("Qualification\t");
				fw.write("University/board\t");
				fw.write("School/College\t\t");
				fw.write("Percentage");
				fw.write(System.getProperty("line.separator"));
				
				fw.write(tfqual1.getText()+"\t\t\t");
				fw.write(tfboard1.getText()+"\t\t\t");
				fw.write(tfuni1.getText()+"\t\t\t");
				fw.write(tfper1.getText()+"\t\t");
				fw.write(System.getProperty("line.separator"));
	
				fw.write(tfqual2.getText()+"\t\t\t");
				fw.write(tfboard2.getText()+"\t\t\t");
				fw.write(tfuni2.getText()+"\t\t\t");
				fw.write(tfper2.getText()+"\t\t");
				fw.write(System.getProperty("line.separator"));
				
				fw.write(tfqual3.getText()+"\t\t\t");
				fw.write(tfboard3.getText()+"\t\t\t");
				fw.write(tfuni3.getText()+"\t\t\t");
				fw.write(tfper3.getText()+"\t\t");
				fw.write(System.getProperty("line.separator"));
				fw.write(System.getProperty("line.separator"));
				
				fw.write("Personal Details : ".toUpperCase());
				fw.write(System.getProperty("line.separator"));
				fw.write("-----------------------------------------------------------");
				fw.write(System.getProperty("line.separator"));
				fw.write("Name : "+(tfname.getText()));
				fw.write(System.getProperty("line.separator"));
				fw.write("Date of birth : "+(tfdob.getText()));
				fw.write(System.getProperty("line.separator"));
				fw.write("Gender : "+(male.getState()==true?"Male":"Female"));
				fw.write(System.getProperty("line.separator"));
				fw.write("Nationality : "+(cnat.getItem(cnat.getSelectedIndex())));
				fw.write(System.getProperty("line.separator"));
				fw.write("Religion : "+(tfrel.getText()));
				fw.write(System.getProperty("line.separator"));
				fw.write("Languages Known : "+(tflang.getText()));
				fw.write(System.getProperty("line.separator"));
				
				fw.close();  
				
				ack.setText("Printed Successfully");
				ack.setBackground(Color.WHITE);
				ack.setForeground(Color.RED);
			}
			catch(Exception e)
			{
				System.out.println(e);
			} 
			
		}
		   
	}
}

class prac8
{
	public static void main(String args[])
	{
		new CV();
	}
}