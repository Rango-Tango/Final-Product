import javax.print.DocFlavor.STRING;
import java.util.Random;
public class Bossattacks {
	Random rand= new Random();
	
public int bossShot(STRING weapon){
	int b;
	if (weapon.equals("Bombs")){
		b=rand.nextInt(7)+1;
		Movementarray[b][0].setObject(6);
		int jeff=0;
		for(int y=0;y<7;y++){
		Movementarray[b][jeff].setobject(6);	
		
		for(int x=0;x<10000000;x++){
			
		}
		jeff=jeff+1;
		if(jeff==7){
			Movementarray[b][6].setobject(0);
			break;
		}
		}
		
	}
	else if(weapon.equals("Sword")||("Shank")){
		
	}
	return b;
}
}
