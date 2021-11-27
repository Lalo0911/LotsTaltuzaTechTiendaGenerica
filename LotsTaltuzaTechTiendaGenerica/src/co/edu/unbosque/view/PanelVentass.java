package co.edu.unbosque.view;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;

public class PanelVentass extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelVentass() {
		setLayout(new MigLayout("", "[grow]", "[319.00][][][]"));
		
		table = new JTable();
		add(table, "cell 0 0,grow");
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel, "flowx,cell 0 1,alignx right");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		add(lblNewLabel_1, "flowx,cell 0 2,alignx right");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		add(lblNewLabel_2, "flowx,cell 0 3,alignx right");
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		add(lblNewLabel_3, "cell 0 1");
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		add(lblNewLabel_4, "cell 0 2");
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		add(lblNewLabel_5, "cell 0 3");

	}
}
