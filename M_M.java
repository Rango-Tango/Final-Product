import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
public class M_M extends JFrame
{
	static PD pd=new PD();
	private static JPanel contentPane;
	static JFrame menuframe=new JFrame();
	static JFrame frame=new JFrame();
	static JPanel panel=new JPanel();
	static JFrame bossframe=new JFrame();
	public static CM cm;
	public static Toggle tog=new Toggle();
	public static int check =0;
	public static PlayerMovement move=new PlayerMovement();
	public static CreatingRooms r = new CreatingRooms();
	public static void main(String[] args)
	{
		r.startup();
		menuframe.setVisible(true);
		menuframe.setSize(500,500);
		menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bossframe.setVisible(true);
		bossframe.setSize(500,500);
		bossframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(false);
		cm=new CM();
		cm.setVisible(false);
		cm.setBounds(-10009, -10038, 472, 443);
		contentPane=new JPanel();
		menuframe.setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new CardLayout(0,0));
		contentPane.add(panel);
		contentPane.add(cm);
		panel.setBounds(5, 5, 472, 443);
		panel.setLayout(null);
		pd.setSize(new Dimension(500,450));
		frame.add(pd);
		frame.setResizable(false);
		JLabel label = new JLabel("Hunt For Harambe");
		label.setBounds(185, 36, 105, 16);
		panel.add(label);
		pd.setVisible(true);
		bossframe.setVisible(false);
		JButton b1 = new JButton("Start");
		b1.setBounds(185, 85, 105, 25);
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				menuframe.setVisible(false);
				r.room=0;
				r.startup(); 
				frame.setVisible(true);
				PD.Refresh();
			}
		});
		panel.add(b1);

		JButton b2 = new JButton("Controls");
		b2.setBounds(185, 114, 105, 25);
		b2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				cm.setVisible(true);
				panel.setVisible(false);
			}
		});
		panel.add(b2);

		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(185, 143, 105, 25);
		btnQuit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		panel.add(btnQuit);
		b2.setVisible(true);
		menuframe.repaint();
		int x2;
		int y2;
		int x1;
		int y1;
		int XorY = 0;
		while(true)
		{
			//System.out.println("hello");
			x1 = MovementspaceObject.getX();
			y1 = MovementspaceObject.getY();
			switch(M_M.r.room)
			{
			case 0:
				break;
			case 1:
				//System.out.println(r.left.mean);
				if(r.left.ifMeanie())
				{
					if(x1==meanie.getX(1)&&y1==meanie.getY(1))
					{
						meanie.meanieAI(1);
					}
					//System.out.println("working");
					try
					{
						
						Thread.sleep(500);
					}
					catch(InterruptedException o)
					{
						//System.out.println("error");
					}

					x2 = meanie.getX(1);
					y2=  meanie.getY(1);
					if(XorY==0)
					{
						//System.out.println("moving x");
						if (x2>x1)
						{
							if(x2!=0)
							{
								meanie.setX(x2-1,1);
							}
							else
							{
								meanie.setX(x2+1, 1);
							}
						}
						else if (x2<x1)
						{
							if(x2!=6)
							{
								meanie.setX(x2+1, 1);
							}
							else
							{
								meanie.setX(x2-1, 1);
							}
						}
						XorY=1;
					}
					else if(XorY==1)
					{
					//System.out.println("moving y");
						if (y2>y1)
						{
							if(y2!=0)
							{
								meanie.setY(y2-1, 1);
							}
							else
							{
								meanie.setY(y2+1, 1);
							}
						}
						
						else if (y2<y1)
						{
							if(y2!=6)
							{
								meanie.setY(y2+1, 1);
							}
							else
							{
								meanie.setY(y2-1, 1);
							}
						}
						XorY=0;
					}
					PD.Refresh();
				}
				break;
			case 2:
				if(r.right.ifMeanie())
				{
					if(x1==meanie.getX(2)&&y1==meanie.getY(2))
					{
						meanie.meanieAI(2);
					}
					//System.out.println("working");
					try
					{
						
						Thread.sleep(500);
					}
					catch(InterruptedException o)
					{
						//System.out.println("error");
					}

					x2 = meanie.getX(2);
					y2=  meanie.getY(2);
					if(XorY==0)
					{
						//System.out.println("moving x");
						if (x2>x1)
						{
							if(x2!=0)
							{
								meanie.setX(x2-1, 2);
							}
							else
							{
								meanie.setX(x2+1, 2);
							}
						}
						else if (x2<x1)
						{
							if(x2!=6)
							{
								meanie.setX(x2+1, 2);
							}
							else
							{
								meanie.setX(x2-1, 2);
							}
						}
						XorY=1;
					}
					else if(XorY==1)
					{
					//System.out.println("moving y");
						if (y2>y1)
						{
							if(y2!=0)
							{
								meanie.setY(y2-1, 2);
							}
							else
							{
								meanie.setY(y2+1, 2);
							}
						}
						
						else if (y2<y1)
						{
							if(y2!=6)
							{
								meanie.setY(y2+1, 2);
							}
							else
							{
								meanie.setY(y2-1, 2);
							}
						}
						XorY=0;
					}
					PD.Refresh();
				}
				break;
			case 3:
				if(r.up.ifMeanie())
				{
					if(x1==meanie.getX(3)&&y1==meanie.getY(3))
					{
						meanie.meanieAI(3);
					}
					//System.out.println("working");
					try
					{
						
						Thread.sleep(500);
					}
					catch(InterruptedException o)
					{
						//System.out.println("error");
					}

					x2 = meanie.getX(3);
					y2=  meanie.getY(3);
					if(XorY==0)
					{
						//System.out.println("moving x");
						if (x2>x1)
						{
							if(x2!=0)
							{
								meanie.setX(x2-1, 3);
							}
							else
							{
								meanie.setX(x2+1, 3);
							}
						}
						else if (x2<x1)
						{
							if(x2!=6)
							{
								meanie.setX(x2+1, 3);
							}
							else
							{
								meanie.setX(x2-1, 3);
							}
						}
						XorY=1;
					}
					else if(XorY==1)
					{
					//System.out.println("moving y");
						if (y2>y1)
						{
							if(y2!=0)
							{
								meanie.setY(y2-1, 3);
							}
							else
							{
								meanie.setY(y2+1, 3);
							}
						}
						
						else if (y2<y1)
						{
							if(y2!=6)
							{
								meanie.setY(y2+1, 3);
							}
							else
							{
								meanie.setY(y2-1, 3);
							}
						}
						XorY=0;
					}
					PD.Refresh();
				}
				break;
			default:
				break;
			}
		}
	}
	public static void rs()
	{
		panel.setVisible(true);
		cm.setVisible(false);
	}
	public static void Boss()
	{
		BD bd=new BD();
		BossListener bl=new BossListener();
		bossframe.add(bd);
		frame.setVisible(false);
		bossframe.setVisible(true);
		r.room=4;
		BD.Refresh();
	}

	public static void nextRoom()
	{
		pd.repaint();
	}
	
	public static void win()
	{
		System.out.println("You Win");
		System.exit(0);
	}
	public static void GO()
	{
		frame.setVisible(false);
		bossframe.setVisible(false);
		JFrame lose=new JFrame();
		GameOver loss=new GameOver();
		lose.add(loss);
		lose.setSize(400,400);
		lose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lose.setVisible(true);
		loss.setVisible(true);
	}
	public static void Menu()
	{
		r.room=0;
		menuframe.setVisible(true);
	}
}

