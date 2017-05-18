import java.io.*;
import java.util.*;
import java.awt.Graphics;
public class CreatingRooms 
{
	public static RoomObject up, down, left, right, start, current;{
	left = new RoomObject();
	start = new RoomObject();
	up = new RoomObject();
	down = new RoomObject();
	right = new RoomObject();
	left.setJ(2);
	right.setJ(3);
	start.setJ(0);
	up.setJ(1);}
	public static Freebie f;
	public static meanie m;
	public static int[] item = new int[3];
	public static int[] riddle = new int[3];
	public static int random = 0;
	public static int check=0;
	public static File file = new File("Freebiesmeanies.txt");
	public static void startup()
	{
		start.setFreebie(null);
		start.setMeanie(null);
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
				break;
			case 1:
				up.setFreebie(f);
				up.setMeanie(m);
				break;
			case 2:
				right.setFreebie(f);
				right.setMeanie(m);
				break;
			default:
				break;
			}
		}
		current = start;
	}
}
