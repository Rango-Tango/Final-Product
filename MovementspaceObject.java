
public class MovementspaceObject {
public void MovementspaceObject(){
}
	int x,y,player,health;
	String wep;//current weapon store
	
	public void setX(int here){
		this.x=here;
	}
	public void setY(int here){
		this.y=here;
	}
	public void setHealth(int here){
	this.health=here;
	}
	
	public void setPlayer(int here){
		this.player=here;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public int getHealth(){
	return this.health;	
	}
	public int getPlayer(){
		return this.player;
	}
	

public String getWeapon()//get the players current space trigered weapon
{
	return wep;
}//if you need to see if "z" button was clicked

public void setWeapon(String wep)//set the players current weapon 
{
	this.wep=wep;
}

public void healthDown(int hitType)//make different names for damadge amounts
{
	health=health-hitType;
}

public void healthUp(int healthHelp)//int of how much health will increase by
{
	health=healh+healthHelp;
}

}
