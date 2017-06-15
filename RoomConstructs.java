import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RoomConstructs extends JPanel {
	//static int j=0;
	   /*public static void main(String[] a) {
	      JFrame f = new JFrame();
	      f.setSize(500, 500);
	      f.add(new RoomConstructs());
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setVisible(true);
	   }
	   public static void setJ (int newJ)
	   {
		   j=newJ;
	   }
	   */
	   
	   public  void paint(Graphics g) {
		   if(Transtion.getJ()==1){
			   TopRoom(g);
		   }
		   else if(Transtion.getJ()==0){
			   MiddleRoom(g);
		   }
		   else if(Transtion.getJ()==2){
			   LeftRoom(g);
		   }
		   else if(Transtion.getJ()==3){
			   RightRoom(g);
		   }
	     
	   }
	   public void LeftRoom(Graphics g){
		   Color y = null;
		      g.fillRect (0, 0, 500, 500);
		     g.setColor(y.green);
		     g.drawRect(25, 25, 350, 350);
		     g.drawLine(75,25,75,375);
		     g.drawLine(125,25,125,375);
		     g.drawLine(175, 25, 175, 375);
		     g.drawLine(225, 25, 225, 375);
		     g.drawLine(275,25, 275, 375);
		     g.drawLine(325, 25, 325, 375);
		     //Vertical lines
		     g.drawLine(25, 75, 375,75);
		     g.drawLine(25,125,375,125);
		     g.drawLine(25, 175, 375, 175);
		     g.drawLine(25, 225, 375, 225);
		     g.drawLine(25, 275, 375, 275);
		     g.drawLine(25, 325, 375, 325);
		     //Horizontal Lines
		     g.setColor(y.black);
		     g.drawLine(375, 175, 375, 225);
		     
	   }
	   public void MiddleRoom(Graphics g){
		   Color y = null;
		      g.fillRect (0, 0, 500, 500);
		     g.setColor(y.green);
		     g.drawRect(25, 25, 350, 350);
		     g.drawLine(75,25,75,375);
		     g.drawLine(125,25,125,375);
		     g.drawLine(175, 25, 175, 375);
		     g.drawLine(225, 25, 225, 375);
		     g.drawLine(275,25, 275, 375);
		     g.drawLine(325, 25, 325, 375);
		     //Vertical lines
		     g.drawLine(25, 75, 375,75);
		     g.drawLine(25,125,375,125);
		     g.drawLine(25, 175, 375, 175);
		     g.drawLine(25, 225, 375, 225);
		     g.drawLine(25, 275, 375, 275);
		     g.drawLine(25, 325, 375, 325);
		     //Horizontal Lines
		     g.setColor(y.black);
		     g.drawLine(375, 175, 375, 225);
		     g.drawLine(175, 25, 225, 25);
		     g.drawLine(25, 175, 25, 225);
	   }
	   public void RightRoom(Graphics g){
		   Color y = null;
		      g.fillRect (0, 0, 500, 500);
		     g.setColor(y.green);
		     g.drawRect(25, 25, 350, 350);
		     g.drawLine(75,25,75,375);
		     g.drawLine(125,25,125,375);
		     g.drawLine(175, 25, 175, 375);
		     g.drawLine(225, 25, 225, 375);
		     g.drawLine(275,25, 275, 375);
		     g.drawLine(325, 25, 325, 375);
		     //Vertical lines
		     g.drawLine(25, 75, 375,75);
		     g.drawLine(25,125,375,125);
		     g.drawLine(25, 175, 375, 175);
		     g.drawLine(25, 225, 375, 225);
		     g.drawLine(25, 275, 375, 275);
		     g.drawLine(25, 325, 375, 325);
		     //Horizontal Lines
		     g.setColor(y.black);
		     g.drawLine(25, 175, 25, 225);
		     
	   }
	   public void TopRoom(Graphics g){
		   Color y = null;
		      g.fillRect (0, 0, 500, 500);
		     g.setColor(y.green);
		     g.drawRect(25, 25, 350, 350);
		     g.drawLine(75,25,75,375);
		     g.drawLine(125,25,125,375);
		     g.drawLine(175, 25, 175, 375);
		     g.drawLine(225, 25, 225, 375);
		     g.drawLine(275,25, 275, 375);
		     g.drawLine(325, 25, 325, 375);
		     //Vertical lines
		     g.drawLine(25, 75, 375,75);
		     g.drawLine(25,125,375,125);
		     g.drawLine(25, 175, 375, 175);
		     g.drawLine(25, 225, 375, 225);
		     g.drawLine(25, 275, 375, 275);
		     g.drawLine(25, 325, 375, 325);
		     //Horizontal Lines
		     g.setColor(y.black);
		     g.drawLine(175, 375, 225, 375);   
	   }
	}