package com.myChess;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BK extends ChessPiece implements MouseListener{
	
	private int CurrentsimX;
	private int CurrentsimY;
 

	public BK(int x,int y) {
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
		ImageIcon icon = new ImageIcon("src\\images\\BK.GIF");
		this.setIcon(icon);
	}
	
	@Override
	public void setIconSelect(Boolean tf) {
		// TODO Auto-generated method stub
		super.setIconSelect(tf);
		if(tf == false) {
			ImageIcon icon = new ImageIcon("src\\images\\BK.GIF");
			this.setIcon(icon);	
		}
		if(tf == true) {
			ImageIcon icon = new ImageIcon("src\\images\\BKS.GIF");
			this.setIcon(icon);
		}
	}

	@Override
	public void setLocation(int setsimX, int setsimY) {
		// TODO Auto-generated method stub
		
		if(setsimX>2&&setsimX<6&&setsimY<3) {
			if(setsimX+setsimY-CurrentsimX-CurrentsimY == 1 || setsimX+setsimY-CurrentsimX-CurrentsimY == -1) {
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
	}
	
	
	@Override
	public void mouseClicked(MouseEvent var1) {
		// TODO Auto-generated method stub
		int c = var1.getButton();// 得到按下的鼠标键
		String mouseInfo = null;// 接收信息
		if (c==MouseEvent.BUTTON1 && Data.BorRRun == false)// 推断是鼠标左键按下
		{
			if(Data.lastSelectPiece!=this && Data.lastSelectPiece!=null) {
				Data.lastSelectPiece.setIconSelect(false);
				Data.selectPiece = 	this;				
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
		else if (c==MouseEvent.BUTTON1 && Data.BorRRun == true) {
				Data.lastSelectPiece.setLocation(CurrentsimX, CurrentsimY);
				if(Data.BorRRun == false) {
					this.setVisible(false);
					JOptionPane.showMessageDialog(this,"红方获胜","提示",JOptionPane.PLAIN_MESSAGE);				
				}							
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
