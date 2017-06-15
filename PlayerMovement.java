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
					if(MovementspaceObject.getX()==0 && MovementspaceObject.getY()==3 &&(M_M.r.room==0 || M_M.r.room==2))
					{
						Transtion.roomTransition(0, 3);
					}
					else if(MovementspaceObject.getX()>0)
					{
						MovementspaceObject.setX(MovementspaceObject.getX()-1);
						d=1;
					}
				}
				else if(e.getKeyCode()==38)//up arrow key pressed
				{
					if(MovementspaceObject.getX()==3 && MovementspaceObject.getY()==6 && M_M.r.room==0)
					{
						Transtion.roomTransition(3, 6);
					}

					else if(MovementspaceObject.getY()<6)
					{
						MovementspaceObject.setY(MovementspaceObject.getY()+1);
						d=0;
					}
				}
				else if(e.getKeyCode()==39)//right arrow key pressed
				{
					if(MovementspaceObject.getX()==6 && MovementspaceObject.getY()==3 && (M_M.r.room==1 || M_M.r.room==0))
					{
						Transtion.roomTransition(6, 3);
					}
					else if(MovementspaceObject.getX()<6)
					{
						MovementspaceObject.setX(MovementspaceObject.getX()+1);
						d=3;
					}
				}
				else if(e.getKeyCode()==40)//down arrow key pressed
				{
					if(MovementspaceObject.getX()==3 && MovementspaceObject.getY()==0 && M_M.r.room==3)
					{
						Transtion.roomTransition(3, 0);
					}
					else if(MovementspaceObject.getY()>0)
					{
						MovementspaceObject.setY(MovementspaceObject.getY()-1);
						d=2;
					}
				}
				
				PD.Refresh();
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