
public class RoomObject 
{
	public Freebie f = new Freebie();
	public meanie m = new meanie();
	public int MorF;//0 freebie, 1 meanie
	public void RoomObject()
	{
	}
	public void setFreebie(Freebie f)
	{
		this.f = f;
	}
	public void setMeanie(meanie m)
	{
		this.m = m;
	}
	public Freebie getFreebie()
	{
		return f;
	}
	public meanie getMeanie()
	{
		return m;
	}
	public boolean ifMeanie()
	{
		if(MorF==0)
		{
			return false;
		}
		else if(MorF==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
