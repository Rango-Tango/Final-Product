import java.awt.Graphics;
public class Transtion {
	Graphics g;
	RoomConstructs n;
	public void roomTransition(int gio,int dio){
		if (gio==0||gio==6||dio==0||dio==6){
			if (gio==3||dio==3){
				if (gio==0&&dio==3)
				{
					n.paint(g);
					j = 2;
				}
				else if(gio==6||dio==3){
					n.paint(g);
					j = 3;
				}
				else if(gio==3||dio==6){
					n.paint(g);
					j =1;
				}
			}
		}
	}
}
