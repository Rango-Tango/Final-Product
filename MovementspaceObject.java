public class MovementspaceObject {
//public void MovementspaceObject(){
//}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	}
	
	static int x,y,player;
	static int health=6;//set health to an automatic 6 (3 hearts)
	static String wep;//current weapon store
	
	public static void setX(int here){
		x=here;
	}
	public static void setY(int here){
		y=here;
	}
	public static void setHealth(int here){
	health=here;
	}
	
	public static void setPlayer(int here){
	player=here;
	}
	public static int getX(){
		return x;
	}
	public static int getY(){
		return y;
	}
	public static int getHealth(){
	return health;	
	}
	public static int getPlayer(){
		return player;
	}
	

public static String getWeapon()//get the players current space trigered weapon
{
	return wep;
}//if you need to see if "z" button was clicked

public static void setWeapon(String weapon)//set the players current weapon 
{
	wep = weapon;
}

public static void healthDown(int hitType)//make different names for damadge amounts
{
	health=health-hitType;
}

public static void healthUp(int healthHelp)//int of how much health will increase by
{
	health=health+healthHelp;
}

}