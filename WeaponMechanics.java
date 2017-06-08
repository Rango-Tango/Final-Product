
public class WeaponMechanics
{
	static int proj=0;
	static int bomb=0;
	static int bombx=7;
	static int bomby=7;
	static int direction=0;
	public static void Attack(String cw)
	{
		if(cw.equals("Sword"))
		{
			if(M_M.boss==0)
			{
				if(M_M.r.current.m.getX() == MovementspaceObject.getX()+1||M_M.r.current.m.getX() == MovementspaceObject.getX()-1||M_M.r.current.m.getX() == MovementspaceObject.getX())
				{
					if(M_M.r.current.m.getY() == MovementspaceObject.getY()+1||M_M.r.current.m.getY() == MovementspaceObject.getY()-1||M_M.r.current.m.getY() == MovementspaceObject.getY())
					{
						meanie.sethealth(meanie.gethealth()-1);
					}
				}
			}
			else if(M_M.boss==1)
			{
				if(3==MovementspaceObject.getX()+1||3==MovementspaceObject.getX()-1||3==MovementspaceObject.getX())
				{
					if(6==MovementspaceObject.getY()+1||6==MovementspaceObject.getY()-1||6==MovementspaceObject.getY())
					{
						Boss.setHealth(Boss.getHealth()-1);
						MovementspaceObject.setY(0);
					}
				}
			}

		}
		else if(cw.equals("Bow"))
		{
			if(proj==0)
			{
				if(M_M.boss==0)
				{
					proj=1;
					Bow.Shoot(MovementspaceObject.getX(),MovementspaceObject.getY(),PlayerMovement.Getd());
				}
				else
				{
					proj=1;
					Bow.Shoot(MovementspaceObject.getX(),MovementspaceObject.getY(),BossListener.d);	
				}
			}
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
				int win=0;
				int b =0;
				bomb--;
				if(M_M.boss==0)
				{
					if(M_M.r.current.m.getX() == bombx+1||M_M.r.current.m.getX() == bombx-1||M_M.r.current.m.getX() == bombx)
					{
						if(M_M.r.current.m.getY() == bomby||M_M.r.current.m.getY() == bomby-1||M_M.r.current.m.getY() == bomby)
						{
							meanie.sethealth(meanie.gethealth()-2);
						}
					}
				}
				else
				{
					for(int v=bombx-1;v<bombx+2;v++)
					{				
						if(SB.find(v,bomby+1)!=-1||SB.find(v,bomby)!=-1||SB.find(v,bomby-1)!=-1)
						{
							win=1;
							b=v;
						}
					}
					if(win==1)
					{
						Boss.setHealth(Boss.getHealth()-1);
						if(SB.find(b,bomby+1)!=-1)
						{
							SB.Hit(b,bomby+1);	
						}
						else if(SB.find(b,bomby)!=-1)
						{
							SB.Hit(b,bomby);	
						}
						else
						{
							SB.Hit(b,bomby-1);	
						}
					}
				}
			}
			if(M_M.boss==0)
			{
				PD.Refresh();
			}
			else
			{
				BD.Refresh(); 
			}
		}
		else if(cw.equals("Shank"))
		{
			if(M_M.r.current.m.getX() == MovementspaceObject.getX()+1||M_M.r.current.m.getX() == MovementspaceObject.getX()-1||M_M.r.current.m.getX() == MovementspaceObject.getX())
			{
				if(M_M.r.current.m.getY() == MovementspaceObject.getY()+1||M_M.r.current.m.getY() == MovementspaceObject.getY()-1||M_M.r.current.m.getY() == MovementspaceObject.getY())
				{
					meanie.sethealth(meanie.gethealth()-2);
				}
			}
			else if(3==MovementspaceObject.getX()+1||3==MovementspaceObject.getX()-1||3==MovementspaceObject.getX())
			{
				if(6==MovementspaceObject.getY()+1||6==MovementspaceObject.getY()-1||6==MovementspaceObject.getY())
				{
					Boss.setHealth(Boss.getHealth()-1);
					MovementspaceObject.setY(0);
				}
			}
		}
		else	//peanuts!
		{
			if(proj==0)
			{
				if(M_M.boss==0)
				{
					proj=2;
					Bow.Shoot(MovementspaceObject.getX(),MovementspaceObject.getY(),PlayerMovement.Getd());
				}
				else
				{
					proj=2;
					Bow.Shoot(MovementspaceObject.getX(),MovementspaceObject.getY(),BossListener.d);	
				}
			}
		}
		if(M_M.boss==0)
		{
			PD.Refresh();
		}
		else
		{
			BD.Refresh();
		}
	}
	public static int Projectile()
	{
		return proj;
	}
	public static void Kill()
	{
		proj=0;
		Bow.projectile[1]=7;
		Bow.projectile[0]=7;
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
