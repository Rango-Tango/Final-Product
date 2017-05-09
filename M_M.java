import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
public class M_M 
{
	private static JPanel contentPane;
	static JFrame frame=new JFrame();
	static JPanel panel=new JPanel();
	public static CM cm;
	public static void main(String[] args)
	{
		
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cm=new CM();
		cm.setVisible(false);
		cm.setBounds(-10009, -10038, 472, 443);
		contentPane=new JPanel();
		frame.setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new CardLayout(0,0));
		contentPane.add(panel);
		contentPane.add(cm);
		panel.setBounds(5, 5, 472, 443);
		panel.setLayout(null);

		JLabel label = new JLabel("Hunt For Harambe");
		label.setBounds(185, 36, 105, 16);
		panel.add(label);

		JButton b1 = new JButton("Start");
		b1.setBounds(185, 85, 105, 25);
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				//start game
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
		frame.repaint();
	}
	public static void rs()
	{
		panel.setVisible(true);
		cm.setVisible(false);
	}
}

