import java.io.*;
import java.util.*;
public class CreatingRooms 
{
	public RoomObject up, left, right, start, current;
	public Freebie f;
	public meanie m;{
	current = new RoomObject();
	left = new RoomObject();
	start = new RoomObject();
	up = new RoomObject();
	right = new RoomObject();}
	public int[] item = new int[3];
	public int[] riddle = new int[3];
	public int random = 0;
	public int check=0;
	public File file = new File("Freebiesmeanies.txt");
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
		start.MorF=1;
		start.m.setX(0);
		start.m.setY(0);
		for(int c=0;c<3;c++)
		{
			random = (int)Math.round(Math.random()*6)+1;
			check=1;
			for(int c2=0;c2<3;c2++)
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
			random = (int)Math.round(Math.random()*3)+1;
			check=1;
			for(int c2=0;c2<3;c2++)
			{
				if(random==riddle[c2])
				{
					check=0;
				}
			}
			if(check==1)
			{
				riddle[c] = random;
			}
			else
			{
				c--;
			}
		}
		for(int c=0;c<3;c++)
		{
			if(Math.round(Math.random())+1==1)
			{
				f = new Freebie();
				m = null;
				check = 0;
				try
				{
					Scanner input = new Scanner(file);
					for(int c2=0;c2<item[c]-1;c2++)
					{
						input.nextLine();
					}
					f.setItem(input.nextLine());
					input = new Scanner(file);
					for(int c2=0;c2<riddle[c]+6;c2++)
					{
						input.nextLine();
					}
					f.setRiddle(input.nextLine());
					f.setAnswer(input.nextLine());
					f.setX(4);
					f.setY(4);
				}
				catch(IOException a)
				{
				}
			}
			else
			{
				f = null;
				m = new meanie();
				check=1;
				try
				{
					Scanner input = new Scanner(file);
					for(int c2=0;c2<item[c]-1;c2++)
					{
						input.nextLine();
					}
					m.setItem(input.nextLine());
					m.setX(4);
					m.setY(4);
					m.sethealth(3);
				}
				catch(IOException a)
				{
				}
			}
			switch(c)
			{
			case 0:
				left.setFreebie(f);
				left.setMeanie(m);
				left.MorF=check;
				break;
			case 1:
				up.setFreebie(f);
				up.setMeanie(m);
				up.MorF=check;
				break;
			case 2:
				right.setFreebie(f);
				right.setMeanie(m);
				right.MorF=check;
				break;
			default:
				break;
			}
		}
		current = start;
	}
}
