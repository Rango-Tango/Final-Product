import java.util.*;
public class SB
{
	static ArrayList<ArrayList<Integer>> ban=new ArrayList<ArrayList<Integer>>();
	static int num=0;
	static int hit=0;
	static int pos=7;
	static int poss=7;
	public static void add(int x)
	{
		if(BD.cw.equals("Bow")||BD.cw.equals("Bomb"))
		{
			ban.add(new ArrayList<Integer>());
			ban.get(num).add(x);
			ban.get(num).add(5);
			num++;
		}
	}
	public static void Time()
	{
		for(int c=num-1;c>0;c--)
		{
			ban.get(c).set(1,ban.get(c).get(1)-1);
		}
		for(int c=num-1;c>=0;c--)
		{
			if(MovementspaceObject.getX()==ban.get(c).get(0) && MovementspaceObject.getY()==ban.get(c).get(1))
			{
				if(BD.cw.equals("Bow")||BD.cw.equals("Peanuts"))
				{
					MovementspaceObject.setHealth(MovementspaceObject.health-2);
				}
				else
				{
					MovementspaceObject.setHealth(MovementspaceObject.health-4);
				}
				SB.kill(c);
			}
			else if(ban.get(c).get(0)==Bow.getx()&&ban.get(c).get(1)==Bow.gety())
			{
				pos=Bow.gety();
				poss=Bow.getx();
				WeaponMechanics.Kill();
				hit=1;	
			}
			else if(ban.get(c).get(0)==WeaponMechanics.Bombx()&&ban.get(c).get(1)==WeaponMechanics.Bomby())
			{
				WeaponMechanics.bomb=0;
			}
		}
		if(hit==1)
		{
			SB.Hit(poss,pos);
			pos=7;
		}
	}
	public static void kill(int n)
	{
		ban.remove(n);
		num--;
	}
	public static int find(int x, int y)
	{
		for(int c=num-1;c>0;c--)
		{
			if(ban.get(c).get(1)<=-1)
			{
				SB.kill(c);
			}
			else if(x==ban.get(c).get(0)&&y==ban.get(c).get(1))
			{
				return c;
			}
		}
		return -1;
	}
	public static void Hit(int x,int y)
	{
		if(BD.cw=="Bow"||BD.cw=="Peanuts")
		{
			for(int c=0;c<7;c++)
			{
				if(x!=c)
				{
					if(Ban.find(c, y)!=-1)
					{
						Ban.kill((Ban.find(c,y)));
					}
				}
				else
				{
					ban.remove(SB.find(x,y));
					num--;
				}
			}
			hit=0;
		}
		else
		{
			int win=SB.find(x,y);
			if(win!=-1)
			{
				ban.get(win).set(0,3);
				ban.get(win).set(1,6);
				hit=0;
			}
		}
	}
}
