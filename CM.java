import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CM extends JPanel {

	/**
	 * Create the panel.
	 */
	public CM() 
	{
		setLayout(new MigLayout("", "[][][][][][][][][][]", "[][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Controls");
		add(lblNewLabel, "cell 8 1");
		
		JLabel lblNewLabel_1 = new JLabel("Movement");
		add(lblNewLabel_1, "cell 7 3");
		
		JLabel lblNewLabel_5 = new JLabel("Arrow keys");
		add(lblNewLabel_5, "cell 9 3");
		
		JLabel lblNewLabel_2 = new JLabel("Attack");
		add(lblNewLabel_2, "cell 7 4");
		
		JLabel lblNewLabel_6 = new JLabel("Space");
		add(lblNewLabel_6, "cell 9 4");
		
		JLabel lblNewLabel_3 = new JLabel("Swap weapon");
		add(lblNewLabel_3, "cell 7 5");
		
		JLabel lblNewLabel_7 = new JLabel("b");
		add(lblNewLabel_7, "cell 9 5");
		
		JLabel lblNewLabel_4 = new JLabel("Use consumable");
		add(lblNewLabel_4, "cell 7 6");
		
		JLabel lblNewLabel_8 = new JLabel("z");
		add(lblNewLabel_8, "cell 9 6");
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				M_M.rs();
			}
		});
		add(btnNewButton, "cell 8 8");
		
	}

}
