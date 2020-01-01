package com.myChess;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class RP extends ChessPiece implements MouseListener{
	
	private int CurrentsimX;
	private int CurrentsimY;
	Boolean sFlag = false;
	public RP(int x,int y) {
		// TODO Auto-generated constructor stub
		init();
		this.CurrentsimX = x;
		this.CurrentsimY = y;
		this.addMouseListener(this);
	}
	
	public void init() {	
		//设定透明效果
		this.setOpaque(false);  
		//去掉背景点击效果
		this.setContentAreaFilled(false);  
		//去掉聚焦线
		this.setFocusPainted(false);
		//去掉边框
		this.setBorder(null);
		ImageIcon icon = new ImageIcon("src\\images\\RP.GIF");
		this.setIcon(icon);
	}
	
	@Override
	public void setIconSelect(Boolean tf) {
		// TODO Auto-generated method stub
		super.setIconSelect(tf);
		if(tf == false) {
			ImageIcon icon = new ImageIcon("src\\images\\RP.GIF");
			this.setIcon(icon);	
		}
		if(tf == true) {
			ImageIcon icon = new ImageIcon("src\\images\\RPS.GIF");
			this.setIcon(icon);
		}
	}

	@Override
	public void setLocation(int setsimX, int setsimY) {
		// TODO Auto-generated method stub
		if(setsimX==CurrentsimX || setsimY==CurrentsimY)
		if((CurrentsimY>4 && (setsimY-CurrentsimY)==-1) || 
				(CurrentsimY<=4 && ((setsimY-CurrentsimY)==-1||(setsimX-CurrentsimX)==-1||(setsimX-CurrentsimX)==1))) {
			Data.panelArray[CurrentsimX][CurrentsimY] = 0;
			Data.panelArray[setsimX][setsimY] = 1;
			this.CurrentsimX = setsimX;
			this.CurrentsimY = setsimY;
			Data.selectPiece = null;
			Data.BorRRun = !Data.BorRRun;
			this.move(Data.simnum2xy(setsimX),Data.simnum2xy(setsimY));
		}
		else {
			this.move(Data.simnum2xy(CurrentsimX),Data.simnum2xy(CurrentsimY));
		}				
	}
	
	
	@Override
	public void mouseClicked(MouseEvent var1) {
		// TODO Auto-generated method stub
		int c = var1.getButton();// 得到按下的鼠标键
		String mouseInfo = null;// 接收信息
		if (c == MouseEvent.BUTTON1 && Data.BorRRun == true){// 推断是鼠标左键按下		
			if(Data.lastSelectPiece!=this && Data.lastSelectPiece!=null) {
				Data.lastSelectPiece.setIconSelect(false);
				Data.selectPiece = this;				
				this.setIconSelect(true);
				Data.lastSelectPiece = this;
				
			}
			else if(Data.lastSelectPiece == this ) {
				this.setIconSelect(false);			
				Data.lastSelectPiece = null;				
			}else {
				Data.selectPiece = this;
				this.setIconSelect(true);
				Data.lastSelectPiece = this;
			}			
		}
		else if (c==MouseEvent.BUTTON1 && Data.BorRRun == false) {//这个算是吃子时的操作，当该敌方走子时点到了己方的棋子就是想吃了你呗，当然得满足规则才能让它吃
			Data.lastSelectPiece.setLocation(CurrentsimX, CurrentsimY);
			if(Data.BorRRun == true)//但setLocation执行则满足规则，执行时会将BorRRun取反，所以BorRRun与开始相反时就说明子被吃了，
				this.setVisible(false);//把visible设为false代表子被吃了
		}
	}

	@Override
	public void mousePressed(MouseEvent var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent var1) {
		// TODO Auto-generated method stub
		
	}
}