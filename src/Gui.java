import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Gui extends JFrame implements KeyListener{
	private static ImageIcon background= new ImageIcon(".\\image\\background.png");
	private static JLabel[][] lb = new JLabel[13][15];                      
	private static int[][] arr = new int[13][15];
	private static ImageIcon box = new ImageIcon(".\\image\\box.png");
	private static ImageIcon house1 = new ImageIcon(".\\image\\house-blue.png");//blue
	private static ImageIcon house2 = new ImageIcon(".\\image\\house-red.png");//red
	private static ImageIcon house3 = new ImageIcon(".\\image\\house-yellow.png");//yellow
	private static ImageIcon tree = new ImageIcon(".\\image\\tree.png");
	private static int p1x;  // player1 x
	private static int p1y;  // player1 y
	private static int speed=300;
	private static JLabel clock;
	private static int sc1=0,sc2=0;
	final int row=13,col=15;
	private static JLabel score1 = new JLabel();
	private static JLabel score2 = new JLabel();
	private static JPanel start;
	
	
	
	public Gui()
	{
		setscore(score1,score2);
		startBtn();
		addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		int key = arg0.getKeyCode();
		
		if (key == KeyEvent.VK_RIGHT){ 
			if(p1y != col-1)
			 {
				if(arr[p1x][p1y+1]==0) //white
				{
					arr[p1x][p1y]=0;
					p1y=p1y+1;
					arr[p1x][p1y]=3;
				}
				else if(arr[p1x][p1y+1]==11) //shoes
				{
					if(speed>50)
					{
						speed=speed-50;
						arr[p1x][p1y]=0;
						p1y=p1y+1;
						arr[p1x][p1y]=3;
					}
				}
			 }
			
		}else if(key == KeyEvent.VK_LEFT){
			if(p1y != 0)
			 {
				if(arr[p1x][p1y-1]==0)
				{
					arr[p1x][p1y]=0;
					p1y=p1y-1;
					arr[p1x][p1y]=3;
				}
				else if(arr[p1x][p1y-1]==11)
				{
					if(speed>50)
					{
						speed=speed-50;
						arr[p1x][p1y]=0;
						p1y=p1y-1;
						arr[p1x][p1y]=3;
					}
				}
				//play1.setPosition(play1,p1x,p1y,0,speed);
			 }
			
		}
		else if(key == KeyEvent.VK_UP){
			if(p1x != 0)
			 {
				if(arr[p1x-1][p1y]==0)
				{				
					arr[p1x][p1y]=0;
					p1x=p1x-1;
					arr[p1x][p1y]=3;
				}
				else if(arr[p1x-1][p1y]==11)
				{
					if(speed>50)
					{
						speed=speed-50;
						arr[p1x][p1y]=0;
						p1x=p1x-1;
						arr[p1x][p1y]=3;
					}
				}
				//play1.setPosition(play1,p1x,p1y,2,speed);
			 }
		}
		else if(key == KeyEvent.VK_DOWN){
			if(p1x != row-1)
			{
				if(arr[p1x+1][p1y]==0)
				{
					arr[p1x][p1y]=0;
					p1x=p1x+1;
					arr[p1x][p1y]=3;
				}
				else if(arr[p1x+1][p1y]==11)
				{
					if(speed>50)
					{
						speed=speed-50;
						arr[p1x][p1y]=0;
						p1x=p1x-1;
						arr[p1x][p1y]=3;
					}
				}
				//play1.setPosition(play1,p1x,p1y,3,speed);
			}	
			
		}
		else if(key == KeyEvent.VK_ENTER){   //player1 bomber
			
		}
		else  // player 2 control
		{
			if (key == KeyEvent.VK_D){ 
				if(p1y != col-1)
				 {
					if(arr[p1x][p1y+1]==0) //white
					{
						arr[p1x][p1y]=0;
						p1y=p1y+1;
						arr[p1x][p1y]=3;
					}
					else if(arr[p1x][p1y+1]==11) //shoes
					{
						if(speed>50)
						{
							speed=speed-50;
							arr[p1x][p1y]=0;
							p1y=p1y+1;
							arr[p1x][p1y]=3;
						}
					}
				 }
				
			}else if(key == KeyEvent.VK_A){
				if(p1y != 0)
				 {
					if(arr[p1x][p1y-1]==0)
					{
						arr[p1x][p1y]=0;
						p1y=p1y-1;
						arr[p1x][p1y]=3;
					}
					else if(arr[p1x][p1y-1]==11)
					{
						if(speed>50)
						{
							speed=speed-50;
							arr[p1x][p1y]=0;
							p1y=p1y-1;
							arr[p1x][p1y]=3;
						}
					}
					//play1.setPosition(play1,p1x,p1y,0,speed);
				 }
				
			}
			else if(key == KeyEvent.VK_W){
				if(p1x != 0)
				 {
					if(arr[p1x-1][p1y]==0)
					{				
						arr[p1x][p1y]=0;
						p1x=p1x-1;
						arr[p1x][p1y]=3;
					}
					else if(arr[p1x-1][p1y]==11)
					{
						if(speed>50)
						{
							speed=speed-50;
							arr[p1x][p1y]=0;
							p1x=p1x-1;
							arr[p1x][p1y]=3;
						}
					}
					//play1.setPosition(play1,p1x,p1y,2,speed);
				 }
				
			}
			else if(key == KeyEvent.VK_S){
				if(p1x != row-1)
				{
					if(arr[p1x+1][p1y]==0)
					{
						arr[p1x][p1y]=0;
						p1x=p1x+1;
						arr[p1x][p1y]=3;
					}
					else if(arr[p1x+1][p1y]==11)
					{
						if(speed>50)
						{
							speed=speed-50;
							arr[p1x][p1y]=0;
							p1x=p1x-1;
							arr[p1x][p1y]=3;
						}
					}
					//play1.setPosition(play1,p1x,p1y,3,speed);
				}	
			}
			else if(key == KeyEvent.VK_B){  //player2 bomb
					//System.out.println("AAA");
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void setscore(JLabel score1,JLabel score2)
	{
		score1.setText(":  "+sc1);
        score1.setFont(new java.awt.Font("Dialog", 1, 30));
        score1.setForeground(Color.RED);
		score1.setSize(100,100);
	
		score2.setText(":  "+sc2);
        score2.setFont(new java.awt.Font("Dialog", 1, 30));
        score2.setForeground(Color.RED);
		score2.setSize(100,100);
	}
	
	public static void startBtn()
	{
		start=new JPanel();
		start.setSize(100,100);
		start.setLocation(200,80);
		start.setBackground(Color.WHITE);
		JButton btn =new JButton("start!");
		
		StartButton mblistener = new StartButton();
		btn.addActionListener(mblistener);
		start.add(btn);
	}
	
	public static void setPicture()
	{
		for(int i=0;i<13;i++)
		{
			for(int j=0;j<15;j++)
			{
				if(arr[i][j] == 0)      //white 
				{
					lb[i][j].setIcon(null);
				}
				else if(arr[i][j] == 1) //box
				{
					lb[i][j].setIcon(box);
				}
				else if(arr[i][j] == 2) //house1
				{
					lb[i][j].setIcon(house1);
				}
				else if(arr[i][j] == 3) //house2
				{
					lb[i][j].setIcon(house2);
				}
				else if(arr[i][j] == 4) //house3
				{
					lb[i][j].setIcon(house3);
				}
				else if(arr[i][j] == 5) //tree
				{
					lb[i][j].setIcon(tree);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new Gui();
		JLabel label = new JLabel(background);
		frame.setSize(background.getIconWidth(), background.getIconHeight());
		label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		
		JPanel scoreboard = new JPanel();
		scoreboard.setSize(130,140);
		scoreboard.setLocation(650,80);
		scoreboard.setBackground(Color.WHITE);
		scoreboard.setLayout(new GridLayout(2,2));
		frame.setContentPane(label);
		scoreboard.add(new JLabel(new ImageIcon(".\\image\\p1.jpg")));
		scoreboard.add(score1);
		scoreboard.add(new JLabel(new ImageIcon(".\\image\\p2.jpg")));
		scoreboard.add(score2);
		
		frame.add(start);
		frame.add(scoreboard);
		//frame.add(start);
		frame.setVisible(true);
		 
		//frame.setLayout(null);
		//frame.setVisible(true);
	}

	

}

