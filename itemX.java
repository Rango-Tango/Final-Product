//item slot 2
//"x" key
public class itemX {

	public itemX (/*String NameTwo, int countItemTwo*/)//string is to store the name of the item, the int is a count to see if they hit the "z" key 
	{
		
	}
	
static String NameTwo;
static int countItemTwo;

public static String getItemTwoName ()
{
	return NameTwo;
}//to get the name in item two's spot 

public static void setItemTwoName (String NameTwo)
{
	NameTwo=NameTwo;
}//to set the name in item two's spot

public static int getCountItemTwo()
{
	return countItemTwo;
}//if you need to see if "z" button was clicked

public static void setCountItemTwo()
{
	countItemTwo=countItemTwo;
}

public static void xKeyIsPressed()//get the item the player got, the health of player, 
{
	//if (NameOne.equals("medkit"))//give player full health back
//	{
		//MovementspaceObject.setHealth(6); 
		
	//}
	
	if (NameTwo.equals("steriods"))
	{
		MovementspaceObject.healthUp(2);//make the change of health
		//check to make sure health max is 6 (3 hearts)
		int u=MovementspaceObject.getHealth();
		if (u<=6)//if the health is a normal 6 max
		{
		}
		else if (u>6)
		{//if the health is 5 or 6 before the item, their health will go to 7 or 8. Thats not ok. so i just set to he max (6)
			MovementspaceObject.setHealth(6);
		}
	}
	else if (NameTwo.equals("determination"))
	{
		int u=MovementspaceObject.getHealth();
		if (u<=3)//if the health is a normal 6 max
		{
			u=(u*2);//double health
			MovementspaceObject.setHealth(u);
		}
		else if (u>3)
		{//if the health is 5 or 6 before the item, their health will go to 7 or 8. Thats not ok. so i just set to he max (6)
			MovementspaceObject.setHealth(6);//doubling health from 3 will max out, therefore im just settting it to the max
		}
	}
}
	
}
