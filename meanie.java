public class meanie {

	public void meanie()
	{
		
	}
        protected static int health=4;
        private String item;
        protected static int x, y;//the x and y coordinats of the PD.mOneie

        //protected String[][] locationM=new String [8][8];

        public static int gethealth ()
        {
                return health;
        }//get the PD.mOneie health

        public static void sethealth (int heal)
        {
                health=heal;
        }//setting health of PD.mOneie

        public void setX(int X)
        {
                x=X;
        }

        public void setY(int Y)
        {
                y=Y;
        }

        public static int getX()
        {
                return x;
        }

        public static int getY()
        {
                return y;
        }
        public String getItem()
        {
                return item;
        }
        public void setItem(String item)
        {
                this.item = item;
        }
        public void hitM(String weaponP)
        {
                if (weaponP.equals("sword"))//if the item the player has is a basic sword, he gets .5 heats off
                {
                        health=health-1;        
                }
                else if (weaponP.equals("bow"))
                {
                        health=health-2;//lose a heart
                }
                else if (weaponP.equals("bomb"))
                {
                        health=health-2;//loose a heart
                }
                else if(weaponP.equals("shank"))
                {
                        health=health-2;//lose a heart
                }
        }
        public static void meanieAI ()//need the player location and the pre-created PD.mOneie(in main have this update with player movemnt
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
                                        if (x>=3)
                                        {shiftX=(x-2);}
                                        else
                                        {shiftX=(x+3);}

                                        if (y<=1)
                                        {shiftY=(y+2);                                  }
                                        else {shiftY =y-2;      }
                                        PD.mOne.setX(shiftX);
                                        PD.mOne.setY(shiftY);
                                }
                                //dont actually set the jump back untill u make sure its in the frame 0<x<7
                                else if (jumpBack==2||jumpBack==5||jumpBack==8)
                                {
                                        if (x>=4 )
                                        {shiftX=(x-3);}
                                        else
                                        {shiftX=(x+2);}

                                        if (y<=6)
                                        {shiftY=(y+1);                                  }
                                        else {shiftY =y-3;      }
                                        PD.mOne.setX(shiftX);
                                        PD.mOne.setY(shiftY);
                                }
                                else if(jumpBack==3||jumpBack==7||jumpBack==9)
                                {
                                        if (x>=6 )
                                        {shiftX=(x-4);}
                                        else
                                        {shiftX=(x+2);}

                                        if (y>=5)
                                        {shiftY=(y-1);                                  }
                                        else {shiftY =y+3;      }
                                        PD.mOne.setX(shiftX);
                                        PD.mOne.setY(shiftY);
                                }
                        }
              

             //   }//while

        }
//}
