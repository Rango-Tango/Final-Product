import java.util.*;

public class Ban
{
	static ArrayList<ArrayList<Integer>> ban=new ArrayList<ArrayList<Integer>>();
	static int num=0;
	public static void add(int x)
	{
		ban.add(new ArrayList<Integer>());
		ban.get(num).add(x);
		ban.get(num).add(5);
		num++;
	}
	public static void Time()
	{
		for(int c=num-1;c>0;c--)
		{
			ban.get(c).set(1,ban.get(c).get(1)-1);
		}
		for(int c=num-1;c>0;c--)
		{
			if(MovementspaceObject.getX()==ban.get(c).get(0) && MovementspaceObject.getY()==ban.get(c).get(1))
			{
				MovementspaceObject.health=MovementspaceObject.health-2;
				Ban.kill(c);
			}
			else if(ban.get(c).get(0)==Bow.getx()&&ban.get(c).get(1)==Bow.gety())
			{
				WeaponMechanics.Kill();
			}
			else if(ban.get(c).get(0)==WeaponMechanics.Bombx()&&ban.get(c).get(1)==WeaponMechanics.Bomby())
			{
				WeaponMechanics.bomb=0;
			}
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
				Ban.kill(c);
			}
			else if(x==ban.get(c).get(0)&&y==ban.get(c).get(1))
			{
				return c;
			}
		}
		return -1;
	}
}
