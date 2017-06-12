//Anastasia
//item slot one, relates to "z" key (or item #1)

public class item {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
	}



		public item (/*String NameOne, int countItemOne*/)//string is to store the name of the item, the int is a count to see if they hit the "z" key 
		{
		
		}

		


		protected String NameOne;
		protected int countItemOne;

		public String getItemOneName ()
		{
			return NameOne;
		}//to get the name in item one's spot 

		public void setItemOneName (String NameOne)
		{
			this.NameOne=NameOne;
		}//to set the name in item one's spot

		public int getCountItemOne()
		{
			return countItemOne;
		}//if you need to see if "z" button was clicked

		public void setCountItemOne(int countItemOne)
		{
			this.countItemOne=countItemOne;
		}

		public void zKeyIsPressed()//get the item the player got, the health of player, 
		{
			if (NameOne.equals("medkit"))//give player full health back
			{
				MovementspaceObject.setHealth(6); 

			}
			else if(NameOne.equals("running shoes"))
			{
				//change speed of player 
			}
			else if (NameOne.equals("steriods"))
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
			else if (NameOne.equals("determination"))
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
			else if (NameOne.equals("shank"))
			{

			}
			else if(NameOne.equals("nothing"))
			{
				//does nothing 
			}



		
	
	}
}
