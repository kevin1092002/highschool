package Lab2;


	import javax.swing.JFrame;
	import java.awt.event.ActionEvent;
	import javax.swing.JPanel;
	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.WindowConstants;
	public class c5 {//Make a GUI
		private JFrame backGround;
		public c5()  {
		
			backGround= new JFrame("Connect Four");
			backGround.setSize(700,400);
			backGround.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			backGround.setPreferredSize(backGround.getSize());
			backGround.add(new coinSpace(backGround.getSize()));
			backGround.pack();
			backGround.setVisible(true);
		}
		public static void main(String... argv) {
			new c5();
		}//Main
		public static class coinSpace extends JPanel implements MouseListener{//The class to make the game
			int firstCol=10;
			int firstRow=10;
			int coinWidth=40;
			int turn=2;
			int rows=6;
			int coloums=7;
			Color[][] board=new Color[rows][coloums];
			int[][] b=new int[rows][coloums];
			public coinSpace(Dimension dimension) {// Make the circle coin 
				setSize(dimension);
				setPreferredSize(dimension);
				addMouseListener(this);
				int x=0;
				for(int count=0;count<board.length;count++) {//the loop to pain the coin white
					for(int counter=0;counter<board[0].length;counter++) {
						board[count][counter]=new Color(255,255,255);
					}
				}
			}
			
			@Override
			public	void paintComponent(Graphics g) {// paint the board
				Graphics2D g2=(Graphics2D)g;
				Dimension dim=getSize();
				g2.setColor(new Color(0,255,0));
				g2.fillRect(0, 0, dim.width, dim.height);
				firstCol=0;
				firstRow=0;
				for(int count=0;count<board.length;count++) {//the loop to paint all the board
					for(int counter=0;counter<board[0].length;counter++) {
						g.setColor(board[count][counter]);
						g.fillOval(firstCol,firstRow, coinWidth, coinWidth);
						firstCol+=coinWidth;
					}
					firstCol=0;
					firstRow+=coinWidth;
					
			}
				if(turn%2==0) {//indicate the turn
					g.setColor(new Color(255,0,0));	
					g.drawString("Red's turn", 500, 20);
				}else {
					g.setColor(new Color(255,255,0));
					g.drawString("Yellow's turn", 500, 20);
				}
		}
			public int validMove(int col,int y) {//check if the coin drop is a valid move
				int row=rows-1;
				if(col==board[row].length||y==board.length) {//can't be outside the board
					return row=-1;
				}else {
				while(! (row<0||board[row][col].equals(new Color(255,255,255)))) {//to make it go to the last available space
				row--;
			}
				}
			return row;
			}
		
			public void mousePressed(MouseEvent e) {// if we pressed the mouse the coin will drop
				int x=e.getX();
				int y=e.getY();
				int pressCol=x/coinWidth;
				int pressRow=y/coinWidth;
				pressRow=validMove(pressCol,y/coinWidth);
				if(pressRow<0) {
					System.out.println("Sorry, you can't move there");
				}else {
					if(checkWin()==true) {//check if game has over or not
						System.out.println("Game over");
					}
					else if(checkWin()== false) {
				if(turn%2==0) {//red turn
					board[pressRow][pressCol]=new Color(255,0,0);
					b[pressRow][pressCol]=1;
					//System.out.println(Arrays.deepToString(b));
					if(checkWin()==true) {// check if red has won
						System.out.println("red player win");
					}
				}else {// yellow turn
					board[pressRow][pressCol]=new Color(255,255,0);
					b[pressRow][pressCol]=2;
					//System.out.println(Arrays.deepToString(b));
					if(checkWin()==true) {//check if yellow has won
						System.out.println("yellow player win");
					}
				}
				turn++;//next turn
				}
				}
				repaint();
				}

			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public boolean checkWin() {//the method to check for the winner
				for(int r=5;r>-1;r--) {//check col
					for(int co=0; co<4;co++) {
						//System.out.println(Arrays.deepToString(b));
						if(b[r][co]==1 && b[r][co+1]==1&& b[r][co+2]==1&& b[r][co+3]==1) {
							return true;
					}if(b[r][co]==2 && b[r][co+1]==2&& b[r][co+2]==2&& b[r][co+3]==2) {
						return true;
				}
					}
				}
						for(int co=0;co<7;co++) {//check rows
							for(int r=5; r>2;r--) {
								//System.out.println(Arrays.deepToString(b));
								if(b[r][co]==1 && b[r-1][co]==1&& b[r-2][co]==1&& b[r-3][co]==1) {
									return true;
							
			}if(b[r][co]==2 && b[r-1][co]==2&& b[r-2][co]==2&& b[r-3][co]==2) {
				return true;
				
	}
						}
					}for(int co=0;co<4;co++) {//check diagnose
						for(int r=5; r>2;r--) {
							//System.out.println(Arrays.deepToString(b));
							if(b[r][co]==1 && b[r-1][co+1]==1&& b[r-2][co+2]==1&& b[r-3][co+3]==1) {
								return true;
		}if(b[r][co]==2 && b[r-1][co+1]==2&& b[r-2][co+2]==2&& b[r-3][co+3]==2) {
			return true;
	}
			}
					}for(int co=0;co<4;co++) {//check back diagnose
						for(int r=0; r<3;r++) {
							//System.out.println(Arrays.deepToString(b));
							if(b[r][co]==1 && b[r+1][co+1]==1&& b[r+2][co+2]==1&& b[r+3][co+3]==1) {
								return true;
		}if(b[r][co]==2 && b[r+1][co+1]==2&& b[r+2][co+2]==2&& b[r+3][co+3]==2) {
			return true;
	}
			}
					}
			
			return false;
		}
			}
		
	}
	
	
				