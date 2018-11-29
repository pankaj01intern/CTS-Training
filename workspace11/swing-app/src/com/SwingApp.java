package com;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class SwingApp {
	
	public SwingApp()
    {
   	    Container c= getContentPane();
	    c.setLayout(new BorderLayout());

	    CardLayout cardmanager = new CardLayout();

        JPanel deck = new JPanel();
        deck.setLayout(cardmanager);
        c.add(deck);
        cardmanager.next(deck);
        setSize(1360,960);
	    setVisible(true);

}
	
	public static void main(String args[])
	{
		
		SwingApp of=new SwingApp();
		of.addWindowListener(
		new WindowAdapter()
		{
			
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
				
			}
			
		}
		
		);
		
	}		
}

	