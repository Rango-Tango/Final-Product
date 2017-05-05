
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
		else if (weaponP.equals(""))
		{
			
		}
	}
	
	//public String[][] getLocationM ()
	//{
		//return locationM;
	//}//returning location of meanie
	
	//public void setLocationM (int xM, int yM)
	//{
	//	this.locationM[xM][yM]=locationM [xM][yM];
	//}//setting location of meanie
}
