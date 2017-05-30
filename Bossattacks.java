import javax.print.DocFlavor.STRING;
import java.util.Random;
public class Bossattacks {
	Random rand= new Random();
	
public int bossShot(STRING weapon){
	int b;
	if (weapon.equals("Bombs")){
		b=rand.nextInt(7);
		Movementarray[b][0].setObject(6);
		int jeff=0;
		for(int y=0;y<7;y++){
		Movementarray[b][jeff].setobject(6);	
		
		for(int k=0;k<10000000;k++){
			
		}
		jeff=jeff+1;
		if(jeff==6){
			Movementarray[b][6].setobject(0);
			break;
		}
		}
		
	}
	else if(weapon.equals("Sword")||weapon.equals("Shank")){
		b=rand.nextInt(7);
		int jeff=0;
		for(int y=0;y<7;y++){
			if(y==b){
				
			}
			else{
				Movementarray[y][0].setobject(7);
			}
		}
		for(int x=0;x<7;x++){
			Movementarray[0][x].setobject(0);
			Movementarray[0][x].setobject(7);
			Movementarray[1][x].setobject(0);
			Movementarray[1][x].setobject(7);
			Movementarray[2][x].setobject(0);
			Movementarray[2][x].setobject(7);
			Movementarray[3][x].setobject(0);
			Movementarray[3][x].setobject(7);
			Movementarray[4][x].setobject(0);
			Movementarray[4][x].setobject(7);
			Movementarray[5][x].setobject(0);
			Movementarray[5][x].setobject(7);
			Movementarray[6][x].setobject(0);
			Movementarray[6][x].setobject(7);
			for(int k=0;k<10000000;k++){
				
			}
			jeff=jeff+1;
			if(jeff==6){
				Movementarray[0][x].setobject(0);
				Movementarray[1][x].setobject(0);
				Movementarray[2][x].setobject(0);
				Movementarray[3][x].setobject(0);
				Movementarray[4][x].setobject(0);
				Movementarray[5][x].setobject(0);
				Movementarray[6][x].setobject(0);
				break;
				
			}
		}
	}
	else if(weapon.equals("Bow")){
		b=rand.nextInt(7);
		int jeff=0;
		for(int y=0;y<7;y++){
			if(y==B){
				Movementarray[y][0].setobject(8);
			}
			else{
				Movementarray[y][0].setobject(7);
			}
		}
		for(int d=1;d<7;d++){
		for(int x=0;x<7;x++){
			if(x==b){
				Movementarray[x][d-1].setobject(0);
				Movementarray[x][d].setobject(8);
			}
			else{
				Movementarray[x][d-1].setobject(0);
				Movementarray[x][d].setobject(7);
			}
			
		}
for(int k=0;k<10000000;k++){
			
		}
jeff=jeff+1;
if(jeff==7){
	for(int x=0;x<7;x++){
		Movementarray[x][6].setobject(0);
	}
	break;
}
		}
	}
	return b;
}
}
