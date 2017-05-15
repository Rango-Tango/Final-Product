import javax.swing.*;
import net.miginfocom.swing.MigLayout;
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
	static JLabel weap=new JLabel();	//bomb and arrow values: 0 is x and 1 is y.
	/**
	 * Create the panel.
	 */
	public PD() 
	{
		arrow.add(0);
		arrow.add(0);
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
		setLayout(new MigLayout("", "[50px][50px][50px][50px][50px][50px][50px][50px]", "[50px][50px][50px][50px][50px][50px][50px][50px]"));
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
		for(int c=0;c<9;c++)
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
		int x2=meanie.getXM();
		int y2=meanie.getYM();
		Bow.Time();
		arrow.set(0, Bow.getx());
		arrow.set(1, Bow.gety());
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
			weap.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (2).png"));
		}
		else if(cw.equals("Peanuts"))
		{
			weap.setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
		}
	}
	public static void Health(int h)
	{
		health=h;
		for(int x=health-h;x!=0;x--)
		{
			heart.remove(heart.size());
		}
	}
}
