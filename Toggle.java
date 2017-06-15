import java.awt.event.*;
import java.util.*;
public class Toggle 
{
	static String cw=new String("Sword");
	static int cwn=0;
	static int weapons=2;
	static ArrayList<String> weap=new ArrayList<String>();
	public Toggle()
	{
		weap.add("Sword");
		//weap.add("Bow");
		weap.add("Bomb");
		//weap.add("Shank");
		//weap.add("Peanuts");
		M_M.frame.addKeyListener(new KeyListener()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==66)//b
				{
					if(weapons!=cwn+1)
					{
						cwn++;
						cw=weap.get(cwn);
					}
					else if(cwn==weapons-1)
					{
						cwn=0;
						cw=("Sword");
					}
					PD.Weaponset(cw);
				}
				else if(e.getKeyCode()==32)//space
				{
					WeaponMechanics.Attack(cw);
				}
				else if(e.getKeyCode()==27)//esc
				{
					M_M.Boss();
				}
				MovementspaceObject.setWeapon(cw);
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
	public static void NewWeapon(String weapon)
	{
		weapons++;
		weap.add(weapon);
	}
	public static String CurWeap()
	{
		return cw;
	}
}
