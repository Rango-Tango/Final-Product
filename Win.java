import java.awt.CardLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Win extends JPanel {

	/**
	 * Create the panel.
	 */
	public Win() {
		setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				M_M.Menu();
			}
		});
		btnNewButton.setIcon(new ImageIcon("G:\\Downloads\\Win.png"));
		add(btnNewButton, "name_3859627940413");

	}

}