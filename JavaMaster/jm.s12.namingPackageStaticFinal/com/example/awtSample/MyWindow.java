package com.example.awtSample;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindow extends Frame {

	public MyWindow(String title) {
		super(title);
		setSize(500, 140);
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);	// correct method
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);	// wrong method
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
		Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
		g.setFont(sansSerifLarge);
		g.drawString("The Java Developer Course", 60, 60);
		g.setFont(sansSerifSmall);
		g.drawString("By Tim", 60, 100);
	}

	

	
	
}
