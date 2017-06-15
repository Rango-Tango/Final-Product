import javax.swing.JPanel;
public class Transtion {
	static CreatingRooms d = new CreatingRooms();
	static int j=0;
	public static void roomTransition(int x, int y)
	{
		if (M_M.r.room==1)
		{
			if (x==6 && y==3)
			{
				M_M.r.room = 0;
				if(M_M.r.left.ifMeanie())
				{
					meanie.x[1]=(3);
					meanie.y[1]=(3);
				}
				j = 0;
				MovementspaceObject.setX(0);
				MovementspaceObject.setY(3);
			}
		}
		else if(M_M.r.room==2)
		{
			if(x==0 && y==3)
			{
				M_M.r.room = 0;
				if(M_M.r.right.ifMeanie())
				{
					meanie.x[2]=(3);
					meanie.y[2]=(3);
				}
				j = 0;
				MovementspaceObject.setX(6);
				MovementspaceObject.setY(3);
			}
		}
		else if(M_M.r.room==3)
		{
			if(x==3 && y==0)
			{
				M_M.r.room = 0;
				if(M_M.r.up.ifMeanie())
				{
					meanie.x[3]=(3);
					meanie.y[3]=(3);
				}
				j = 0;
				MovementspaceObject.setX(3);
				MovementspaceObject.setY(6);
			}
		}
		else if(M_M.r.room == 0)
		{
			if(x==0 && y==3)
			{
				M_M.r.room = 1;
				j = 1;
				MovementspaceObject.setX(6);
				MovementspaceObject.setY(3);
				//System.out.println(M_M.r.left.m.gethealth());
			}
			else if(x==6 && y==3)
			{
				M_M.r.room = 2;
				j = 2;
				MovementspaceObject.setX(0);
				MovementspaceObject.setY(3);
			}
			else if(x==3 && y==6)
			{
				M_M.r.room = 3;
				j = 3;
				MovementspaceObject.setX(3);
				MovementspaceObject.setY(0);
				//System.out.println(M_M.r.up.m.gethealth());
			}
		}
	}
	
	
	public static int getJ()
	{
		return j;
	}
}
