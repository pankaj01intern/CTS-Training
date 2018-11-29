package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class SwingDemo extends JFrame
{

   JPanel deck;	
   CardLayout cardmanager;

	
	public SwingDemo()
       {
	   	    Container c= getContentPane();
		    c.setLayout(new BorderLayout());
	
	        cardmanager = new CardLayout();
	
	        deck = new JPanel();
	        deck.setLayout(cardmanager);
	 
	        cardmanager.next(deck);
	 
	 		JLabel jl3=new JLabel("Please Select Your Path...");
	 		jl3.setFont(new Font("Arial",Font.BOLD,25));
	 	
	  	    JPanel card=new JPanel();
	   	    JButton btn=new JButton("Browse");
	 	    card.add(jl3,new Integer(Integer.MIN_VALUE));
	 	    card.add(btn,new Integer(Integer.MIN_VALUE));
	 	    jl3.setBounds(55,130,1000,25);
	 	    btn.setBounds(255,200,80,25);
	 	    
	 	    JFrame frame =new JFrame();
	 	    btn.addActionListener(new ActionListener(){
	 		  public void actionPerformed(ActionEvent e)
	 		  {     
	 	    JFileChooser fc = new JFileChooser();
	 	    fc.showSaveDialog(frame);
	 	    frame.setSize(700,500);
	 	    File selFile=null;
	 	    try {
	 		 selFile = fc.getSelectedFile();
	 	    }catch(Exception e1){}
	 
	 	    JOptionPane.showMessageDialog(null," Your Selected path is " + selFile);
	 	    System.exit(0);
	 		  }
	 	          })	;
	 		
	 	    card.setLayout(new BorderLayout());
	 	    deck.add(card,jl3.getText());
	 	    c.add(deck);
	 		setSize(700,500);
	        setVisible(true);
	 	    }
	 		
	 		public static void main(String args[])
	 		{
	 		  new SwingDemo();
	 			
	 		}		
	 	}              
