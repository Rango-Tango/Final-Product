import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class BD extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2922086132926084680L;
	/**
	 * Create the panel.
	 */
	static ArrayList<ArrayList<JLabel>> grid=new ArrayList<ArrayList<JLabel>>();
	static ArrayList<JLabel> heart=new ArrayList<JLabel>();
	static ArrayList<Integer> bomb=new ArrayList<Integer>();
	static ArrayList<Integer> arrow=new ArrayList<Integer>();
	static ArrayList<ArrayList<Integer>> ban=new ArrayList<ArrayList<Integer>>();
	static String cw=Toggle.CurWeap();
	static int health=MovementspaceObject.health;
	static int ad=-1;
	static int sc=0;
	static JLabel weap=new JLabel();
	public BD() 
	{
		arrow.add(0);
		arrow.add(0);
		bomb.add(0);
		bomb.add(0);
		MovementspaceObject.x=3;
		MovementspaceObject.y=0;
		for(int c=0;c<7;c++)
		{
			grid.add(new ArrayList<JLabel>());
			for(int v=0;v<7;v++)
			{
				grid.get(c).add(new JLabel());
			}
		}
		for(int c=0;c<8;c++)
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
		for(int c=0;c<8;c++)
		{
			add(heart.get(c), "cell " + c + " 0");
		}
		add(weap, "cell 9 0");
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
	public static void Refresh()
	{
		int x=MovementspaceObject.getX();
		int y=MovementspaceObject.getY();
		Ban.Time();
		SB.Time();
		if(BD.cw=="Bow")
		{
			Bow.BossTime();		
		}
		sc=Boss.shoot(sc);
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
		grid.get(x).get(y).setIcon(new ImageIcon("G:\\Downloads\\New Piskel (1).png"));
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
		for(int c=0;c<7;c++)
		{
			for(int v=0;v<7;v++)
			{
				if(Ban.find(c,v)!=-1)
				{
					grid.get(c).get(v).setIcon(new ImageIcon("G:\\Downloads\\Banana.png"));
				}
			}
		}
		for(int c=0;c<7;c++)
		{
			for(int v=0;v<7;v++)
			{
				if(SB.find(c,v)!=-1)
				{
					if(cw=="Bow")
					{
						grid.get(c).get(v).setIcon(new ImageIcon("G:\\Downloads\\Hit.png"));
					}
					else
					{
						grid.get(c).get(v).setIcon(new ImageIcon("G:\\Downloads\\Hit 2.png"));
					}
				}
			}
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
		grid.get(3).get(6).setIcon(new ImageIcon("G:\\Downloads\\Harambe.png"));
	}
}
