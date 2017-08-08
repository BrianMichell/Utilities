package com.github.BrianMichell.Utils;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BriFrame {
	
	private JFrame myFrame;
	
	public BriFrame(){
		this(new JFrame());
	}
	
	public BriFrame(JFrame frame){
		this(frame, new GridLayout(1,1));
	}
	
	public BriFrame(JFrame frame, GridLayout layout){
		this(frame, layout, true);
	}
	
	public BriFrame(JFrame frame, GridLayout layout, boolean visible){
		myFrame=frame;
		myFrame.setLayout(layout);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);
		myFrame.pack();
		myFrame.setVisible(visible);
	}
	
	public BriFrame(JFrame frame, GridLayout layout, int width, int height){
		this(frame,layout,width,height,true);
	}
	
	public BriFrame(JFrame frame, GridLayout layout, int width, int height, boolean visible){
		myFrame=frame;
		myFrame.setLayout(layout);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);
		myFrame.setSize(width,height);
		myFrame.setVisible(visible);
	}
	
	public JFrame getFrame(){
		return this.myFrame;
	}
	
	public void repack(){
		myFrame.pack();
		myFrame.repaint();
	}
	
	public void addButton(JButton b){
		myFrame.add(b);
	}
	
	public void addLabel(JLabel l){
		myFrame.add(l);
	}

}
