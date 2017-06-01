
public class Boss 
{
	static int health=12;
	static int stage=0;
	public static void setHealth(int h)
	{
		health=h;
		System.out.println(health);
		if(health<=4)
		{
			stage=1;
		}
		if(health<=0)
		{
			M_M.win();
		}
		MovementspaceObject.setY(0);
	}
	public static int getHealth()
	{
		return health;
	}
	public static int shoot(int sc)
	{
		if(stage==0)
		{
			if(sc>=6)
			{
				double ran=Math.random();
				int r=(int)(ran*6);
				for(int c=0;c<7;c++)
				{
					if(r!=c)
					{
						Ban.add(c);
					}
				}
				sc=0;
				if(BD.cw=="Bow")
				{
					SB.add(r);
				}
				else if(BD.cw=="Bomb")
				{
					//insert bomb projectile creator here
				}
			}
			else
			{
				sc++;
			}
		}
		else
		{
			if(sc>=4)
			{
				double ran=Math.random();
				int r=(int)(ran*6);
				for(int c=0;c<7;c++)
				{
					if(r!=c)
					{
						Ban.add(c);
					}
				}
				SB.add(r);
				sc=0;
			}
			else
			{
				sc++;
			}
		}
		return sc;
	}
}
