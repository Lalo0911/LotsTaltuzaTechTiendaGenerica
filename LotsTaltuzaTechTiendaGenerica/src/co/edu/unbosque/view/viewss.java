package co.edu.unbosque.view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class viewss extends JPanel {

	/**
	 * Create the panel.
	 */
	public viewss() {
		setLayout(new MigLayout("", "[][][][][][][][][][]", "[][][][][][][][][][]"));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		add(lblNewLabel_1, "cell 0 0");
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel, "cell 3 0 5 3,alignx center");
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		add(lblNewLabel_3, "cell 9 0");
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton, "cell 3 5");
		
		JButton btnNewButton_1 = new JButton("New button");
		add(btnNewButton_1, "cell 7 5");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		add(lblNewLabel_2, "cell 0 9");
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		add(lblNewLabel_4, "cell 9 9");

	}

}
