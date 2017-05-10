
public class Movementarray {
public Movementobject [][] g;
g= new Movementobject[7][7];
for(int x=0;x<7;x++){//This assigns the proper x and y to each coordinate space
g[6][x].setX(25);
g[5][x].setX(75);
g[4][x].setX(125);
g[3][x].setX(175);
g[2][x].setX(225);
g[1][x].setX(275);
g[0][x].setX(325);
}
for(int y=0;y<7;y++){
g[y][6].setY(25);
g[y][5].setY(75);
g[y][4].setY(125);
g[y][3].setY(175);
g[y][2].setY(225);
g[y][1].setY(275);
g[y][0].setY(325);
}
}
}
//Player Objects
//0= Nothing
//1=Player
//2=Meanie
//3=Freebie
//4=Sword
//5=Meanie Sword
//6=Boss bomb shot
//7=Boss shot
//8=Boss arrow shot
//9=Boss