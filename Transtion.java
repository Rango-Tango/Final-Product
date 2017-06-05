import javax.swing.JPanel;
public class Transtion {
	static CreatingRooms d = new CreatingRooms();
	static int j=0;
	public static void roomTransition(int x, int y){
		if (M_M.r.current==M_M.r.left)
		{
			if (x==7 && y==4){
				M_M.r.current = M_M.r.start;
				j = 0;
			}
		}
		else if(M_M.r.current==M_M.r.right)
		{
			if(x==1 && y==4)
			{
				M_M.r.current = M_M.r.start;
				j = 0;
			}
		}
		else if(M_M.r.current == M_M.r.up)
		{
			if(x==4 && y==1)
			{
				M_M.r.current = M_M.r.start;
				j = 0;
			}
		}
		else if(M_M.r.current == M_M.r.start)
		{
			if(x==1 && y==4)
			{
				M_M.r.current = M_M.r.left;
				j = 1;
			}
			else if(x==7 && y==4)
			{
				M_M.r.current = M_M.r.right;
				j = 2;
			}
			else if(x==4 && y==7)
			{
				M_M.r.current = M_M.r.up;
				j = 3;
			}
		}
	}
	
	public static int getJ()
	{
		return j;
	}
}
