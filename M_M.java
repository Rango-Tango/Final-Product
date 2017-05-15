import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
public class M_M 
{
		static PD pd=new PD();
		private static JPanel contentPane;
        static JFrame menuframe=new JFrame();
        static JFrame frame=new JFrame();
        static JPanel panel=new JPanel();
        public static CM cm;
        public static Toggle tog=new Toggle();
        public static PlayerMovement move=new PlayerMovement();
        public static void main(String[] args)
        {
                
                menuframe.setVisible(true);
                menuframe.setSize(500,500);
                menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setSize(500,500);
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
                frame.add(pd);
                JLabel label = new JLabel("Hunt For Harambe");
                label.setBounds(185, 36, 105, 16);
                panel.add(label);
                pd.setVisible(true);
                JButton b1 = new JButton("Start");
                b1.setBounds(185, 85, 105, 25);
                b1.addActionListener(new ActionListener() 
                {
                        public void actionPerformed(ActionEvent arg0) 
                        {
                                menuframe.setVisible(false);
                        		menuframe=null;
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
        }
        public static void rs()
        {
                panel.setVisible(true);
                cm.setVisible(false);
        }
}

