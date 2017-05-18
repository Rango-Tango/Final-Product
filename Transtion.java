import java.awt.Graphics;
public class Transtion {
	Graphics g;
	RoomConstructs n;
	int j;
	public void roomTransition(int x,int y){
		if (CreatingRooms.current==CreatingRooms.left)
		{
			if (MovementspaceObject.getX()==7 && MovementspaceObject.getY()==4){
				CreatingRooms.current = CreatingRooms.start;
			}
		}
		else if(CreatingRooms.current==CreatingRooms.right)
		{
			if(MovementspaceObject.getX()==1 && MovementspaceObject.getY()==4)
			{
				CreatingRooms.current = CreatingRooms.start;
			}
		}
		else if(CreatingRooms.current == CreatingRooms.up)
		{
			if(MovementspaceObject.getX()==4 && MovementspaceObject.getY()==1)
			{
				CreatingRooms.current = CreatingRooms.start;
			}
		}
		else if(CreatingRooms.current == CreatingRooms.start)
		{
			if(MovementspaceObject.getX()==1 && MovementspaceObject.getY()==4)
			{
				CreatingRooms.current = CreatingRooms.left;
			}
			else if(MovementspaceObject.getX()==7 && MovementspaceObject.getY()==4)
			{
				CreatingRooms.current = CreatingRooms.right;
			}
			else if(MovementspaceObject.getX()==4 && MovementspaceObject.getY()==7)
			{
				CreatingRooms.current = CreatingRooms.up;
			}
		}
	}
}
