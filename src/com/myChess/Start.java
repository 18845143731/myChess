package com.myChess;

import java.awt.Container;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Start {

	public JButton sPiece = null; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
			JFrame frame = new JFrame("象棋");
			frame.setBounds(100, 100, 1000, 700);			
			frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
			Container container = frame.getContentPane();				
			container.setLayout(null);
			GamePannel gmp = new GamePannel();
			container.add(gmp);
			gmp.setBounds(0, 0, 500, 500);//这里如果不设置长宽，就不会显示，因为默认长宽为0，0.
//			frame.pack();
			
//			this.add(ba);
//			this.add(bb);
//			this.add(bn);
//			this.add(bc);
//			this.add(bp);
//			this.add(br);
		
	}

}
