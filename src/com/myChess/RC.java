package com.myChess;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

public class RC extends ChessPiece implements MouseListener{
	
	private int CurrentsimX;
	private int CurrentsimY;
	public RC(int x,int y) {
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
		ImageIcon icon = new ImageIcon("src\\images\\RC.GIF");
		this.setIcon(icon);
	}
	
	@Override
	public void setIconSelect(Boolean tf) {
		// TODO Auto-generated method stub
		super.setIconSelect(tf);
		if(tf == false) {
			ImageIcon icon = new ImageIcon("src\\images\\RC.GIF");
			this.setIcon(icon);	
		}
		if(tf == true) {
			ImageIcon icon = new ImageIcon("src\\images\\RCS.GIF");
			this.setIcon(icon);
		}
	}

	@Override
	public void setLocation(int setsimX, int setsimY) {
		// TODO Auto-generated method stub
		int BRflagX = 0;
		int BRflagY = 0;
		if(setsimX < CurrentsimX)//跟车的走子规则判断差不多，但是吃子的时候有点区别中间要隔一个子嘛
			for(int i=setsimX+1;i<CurrentsimX;i++)
				BRflagX = Data.panelArray[i][CurrentsimY] + BRflagX;
		else if(setsimX > CurrentsimX)
			for(int i=CurrentsimX+1;i<setsimX;i++)					
					BRflagX = Data.panelArray[i][CurrentsimY] + BRflagX;							
		if(setsimY < CurrentsimY)
			for(int i=setsimY+1;i<CurrentsimY;i++)
				BRflagY = Data.panelArray[CurrentsimX][i] + BRflagY;
		else if(setsimY > CurrentsimY)
			for(int i=CurrentsimY+1;i<setsimY;i++)
				BRflagY = Data.panelArray[CurrentsimX][i] + BRflagY;
			
		if((setsimX==CurrentsimX&&BRflagY==1 || setsimY==CurrentsimY&&BRflagX==1)&& Data.panelArray[setsimX][setsimY]==1 ) {//中间隔一个子时进行吃子操作
			Data.panelArray[CurrentsimX][CurrentsimY] = 0;
			Data.panelArray[setsimX][setsimY] = 1;
			this.CurrentsimX = setsimX;
			this.CurrentsimY = setsimY;
			Data.selectPiece = null;
			Data.BorRRun = !Data.BorRRun;
			this.move(Data.simnum2xy(setsimX),Data.simnum2xy(setsimY));
		}
		else if((setsimX==CurrentsimX&&BRflagY==0 || setsimY==CurrentsimY&&BRflagX==0)  && Data.panelArray[setsimX][setsimY]==0) {//中间没有子时代表正常的走子	
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
		if (c==MouseEvent.BUTTON1 && Data.BorRRun == true)// 这个算是正常的棋子选择时的操作，就是换Icon之类的操作，BorRRun表示该哪一方走了
		{
			if(Data.lastSelectPiece!=this && Data.lastSelectPiece!=null) {//如果连续两次点了不同的棋子，就会将上次点的棋子设为未选中，这次点的棋子设为选中
				Data.lastSelectPiece.setIconSelect(false);
				Data.selectPiece = 	this;				
				this.setIconSelect(true);
				Data.lastSelectPiece = this;
				
			}
			else if(Data.lastSelectPiece == this ) {//如果连续两次点同一个棋子，会将选中设为未选中，这个功能现在感觉很鸡肋啊，看看可不可以去掉
				this.setIconSelect(false);			
				Data.lastSelectPiece = this;				
			}else {	//这是满足条件Data.lastSelectPiece!=this && Data.lastSelectPiece=null时执行的，算是走第一步时执行的吧
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
//		
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
