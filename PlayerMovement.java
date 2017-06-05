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
					}
				}
				else if(e.getKeyCode()==38)//up arrow key pressed
				{
					if(MovementspaceObject.getY()<6)
					{
						MovementspaceObject.setY(MovementspaceObject.getY()+1);
						d=0;
						//meanie.meanieAI(M_M.r.current.getMeanie());
					}
				}
				else if(e.getKeyCode()==39)//right arrow key pressed
				{
					if(MovementspaceObject.getX()<6)
					{
						MovementspaceObject.setX(MovementspaceObject.getX()+1);
						d=3;
					}
				}
				else if(e.getKeyCode()==40)//down arrow key pressed
				{
					if(MovementspaceObject.getY()>0)
					{
						MovementspaceObject.setY(MovementspaceObject.getY()-1);
						d=2;
					}
				}
				if(M_M.r.current == M_M.r.start)
				{
					if(MovementspaceObject.getX()==6 && MovementspaceObject.getY()==3)
					{
						M_M.r.current = M_M.r.right;
					}
					else if(MovementspaceObject.getX()==3 && MovementspaceObject.getY()==6)
					{
						M_M.r.current = M_M.r.up;
					}
					else if(MovementspaceObject.getX()==0 && MovementspaceObject.getY()==3)
					{
						M_M.r.current = M_M.r.left;
					}
				}
				else if(M_M.r.current == M_M.r.left)
				{
					if(MovementspaceObject.getX()==6 && MovementspaceObject.getY()==3)
					{
						if(M_M.r.current.getMeanie()!=null)
						{
							M_M.r.current.getMeanie().setX(3);
							M_M.r.current.getMeanie().setY(3);
						}
						M_M.r.current = M_M.r.start;
					}
				}
				else if(M_M.r.current==M_M.r.up)
				{
					if(MovementspaceObject.getX()==3 && MovementspaceObject.getY()==0)
					{
						if(M_M.r.current.getMeanie()!=null)
						{
							M_M.r.current.getMeanie().setX(3);
							M_M.r.current.getMeanie().setY(3);
						}
						M_M.r.current = M_M.r.start;
					}
				}
				else if(M_M.r.current == M_M.r.right)
				{
					if(MovementspaceObject.getX()==0 && MovementspaceObject.getY()==3)
					{
						if(M_M.r.current.getMeanie()!=null)
						{
							M_M.r.current.getMeanie().setX(3);
							M_M.r.current.getMeanie().setY(3);
						}
						M_M.r.current = M_M.r.start;
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