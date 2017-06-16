import javax.swing.ImageIcon;

public class meanie {

	public void meanie()
	{
		
	}
        public static String item[] = new String[4];
        public static int health[] = new int[4];
        public static int x[] = new int[4];
        public static int y[] = new int[4];
        //the x and y coordinats of the PD.mOneie

        //protected String[][] locationM=new String [8][8];

        public static int gethealth (int room)
        {
                return health[room];
        }//get the PD.mOneie health

        public static void sethealth (int heal, int room)
        {
               health[room]=heal;
       }//setting health of PD.mOneie

        public static void setX(int X, int room)
        {
                x[room]=X;
        }

        public static void setY(int Y, int room)
        {
                y[room]=Y;
        }

        public static int getX(int room)
        {
        	return x[room];
        }

        public static int getY(int room)
        {
                return y[room];
        }
        public String getItem(int room)
        {
                return item[room];
        }
        public void setItem(String item, int room)
        {
                this.item[room] = item;
        }
        public static void hitM(String weaponP, int room)
        {
        	if (weaponP.equals("Sword"))//if the item the player has is a basic Sword, he gets .5 heats off
            {
                    meanie.sethealth(meanie.gethealth(room)-1,room);        
            }
            else if (weaponP.equals("Bow"))
            {
            	meanie.sethealth(meanie.gethealth(room)-1,room); 
            }
            else if (weaponP.equals("Bomb"))
            {
            	meanie.sethealth(meanie.gethealth(room)-1,room); 
            }
            else if(weaponP.equals("Shank"))
            {
            	meanie.sethealth(meanie.gethealth(room)-1,room); 
            }
        	if(health[room]<=0)
        	{
        		switch(room)
        		{
        		case 0:
        			break;
        		case 1:
        			M_M.r.left.mean=0;
        			break;
        		case 2:
        			M_M.r.right.mean=0;
        			break;
        		case 3:
        			M_M.r.up.mean=0;
        			break;
        		default:
        			break;
        		}
        		Toggle.NewWeapon(item[room]);
        		/*switch(item[room])
        		{
        		case "Bomb":
        			M_M.pd.grid.get(x).get(y).setIcon(new ImageIcon("G:\\Downloads\\New Piskel (5).png"));
        			break;
        		case "Bow":
        			M_M.pd.grid.get(x).get(y).setIcon(new ImageIcon("G:\\Downloads\\New Piskel (3).png"));
        			break;
        		case "Shank":
        			M_M.pd.grid.get(x).get(y).setIcon(new ImageIcon("G:\\Downloads\\New Piskel (2).png"));
        			break;
        		case "Peanuts":
        			M_M.pd.grid.get(x).get(y).setIcon(new ImageIcon("G:\\Downloads\\Peanut.png"));
        			break;
        		default:
        			break;
        		}*/
        	}
        }
        public static void meanieAI (int room)//need the player location and the pre-created PD.mOneie(in main have this update with player movement
        {
                int loopingStall=0,cri=0;
                int xGoal, yGoal,jumpBack, shiftX,shiftY;//where player is/ goal for PD.mOneie

                xGoal=MovementspaceObject.getX();//chat at and get the players x&Y coordinates
                yGoal=MovementspaceObject.getY();

                jumpBack=(int)(Math.random()*10);//make a random amount/direction for PD.mOneie to jump back to
      
                                MovementspaceObject.healthDown(1);// if player is hit
                                PD.Health(MovementspaceObject.getHealth());

                                if (jumpBack==1||jumpBack==4||jumpBack==6)//set PD.mOneie to another local
                                {
                                        if (x[room]>=3)
                                        {shiftX=(x[room]-2);}
                                        else
                                        {shiftX=(x[room]+3);}

                                        if (y[room]<=1)
                                        {shiftY=(y[room]+2);                                  }
                                        else {shiftY =y[room]-2;      }
                                        x[room]=shiftX;
                                        y[room] = shiftY;
                                }
                                //dont actually set the jump back until u make sure its in the frame 0<x<7
                                else if (jumpBack==2||jumpBack==5||jumpBack==8)
                                {
                                        if (x[room]>=4 )
                                        {shiftX=(x[room]-3);}
                                        else
                                        {shiftX=(x[room]+2);}

                                        if (y[room]<=6)
                                        {shiftY=(y[room]+1);                                  }
                                        else {shiftY =y[room]-3;      }
                                        x[room]=(shiftX);
                                        y[room]=(shiftY);
                                }
                                else if(jumpBack==3||jumpBack==7||jumpBack==9)
                                {
                                        if (x[room]>=6 )
                                        {shiftX=(x[room]-4);}
                                        else
                                        {shiftX=(x[room]+2);}

                                        if (y[room]>=5)
                                        {shiftY=(y[room]-1);                                  }
                                        else {shiftY =y[room]+3;      }
                                        x[room]=(shiftX);
                                        y[room]=(shiftY);
                                }
                        }
              

             //   }//while

        }
//}
