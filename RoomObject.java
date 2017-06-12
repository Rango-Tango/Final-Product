
public class RoomObject 
{
	public meanie m = new meanie();
	public int mean=0;
	public void RoomObject()
	{
	}
	public void setMeanie(meanie m)
	{
		this.m = m;
	}
	public meanie getMeanie()
	{
		return m;
	}
	public boolean ifMeanie()
	{
		if(mean==0)
		{
			return false;
		}
		else if(mean==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
