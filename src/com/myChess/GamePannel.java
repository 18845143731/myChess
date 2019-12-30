package com.myChess;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePannel extends JPanel implements MouseListener{
	
	
	GamePannel() {		
		this.setBackground(Color.red);
		this.setVisible(true);
		this.addMouseListener(this);  
		init();
	}
	@Override
	protected void paintComponent(Graphics g) {  
		 ImageIcon icon = new ImageIcon("src\\images\\bg.GIF");
		g.drawImage(icon.getImage(), 0, 0, 379, 410, this);  
	}  
		 
	
	public void init() {		
		BR br1 = new BR(8,0);
		BN bn1 = new BN(7,0);
		BB bb1 = new BB(6,0);
		BA ba1 = new BA(5,0);
		BK bk = new BK(4,0);
		BA ba2 = new BA(3,0);
		BB bb2 = new BB(2,0);
		BN bn2= new BN(1,0);
		BR br2 = new BR(0,0);
		BC bc1 = new BC(7,2);
		BC bc2 = new BC(1,2);
		BP bp1 = new BP(8,3);
		BP bp2 = new BP(6,3);
		BP bp3 = new BP(4,3);
		BP bp4 = new BP(2,3);
		BP bp5 = new BP(0,3);
		
		this.add(br1);//黑子
		br1.setBounds(Data.simnum2xy(8), Data.simnum2xy(0), Data.chessWidth, Data.chessHeigth);
		this.add(bn1);
		bn1.setBounds(Data.simnum2xy(7), Data.simnum2xy(0), Data.chessWidth, Data.chessHeigth);
		this.add(bb1);
		bb1.setBounds(Data.simnum2xy(6), Data.simnum2xy(0), Data.chessWidth, Data.chessHeigth);
		this.add(ba1);
		ba1.setBounds(Data.simnum2xy(5), Data.simnum2xy(0), Data.chessWidth, Data.chessHeigth);
		this.add(bk);
		bk.setBounds(Data.simnum2xy(4), Data.simnum2xy(0), Data.chessWidth, Data.chessHeigth);
		this.add(ba2);
		ba2.setBounds(Data.simnum2xy(3), Data.simnum2xy(0), Data.chessWidth, Data.chessHeigth);
		this.add(bb2);
		bb2.setBounds(Data.simnum2xy(2), Data.simnum2xy(0), Data.chessWidth, Data.chessHeigth);
		this.add(bn2);
		bn2.setBounds(Data.simnum2xy(1), Data.simnum2xy(0), Data.chessWidth, Data.chessHeigth);
		this.add(br2);
		br2.setBounds(Data.simnum2xy(0), Data.simnum2xy(0), Data.chessWidth, Data.chessHeigth);
		this.add(bc1);
		bc1.setBounds(Data.simnum2xy(7), Data.simnum2xy(2), Data.chessWidth, Data.chessHeigth);
		this.add(bc2);
		bc2.setBounds(Data.simnum2xy(1), Data.simnum2xy(2), Data.chessWidth, Data.chessHeigth);
		this.add(bp1);
		bp1.setBounds(Data.simnum2xy(8), Data.simnum2xy(3), Data.chessWidth, Data.chessHeigth);
		this.add(bp2);
		bp2.setBounds(Data.simnum2xy(6), Data.simnum2xy(3), Data.chessWidth, Data.chessHeigth);
		this.add(bp3);
		bp3.setBounds(Data.simnum2xy(4), Data.simnum2xy(3), Data.chessWidth, Data.chessHeigth);
		this.add(bp4);
		bp4.setBounds(Data.simnum2xy(2), Data.simnum2xy(3), Data.chessWidth, Data.chessHeigth);
		this.add(bp5);
		bp5.setBounds(Data.simnum2xy(0), Data.simnum2xy(3), Data.chessWidth, Data.chessHeigth);
		
		
		RR rr1 = new RR(8,9);
		RN rn1 = new RN(7,9);
		RB rb1 = new RB(6,9);
		RA ra1 = new RA(5,9);
		RK rk = new RK(4,9);//红子
		RA ra2 = new RA(3,9);	
		RB rb2 = new RB(2,9);
		RN rn2 = new RN(1,9);	
		RR rr2 = new RR(0,9);
		RC rc1 = new RC(7,7);
		RC rc2 = new RC(1,7);
		RP rp1 = new RP(8,6);
		RP rp2 = new RP(6,6);
		RP rp3 = new RP(4,6);
		RP rp4 = new RP(2,6);
		RP rp5 = new RP(0,6);
	
		this.add(rr1);
		rr1.setBounds(Data.simnum2xy(8), Data.simnum2xy(9), Data.chessWidth, Data.chessHeigth);
		this.add(rn1);
		rn1.setBounds(Data.simnum2xy(7), Data.simnum2xy(9), Data.chessWidth, Data.chessHeigth);
		this.add(rb1);
		rb1.setBounds(Data.simnum2xy(6), Data.simnum2xy(9), Data.chessWidth, Data.chessHeigth);
		this.add(ra1);
		ra1.setBounds(Data.simnum2xy(5), Data.simnum2xy(9), Data.chessWidth, Data.chessHeigth);
		this.add(rk);
		rk.setBounds(Data.simnum2xy(4), Data.simnum2xy(9), Data.chessWidth, Data.chessHeigth);
		this.add(ra2);
		ra2.setBounds(Data.simnum2xy(3), Data.simnum2xy(9), Data.chessWidth, Data.chessHeigth);
		this.add(rb2);
		rb2.setBounds(Data.simnum2xy(2), Data.simnum2xy(9), Data.chessWidth, Data.chessHeigth);
		this.add(rn2);
		rn2.setBounds(Data.simnum2xy(1), Data.simnum2xy(9), Data.chessWidth, Data.chessHeigth);
		this.add(rr2);
		rr2.setBounds(Data.simnum2xy(0), Data.simnum2xy(9), Data.chessWidth, Data.chessHeigth);
		this.add(rc1);
		rc1.setBounds(Data.simnum2xy(7), Data.simnum2xy(7), Data.chessWidth, Data.chessHeigth);
		this.add(rc2);
		rc2.setBounds(Data.simnum2xy(1), Data.simnum2xy(7), Data.chessWidth, Data.chessHeigth);
		this.add(rp1);
		rp1.setBounds(Data.simnum2xy(8), Data.simnum2xy(6), Data.chessWidth, Data.chessHeigth);
		this.add(rp2);
		rp2.setBounds(Data.simnum2xy(6), Data.simnum2xy(6), Data.chessWidth, Data.chessHeigth);
		this.add(rp3);
		rp3.setBounds(Data.simnum2xy(4), Data.simnum2xy(6), Data.chessWidth, Data.chessHeigth);
		this.add(rp4);
		rp4.setBounds(Data.simnum2xy(2), Data.simnum2xy(6), Data.chessWidth, Data.chessHeigth);
		this.add(rp5);
		rp5.setBounds(Data.simnum2xy(0), Data.simnum2xy(6), Data.chessWidth, Data.chessHeigth);
	
	}
	

	@Override
	public void mouseClicked(MouseEvent var1) {
		// TODO Auto-generated method stub
		int c = var1.getButton();// 得到按下的鼠标键
		int mouseX = var1.getX();
		int mouseY = var1.getY();
		String mouseInfo = null;// 接收信息
		if (c == MouseEvent.BUTTON1)// 推断是鼠标左键按下
		{	
			try {
				Data.selectPiece.setLocation(Data.xy2simnum(mouseX), Data.xy2simnum(mouseY));	
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
	
	
	}

	@Override
	public void mouseEntered(MouseEvent var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent var1) {
		// TODO Auto-generated method stub
		
	}

	 

}
