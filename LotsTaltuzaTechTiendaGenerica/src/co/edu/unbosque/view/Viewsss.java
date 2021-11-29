package co.edu.unbosque.view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Viewsss extends JPanel {

	/**
	 * Create the panel.
	 */
	public Viewsss() {
		
		JLabel lblNewLabel = new JLabel("New label");
		
		JButton btnNewButton = new JButton("New button");
		
		
		JButton btnNewButton_1 = new JButton("New button");
		setLayout(new MigLayout("", "[89px][46px][89px]", "[55.00px][75.00][138.00px]"));
		//setLayout(new MigLayout("", "[89px][46px][89px]", "[91px][55.00][69.00px]"));
		add(lblNewLabel, "cell 1 0,alignx center,growy");
		add(btnNewButton, "cell 0 2,alignx center,aligny center");
		add(btnNewButton_1, "cell 2 2,alignx center,aligny center");

	}
}
