
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
			if(meanie.getXM() == MovementspaceObject.getX()+1||meanie.getXM() == MovementspaceObject.getX()-1||meanie.getXM() == MovementspaceObject.getX())
			{
				if(meanie.getYM() == MovementspaceObject.getY()+1||meanie.getYM() == MovementspaceObject.getY()-1||meanie.getYM() == MovementspaceObject.getY())
				{
					meanie.setHeatlh(meanie.getHealthM()-1);
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
		}
		else if(cw.equals("Bomb"))
		{
			if(bomb==0)
			{
				bomb++;
				bombx=(MovementspaceObject.getX());
				bomby=(MovementspaceObject.getY());
				PersonDisplay.Bomb(bombx,bomby);
			}
			else
			{
				bomb--;
				if(meanie.getXM() == bombx+1||meanie.getXM() == bombx-1||meanie.getXM() == bombx)
				{
					if(meanie.getYM() == bomby||meanie.getYM() == bomby-1||meanie.getYM() == bomby)
					{
						meanie.setHeatlh(meanie.getHealthM()-2);
					}
				}
			}
		}
		else if(cw.equals("Shank"))
		{
			if(meanie.getXM() == MovementspaceObject.getX()+1||meanie.getXM() == MovementspaceObject.getX()-1||meanie.getXM() == MovementspaceObject.getX())
			{
				if(meanie.getYM() == MovementspaceObject.getY()+1||meanie.getYM() == MovementspaceObject.getY()-1||meanie.getYM() == MovementspaceObject.getY())
				{
					meanie.setHeatlh(meanie.getHealthM()-2);
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
		PersonDisplay.Paint();
	}
	public static int Projectile()
	{
		return proj;
	}
	public static void Kill()
	{
		proj=0;
	}
}
