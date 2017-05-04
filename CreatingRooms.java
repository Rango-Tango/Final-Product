import java.io.*;
import java.util.*;
public class CreatingRooms 
{
	int[][] rooms = RoomGeneration.pickRooms();
	int room = 0;
	int j=0;//global variable to control paint method
	freebie f;
	meanie m;
	public void nextRoom()
	{
		room++;
		j = rooms[room][0];
		JFrame.repaint();
		File file = new File("FreebiesMeanies.txt");
		Scanner input = new Scanner (file);
		if(rooms[room][1]<=4)
		{
			f = new freebie();
			for(int c=0;c<((int)Math.round(Math.random()*8));c++)
			{
				input.nextLine();
			}
			f.setItem(input.nextLine());
			input = new Scanner(file);
			for(int c=0;c<9;c++)
			{
				input.nextLine();
			}
			for(int c=0;c<rooms[room][1]-1;c++)
			{
				input.nextLine();
				input.nextLine();
			}
			f.setRiddle(input.nextLine());
			f.setAnswer(input.nextLine());
			f.setX(3);
			f.setY(3);
			m = null;
		}
		else
		{
			m = new meanie();
			for(int c=0;c<((int)Math.round(Math.random()*8));c++)
			{
				input.nextLine();
			}
			m.setItem(input.nextLine());
			m.setX(7);
			m.setY(3);
			f = null;
		}
	}
}
