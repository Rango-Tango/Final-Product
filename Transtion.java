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
					M_M.r.left.m.setX(3);
					M_M.r.left.m.setY(3);
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
					M_M.r.right.m.setX(3);
					M_M.r.right.m.setY(3);
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
					M_M.r.up.m.setX(3);
					M_M.r.up.m.setY(3);
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
			}
		}
	}
	
	
	public static int getJ()
	{
		return j;
	}
}
