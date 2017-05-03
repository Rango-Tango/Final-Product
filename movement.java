import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;


import javax.management.timer.Timer;
import javax.swing.JPanel;

public class movement extends JPanel implements ActionListener, KeyListener {
	Timer t = new Timer();
	double x = 0, y = 0, velx= 0, vely = 0 ; // declaring variables
	public movement() {
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	public void paintComponent (Graphics g) {
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.fill (new Ellipse2D.Double(x,y,40,40));
	}
	public void actionPerformed(ActionEvent e) {
		repaint();
		x += velx;
		y += vely;
	}
	public void up() {
		vely = -1.5;
		velx = 0;
	}
	public void down() {
		vely = 1.5;
		velx = 0;
	}
	public void left() {
		vely = 0;
		velx = -1.5;
	}
	public void right() {
		vely = 0;
		velx = 1.5;
	}
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code ==KeyEvent.VK_UP) {
			up();
		}
		if (code ==KeyEvent.VK_DOWN) {
			down();
		}
		if (code ==KeyEvent.VK_LEFT) {
			left();
		}
		if (code ==KeyEvent.VK_RIGHT) {
			right();
		}
	}
	public void keyTyped(KeyEvent e) {}
	public void keyReleased (KeyEvent e) {}
}
