
public class Bow
{
	static int [] projectile = new int[2];
	static int d=-1;
	public static void Shoot(int x,int y,int dir)
	{
		projectile[0]=x;
		projectile[1]=y;
		d=dir;
		PD.ad=dir;
	}
	public static void Time()
	{
		if(d==-1)
		{
		}
		else if(d==0)
		{
			projectile[1]++;
		}
		else if(d==1)
		{
			projectile[0]--;
		}
		else if(d==2)
		{
			projectile[1]--;
		}
		else if(d==3)
		{
			projectile[0]++;
		}
		if(projectile[0]==7||projectile[1]==7||projectile[1]==-1||projectile[1]==-1)
		{
			d=-1;
			WeaponMechanics.Kill();
		}
		else if(projectile[0]==meanie.getXM() && projectile[1]==meanie.getYM())
		{
			if(WeaponMechanics.Projectile()==1)
			{
				meanie.setHeatlh(meanie.getHealthM()-1);
				d=-1;
				WeaponMechanics.Kill();
			}
			else if(WeaponMechanics.Projectile()==2)
			{
				//lol no damage
				d=-1;
				WeaponMechanics.Kill();
			}			
		}
	}
	public static int getx()
	{
		return projectile[0];
	}
	public static int gety()
	{
		return projectile[1];
	}
}
