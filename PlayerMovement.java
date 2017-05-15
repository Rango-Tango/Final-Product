import java.awt.event.*;
public class PlayerMovement 
{
	static int d=-1;
	public PlayerMovement ()
	{	
		M_M.frame.addKeyListener(new KeyListener()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==37)//left arrow key pressed
				{
					if(MovementspaceObject.getX()>0)
					{
						MovementspaceObject.setX(MovementspaceObject.getX()-1);
						d=1;
						Bow.Time();
						PD.Refresh();
					}
				}
				else if(e.getKeyCode()==38)//up arrow key pressed
				{
					if(MovementspaceObject.getY()<6)
					{
						MovementspaceObject.setY(MovementspaceObject.getY()+1);
						d=0;
						Bow.Time();
						PD.Refresh();
					}
				}
				else if(e.getKeyCode()==39)//right arrow key pressed
				{
					if(MovementspaceObject.getX()<6)
					{
						MovementspaceObject.setX(MovementspaceObject.getX()+1);
						d=3;
						Bow.Time();
						PD.Refresh();
					}
					else
					{
						if(MovementspaceObject.getY()==3)
						{
							//move to next room
							//paint new background and create meanie/freebie
							//move player to left side of the room
							MovementspaceObject.setX(0);
							MovementspaceObject.setY(3);
						}
					}
				}
				else if(e.getKeyCode()==40)//down arrow key pressed
				{
					if(MovementspaceObject.getY()>0)
					{
						MovementspaceObject.setY(MovementspaceObject.getY()-1);
						d=2;
						Bow.Time();
						PD.Refresh();
					}
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}
	public static int Getd()
	{
		return d;
	}
}