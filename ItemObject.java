
public class ItemObject 
{
	private String zWeapon = "";
	private String xWeapon = "";
	private String cWeapon = "";
	public void ItemObject()
	{
	}
	public void setZWeapon(String zWeapon)
	{
		this.zWeapon = zWeapon;
	}
	public void setXWeapon(String xWeapon)
	{
		this.xWeapon = xWeapon;
	}
	public void setCWeapon(String cWeapon)
	{
		this.cWeapon = cWeapon;
	}
	public String getZWeapon()
	{
		return zWeapon;
	}
	public String getXWeapon()
	{
		return xWeapon;
	}
	public String getCWeapon()
	{
		return cWeapon;
	}
	
	public void addItem(String item)
	{
		if(zWeapon.equals(""))
		{
			zWeapon = item;
		}
		else if(xWeapon.equals(""))
		{
			xWeapon = item;
		}
		else
		{
			cWeapon = item;
		}
	}
}
