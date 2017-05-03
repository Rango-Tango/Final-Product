
public abstract class freebie {

	public freebie()
	{

	}

	private String riddle;
	private String [][]locationF=new String [8][8];

	public String getRiddle ()
	{
		return riddle;
	}//get the riddle

	public void setRiddle (String riddle)
	{
		this.riddle=riddle;
	}//setting riddle

	public String[][] getLocationF ()
	{
		return locationF;
	}//returning location of meanie

	public void setLocationF (int xF, int yF)
	{
		this.locationF[xF][yF]=locationF[xF][yF];
	}//setting location of meanie

}
