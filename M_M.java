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
	static int boss=-1;
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
				frame.setVisible(true);
				boss=0;
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
		meanie.meanieAI();
		while(boss==0)
		{
			//System.out.println("hello");
			x1 = MovementspaceObject.getX();
			y1 = MovementspaceObject.getY();
			if(x1==M_M.r.current.m.getX()&&y1==M_M.r.current.m.getY())
			{
				meanie.meanieAI();
			}
			else if(r.current.ifMeanie())
			{
				//System.out.println("working");
				try
				{

					Thread.sleep(500);
				}
				catch(InterruptedException o)
				{
					//System.out.println("error");
				}

				x2 = M_M.r.current.m.getX();
				y2=  M_M.r.current.m.getY();
				if(XorY==0)
				{
					//System.out.println("moving x");
					if (x2>x1)
					{
						if(x2!=0)
						{
							M_M.r.current.m.setX(x2-1);
						}
						else
						{
							M_M.r.current.m.setX(x2+1);
						}
					}
					else if (x2<x1)
					{
						if(x2!=7)
						{
							M_M.r.current.m.setX(x2+1);
						}
						else
						{
							M_M.r.current.m.setX(x2-1);
						}
					}
					XorY=1;
				}
				else if(XorY==1)
				{
					//	System.out.println("moving y");
					if (y2>y1)
					{
						if(y2!=0)
						{
							M_M.r.current.m.setY(y2-1);
						}
						else
						{
							M_M.r.current.m.setY(y2+1);
						}
					}

					else if (y2<y1)
					{
						if(y2!=7)
						{
							M_M.r.current.m.setY(y2+1);
						}
						else
						{
							M_M.r.current.m.setY(y2-1);
						}
					}
					XorY=0;
				}
				PD.Refresh();
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
		boss=1;
		BD.Refresh();
	}

	public static void nextRoom()
	{
		pd.repaint();
	}

	public static void win()
	{
		frame.setVisible(false);
		bossframe.setVisible(false);
		JFrame lose=new JFrame();
		Win loss=new Win();
		lose.add(loss);
		lose.setSize(400,400);
		lose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lose.setVisible(true);
		loss.setVisible(true);
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
		boss=-1;
		menuframe.setVisible(true);
	}
}

