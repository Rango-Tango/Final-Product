import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;//must import these libraries
	import javax.swing.*;
public class ToAddToGUI implements KeyListener
{

	//executed upon startup
	//room number tells gui which program to run when painting the JFrame
	//freebie/meanie number tells program which character to take information for(information can be stored in text file or in main program)
	public static int[][] pickRooms()
	{
		int[][] rooms = new int[3][2];//(first dimension is room number, second dimension is 0 for room design, or 1 for freebie/meanie generation)
		int num=0;
		int check=0;
		for(int c=0;c<3;c++)
		{
			num = (int)Math.round((Math.random()*5)+1);
			check = 1;
			for(int c2=0;c2<2;c2++)
			{
				if(num==rooms[c2][0])
				{
					check=0;
				}
			}
			if(check==1)
			{
				rooms[c][0] = num;
			}
			else
			{
				c--;
			}
		}

		for(int c=0;c<3;c++)
		{
			num = (int)Math.round((Math.random()*8)+1);
			check = 1;
			for(int c2=0;c2<2;c2++)
			{
				if(num==rooms[c2][1])
				{
					check=0;
				}
			}
			if(check==1)
			{
				rooms[c][1] = num;
			}
			else
			{
				c--;
			}
		}

		return rooms;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
				//slow down speed of key listeners
			
				@Override
				public void keyPressed(KeyEvent e)
				{
					if(e.getKeyCode()==37)//left arrow key pressed
					{
						//update player position
					}
					else if(e.getKeyCode()==38)//up arrow key pressed
					{
						//update player position
					}
					else if(e.getKeyCode()==39)//right arrow key pressed
					{
						//update player position
					}
					else if(e.getKeyCode()==40)//down arrow key pressed
					{
						//update player position
					}
					else if(e.getKeyCode()==32)
					{
						//attack (space bar)
					}
					else
					{
						System.out.println(e.getKeyCode());
					}
				}
				@Override
				public void keyReleased(KeyEvent e)
				{
				}
				@Override
				public void keyTyped(KeyEvent e)
				{
				}

}
