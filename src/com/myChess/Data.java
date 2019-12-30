package com.myChess;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Data {
	public static Boolean sFlag = false;
	public static ChessPiece selectPiece = null;
	public static ChessPiece lastSelectPiece = null;
	public static final int chessWidth = 41;
	public static final int chessHeigth = 41;
	public static Boolean BorRRun = true;//被选中的是黑子还是红字，黑子为true
	public static int panelArray[][]= {	{1, 0, 0, 1, 0, 0, 1, 0, 0,1}, 
										{1, 0, 1, 0, 0, 0, 0, 1, 0,1},
										{1, 0, 0, 1, 0, 0, 1, 0, 0,1},
										{1, 0, 0, 0, 0, 0, 0, 0, 0,1},
										{1, 0, 0, 1, 0, 0, 1, 0, 0,1}, 
										{1, 0, 0, 0, 0, 0, 0, 0, 0,1}, 
										{1, 0, 0, 1, 0, 0, 1, 0, 0,1}, //列代表X，行代表Y
										{1, 0, 1, 0, 0, 0, 0, 1, 0,1},				
										{1, 0, 0, 1, 0, 0, 1, 0, 0,1}};//用来表示棋盘上每个位置是否有棋子

	public static int simnum2xy (int num) {//将0,1,2,3转成真实坐标
		int xy = 41*num;
		return xy;
	}
	public static int xy2simnum (int xy) {//将真实坐标转成0,1,2,3
		int num = xy/41;
		return num;
	}
}
