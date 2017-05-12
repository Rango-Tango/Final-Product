import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ToAddToGUI extends JFrame implements KeyListener{
public int x,y;
	x=4;
	y=4;
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
			this.x=this.x+1;
			if(x==7){
				this.x=this.x-1;
			}
			else
			{
			if(g[this.x][this.y]==0){
				g[this.x-1][this.y]=0;
			g[this.x][this.y]=1;
				roomtransition(this.x,thix.y);
				  }
				
			else{
				this.x=this.x-1;
				g[this.x][this.y]=1;
			}
				  }
			//update player position
		}
		else if(e.getKeyCode()==38)//up arrow key pressed
		{
			this.y=this.y+1;
			if(this.y==7){
				this.y=this.y-1;
			}
			else{
			if(g[this.x][this.y]==0){
				g[this.x][this.y-1]=0;
			g[this.x][this.y]=1;
				roomtransition(this.x,thix.y);
			}
			else{
				this.x=this.y-1;
				g[this.x][this.y]=1;
			}
			}
			//update player position
		}
		else if(e.getKeyCode()==39)//right arrow key pressed
		{
			this.x=this.x-1;
			if(this.x==-1){
			this.x=this.x+1;	
			}
			else{
			if(g[this.x][this.y]==0){
				g[this.x+1][this.y]=0;
			g[this.x][this.y]=1;
				roomtransition(this.x,thix.y);
			}
			else{
				this.x=this.x+1;
				g[this.x][this.y]=1;
			}
			}
			//update player position
		}
		else if(e.getKeyCode()==40)//down arrow key pressed
		{
			
			this.y=this.y-1;
			if(this.y==-1){
				this.y=this.y+1;
			}
			else{
			if(g[this.x][this.y]==0){
				g[this.x][this.y+1]=0;
			g[this.x][this.y]=1;
				roomtransition(this.x,thix.y);
			}
			else{
				this.x=this.y+1;
				g[this.x][this.y]=1;
			}
			}
			//update player position
		}
		else if(e.getKeyCode()==32)//space bar
		{
			//attack
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
		else if(e.getKeyCode()==66)//b key
		{
			//switch weapons
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
