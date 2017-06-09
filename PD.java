import javax.swing.*;
import net.miginfocom.swing.MigLayout;

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;
public class PD extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 646480799273515869L;
	static ArrayList<ArrayList<JLabel>> grid=new ArrayList<ArrayList<JLabel>>();
	static ArrayList<JLabel> heart=new ArrayList<JLabel>();
	static ArrayList<Integer> bomb=new ArrayList<Integer>();
	static ArrayList<Integer> arrow=new ArrayList<Integer>();
	static int health=8;
	static int ad=-1;
	static Graphics w;
	static meanie mOne = new meanie();
	meanie m = new meanie();
	static JLabel weap=new JLabel();
	/**
	 * Create the panel.
	 */
	public PD() 
	{
		arrow.add(0);
		arrow.add(0);
		bomb.add(0);
		bomb.add(0);
		for(int c=0;c<7;c++)
		{
			grid.add(new ArrayList<JLabel>());
			for(int v=0;v<7;v++)
			{
				grid.get(c).add(new JLabel());
			}
		}
		for(int c=0;c<9;c++)
		{
			heart.add(new JLabel());
		}
		setLayout(new MigLayout("insets 0 0 0 0", "25[50px]0[50px]0[50px]0[50px]0[50px]0[50px]0[50px]0[50px]0[50px]25", "0[50px]25[50px]0[50px]0[50px]0[50px]0[50px]0[50px]0[50px]0"));
		for(int c=0;c<7;c++)
		{
			for(int v=0;v<7;v++)
			{
				int j=0;
				if(v==0)
				{
					j=6;
				}
				else if(v==1)
				{
					j=5;
				}
				else if(v==2)
				{
					j=4;
				}
				else if(v==3)
				{
					j=3;
				}
				else if(v==4)
				{
					j=2;
				}
				else if(v==5)
				{
					j=1;
				}
				else if(v==6)
				{
					j=0;
				}
				add(grid.get(c).get(v), "cell " + c + " " + j+1);
			}
		}
		for(int c=0;c<7;c=c+2)
		{
			heart.get(c).setIcon(new ImageIcon("G:\\Downloads\\Heart Left.png"));
		}
		for(int c=1;c<8;c=c+2)
		{
			heart.get(c).setIcon(new ImageIcon("G:\\Downloads\\Heart Right.png"));
		}
		for(int c=0;c<8;c++)
		{
			add(heart.get(c), "cell " + c + " 0");
		}
		add(weap, "cell 9 0");
		weap.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (4).png"));
	}
	public static void Refresh()
	{
		int x1=MovementspaceObject.getX();
		int y1=MovementspaceObject.getY();
		int x2=0;
		int y2=0;
		int XorY = 0;
		if(M_M.r.current.ifMeanie())
		{
			x2 = M_M.r.current.m.getX();
			y2=  M_M.r.current.m.getY();
		}
		else
		{
			x2 = M_M.r.current.f.getX();
			y2 = M_M.r.current.f.getX();
		}
		Bow.Time();
		arrow.set(0, Bow.getx());
		arrow.set(1, Bow.gety());
		bomb.set(0, WeaponMechanics.bombx);
		bomb.set(1, WeaponMechanics.bomby);
		for(int c=0;c<7;c++)
		{
			for(int v=0;v<7;v++)
			{
				grid.get(c).get(v).setIcon(new ImageIcon("G:\\Downloads\\Blank.png"));
			}
		}
		if(x2!=7)
		{
			grid.get(x2).get(y2).setIcon(new ImageIcon("G:\\Downloads\\New Piskel.png"));
		}
		grid.get(x1).get(y1).setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
		if(WeaponMechanics.Projectile()==2)
		{
			grid.get(arrow.get(0)).get(arrow.get(1)).setIcon(new ImageIcon("G:\\Downloads\\Peanut.png"));
		}
		else if(WeaponMechanics.Projectile()==0)
		{	
		}
		else if(ad==0)
		{
			grid.get(arrow.get(0)).get(arrow.get(1)).setIcon(new ImageIcon("G:\\Downloads\\Arrow Up.png"));
		}
		else if(ad==1)
		{
			grid.get(arrow.get(0)).get(arrow.get(1)).setIcon(new ImageIcon("G:\\Downloads\\Arrow Left.png"));
		}
		else if(ad==2)
		{
			grid.get(arrow.get(0)).get(arrow.get(1)).setIcon(new ImageIcon("G:\\Downloads\\Arrow Down.png"));
		}
		else if(ad==3)
		{
			grid.get(arrow.get(0)).get(arrow.get(1)).setIcon(new ImageIcon("G:\\Downloads\\Arrow Right.png"));
		}
		if(WeaponMechanics.bomb==1)
		{		
			grid.get(bomb.get(0)).get(bomb.get(1)).setIcon(new ImageIcon("G:\\Downloads\\New Piskel (5).png"));
		}
		if(MovementspaceObject.health!=health)
		{
			for(int c=health;c!=0;c--)
			{
				if(MovementspaceObject.health<0)
				{
					//dead
				}
				else if(MovementspaceObject.health<c)
				{
					heart.get(heart.size()-1).setIcon(null);
					heart.remove(heart.size()-1);
				}
			}
			health=MovementspaceObject.health;
		}
	}
	public static void Weaponset(String cw)
	{
		if(cw.equals("Sword"))
		{
			weap.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (4).png"));
		}
		else if(cw.equals("Bow"))
		{
			weap.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (3).png"));
		}
		else if(cw.equals("Bomb"))
		{
			weap.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (5).png"));
		}
		else if(cw.equals("Shank"))
		{
			weap.setIcon(new ImageIcon("G:\\Downloads\\Shank.png"));
		}
		else if(cw.equals("Peanuts"))
		{
			weap.setIcon(new ImageIcon("G:\\Downloads\\Peanut.png"));
		}
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		switch(Transtion.getJ())
		{
		case 0:
			MiddleRoom(g);
			break;
		case 1:
			LeftRoom(g);
			break;
		case 2:
			RightRoom(g);
			break;
		case 3:
			TopRoom(g);
			break;
		default:
			break;
		}
	}
	   public void LeftRoom(Graphics g){
		   Color y = null;
		      g.fillRect (0, 0, 500, 500);
		     g.setColor(y.green);
		     g.drawRect(25, 75, 350, 350);
		     g.drawLine(75,75,75,425);
		     g.drawLine(125,75,125,425);
		     g.drawLine(175, 75, 175, 425);
		     g.drawLine(225, 75, 225, 425);
		     g.drawLine(275, 75, 275, 425);
		     g.drawLine(325, 75, 325, 425);
		     //Vertical lines
		     g.drawLine(25, 125, 375, 125);
		     g.drawLine(25, 175, 375, 175);
		     g.drawLine(25, 225, 375, 225);
		     g.drawLine(25, 275, 375, 275);
		     g.drawLine(25, 325, 375, 325);
		     g.drawLine(25, 375, 375, 375);
		     //Horizontal Lines
		     g.setColor(y.black);
		     g.drawLine(375, 225, 375, 275);
	   }
	   public void MiddleRoom(Graphics g){
		   Color y = null;
		      g.fillRect (0, 0, 500, 500);
		     g.setColor(y.green);
		     g.drawRect(25, 75, 350, 350);
		     g.drawLine(75,75,75,425);
		     g.drawLine(125,75,125,425);
		     g.drawLine(175, 75, 175, 425);
		     g.drawLine(225, 75, 225, 425);
		     g.drawLine(275, 75, 275, 425);
		     g.drawLine(325, 75, 325, 425);
		     //Vertical lines
		     g.drawLine(25, 125, 375, 125);
		     g.drawLine(25, 175, 375, 175);
		     g.drawLine(25, 225, 375, 225);
		     g.drawLine(25, 275, 375, 275);
		     g.drawLine(25, 325, 375, 325);
		     g.drawLine(25, 375, 375, 375);
		     //Horizontal Lines
		     g.setColor(y.black);
		     g.drawLine(375, 225, 375, 275);
		     g.drawLine(25, 225, 25, 275);
		     g.drawLine(175, 75, 225, 75);
	   }
	   public void RightRoom(Graphics g){
		   Color y = null;
		      g.fillRect (0, 0, 500, 500);
		     g.setColor(y.green);
		     g.drawRect(25, 75, 350, 350);
		     g.drawLine(75,75,75,425);
		     g.drawLine(125,75,125,425);
		     g.drawLine(175, 75, 175, 425);
		     g.drawLine(225, 75, 225, 425);
		     g.drawLine(275, 75, 275, 425);
		     g.drawLine(325, 75, 325, 425);
		     //Vertical lines
		     g.drawLine(25, 125, 375, 125);
		     g.drawLine(25, 175, 375, 175);
		     g.drawLine(25, 225, 375, 225);
		     g.drawLine(25, 275, 375, 275);
		     g.drawLine(25, 325, 375, 325);
		     g.drawLine(25, 375, 375, 375);
		     //Horizontal Lines
		     g.setColor(y.black);
		     g.drawLine(25, 225, 25, 275);
	   }
	   public void TopRoom(Graphics g){
		   Color y = null;
		      g.fillRect (0, 0, 500, 500);
		     g.setColor(y.green);
		     g.drawRect(25, 75, 350, 350);
		     g.drawLine(75,75,75,425);
		     g.drawLine(125,75,125,425);
		     g.drawLine(175, 75, 175, 425);
		     g.drawLine(225, 75, 225, 425);
		     g.drawLine(275, 75, 275, 425);
		     g.drawLine(325, 75, 325, 425);
		     //Vertical lines
		     g.drawLine(25, 125, 375, 125);
		     g.drawLine(25, 175, 375, 175);
		     g.drawLine(25, 225, 375, 225);
		     g.drawLine(25, 275, 375, 275);
		     g.drawLine(25, 325, 375, 325);
		     g.drawLine(25, 375, 375, 375);
		     //Horizontal Lines
		     g.setColor(y.black);
		     g.drawLine(175, 425, 225, 425);   
	   }
}