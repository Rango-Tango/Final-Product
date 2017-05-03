import javax.swing.JFrame;

public class Meanie_Method {
	public static void main(String args[]) {
		JFrame f = new JFrame();
		movement  s = new movement();
		f.add(s);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 600);
	}
}
