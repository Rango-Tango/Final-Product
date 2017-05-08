
public class MovementspaceObject 
{
	public void MovementspaceObject()
	{
	}
	private int x,y, health;
	private String item;
	public void setItem(String item)
	{
		this.item = item;
	}
	public String getItem()
	{
		return item;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y=y;
	}
	public void setHealth(int health){
	this.health = health;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getHealth(){
	return health;	
	}
	
public void healthDown(int hitType)//make different names for damadge amounts
{
	health-=hitType;
}

public void healthUp(int healthHelp)//int of how much health will increase by
{
	health+=healthHelp;
}

}
