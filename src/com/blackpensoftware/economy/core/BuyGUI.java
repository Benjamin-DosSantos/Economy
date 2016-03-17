package com.blackpensoftware.economy.core;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BuyGUI{
	
	static String mainframe_title = "Buy GUI";
	static JFrame mainframe = new JFrame(mainframe_title);
	static boolean mainframe_ontop = true;
	static int mainframe_xSize = 500;
	static int mainframe_ySize = 500;
	static JPanel mainpanel = new JPanel();
	static Color mainpanel_backgroundcolor = Color.DARK_GRAY;
	
	static int gold_amount = 100;
	static JLabel gold_text = new JLabel(gold_amount + "");
	static int gold_text_xPos = 300;
	static int gold_text_yPos = 200;
	static int gold_text_width = 30;
	static int gold_text_height = 50;
	static Button gold_add = new Button ("+");
	static int gold_add_xPos = 200;
	static int gold_add_yPos = 200;
	static int gold_add_width = 20;
	static int gold_add_height = 20;
	static Button gold_sub = new Button ("-");
	static int gold_sub_xPos = 400;
	static int gold_sub_yPos = 200;
	static int gold_sub_width = 20;
	static int gold_sub_height = 20;
	
	public static void main(String[] args){
		mainframe.setVisible(true);
		mainframe.setAlwaysOnTop(mainframe_ontop);
		mainframe.setSize(new Dimension(mainframe_xSize, mainframe_ySize));
		mainframe.add(mainpanel);
		mainpanel.setBackground(mainpanel_backgroundcolor);
		mainpanel.setLayout(null);
		
		gold_add.setBounds(gold_add_xPos, gold_add_yPos, gold_add_width, gold_add_height);
		gold_sub.setBounds(gold_sub_xPos, gold_sub_yPos, gold_sub_width, gold_sub_height);
		gold_text.setBounds(gold_text_xPos, gold_text_yPos, gold_text_width, gold_text_height);
		
		mainpanel.add(gold_add);
		mainpanel.add(gold_sub);
		mainpanel.add(gold_text);
		
		gold_add.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		        gold_amount += 1;
		    }
		});
	}
}