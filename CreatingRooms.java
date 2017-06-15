import java.io.*;
import java.util.*;
public class CreatingRooms 
{
	public RoomObject up, left, right, start;
	int room;
	String line;
	Scanner input;
	//public meanie m;
	{
	room=0;//0 start, 1 left, 2 right, 3 up
	left = new RoomObject();
	start = new RoomObject();
	up = new RoomObject();
	right = new RoomObject();
	
	left.mean=1;
	right.mean=1;
	up.mean=1;
	start.mean=0;
	}
	public int c=0;
	public int c2=0;
	////////^^
	public int[] item = new int[3];
	public int random = 0;
	public int check=0;
	public File file = new File("FreebiesMeanies.txt");
	public void CreatingRooms()
	{
		
	}
	/*public int getRoom()
	{
		return current;
	}
	public void setRoom(int current)
	{
		this.current = current;
	}*/
	public void startup()
	{
		////################whats going on here? SOS################/////////////
		for(int c=0;c<3;c++)
		{
			random = (int)Math.round(Math.random()*3)+1;
			check=1;
			for(c2=0;c2<3;c2++)
			{
				if(random==item[c2])
				{
					check=0;
				}
			}
			if(check==1)
			{
				item[c] = random;
			}
			else
			{
				c--;
			}
		}
		for(int c=0;c<3;c++)
		{
				//m = new meanie();
				check=1;
				try
				{
					input = new Scanner(file);
					for(c2=0;c2<item[c]-1;c2++)
					{
						input.nextLine();
					}
					line = input.nextLine();
					meanie.item[c]=(line);
					meanie.x[c]=(3);
					meanie.y[c]=(3);
					meanie.health[c]=(3);
					///VVVVVVVVVV
				/*for(c2=0;c2<item[c]-1;c2++)
				{
					input.nextLine();
				}
						line = input.nextLine();
						meanie.item[1]=(line);
						meanie.x[1]=(3);
						meanie.y[1]=(3);
						meanie.health[1]=(3);
						
						///input.nextLine();
						//	}
						input = new Scanner (file);
						for(c2=0;c2<item[c]-1;c2++)
						{
							input.nextLine();
						}
							line = input.nextLine();
							mThree.setItem(line);
							mThree.setX(3);
							mThree.setY(3);
							mThree.sethealth(3);
							//^^^^^
						*/	
					input.close();
				}
				catch(IOException a)
				{
					System.out.println("not working");
				}
		}
		 
		room=0;
	}
}
