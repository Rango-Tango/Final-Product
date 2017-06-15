
public class RoomObject 
{////////
	public meanie mOne = new meanie();
	public meanie mTwo=new meanie();
	public meanie mThree=new meanie();
	///////////
	public int mean=0;
	public void RoomObject()
	{
	}
	
	public void setMeanie(meanie m,int room)
	{
		if (room==1)
		{m=mOne;}
		else if(room==2)
		{
			m=mTwo;
		}
		else if(room==3)
		{
			m=mThree;
		}
	}
	/*public meanie getMeanie(int room)
	{
		return m;
	}*/
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
