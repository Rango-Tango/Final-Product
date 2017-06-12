
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
			switch(M_M.r.room)
			{
			case 0:
				if(M_M.r.start.m.getX() == MovementspaceObject.getX()+1||M_M.r.start.m.getX() == MovementspaceObject.getX()-1||M_M.r.start.m.getX() == MovementspaceObject.getX())
				{
					if(M_M.r.start.m.getY() == MovementspaceObject.getY()+1||M_M.r.start.m.getY() == MovementspaceObject.getY()-1||M_M.r.start.m.getY() == MovementspaceObject.getY())
					{
						M_M.r.start.m.hitM(cw);
					}
				}
				break;
			case 1:
				if(M_M.r.left.m.getX() == MovementspaceObject.getX()+1||M_M.r.left.m.getX() == MovementspaceObject.getX()-1||M_M.r.left.m.getX() == MovementspaceObject.getX())
				{
					if(M_M.r.left.m.getY() == MovementspaceObject.getY()+1||M_M.r.left.m.getY() == MovementspaceObject.getY()-1||M_M.r.left.m.getY() == MovementspaceObject.getY())
					{
						M_M.r.left.m.hitM(cw);
					}
				}
				break;
			case 2:
				if(M_M.r.right.m.getX() == MovementspaceObject.getX()+1||M_M.r.right.m.getX() == MovementspaceObject.getX()-1||M_M.r.right.m.getX() == MovementspaceObject.getX())
				{
					if(M_M.r.right.m.getY() == MovementspaceObject.getY()+1||M_M.r.right.m.getY() == MovementspaceObject.getY()-1||M_M.r.right.m.getY() == MovementspaceObject.getY())
					{
						M_M.r.right.m.hitM(cw);
					}
				}
				break;
			case 3:
				if(M_M.r.up.m.getX() == MovementspaceObject.getX()+1||M_M.r.up.m.getX() == MovementspaceObject.getX()-1||M_M.r.up.m.getX() == MovementspaceObject.getX())
				{
					if(M_M.r.up.m.getY() == MovementspaceObject.getY()+1||M_M.r.up.m.getY() == MovementspaceObject.getY()-1||M_M.r.up.m.getY() == MovementspaceObject.getY())
					{
						M_M.r.up.m.hitM(cw);
					}
				}
				break;
			case 4:
				if(3==MovementspaceObject.getX()+1||3==MovementspaceObject.getX()-1||3==MovementspaceObject.getX())
				{
					if(6==MovementspaceObject.getY()+1||6==MovementspaceObject.getY()-1||6==MovementspaceObject.getY())
					{
						Boss.setHealth(Boss.getHealth()-1);
						MovementspaceObject.setY(0);
					}
				}
				break;
			default:
				break;
			}

		}
		else if(cw.equals("Bow"))
		{
			if(proj==0)
			{
				if(M_M.r.room==4)
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
				switch(M_M.r.room)
				{
				case 0:
					if(M_M.r.start.m.getX() == bombx+1||M_M.r.start.m.getX() == bombx-1||M_M.r.start.m.getX() == bombx)
					{
						if(M_M.r.start.m.getY() == bomby||M_M.r.start.m.getY() == bomby-1||M_M.r.start.m.getY() == bomby)
						{
							M_M.r.start.m.sethealth(M_M.r.start.m.gethealth()-2);
						}
					}
					break;
				case 1:
					if(M_M.r.left.m.getX() == bombx+1||M_M.r.left.m.getX() == bombx-1||M_M.r.left.m.getX() == bombx)
					{
						if(M_M.r.left.m.getY() == bomby||M_M.r.left.m.getY() == bomby-1||M_M.r.left.m.getY() == bomby)
						{
							M_M.r.left.m.sethealth(M_M.r.left.m.gethealth()-2);
						}
					}
					break;
				case 2:
					if(M_M.r.right.m.getX() == bombx+1||M_M.r.right.m.getX() == bombx-1||M_M.r.right.m.getX() == bombx)
					{
						if(M_M.r.right.m.getY() == bomby||M_M.r.right.m.getY() == bomby-1||M_M.r.right.m.getY() == bomby)
						{
							M_M.r.right.m.sethealth(M_M.r.right.m.gethealth()-2);
						}
					}
					break;
				case 3:
					if(M_M.r.up.m.getX() == bombx+1||M_M.r.up.m.getX() == bombx-1||M_M.r.up.m.getX() == bombx)
					{
						if(M_M.r.up.m.getY() == bomby||M_M.r.up.m.getY() == bomby-1||M_M.r.up.m.getY() == bomby)
						{
							M_M.r.up.m.sethealth(M_M.r.up.m.gethealth()-2);
						}
					}
					break;
				case 4:
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
					break;
				default:
					break;
				}
			}
		}
		else if(cw.equals("Shank"))
		{
			switch(M_M.r.room)
			{
			case 0:
				if(M_M.r.start.m.getX() == MovementspaceObject.getX()+1||M_M.r.start.m.getX() == MovementspaceObject.getX()-1||M_M.r.start.m.getX() == MovementspaceObject.getX())
				{
					if(M_M.r.start.m.getY() == MovementspaceObject.getY()+1||M_M.r.start.m.getY() == MovementspaceObject.getY()-1||M_M.r.start.m.getY() == MovementspaceObject.getY())
					{
						M_M.r.start.m.sethealth(M_M.r.start.m.gethealth()-2);
					}
				}
				break;
			case 1:
				if(M_M.r.left.m.getX() == MovementspaceObject.getX()+1||M_M.r.left.m.getX() == MovementspaceObject.getX()-1||M_M.r.left.m.getX() == MovementspaceObject.getX())
				{
					if(M_M.r.left.m.getY() == MovementspaceObject.getY()+1||M_M.r.left.m.getY() == MovementspaceObject.getY()-1||M_M.r.left.m.getY() == MovementspaceObject.getY())
					{
						M_M.r.left.m.sethealth(M_M.r.left.m.gethealth()-2);
					}
				}
				break;
			case 2:
				if(M_M.r.right.m.getX() == MovementspaceObject.getX()+1||M_M.r.right.m.getX() == MovementspaceObject.getX()-1||M_M.r.right.m.getX() == MovementspaceObject.getX())
				{
					if(M_M.r.right.m.getY() == MovementspaceObject.getY()+1||M_M.r.right.m.getY() == MovementspaceObject.getY()-1||M_M.r.right.m.getY() == MovementspaceObject.getY())
					{
						M_M.r.right.m.sethealth(M_M.r.right.m.gethealth()-2);
					}
				}
				break;
			case 3:
				if(M_M.r.up.m.getX() == MovementspaceObject.getX()+1||M_M.r.up.m.getX() == MovementspaceObject.getX()-1||M_M.r.up.m.getX() == MovementspaceObject.getX())
				{
					if(M_M.r.up.m.getY() == MovementspaceObject.getY()+1||M_M.r.up.m.getY() == MovementspaceObject.getY()-1||M_M.r.up.m.getY() == MovementspaceObject.getY())
					{
						M_M.r.up.m.sethealth(M_M.r.up.m.gethealth()-2);
					}
				}
				break;
			case 4:
				if(3==MovementspaceObject.getX()+1||3==MovementspaceObject.getX()-1||3==MovementspaceObject.getX())
				{
					if(6==MovementspaceObject.getY()+1||6==MovementspaceObject.getY()-1||6==MovementspaceObject.getY())
					{
						Boss.setHealth(Boss.getHealth()-1);
						MovementspaceObject.setY(0);
					}
				}
				break;
			default:
				break;
			}
		}
		else	//peanuts!
		{
			if(proj==0)
			{
				if(M_M.r.room==4)
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
		if(M_M.r.room==0 || M_M.r.room==1 || M_M.r.room==2 || M_M.r.room==3)
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
