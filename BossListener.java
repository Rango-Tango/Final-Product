import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BossListener 
{
	static int d=-1;
	String weap=BD.cw;
	public BossListener()
	{
		M_M.bossframe.addKeyListener(new KeyListener()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==32)//space
				{
					WeaponMechanics.Attack(weap);
				}
				else if(e.getKeyCode()==27)//esc
				{
					
				}
				if(e.getKeyCode()==37)//left arrow key pressed
				{
					if(MovementspaceObject.getX()>0)
					{
						MovementspaceObject.setX(MovementspaceObject.getX()-1);
						d=1;
						BD.Refresh();
					}
				}
				else if(e.getKeyCode()==38)//up arrow key pressed
				{
					if(MovementspaceObject.getY()<6)
					{
						MovementspaceObject.setY(MovementspaceObject.getY()+1);
						d=0;
						BD.Refresh();
					}
				}
				else if(e.getKeyCode()==39)//right arrow key pressed
				{
					if(MovementspaceObject.getX()<6)
					{
						MovementspaceObject.setX(MovementspaceObject.getX()+1);
						d=3;
						BD.Refresh();
					}
				}
				else if(e.getKeyCode()==40)//down arrow key pressed
				{
					if(MovementspaceObject.getY()>0)
					{
						MovementspaceObject.setY(MovementspaceObject.getY()-1);
						d=2;
						BD.Refresh();
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
}
