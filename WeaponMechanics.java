
public class WeaponMechanics
{
	static int proj=0;
	static int bomb=0;
	static int bombx=0;
	static int bomby=0;
	static int direction=0;
	public static void Attack(String cw)
	{
		if(cw.equals("Sword"))
		{
			if(meanie.getX() == MovementspaceObject.getX()+1||meanie.getX() == MovementspaceObject.getX()-1||meanie.getX() == MovementspaceObject.getX())
			{
				if(meanie.getY() == MovementspaceObject.getY()+1||meanie.getY() == MovementspaceObject.getY()-1||meanie.getY() == MovementspaceObject.getY())
				{
					meanie.sethealth(meanie.gethealth()-1);
				}
			}

		}
		else if(cw.equals("Bow"))
		{
			if(proj==0)
			{
				proj=1;
				Bow.Shoot(MovementspaceObject.getX(),MovementspaceObject.getY(),PlayerMovement.Getd());
			}
			PD.Refresh();
		}
		else if(cw.equals("Bomb"))
		{
			if(bomb==0)
			{
				bomb++;
				bombx=(MovementspaceObject.getX());
				bomby=(MovementspaceObject.getY());
				PD.bomb.set(0, bombx);
				PD.bomb.set(1, bomby);
			}
			else
			{
				bomb--;
				if(meanie.getX() == bombx+1||meanie.getX() == bombx-1||meanie.getX() == bombx)
				{
					if(meanie.getY() == bomby||meanie.getY() == bomby-1||meanie.getY() == bomby)
					{
						meanie.sethealth(meanie.gethealth()-2);
					}
				}
			}
			PD.Refresh();
		}
		else if(cw.equals("Shank"))
		{
			if(meanie.getX() == MovementspaceObject.getX()+1||meanie.getX() == MovementspaceObject.getX()-1||meanie.getX() == MovementspaceObject.getX())
			{
				if(meanie.getY() == MovementspaceObject.getY()+1||meanie.getY() == MovementspaceObject.getY()-1||meanie.getY() == MovementspaceObject.getY())
				{
					meanie.sethealth(meanie.gethealth()-2);
				}
			}
		}
		else	//peanuts!
		{
			if(proj==0)
			{
				proj=2;
				Bow.Shoot(MovementspaceObject.getX(),MovementspaceObject.getY(),PlayerMovement.Getd());
			}
		}
		PD.Refresh();
	}
	public static int Projectile()
	{
		return proj;
	}
	public static void Kill()
	{
		proj=0;
	}
	public static int Bombx()
	{
		return bombx;
	}
	public static int Bomby()
	{
		return bomby;
	}
}
