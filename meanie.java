public class meanie {

	public void meanie()
	{

	}//need to set weapon, set health, get location

	protected static int health=4;
	private String item;
	protected static int x, y;//the x and y coordinats of the meanie

	//protected String[][] locationM=new String [8][8];

	public static int gethealth ()
	{
		return health;
	}//get the meanie health

	public static void sethealth (int heal)
	{
		health=heal;
	}//setting health of meanie

	public void setX(int X)
	{
		x=X;
	}

	public void setY(int Y)
	{
		y=Y;
	}

	public static int getX()
	{
		return x;
	}

	public static int getY()
	{
		return y;
	}
	public String getItem()
	{
		return item;
	}
	public void setItem(String item)
	{
		this.item = item;
	}
	public void hitM(String weaponP)
	{
		if (weaponP.equals("sword"))//if the item the player has is a basic sword, he gets .5 heats off
		{
			health=health-1;	
		}
		else if (weaponP.equals("bow"))
		{
			health=health-2;//lose a heart
		}
		else if (weaponP.equals("bomb"))
		{
			health=health-2;//loose a heart
		}
		else if(weaponP.equals("shank"))
		{
			health=health-2;//lose a heart
		}
	}
	public void meanieAI (String [][] playerlocal/*need player's current x an y */, meanie mean)//need the player location and the pre-created meanie(in main have this update with player movemnt
	{
		//each time the player moves in a meanie room they need to update this

		int loopingStall=0,cri=0;
		int xGoal, yGoal,jumpBack, shiftX,shiftY;//where player is/ goal for meanie

		//%%%%%% figure out how he stored it, i understand as an array but, how can i get the number out//
		//what did he store in the array? can i char AT it to separate?

		xGoal=MovementspaceObject.getX();//chat at and get the players x&Y coordinates
		yGoal=MovementspaceObject.getY();

		jumpBack=(int)Math.random();//make a random amount/direction for meanie to jump back to
		System.out.println(jumpBack);


		while (cri==-1)//to stop the meanie from going (only when dead)
		{
			if (x==xGoal&&y==yGoal)//manie hits player and jumps back
			{
				MovementspaceObject.healthDown(1);// if player is hit

				if (jumpBack==1||jumpBack==4||jumpBack==6)//set meanie to another local
				{
					if (x>=3)
					{shiftX=(x-2);}
					else
					{shiftX=(x+3);}

					if (y<=1)
					{shiftY=(y+2);					}
					else {shiftY =y-2;	}
					mean.setX(shiftX);
					mean.setY(shiftY);
				}
				//dont actually set the jump back untill u make sure its in the frame 0<x<7
				else if (jumpBack==2||jumpBack==5||jumpBack==8)
				{
					if (x>=4 )
					{shiftX=(x-3);}
					else
					{shiftX=(x+2);}

					if (y<=6)
					{shiftY=(y+1);					}
					else {shiftY =y-3;	}
					mean.setX(shiftX);
					mean.setY(shiftY);
				}
				else if(jumpBack==3||jumpBack==7||jumpBack==9)
				{
					if (x>=6 )
					{shiftX=(x-4);}
					else
					{shiftX=(x+2);}

					if (y>=5)
					{shiftY=(y-1);					}
					else {shiftY =y+3;	}
					mean.setX(shiftX);
					mean.setY(shiftY);
				}
			}
			else //meanie trying to get to player 
			{
				if ((mean.getX())>=xGoal)
				{
					mean.setX((mean.getX()-1));
				}
				else if ((mean.getX())<=xGoal)
				{
					mean.setX((mean.getX()+1));
				}

				if ((mean.getY())>=yGoal)
				{
					mean.setY((mean.getY()-1));
				}
				else if ((mean.getY())<=yGoal)
				{
					mean.setY((mean.getY()+1));
				}

			}//end of else 

			int stat=mean.gethealth();
			if (stat==0)//meanie has no health
			{
				cri=-1;
			}
			else //still got the heath, keep on running
			{

			}

		}//while

	}
}
