import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.TableModel;
import java.awt.Scrollbar;
import java.awt.ScrollPane;
import javax.swing.JTree;
import java.awt.Panel;

public class MainWindow {
	String ClassType[]= {"ClassificationYard", "InterchangeYard", "IndustrysupportYard"};
	String Direction []={"EW", "WE", "NS", "SN", "BiNS", "BiWE"};
	String CarType []={"Local","Tonnage","Manisfest","InterModal"};
	String[] columnNames = {"Line","Type","Code","Line in Station","Direction","Position"};
	String[][] data = {{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting","Noting"}};	
	DefaultTableModel model = new DefaultTableModel(data,columnNames);
	
	String[] columnNameStation = {"Station name","Type","Acro","Direction","Num of cars"};
	String[][] dataStation = {{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting","Noting"}};
	DefaultTableModel modelStation = new DefaultTableModel(dataStation,columnNameStation);
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	/**
	 * @wbp.nonvisual location=291,509
	 */
	private final JSplitPane splitPane = new JSplitPane();
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_34;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_35;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 586, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel MainPanel = new JPanel();
		frame.getContentPane().add(MainPanel, "name_1308126600308800");
		MainPanel.setLayout(new BorderLayout(0, 0));
		
		
		
		JPanel HomePanel = new JPanel();
		HomePanel.setVisible(true);
		MainPanel.add(HomePanel, BorderLayout.CENTER);
		HomePanel.setLayout(new CardLayout(0, 0));
		
		JPanel addLine = new JPanel();
		addLine.setVisible(false);
		HomePanel.add(addLine, "name_1310157411821900");
		addLine.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Line Name");
		addLine.add(lblNewLabel);
		
		textField = new JTextField();
		addLine.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Line Acronym");
		addLine.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		addLine.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Line length");
		addLine.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		addLine.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Line Class");
		addLine.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox(ClassType);
		addLine.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Line Direction");
		addLine.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox(Direction);
		addLine.add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(60);
		textArea.setRows(10);
		addLine.add(textArea);
		
		JButton btnNewButton = new JButton("Next");

		addLine.add(btnNewButton);
		
		JPanel editLine = new JPanel();
		HomePanel.add(editLine, "name_1310157420991900");
		GridBagLayout gbl_editLine = new GridBagLayout();
		gbl_editLine.columnWidths = new int[]{586, 0};
		gbl_editLine.rowHeights = new int[] {100, 260, 0};
		gbl_editLine.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_editLine.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		editLine.setLayout(gbl_editLine);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		editLine.add(panel_3, gbc_panel_3);
		
		JLabel lblNewLabel_15 = new JLabel("Enter Name or Acronym of the Line");
		panel_3.add(lblNewLabel_15);
		
		textField_13 = new JTextField();
		panel_3.add(textField_13);
		textField_13.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Search");
		panel_3.add(btnNewButton_2);
		
		JPanel panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 0;
		gbc_panel_9.gridy = 1;
		editLine.add(panel_9, gbc_panel_9);
		panel_9.setLayout(new CardLayout(0, 0));
		
		JPanel noFound = new JPanel();
		panel_9.add(noFound, "name_1393384886757600");
		
		JLabel lblNewLabel_16 = new JLabel("No Coincidence ...");
		noFound.add(lblNewLabel_16);
		
		JPanel found = new JPanel();
		panel_9.add(found, "name_1393413172175100");
		
		JLabel lblNewLabel_17 = new JLabel("Line Name");
		found.add(lblNewLabel_17);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		found.add(textField_14);
		
		JLabel lblNewLabel_1_1 = new JLabel("Line Acronym");
		found.add(lblNewLabel_1_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		found.add(textField_15);
		
		JLabel lblNewLabel_2_1 = new JLabel("Line length");
		found.add(lblNewLabel_2_1);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		found.add(textField_16);
		
		JLabel lblNewLabel_3_1 = new JLabel("Line Class");
		found.add(lblNewLabel_3_1);
		
		JComboBox comboBox_6 = new JComboBox(ClassType);
		found.add(comboBox_6);
		
		JLabel lblNewLabel_4_1 = new JLabel("Line Direction");
		found.add(lblNewLabel_4_1);
		
		JComboBox comboBox_1_1 = new JComboBox(Direction);
		found.add(comboBox_1_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setRows(10);
		textArea_2.setColumns(60);
		found.add(textArea_2);
		
		JButton btnNewButton_3 = new JButton("Edit");
		found.add(btnNewButton_3);
		
		JPanel deleteLine = new JPanel();
		HomePanel.add(deleteLine, "name_1310157432045200");
		GridBagLayout gbl_deleteLine = new GridBagLayout();
		gbl_deleteLine.columnWidths = new int[]{586, 0};
		gbl_deleteLine.rowHeights = new int[] {100, 260, 0};
		gbl_deleteLine.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_deleteLine.rowWeights = new double[]{0.0, 0.0};
		deleteLine.setLayout(gbl_deleteLine);
		
		JPanel panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 0;
		deleteLine.add(panel_10, gbc_panel_10);
		
		JLabel lblNewLabel_15_1 = new JLabel("Enter Name or Acronym of the Line to DELETE");
		panel_10.add(lblNewLabel_15_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		panel_10.add(textField_17);
		
		JButton btnNewButton_2_1 = new JButton("Search");
		panel_10.add(btnNewButton_2_1);
		
		JPanel panel_11 = new JPanel();
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 0;
		gbc_panel_11.gridy = 1;
		deleteLine.add(panel_11, gbc_panel_11);
		panel_11.setLayout(new CardLayout(0, 0));
		
		JPanel noFound_1 = new JPanel();
		panel_11.add(noFound_1, "name_1394579907728900");
		
		JLabel lblNewLabel_16_1 = new JLabel("No Coincidence ...");
		noFound_1.add(lblNewLabel_16_1);
		
		JPanel found_1 = new JPanel();
		panel_11.add(found_1, "name_1394579920907200");
		found_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_17_1 = new JLabel("Line Name: ");
		found_1.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Line Acronym: ");
		found_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Line length: ");
		found_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Line Class: ");
		found_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Line Direction:");
		found_1.add(lblNewLabel_4_1_1);
		
		JButton btnNewButton_3_1 = new JButton("DELETE");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel_18 = new JLabel("Description: ");
		found_1.add(lblNewLabel_18);
		found_1.add(btnNewButton_3_1);
		
		JPanel addStation = new JPanel();
		HomePanel.add(addStation, "name_1310157443877700");
		addStation.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_12 = new JPanel();
		addStation.add(panel_12);
		panel_12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_5_2 = new JLabel("Type of Station");
		panel_12.add(lblNewLabel_5_2);
		
		JLabel label_12 = new JLabel("");
		panel_12.add(label_12);
		
		JLabel label_1_2 = new JLabel("");
		panel_12.add(label_1_2);
		
		JLabel label_2_2 = new JLabel("");
		panel_12.add(label_2_2);
		
		JLabel label_3_2 = new JLabel("");
		panel_12.add(label_3_2);
		
		JLabel label_4_2 = new JLabel("");
		panel_12.add(label_4_2);
		
		JLabel label_5_2 = new JLabel("");
		panel_12.add(label_5_2);
		
		JLabel label_6_2 = new JLabel("");
		panel_12.add(label_6_2);
		
		JLabel label_7_2 = new JLabel("");
		panel_12.add(label_7_2);
		
		JLabel label_8_2 = new JLabel("");
		panel_12.add(label_8_2);
		
		JLabel label_9_2 = new JLabel("");
		panel_12.add(label_9_2);
		
		JLabel label_10_2 = new JLabel("");
		panel_12.add(label_10_2);
		
		JComboBox comboBox_2_2 = new JComboBox(ClassType);
		panel_12.add(comboBox_2_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("Station Name");
		panel_12.add(lblNewLabel_6_2);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		panel_12.add(textField_18);
		
		JLabel lblNewLabel_7_2 = new JLabel("Station Acronym");
		panel_12.add(lblNewLabel_7_2);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		panel_12.add(textField_19);
		
		JLabel lblNewLabel_8_2 = new JLabel("Station Direction");
		panel_12.add(lblNewLabel_8_2);
		
		JComboBox comboBox_3_2 = new JComboBox(Direction);
		panel_12.add(comboBox_3_2);
		
		JLabel lblNewLabel_9_2 = new JLabel("Number of lines");
		panel_12.add(lblNewLabel_9_2);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		panel_12.add(textField_20);
		
		JLabel lblNewLabel_10_2 = new JLabel("Number of cars per line");
		panel_12.add(lblNewLabel_10_2);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		panel_12.add(textField_21);
		
		JLabel lblNewLabel_19 = new JLabel("Tail Station");
		panel_12.add(lblNewLabel_19);
		
		JComboBox comboBox_7 = new JComboBox();
		panel_12.add(comboBox_7);
		
		JLabel lblNewLabel_20 = new JLabel("Head Station");
		panel_12.add(lblNewLabel_20);
		
		JComboBox comboBox_8 = new JComboBox();
		panel_12.add(comboBox_8);
		
		JPanel panel_13 = new JPanel();
		addStation.add(panel_13);
		panel_13.setLayout(new CardLayout(0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_13.add(panel_14, "name_1399693335509700");
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Station 1");
		panel_14.add(lblNewLabel_11_1_1);
		
		JComboBox comboBox_4_1_1 = new JComboBox();
		panel_14.add(comboBox_4_1_1);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("Station 2");
		panel_14.add(lblNewLabel_12_1_1);
		
		JComboBox comboBox_5_1_1 = new JComboBox();
		panel_14.add(comboBox_5_1_1);
		
		JPanel panel_15 = new JPanel();
		panel_13.add(panel_15, "name_1399693385627100");
		
		JLabel lblNewLabel_13_1_1 = new JLabel("Industry Name");
		panel_15.add(lblNewLabel_13_1_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		panel_15.add(textField_22);
		
		JLabel lblNewLabel_14_1_1 = new JLabel("Description");
		panel_15.add(lblNewLabel_14_1_1);
		
		JTextArea textArea_1_1_1 = new JTextArea();
		textArea_1_1_1.setRows(4);
		textArea_1_1_1.setColumns(40);
		panel_15.add(textArea_1_1_1);
		
		JPanel panel_16 = new JPanel();
		addStation.add(panel_16);
		
		JButton AddStationButton = new JButton("Add Station");
		panel_16.add(AddStationButton);
		
		JPanel editStation = new JPanel();
		HomePanel.add(editStation, "name_1310157453290100");
		editStation.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_17 = new JPanel();
		editStation.add(panel_17);
		
		JLabel lblNewLabel_15_2 = new JLabel("Enter Name or Acronym of the Line");
		panel_17.add(lblNewLabel_15_2);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		panel_17.add(textField_23);
		
		JButton btnNewButton_2_2 = new JButton("Search");
		panel_17.add(btnNewButton_2_2);
		
		JPanel panel_18 = new JPanel();
		editStation.add(panel_18);
		panel_18.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_19 = new JPanel();
		panel_18.add(panel_19);
		panel_19.setLayout(new CardLayout(0, 0));
		
		JPanel noFound_2 = new JPanel();
		panel_19.add(noFound_2, "name_1401563056070200");
		
		JLabel lblNewLabel_16_2 = new JLabel("No Coincidence ...");
		noFound_2.add(lblNewLabel_16_2);
		
		JPanel panel_12_1 = new JPanel();
		panel_19.add(panel_12_1, "name_1401563083982800");
		panel_12_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Type of Station");
		panel_12_1.add(lblNewLabel_5_2_1);
		
		JLabel label_12_1 = new JLabel("");
		panel_12_1.add(label_12_1);
		
		JLabel label_1_2_1 = new JLabel("");
		panel_12_1.add(label_1_2_1);
		
		JLabel label_2_2_1 = new JLabel("");
		panel_12_1.add(label_2_2_1);
		
		JLabel label_3_2_1 = new JLabel("");
		panel_12_1.add(label_3_2_1);
		
		JLabel label_4_2_1 = new JLabel("");
		panel_12_1.add(label_4_2_1);
		
		JLabel label_5_2_1 = new JLabel("");
		panel_12_1.add(label_5_2_1);
		
		JLabel label_6_2_1 = new JLabel("");
		panel_12_1.add(label_6_2_1);
		
		JLabel label_7_2_1 = new JLabel("");
		panel_12_1.add(label_7_2_1);
		
		JLabel label_8_2_1 = new JLabel("");
		panel_12_1.add(label_8_2_1);
		
		JLabel label_9_2_1 = new JLabel("");
		panel_12_1.add(label_9_2_1);
		
		JLabel label_10_2_1 = new JLabel("");
		panel_12_1.add(label_10_2_1);
		
		JComboBox comboBox_2_2_1 = new JComboBox(new Object[]{});
		panel_12_1.add(comboBox_2_2_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Station Name");
		panel_12_1.add(lblNewLabel_6_2_1);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		panel_12_1.add(textField_24);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("Station Acronym");
		panel_12_1.add(lblNewLabel_7_2_1);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		panel_12_1.add(textField_25);
		
		JLabel lblNewLabel_8_2_1 = new JLabel("Station Direction");
		panel_12_1.add(lblNewLabel_8_2_1);
		
		JComboBox comboBox_3_2_1 = new JComboBox(new Object[]{});
		panel_12_1.add(comboBox_3_2_1);
		
		JLabel lblNewLabel_9_2_1 = new JLabel("Number of lines");
		panel_12_1.add(lblNewLabel_9_2_1);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		panel_12_1.add(textField_26);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("Number of cars per line");
		panel_12_1.add(lblNewLabel_10_2_1);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		panel_12_1.add(textField_27);
		
		JLabel lblNewLabel_19_1 = new JLabel("Tail Station");
		panel_12_1.add(lblNewLabel_19_1);
		
		JComboBox comboBox_7_1 = new JComboBox();
		panel_12_1.add(comboBox_7_1);
		
		JLabel lblNewLabel_20_1 = new JLabel("Head Station");
		panel_12_1.add(lblNewLabel_20_1);
		
		JComboBox comboBox_8_1 = new JComboBox();
		panel_12_1.add(comboBox_8_1);
		
		JButton btnNewButton_4 = new JButton("Edit Station");
		panel_12_1.add(btnNewButton_4);
		
		JPanel panel_20 = new JPanel();
		panel_18.add(panel_20);
		panel_20.setLayout(new CardLayout(0, 0));
		
		JPanel panel_14_1 = new JPanel();
		panel_20.add(panel_14_1, "name_1401732706280500");
		
		JLabel lblNewLabel_11_1_1_1 = new JLabel("Station 1");
		panel_14_1.add(lblNewLabel_11_1_1_1);
		
		JComboBox comboBox_4_1_1_1 = new JComboBox();
		panel_14_1.add(comboBox_4_1_1_1);
		
		JLabel lblNewLabel_12_1_1_1 = new JLabel("Station 2");
		panel_14_1.add(lblNewLabel_12_1_1_1);
		
		JComboBox comboBox_5_1_1_1 = new JComboBox();
		panel_14_1.add(comboBox_5_1_1_1);
		
		JPanel panel_15_1 = new JPanel();
		panel_20.add(panel_15_1, "name_1401732752297000");
		
		JLabel lblNewLabel_13_1_1_1 = new JLabel("Industry Name");
		panel_15_1.add(lblNewLabel_13_1_1_1);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		panel_15_1.add(textField_28);
		
		JLabel lblNewLabel_14_1_1_1 = new JLabel("Description");
		panel_15_1.add(lblNewLabel_14_1_1_1);
		
		JTextArea textArea_1_1_1_1 = new JTextArea();
		textArea_1_1_1_1.setRows(4);
		textArea_1_1_1_1.setColumns(40);
		panel_15_1.add(textArea_1_1_1_1);
		
		JPanel deleteStation = new JPanel();
		HomePanel.add(deleteStation, "name_1310157463020500");
		GridBagLayout gbl_deleteStation = new GridBagLayout();
		gbl_deleteStation.columnWidths = new int[]{586, 0};
		gbl_deleteStation.rowHeights = new int[] {100, 260, 0, 30};
		gbl_deleteStation.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_deleteStation.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		deleteStation.setLayout(gbl_deleteStation);
		
		JPanel Search = new JPanel();
		GridBagConstraints gbc_Search = new GridBagConstraints();
		gbc_Search.fill = GridBagConstraints.BOTH;
		gbc_Search.insets = new Insets(0, 0, 5, 0);
		gbc_Search.gridx = 0;
		gbc_Search.gridy = 0;
		deleteStation.add(Search, gbc_Search);
		
		JLabel lblNewLabel_15_1_1 = new JLabel("Enter Name or Acronym of the Station to DELETE");
		Search.add(lblNewLabel_15_1_1);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		Search.add(textField_29);
		
		JButton btnNewButton_2_1_1 = new JButton("Search");
		Search.add(btnNewButton_2_1_1);
		
		JPanel Found = new JPanel();
		GridBagConstraints gbc_Found = new GridBagConstraints();
		gbc_Found.insets = new Insets(0, 0, 5, 0);
		gbc_Found.fill = GridBagConstraints.BOTH;
		gbc_Found.gridx = 0;
		gbc_Found.gridy = 1;
		deleteStation.add(Found, gbc_Found);
		Found.setLayout(new CardLayout(0, 0));
		
		JPanel Nofound = new JPanel();
		Found.add(Nofound, "name_2111533082968600");
		
		JLabel lblNewLabel_16_1_1 = new JLabel("No Coincidence ...");
		Nofound.add(lblNewLabel_16_1_1);
		
		JPanel Found2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) Found2.getLayout();
		Found.add(Found2, "name_2111533101014200");
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Station Class: ");
		Found2.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_17_1_1 = new JLabel("Station's line:");
		Found2.add(lblNewLabel_17_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Station Acronym: ");
		Found2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Station number of lines: ");
		Found2.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_18_1 = new JLabel("Cars per line: ");
		Found2.add(lblNewLabel_18_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Station Direction:");
		Found2.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_22 = new JLabel("Tail Station");
		Found2.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Head Station");
		Found2.add(lblNewLabel_23);
		
		JButton btnNewButton_3_1_1 = new JButton("DELETE");
		Found2.add(btnNewButton_3_1_1);
		
		JPanel addInventory = new JPanel();
		HomePanel.add(addInventory, "name_1310157472521300");
		GridBagLayout gbl_addInventory = new GridBagLayout();
		gbl_addInventory.columnWidths = new int[] {586, 0};
		gbl_addInventory.rowHeights = new int[] {260, 100, 30};
		gbl_addInventory.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_addInventory.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		addInventory.setLayout(gbl_addInventory);
		
		JPanel panel_21 = new JPanel();
		GridBagConstraints gbc_panel_21 = new GridBagConstraints();
		gbc_panel_21.insets = new Insets(0, 0, 5, 0);
		gbc_panel_21.fill = GridBagConstraints.BOTH;
		gbc_panel_21.gridx = 0;
		gbc_panel_21.gridy = 0;
		addInventory.add(panel_21, gbc_panel_21);
		
		JLabel lblNewLabel_24 = new JLabel("Station's Line");
		panel_21.add(lblNewLabel_24);
		
		JComboBox comboBox_9 = new JComboBox();
		panel_21.add(comboBox_9);
		
		JLabel lblNewLabel_25 = new JLabel("Start Station");
		panel_21.add(lblNewLabel_25);
		
		JComboBox comboBox_10 = new JComboBox();
		panel_21.add(comboBox_10);
		
		JLabel lblNewLabel_26 = new JLabel("End Station");
		panel_21.add(lblNewLabel_26);
		
		JComboBox comboBox_11 = new JComboBox();
		panel_21.add(comboBox_11);
		
		JLabel lblNewLabel_27 = new JLabel("Car type");
		panel_21.add(lblNewLabel_27);
		
		JComboBox comboBox_12 = new JComboBox(CarType);
		panel_21.add(comboBox_12);
		
		JLabel lblNewLabel_28 = new JLabel("Car code");
		panel_21.add(lblNewLabel_28);
		
		textField_30 = new JTextField();
		panel_21.add(textField_30);
		textField_30.setColumns(10);
		
		JLabel lblNewLabel_29 = new JLabel("Car weight");
		panel_21.add(lblNewLabel_29);
		
		textField_31 = new JTextField();
		panel_21.add(textField_31);
		textField_31.setColumns(10);
		
		JPanel panel_22 = new JPanel();
		GridBagConstraints gbc_panel_22 = new GridBagConstraints();
		gbc_panel_22.fill = GridBagConstraints.BOTH;
		gbc_panel_22.gridx = 0;
		gbc_panel_22.gridy = 1;
		addInventory.add(panel_22, gbc_panel_22);
		
		JLabel lblNewLabel_30 = new JLabel("Status of submission:");
		panel_22.add(lblNewLabel_30);
		
		JButton btnNewButton_5 = new JButton("ADD Car");
		panel_22.add(btnNewButton_5);
		
		JPanel editInventory = new JPanel();
		HomePanel.add(editInventory, "name_1310157482302200");
		editInventory.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_23 = new JPanel();
		editInventory.add(panel_23);
		panel_23.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_15_1_1_1 = new JLabel("Enter Code of car to EDIT");
		panel_23.add(lblNewLabel_15_1_1_1);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		panel_23.add(textField_34);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Search");
		panel_23.add(btnNewButton_2_1_1_1);
		
		JPanel panel_24 = new JPanel();
		editInventory.add(panel_24);
		panel_24.setLayout(new CardLayout(0, 0));
		
		JPanel panel_28 = new JPanel();
		panel_24.add(panel_28, "name_2600047835335300");
		panel_28.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_31 = new JLabel("No coincidences...");
		panel_28.add(lblNewLabel_31);
		
		JPanel panel_29 = new JPanel();
		panel_24.add(panel_29, "name_2600047882155200");
		
		JLabel lblNewLabel_24_1 = new JLabel("Station's Line");
		panel_29.add(lblNewLabel_24_1);
		
		JComboBox comboBox_9_1 = new JComboBox();
		panel_29.add(comboBox_9_1);
		
		JLabel lblNewLabel_25_1 = new JLabel("Start Station");
		panel_29.add(lblNewLabel_25_1);
		
		JComboBox comboBox_10_1 = new JComboBox();
		panel_29.add(comboBox_10_1);
		
		JLabel lblNewLabel_26_1 = new JLabel("End Station");
		panel_29.add(lblNewLabel_26_1);
		
		JComboBox comboBox_11_1 = new JComboBox();
		panel_29.add(comboBox_11_1);
		
		JLabel lblNewLabel_27_1 = new JLabel("Car type");
		panel_29.add(lblNewLabel_27_1);
		
		JComboBox comboBox_12_1 = new JComboBox(new Object[]{});
		panel_29.add(comboBox_12_1);
		
		JLabel lblNewLabel_28_1 = new JLabel("Car code");
		panel_29.add(lblNewLabel_28_1);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		panel_29.add(textField_32);
		
		JLabel lblNewLabel_29_1 = new JLabel("Car weight");
		panel_29.add(lblNewLabel_29_1);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		panel_29.add(textField_33);
		
		JLabel lblNewLabel_30_1 = new JLabel("Status of EDITION:");
		panel_29.add(lblNewLabel_30_1);
		
		JButton btnNewButton_5_1 = new JButton("EDIT Car");
		panel_29.add(btnNewButton_5_1);
		
		JPanel removeInventory = new JPanel();
		HomePanel.add(removeInventory, "name_1310157493252200");
		GridBagLayout gbl_removeInventory = new GridBagLayout();
		gbl_removeInventory.columnWidths = new int[]{586, 0};
		gbl_removeInventory.rowHeights = new int[] {100, 260, 0};
		gbl_removeInventory.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_removeInventory.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		removeInventory.setLayout(gbl_removeInventory);
		
		JPanel panel_25 = new JPanel();
		GridBagConstraints gbc_panel_25 = new GridBagConstraints();
		gbc_panel_25.fill = GridBagConstraints.BOTH;
		gbc_panel_25.insets = new Insets(0, 0, 5, 0);
		gbc_panel_25.gridx = 0;
		gbc_panel_25.gridy = 0;
		removeInventory.add(panel_25, gbc_panel_25);
		
		JLabel lblNewLabel_15_1_1_1_1 = new JLabel("Enter Code of car to DELETE");
		panel_25.add(lblNewLabel_15_1_1_1_1);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		panel_25.add(textField_35);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("Search");
		panel_25.add(btnNewButton_2_1_1_1_1);
		
		JPanel panel_26 = new JPanel();
		GridBagConstraints gbc_panel_26 = new GridBagConstraints();
		gbc_panel_26.fill = GridBagConstraints.BOTH;
		gbc_panel_26.gridx = 0;
		gbc_panel_26.gridy = 1;
		removeInventory.add(panel_26, gbc_panel_26);
		panel_26.setLayout(new CardLayout(0, 0));
		
		JPanel panel_31 = new JPanel();
		panel_26.add(panel_31, "name_2171447686946600");
		
		JLabel lblNewLabel_31_1 = new JLabel("No coincidences...");
		panel_31.add(lblNewLabel_31_1);
		
		JPanel panel_32 = new JPanel();
		panel_26.add(panel_32, "name_2171447704344899");
		
		JLabel lblNewLabel_24_1_1 = new JLabel("Station's Line");
		panel_32.add(lblNewLabel_24_1_1);
		
		JLabel lblNewLabel_25_1_1 = new JLabel("Start Station");
		panel_32.add(lblNewLabel_25_1_1);
		
		JLabel lblNewLabel_26_1_1 = new JLabel("End Station");
		panel_32.add(lblNewLabel_26_1_1);
		
		JLabel lblNewLabel_27_1_1 = new JLabel("Car type");
		panel_32.add(lblNewLabel_27_1_1);
		
		JLabel lblNewLabel_28_1_1 = new JLabel("Car code");
		panel_32.add(lblNewLabel_28_1_1);
		
		JLabel lblNewLabel_29_1_1 = new JLabel("Car weight");
		panel_32.add(lblNewLabel_29_1_1);
		
		JLabel lblNewLabel_30_1_1 = new JLabel("Status of DELETION:");
		panel_32.add(lblNewLabel_30_1_1);
		
		JButton btnNewButton_5_1_1 = new JButton("DELETE Car");
		panel_32.add(btnNewButton_5_1_1);
		
		JPanel printG = new JPanel();
		HomePanel.add(printG, "name_1310157503782100");
		
		JPanel printL = new JPanel();
		HomePanel.add(printL, "name_1310157514618300");
		GridBagLayout gbl_printL = new GridBagLayout();
		gbl_printL.columnWidths = new int[]{572, 0};
		gbl_printL.rowHeights = new int[]{70, 281, 0, 0};
		gbl_printL.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_printL.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		printL.setLayout(gbl_printL);
		
		JPanel panel_30_1 = new JPanel();
		GridBagConstraints gbc_panel_30_1 = new GridBagConstraints();
		gbc_panel_30_1.fill = GridBagConstraints.BOTH;
		gbc_panel_30_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_30_1.gridx = 0;
		gbc_panel_30_1.gridy = 0;
		printL.add(panel_30_1, gbc_panel_30_1);
		
		JLabel lblNewLabel_32_1 = new JLabel("Station's Line");
		panel_30_1.add(lblNewLabel_32_1);
		
		JComboBox comboBox_13_1 = new JComboBox();
		panel_30_1.add(comboBox_13_1);
		
		JButton btnNewButton_6_1 = new JButton("Line Report");
		panel_30_1.add(btnNewButton_6_1);
		
		JButton btnNewButton_7_1 = new JButton("Excel Report");
		panel_30_1.add(btnNewButton_7_1);
		
		ScrollPane scrollPane_1 = new ScrollPane();
		table_1 = new JTable(modelStation);
		scrollPane_1.add(table_1);
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 1;
		printL.add(scrollPane_1, gbc_scrollPane_1);
		
		
		
		JPanel printS = new JPanel();
		HomePanel.add(printS, "name_1310157524865700");
		GridBagLayout gbl_printS = new GridBagLayout();
		gbl_printS.columnWidths = new int[]{572, 0};
		gbl_printS.rowHeights = new int[]{72, 283, 0};
		gbl_printS.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_printS.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		printS.setLayout(gbl_printS);
		
		JPanel panel_30 = new JPanel();
		GridBagConstraints gbc_panel_30 = new GridBagConstraints();
		gbc_panel_30.fill = GridBagConstraints.BOTH;
		gbc_panel_30.insets = new Insets(0, 0, 5, 0);
		gbc_panel_30.gridx = 0;
		gbc_panel_30.gridy = 0;
		printS.add(panel_30, gbc_panel_30);
		
		JLabel lblNewLabel_32 = new JLabel("Station's Line");
		panel_30.add(lblNewLabel_32);
		
		JComboBox comboBox_13 = new JComboBox();
		panel_30.add(comboBox_13);
		
		JLabel lblNewLabel_33 = new JLabel("Station Name");
		panel_30.add(lblNewLabel_33);
		
		JComboBox comboBox_14 = new JComboBox();
		panel_30.add(comboBox_14);
		
		JButton btnNewButton_6 = new JButton("Station Report");
		panel_30.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Excel Report");
		panel_30.add(btnNewButton_7);
		ScrollPane scrollPane = new ScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		printS.add(scrollPane, gbc_scrollPane);
		table = new JTable(model);
		table.setFillsViewportHeight(true);
		scrollPane.add(table);
		
		
		
		
		
		
		

		
		JPanel loadInventory = new JPanel();
		HomePanel.add(loadInventory, "name_1310157535558300");
		
		JPanel instruction = new JPanel();
		HomePanel.add(instruction, "name_1310157546043900");
		
		JPanel about = new JPanel();
		HomePanel.add(about, "name_1310157555789500");
		
		JPanel goHome = new JPanel();
		goHome.setVisible(true);
		goHome.setBackground(Color.blue);
		HomePanel.add(goHome, "name_1310157565987200");
		
		JLabel lblNewLabel_21 = new JLabel("Senior Profect APP Yard Organization");
		lblNewLabel_21.setFont(new Font("Verdana", Font.PLAIN, 28));
		goHome.add(lblNewLabel_21);
		
		JPanel nextStrStation = new JPanel();
		HomePanel.add(nextStrStation, "name_1315155886210900");
		nextStrStation.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		nextStrStation.add(panel);
		
		JLabel lblNewLabel_5 = new JLabel("Type of Station");
		
		JComboBox comboBox_2 = new JComboBox(ClassType);
		
		JLabel lblNewLabel_6 = new JLabel("Station Name");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Station Acronym");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Station Direction");
		
		JComboBox comboBox_3 = new JComboBox(Direction);
		
		JLabel lblNewLabel_9 = new JLabel("Number of lines");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Number of cars per line");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel.add(lblNewLabel_5);
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("");
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("");
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("");
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("");
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("");
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("");
		panel.add(label_10);
		panel.add(comboBox_2);
		panel.add(lblNewLabel_6);
		panel.add(textField_3);
		panel.add(lblNewLabel_7);
		panel.add(textField_4);
		panel.add(lblNewLabel_8);
		panel.add(comboBox_3);
		panel.add(lblNewLabel_9);
		panel.add(textField_5);
		panel.add(lblNewLabel_10);
		panel.add(textField_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setVisible(false);
		nextStrStation.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel interyard = new JPanel();
		interyard.setVisible(false);
		panel_1.add(interyard, "name_1317477883456400");
		
		JLabel lblNewLabel_11 = new JLabel("Station 1");
		interyard.add(lblNewLabel_11);
		
		JComboBox comboBox_4 = new JComboBox();
		interyard.add(comboBox_4);
		
		JLabel lblNewLabel_12 = new JLabel("Station 2");
		interyard.add(lblNewLabel_12);
		
		JComboBox comboBox_5 = new JComboBox();
		interyard.add(comboBox_5);
		
		JPanel industryY = new JPanel();
		industryY.setVisible(false);
		panel_1.add(industryY, "name_1317477895157600");
		
		JLabel lblNewLabel_13 = new JLabel("Industry Name");
		industryY.add(lblNewLabel_13);
		
		textField_7 = new JTextField();
		industryY.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Description");
		industryY.add(lblNewLabel_14);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setColumns(40);
		textArea_1.setRows(4);
		industryY.add(textArea_1);
		
		//action lisener optional panels by class of yard
		
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
		        String classTypeSelected = (String)cb.getSelectedItem();
		        System.out.print(classTypeSelected);
		        if (classTypeSelected == "InterchangeYard") {
		        	panel_1.setVisible(true);
		        	industryY.setVisible(false);
					interyard.setVisible(true);
				}else {
					if (classTypeSelected == "IndustrysupportYard") {
						panel_1.setVisible(true);
						industryY.setVisible(true);
						interyard.setVisible(false);
					}else {
						panel_1.setVisible(false);
						interyard.setVisible(false);
						industryY.setVisible(false);
					}
				}
			}
		});
		
		JPanel panel_2 = new JPanel();
		nextStrStation.add(panel_2);
		
		JButton btnNewButton_1 = new JButton("Next");
		panel_2.add(btnNewButton_1);
		
		JPanel AddEndStation = new JPanel();
		HomePanel.add(AddEndStation, "name_1389697286996200");
		AddEndStation.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		AddEndStation.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_5_1 = new JLabel("Type of Station");
		panel_4.add(lblNewLabel_5_1);
		
		JLabel label_11 = new JLabel("");
		panel_4.add(label_11);
		
		JLabel label_1_1 = new JLabel("");
		panel_4.add(label_1_1);
		
		JLabel label_2_1 = new JLabel("");
		panel_4.add(label_2_1);
		
		JLabel label_3_1 = new JLabel("");
		panel_4.add(label_3_1);
		
		JLabel label_4_1 = new JLabel("");
		panel_4.add(label_4_1);
		
		JLabel label_5_1 = new JLabel("");
		panel_4.add(label_5_1);
		
		JLabel label_6_1 = new JLabel("");
		panel_4.add(label_6_1);
		
		JLabel label_7_1 = new JLabel("");
		panel_4.add(label_7_1);
		
		JLabel label_8_1 = new JLabel("");
		panel_4.add(label_8_1);
		
		JLabel label_9_1 = new JLabel("");
		panel_4.add(label_9_1);
		
		JLabel label_10_1 = new JLabel("");
		panel_4.add(label_10_1);
		
		JComboBox comboBox_2_1 = new JComboBox(ClassType);
		panel_4.add(comboBox_2_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Station Name");
		panel_4.add(lblNewLabel_6_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel_4.add(textField_8);
		
		JLabel lblNewLabel_7_1 = new JLabel("Station Acronym");
		panel_4.add(lblNewLabel_7_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel_4.add(textField_9);
		
		JLabel lblNewLabel_8_1 = new JLabel("Station Direction");
		panel_4.add(lblNewLabel_8_1);
		
		JComboBox comboBox_3_1 = new JComboBox(Direction);
		panel_4.add(comboBox_3_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Number of lines");
		panel_4.add(lblNewLabel_9_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		panel_4.add(textField_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Number of cars per line");
		panel_4.add(lblNewLabel_10_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		panel_4.add(textField_11);
		
		JPanel panel_5 = new JPanel();
		AddEndStation.add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7, "name_1389881066264800");
		
		JLabel lblNewLabel_11_1 = new JLabel("Station 1");
		panel_7.add(lblNewLabel_11_1);
		
		JComboBox comboBox_4_1 = new JComboBox();
		panel_7.add(comboBox_4_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("Station 2");
		panel_7.add(lblNewLabel_12_1);
		
		JComboBox comboBox_5_1 = new JComboBox();
		panel_7.add(comboBox_5_1);
		
		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8, "name_1389881087703200");
		
		JLabel lblNewLabel_13_1 = new JLabel("Industry Name");
		panel_8.add(lblNewLabel_13_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		panel_8.add(textField_12);
		
		JLabel lblNewLabel_14_1 = new JLabel("Description");
		panel_8.add(lblNewLabel_14_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setRows(4);
		textArea_1_1.setColumns(40);
		panel_8.add(textArea_1_1);
		
		JPanel panel_6 = new JPanel();
		AddEndStation.add(panel_6);
		
		JButton AddLineButton = new JButton("Add Line");
		AddLineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_6.add(AddLineButton);
		JMenuBar menuBar = new JMenuBar();
		MainPanel.add(menuBar, BorderLayout.NORTH);
		
		JMenu Lines = new JMenu("Lines");
		menuBar.add(Lines);
		
		JMenuItem AddLine = new JMenuItem("Add Line");
		AddLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(true);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Lines.add(AddLine);
		
		JMenuItem EditLine = new JMenuItem("Edit Line");
		EditLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(true);
				addLine.setVisible(false);
				editLine.setVisible(true);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Lines.add(EditLine);
		
		JMenuItem DeleteLine = new JMenuItem("Delete Line");
		DeleteLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(true);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Lines.add(DeleteLine);
		
		JMenu Stations = new JMenu("Stations");
		menuBar.add(Stations);
		
		JMenuItem AddStation = new JMenuItem("Add Station");
		AddStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(true);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
				panel_13.setVisible(false);
			}
		});
		Stations.add(AddStation);
		
		JMenuItem EditStation = new JMenuItem("Edit Station");
		EditStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(true);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
				panel_20.setVisible(false);
			}
		});
		Stations.add(EditStation);
		
		JMenuItem DeleteStation = new JMenuItem("Delete Station");
		DeleteStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(true);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Stations.add(DeleteStation);
		
		JMenu Inventory = new JMenu("Inventory");
		menuBar.add(Inventory);
		
		JMenuItem AddInventory = new JMenuItem("Add");
		AddInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(true);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Inventory.add(AddInventory);
		
		JMenuItem EditInventory = new JMenuItem("Edit");
		EditInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(true);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Inventory.add(EditInventory);
		
		JMenuItem RemoveInventory = new JMenuItem("Remove");
		RemoveInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(true);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Inventory.add(RemoveInventory);
		
		JMenu Edit = new JMenu("Edit");
		menuBar.add(Edit);
		
		JMenuItem ReportGprint = new JMenuItem("Print General Report");
		ReportGprint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(true);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Edit.add(ReportGprint);
		
		JMenuItem ReportLprint = new JMenuItem("Print Line Report");
		ReportLprint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(true);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Edit.add(ReportLprint);
		
		JMenuItem ReportSprint = new JMenuItem("Print Station Report");
		ReportSprint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(true);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Edit.add(ReportSprint);
		
		JMenuItem LoadInventory = new JMenuItem("Load Inventory");
		LoadInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(true);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Edit.add(LoadInventory);
		
		JMenu Help = new JMenu("Help");
		menuBar.add(Help);
		
		JMenuItem Instructions = new JMenuItem("Intrusctions");
		Instructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(true);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Help.add(Instructions);
		
		JMenuItem About = new JMenuItem("About");
		About.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				loadInventory.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(true);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
			}
		});
		Help.add(About);
		
		JMenu Home = new JMenu("HOME");
		menuBar.add(Home);
		
		JMenuItem GoHome = new JMenuItem("Go home");
		GoHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(true);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(true);
				nextStrStation.setVisible(false);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Home.add(GoHome);
				HomePanel.setVisible(true);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(true);
				interyard.setVisible(false);
				industryY.setVisible(false);
				
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePanel.setVisible(true);
				addLine.setVisible(false);
				editLine.setVisible(false);
				deleteLine.setVisible(false);
				addStation.setVisible(false);
				editStation.setVisible(false);
				deleteStation.setVisible(false);
				addInventory.setVisible(false);
				editInventory.setVisible(false);
				removeInventory.setVisible(false);
				printG.setVisible(false);
				printL.setVisible(false);
				printS.setVisible(false);
				instruction.setVisible(false);
				about.setVisible(false);
				goHome.setVisible(false);
				nextStrStation.setVisible(false);
				panel_7.setVisible(false);
				panel_8.setVisible(false);
				interyard.setVisible(false);
				industryY.setVisible(false);
				
				AddEndStation.setVisible(true);
			}
		});
		comboBox_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
		        String classTypeSelected = (String)cb.getSelectedItem();
		        System.out.print(classTypeSelected);
		        if (classTypeSelected == "InterchangeYard") {
					panel_5.setVisible(true);
		        	panel_7.setVisible(true);
					panel_8.setVisible(false);
				}else {
					if (classTypeSelected == "IndustrysupportYard") {
						panel_5.setVisible(true);
			        	panel_7.setVisible(false);
						panel_8.setVisible(true);
						
					}else {
						panel_5.setVisible(false);
			        	panel_7.setVisible(false);
						panel_8.setVisible(false);
					}
				}
			}
		});
		comboBox_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
		        String classTypeSelected = (String)cb.getSelectedItem();
		        System.out.print(classTypeSelected);
		        if (classTypeSelected == "InterchangeYard") {
					panel_13.setVisible(true);
		        	panel_14.setVisible(true);
					panel_15.setVisible(false);
				}else {
					if (classTypeSelected == "IndustrysupportYard") {
						panel_13.setVisible(true);
			        	panel_14.setVisible(false);
						panel_15.setVisible(true);
						
					}else {
						panel_13.setVisible(false);
			        	panel_14.setVisible(false);
						panel_15.setVisible(false);
					}
				}
			}
		});
		Home.add(GoHome);
		HomePanel.setVisible(true);
		addLine.setVisible(false);
		editLine.setVisible(false);
		deleteLine.setVisible(false);
		addStation.setVisible(false);
		editStation.setVisible(false);
		deleteStation.setVisible(false);
		addInventory.setVisible(false);
		editInventory.setVisible(false);
		removeInventory.setVisible(false);
		printG.setVisible(false);
		printL.setVisible(false);
		printS.setVisible(false);
		instruction.setVisible(false);
		about.setVisible(false);
		goHome.setVisible(true);
		nextStrStation.setVisible(false);
		interyard.setVisible(false);
		industryY.setVisible(false);
		panel_1.setVisible(false);
		panel_5.setVisible(false);
    	panel_7.setVisible(false);
		panel_8.setVisible(false);
	}

}
