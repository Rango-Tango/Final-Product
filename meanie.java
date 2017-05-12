public abstract class meanie {

	public meanie(String [][]location)
	{
		
	}//need to set weapon, set health, get location
	
	protected int healthM=4;
	protected int XofM, YofM;//the x and y coordinats of the meanie
	
	//protected String[][] locationM=new String [8][8];
	
	public int getHealthM ()
	{
		return healthM;
	}//get the meanie health
	
	public void setHealthM (int healthM)
	{
		this.healthM=healthM;
	}//setting health of meanie
	
	public void setXM(int X)
	{
		XofM=X;
	}
	
	public void setYM(int Y)
	{
		YofM=Y;
	}
	
	public int getXM()
	{
		return XofM;
	}
	
	public int getYM()
	{
		return YofM;
	}
	
	public void hitM(String weaponP)
	{
		if (weaponP.equals("sword"))//if the item the player has is a basic sword, he gets .5 heats off
		{
			healthM=healthM-1;	
		}
		else if (weaponP.equals("bow"))
		{
			healthM=healthM-2;//lose a heart
		}
		else if (weaponP.equals("bomb"))
		{
			healthM=healthM-2;//loose a heart
		}
		else if(weaponP.equals("shank"))
		{
			healthM=healthM-2;//lose a heart
		}
	}

	public String[][] getLocationM ()
	{
		return locationM;
	}//returning location of meanie

	public void setLocationM (int xM, int yM)
	{
		this.locationM[xM][yM]=locationM [xM][yM];
	}//setting location of meanie

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
			if (XofM==xGoal&&YofM==yGoal)//manie hits player and jumps back
			{
				MovementspaceObject.healthDown(1);// if player is hit

				if (jumpBack==1||jumpBack==4||jumpBack==6)//set meanie to another local
				{
					if (XofM>=3)
					{shiftX=(XofM-2);}
					else
					{shiftX=(XofM+3);}
					
					if (YofM<=1)
					{shiftY=(YofM+2);					}
					else {shiftY =YofM-2;	}
mean.setXM(shiftX);
mean.setYM(shiftY);
				}
				//dont actually set the jump back untill u make sure its in the frame 0<x<7
				else if (jumpBack==2||jumpBack==5||jumpBack==8)
				{
					if (XofM>=4 )
					{shiftX=(XofM-3);}
					else
					{shiftX=(XofM+2);}
					
					if (YofM<=6)
					{shiftY=(YofM+1);					}
					else {shiftY =YofM-3;	}
mean.setXM(shiftX);
mean.setYM(shiftY);
				}
				else if(jumpBack==3||jumpBack==7||jumpBack==9)
				{
					if (XofM>=6 )
					{shiftX=(XofM-4);}
					else
					{shiftX=(XofM+2);}
					
					if (YofM>=5)
					{shiftY=(YofM-1);					}
					else {shiftY =YofM+3;	}
mean.setXM(shiftX);
mean.setYM(shiftY);
				}
			}
			else //meanie trying to get to player 
			{
if ((mean.getXM())>=xGoal)
{
	mean.setXM((mean.getXM()-1));
}
else if ((mean.getXM())<=xGoal)
{
	mean.setXM((mean.getXM()+1));
}

if ((mean.getYM())>=yGoal)
{
	mean.setYM((mean.getYM()-1));
}
else if ((mean.getYM())<=yGoal)
{
	mean.setYM((mean.getYM()+1));
}
				
			}//end of else 

			int stat=mean.getHealthM();
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
