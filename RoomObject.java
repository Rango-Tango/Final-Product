
public class RoomObject 
{
	private Freebie f=null;
	private meanie m=null;
	private int j;
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
	public int getJ()
	{
		return j;
	}
	public void setJ(int j)
	{
		this.j = j;
	}
}
