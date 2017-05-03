import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlsMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlsMenu frame = new ControlsMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ControlsMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][]", "[][][][][][][][][][][][][]"));

		JLabel lblControls = new JLabel("Controls");
		lblControls.setFont(new Font("Stencil", Font.PLAIN, 18));
		contentPane.add(lblControls, "cell 5 0,grow");

		JLabel lblNewLabel = new JLabel("move up");
		contentPane.add(lblNewLabel, "cell 4 1,growy");

		JLabel lblNewLabel_1 = new JLabel("up arrow");
		contentPane.add(lblNewLabel_1, "cell 6 1");

		JLabel lblNewLabel_3 = new JLabel("move down");
		contentPane.add(lblNewLabel_3, "cell 4 2");

		JLabel lblNewLabel_2 = new JLabel("down arrow");
		contentPane.add(lblNewLabel_2, "cell 6 2");

		JLabel lblNewLabel_4 = new JLabel("move left");
		contentPane.add(lblNewLabel_4, "cell 4 3");

		JLabel lblNewLabel_6 = new JLabel("left arrow");
		contentPane.add(lblNewLabel_6, "cell 6 3");

		JLabel lblNewLabel_5 = new JLabel("move right");
		contentPane.add(lblNewLabel_5, "cell 4 4");

		JLabel lblNewLabel_7 = new JLabel("right arrow");
		contentPane.add(lblNewLabel_7, "cell 6 4");

		JLabel lblNewLabel_8 = new JLabel("Attack");
		contentPane.add(lblNewLabel_8, "cell 4 6");

		JLabel lblNewLabel_13 = new JLabel("space");
		contentPane.add(lblNewLabel_13, "cell 6 6");

		JLabel lblNewLabel_12 = new JLabel("toggle weapon");
		contentPane.add(lblNewLabel_12, "cell 4 7");

		JLabel lblNewLabel_14 = new JLabel("b");
		contentPane.add(lblNewLabel_14, "cell 6 7");

		JLabel lblNewLabel_9 = new JLabel("Use item 1");
		contentPane.add(lblNewLabel_9, "cell 4 8");

		JLabel lblNewLabel_15 = new JLabel("z");
		contentPane.add(lblNewLabel_15, "cell 6 8");

		JLabel lblNewLabel_10 = new JLabel("Use item 2");
		contentPane.add(lblNewLabel_10, "cell 4 9");

		JLabel lblNewLabel_16 = new JLabel("x");
		contentPane.add(lblNewLabel_16, "cell 6 9");

		JLabel lblNewLabel_11 = new JLabel("Use item 3");
		contentPane.add(lblNewLabel_11, "cell 4 10");

		JLabel lblNewLabel_17 = new JLabel("c");
		contentPane.add(lblNewLabel_17, "cell 6 10");

		JButton back = new JButton("Return");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				MainMenu.start();
			}
		});
		contentPane.add(back, "cell 5 12,grow");
	}

}
