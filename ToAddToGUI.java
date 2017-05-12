import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ToAddToGUI extends JFrame implements KeyListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToAddToGUI frame = new ToAddToGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode()==37)//left arrow key pressed
		{
			//update player position
		}
		else if(e.getKeyCode()==38)//up arrow key pressed
		{
			//update player position
		}
		else if(e.getKeyCode()==39)//right arrow key pressed
		{
			//update player position
		}
		else if(e.getKeyCode()==40)//down arrow key pressed
		{
			//update player position
		}
		else if(e.getKeyCode()==90)//z key
		{
			//use item in z slot
		}
		else if(e.getKeyCode()==88)//x key
		{
			//use item in x slot
		}
		else if(e.getKeyCode()==67)//c key
		{
			//use item in c slot
		}
	}
	@Override
	public void keyReleased(KeyEvent e)
	{
	}
	@Override
	public void keyTyped(KeyEvent e)
	{
	}
	/**
	 * Create the frame.
	 */
	public ToAddToGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
