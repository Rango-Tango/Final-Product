import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameOver extends JPanel {

	/**
	 * Create the panel.
	 */
	public GameOver() {
		setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				M_M.Menu();
			}
		});
		btnNewButton.setIcon(new ImageIcon("G:\\Downloads\\Game Over Screen (1).png"));
		add(btnNewButton, "name_3859627940413");

	}

}
