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
import java.util.Iterator;
import java.util.List;
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
import java.awt.TextArea;
import javax.swing.JTextPane;

public class MainWindow extends GlobalVars {
	//railSystem main object
	RailSystem MyRailRoad = new RailSystem();
	// components J--------------------------------
	
	JPanel HomePanel;
	JPanel addLine;
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_2;
	JLabel lblNewLabel_3 ;
	JLabel lblNewLabel_4;
	JTextArea textArea;
	JButton btnNewButton;
	JPanel editLine;
	JPanel panel_3;
	JLabel lblNewLabel_15;
	JButton btnNewButton_2;
	JPanel panel_9;
	JPanel noFound;
	JLabel lblNewLabel_16;
	JPanel found;
	JLabel lblNewLabel_17;
	JLabel lblNewLabel_1_1;
	JLabel lblNewLabel_2_1;
	JLabel lblNewLabel_3_1;
	JComboBox comboBox_6;
	JLabel lblNewLabel_4_1;
	JComboBox comboBox_1_1;
	JTextArea textArea_2;
	JButton btnNewButton_3;
	JPanel deleteLine;
	JPanel panel_10;
	JLabel lblNewLabel_15_1;
	JButton btnNewButton_2_1;
	JPanel panel_11;
	JPanel noFound_1;
	JLabel lblNewLabel_16_1;
	JPanel found_1;
	JLabel lblNewLabel_17_1;
	JLabel lblNewLabel_1_1_1;
	JLabel lblNewLabel_2_1_1;
	JLabel lblNewLabel_3_1_1;
	JLabel lblNewLabel_4_1_1;
	JButton btnNewButton_3_1;
	JTextArea lblNewLabel_18;
	JPanel addStation;
	JPanel panel_12;
	JLabel lblNewLabel_19;
	JComboBox comboBox_7;
	JLabel lblNewLabel_5_2;
	JLabel label_12;
	JLabel label_1_2;
	JLabel label_2_2;
	JLabel label_3_2;
	JLabel label_4_2;
	JLabel label_5_2;
	JLabel label_6_2;
	JLabel label_7_2;
	JLabel label_8_2;
	JLabel label_9_2;
	JLabel label_10_2;
	JComboBox comboBox_2_2;
	JLabel lblNewLabel_6_2;
	JLabel lblNewLabel_7_2;
	JLabel lblNewLabel_8_2;
	JComboBox comboBox_3_2;
	JLabel lblNewLabel_9_2;
	JLabel lblNewLabel_10_2;
	JLabel lblNewLabel_20;
	JComboBox comboBox_8;
	JPanel panel_13;
	JPanel panel_14;
	JLabel lblNewLabel_12_1_1;
	JComboBox comboBox_5_1_1;
	JLabel lblNewLabel_13_1_1;
	JLabel lblNewLabel_14_1_1;
	JTextArea textArea_1_1_1;
	JPanel panel_16;
	JButton AddStationButton;
	JPanel editStation;
	JPanel panel_17;
	JLabel lblNewLabel_15_2;
	JButton btnNewButton_2_2;
	JPanel panel_18;
	JPanel panel_19;
	JPanel noFound_2;
	JLabel lblNewLabel_16_2;
	JPanel panel_12_1;
	JLabel lblNewLabel_5_2_1;
	JLabel label_12_1;
	JLabel label_1_2_1;
	JLabel label_2_2_1;
	JLabel label_3_2_1;
	JLabel label_4_2_1;
	JLabel label_5_2_1;
	JLabel label_6_2_1;
	JLabel label_7_2_1;
	JLabel label_8_2_1;
	JLabel label_9_2_1;
	JLabel label_10_2_1;
	JComboBox comboBox_2_2_1;
	JLabel lblNewLabel_6_2_1;
	JLabel lblNewLabel_7_2_1;
	JLabel lblNewLabel_8_2_1;
	JComboBox comboBox_3_2_1;
	JLabel lblNewLabel_9_2_1;
	JLabel lblNewLabel_10_2_1;
	JLabel lblNewLabel_19_1;
	JComboBox comboBox_7_1;
	JButton btnNewButton_4;
	JPanel panel_20;
	JPanel panel_14_1;
	JLabel lblNewLabel_12_1_1_1;
	JComboBox comboBox_5_1_1_1;
	JPanel panel_15_1;
	JLabel lblNewLabel_13_1_1_1;
	JLabel lblNewLabel_14_1_1_1;
	JTextArea textArea_1_1_1_1;
	JPanel deleteStation;
	JPanel Search;
	JLabel lblNewLabel_15_1_1;
	JButton btnNewButton_2_1_1;
	JPanel Found;
	JPanel Nofound;
	JLabel lblNewLabel_16_1_1;
	JPanel Found2;
	JLabel lblNewLabel_3_1_1_1;
	JLabel lblNewLabel_17_1_1;
	JLabel lblNewLabel_1_1_1_1;
	JLabel lblNewLabel_2_1_1_1;
	JLabel lblNewLabel_18_1;
	JLabel lblNewLabel_4_1_1_1;
	JLabel lblNewLabel_22;
	JButton btnNewButton_3_1_1;
	JPanel addInventory;
	JPanel panel_21;
	JLabel lblNewLabel_24;
	JComboBox comboBox_9;
	JLabel lblNewLabel_25;
	JComboBox comboBox_10;
	JLabel lblNewLabel_26;
	JComboBox comboBox_11;
	JLabel lblNewLabel_27;
	JComboBox comboBox_12;
	JLabel lblNewLabel_28;
	JLabel lblNewLabel_29;
	JPanel panel_22;
	JLabel lblNewLabel_30;
	JButton btnNewButton_5;
	JPanel editInventory;
	JPanel panel_23;
	JLabel lblNewLabel_15_1_1_1;
	JButton btnNewButton_2_1_1_1;
	JPanel panel_24;
	JPanel panel_28;
	JLabel lblNewLabel_31;
	JPanel panel_29;
	JLabel lblNewLabel_24_1;
	JComboBox comboBox_9_1;
	JLabel lblNewLabel_25_1;
	JComboBox comboBox_10_1;
	JLabel lblNewLabel_26_1;
	JComboBox comboBox_11_1;
	JLabel lblNewLabel_27_1;
	JComboBox comboBox_12_1;
	JLabel lblNewLabel_28_1;
	JLabel lblNewLabel_29_1;
	JLabel lblNewLabel_30_1;
	JButton btnNewButton_5_1;
	JPanel removeInventory;
	JPanel panel_25;
	JLabel lblNewLabel_15_1_1_1_1;
	JButton btnNewButton_2_1_1_1_1;
	JPanel panel_26;
	JPanel panel_31;
	JLabel lblNewLabel_31_1;
	JPanel panel_32;
	JLabel lblNewLabel_24_1_1;
	JLabel lblNewLabel_25_1_1;
	JLabel lblNewLabel_26_1_1;
	JLabel lblNewLabel_27_1_1;
	JLabel lblNewLabel_28_1_1;
	JLabel lblNewLabel_29_1_1;
	JLabel lblNewLabel_30_1_1;
	JButton btnNewButton_5_1_1;
	JPanel printG;
	JPanel panel_27;
	JLabel lblNewLabel_32_1_1;
	JButton btnNewButton_6_1_1;
	JButton btnNewButton_7_1_1;
	JPanel printL;
	JPanel panel_30_1;
	JLabel lblNewLabel_32_1;
	JComboBox comboBox_13_1;
	JButton btnNewButton_6_1;
	JButton btnNewButton_7_1;
	ScrollPane scrollPane_1;
	JPanel printS;
	JPanel panel_30;
	JLabel lblNewLabel_32;
	JComboBox comboBox_13;
	JLabel lblNewLabel_33;
	JComboBox comboBox_14;
	JButton btnNewButton_6;
	JButton btnNewButton_7;
	ScrollPane scrollPane;
	JPanel loadInventory;
	JPanel instruction;
	ScrollPane scrollPane_3;
	JTextPane textPane;
	JPanel about;
	ScrollPane scrollPane_4;
	JTextPane textPane_1;
	JPanel goHome;
	JLabel lblNewLabel_21;
	JPanel nextStrStation;
	JPanel panel;
	JLabel lblNewLabel_5;
	JComboBox comboBox_2;
	JLabel lblNewLabel_6;
	JLabel lblNewLabel_7;
	JLabel lblNewLabel_8;
	JComboBox comboBox_3;
	JLabel lblNewLabel_9;
	JLabel lblNewLabel_10;
	JLabel label;
	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	JLabel label_4;
	JLabel label_5;
	JLabel label_6;
	JLabel label_7;
	JLabel label_8;
	JLabel label_9;
	JLabel label_10;
	JPanel panel_1;
	JPanel interyard;
	JLabel lblNewLabel_12;
	JComboBox comboBox_5;
	JPanel industryY;
	JLabel lblNewLabel_13;
	JLabel lblNewLabel_14;
	JTextArea textArea_1;
	JPanel panel_2;
	JButton btnNewButton_1;
	JPanel AddEndStation;
	JPanel panel_4;
	JLabel lblNewLabel_5_1;
	JLabel label_11;
	JLabel label_1_1;
	JLabel label_2_1;
	JLabel label_3_1;
	JLabel label_4_1;
	JLabel label_5_1;
	JLabel label_6_1;
	JLabel label_7_1;
	JLabel label_8_1;
	JLabel label_9_1;
	JLabel label_10_1;
	JComboBox comboBox_2_1;
	JLabel lblNewLabel_6_1;
	JLabel lblNewLabel_7_1;
	JLabel lblNewLabel_8_1;
	JComboBox comboBox_3_1;
	JLabel lblNewLabel_9_1;
	JLabel lblNewLabel_10_1;
	JPanel panel_5;
	JPanel panel_7;
	JLabel lblNewLabel_12_1;
	JComboBox comboBox_5_1;
	JPanel panel_8;
	JLabel lblNewLabel_13_1;
	JLabel lblNewLabel_14_1;
	JTextArea textArea_1_1;
	JPanel panel_6;
	JButton AddLineButton;
	JMenuBar menuBar;
	JMenu Lines;
	JMenuItem AddLine;
	JMenuItem EditLine;
	JMenuItem DeleteLine;
	JMenu Stations;
	JMenuItem AddStation;
	JMenuItem EditStation;
	JMenuItem DeleteStation;
	JMenu Inventory;
	JMenuItem AddInventory;
	JMenuItem EditInventory;
	JMenuItem RemoveInventory;
	JMenu Edit;
	JMenuItem ReportGprint;
	JMenuItem ReportLprint;
	JMenuItem ReportSprint;
	JMenuItem LoadInventory;
	JMenu Help;
	JMenuItem Instructions;
	JMenuItem About;
	JMenu Home;
	JMenuItem GoHome;
	
	
	
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
	String[] columnNameGeneral = {"Line name","Line Acro","Number of station","Number of cars"};
	String[][] dataGeneral = {{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"},
			{"Noting","Noting","Noting","Noting"}};
	DefaultTableModel modelGeneral = new DefaultTableModel(dataGeneral,columnNameGeneral);
	String Instruction  = "7.7 Writing Instructions\r\n"
			+ "One of the most common and important uses of technical writing is to provide instructions, those step-by-step explanations of how to assemble, operate, repair, or do routine maintenance on something. Although they may seems intuitive and simple to write, instructions are some of the worst-written documents you can find. Most of us have probably had many infuriating experiences with badly written instructions. This chapter will show you what professionals consider the best techniques in providing instructions.\r\n"
			+ "\r\n"
			+ "An effective set of instruction requires the following:\r\n"
			+ "\r\n"
			+ "Clear, precise, and simple writing\r\n"
			+ "A thorough understanding of the procedure in all its technical detail\r\n"
			+ "The ability to put yourself in the place of the reader, the person trying to use your instructions\r\n"
			+ "The ability to visualize the procedure in detail and to capture that awareness on paper\r\n"
			+ "Willingness to test your instructions on the kind of person you wrote them for.\r\n"
			+ "Preliminary Steps\r\n"
			+ "At the beginning of a project to write a set of instructions, it is important to determine the structure or characteristics of the particular procedure you are going to write about. Here are some steps to follow:\r\n"
			+ "\r\n"
			+ "1. Do a careful audience and task analysis\r\n"
			+ "Early in the process, define the audience and situation of your instructions. Remember that defining an audience means defining the level of familiarity your readers have with the topic.\r\n"
			+ "\r\n"
			+ "2. Determine the number of tasks\r\n"
			+ "How many tasks are there in the procedure you are writing about? Let�s use the term procedure to refer to the whole set of activities your instructions are intended to discuss. A task is a semi-independent group of actions within the procedure: for example, setting the clock on a microwave oven is one task in the big overall procedure of operating a microwave oven.\r\n"
			+ "\r\n"
			+ "A simple procedure like changing the oil in a car contains only one task; there are no semi-independent groupings of activities. A more complex procedure like using a microwave oven contains several semi-independent tasks:  setting the clock; setting the power level; using the timer; cleaning and maintaining the microwave, among others.\r\n"
			+ "\r\n"
			+ "Some instructions have only a single task, but have many steps within that single task. For example, imagine a set of instructions for assembling a kids� swing set. In my own experience, there were more than a 130 steps! That can be a bit daunting. A good approach is to group similar and related steps into phases, and start renumbering the steps at each new phase. A phase then is a group of similar steps within a single-task procedure. In the swing-set example, setting up the frame would be a phase; anchoring the thing in the ground would be another; assembling the box swing would be still another.\r\n"
			+ "\r\n"
			+ "3.  Determine the best approach to the step-by-step discussion\r\n"
			+ "For most instructions, you can focus on tasks, or you can focus on tools (or features of tools).  In a task approach (also known as task orientation) to instructions on using a phone-answering service, you�d have these sections:\r\n"
			+ "\r\n"
			+ "Recording your greeting\r\n"
			+ "Playing back your messages\r\n"
			+ "Saving your messages\r\n"
			+ "Forwarding your messages\r\n"
			+ "Deleting your messages, and so on\r\n"
			+ "These are tasks�the typical things we�d want to do with the machine.\r\n"
			+ "\r\n"
			+ "On the other hand, in a tools approach to instructions on using a photocopier, there likely would be sections on how to use specific features:\r\n"
			+ "\r\n"
			+ "Copy button\r\n"
			+ "Cancel button\r\n"
			+ "Enlarge/reduce button\r\n"
			+ "Collate/staple button\r\n"
			+ "Copy-size button, and so on\r\n"
			+ "If you designed a set of instructions on this plan, you�d write steps for using each button or feature of the photocopier. Instructions using this tools approach are hard to make work. Sometimes, the name of the button doesn�t quite match the task it is associated with; sometimes you have to use more than just the one button to accomplish the task. Still, there can be times when the tools/feature approach may be preferable.\r\n"
			+ "\r\n"
			+ "4.  Design groupings of tasks\r\n"
			+ "Listing tasks may not be all that you need to do. There may be so many tasks that you must group them so that readers can find individual ones more easily. For example, the following are common task groupings in instructions:\r\n"
			+ "\r\n"
			+ "Unpacking and setup tasks\r\n"
			+ "Installing and customizing tasks\r\n"
			+ "Basic operating tasks\r\n"
			+ "Routine maintenance tasks\r\n"
			+ "Troubleshooting tasks.Introduction:  plan the introduction to your instructions carefully. It might include any of the following (but not necessarily in this order):\r\n"
			+ "\r\n"
			+ "Indicate the specific tasks or procedure to be explained as well as the scope (what will and will not be covered)\r\n"
			+ "Indicate what the audience needs in terms of knowledge and background to understand the instructions\r\n"
			+ "Give a general idea of the procedure and what it accomplishes\r\n"
			+ "Indicate the conditions when these instructions should (or should not) be used\r\n"
			+ "Give an overview of the contents of the instructions.\r\n"
			+ "General warning, caution, danger notices:  instructions often must alert readers to the possibility of ruining their equipment, screwing up the procedure, and hurting themselves. Also, instructions must often emphasize key points or exceptions. For these situations, you use special notices�note, warning, caution, and danger notices. Notice how these special notices are used in the example instructions listed above.\r\n"
			+ "\r\n"
			+ "Technical background or theory:  at the beginning of certain kinds of instructions (after the introduction), you may need a discussion of background related to the procedure. For certain instructions, this background is critical�otherwise, the steps in the procedure make no sense. For example, you may have had some experience with those software applets in which you define your own colors by nudging red, green, and blue slider bars around. To really understand what you�re doing, you need to have some background on color. Similarly, you can imagine that, for certain instructions using cameras, some theory might be needed as well.\r\n"
			+ "\r\n"
			+ "Equipment and supplies:  notice that most instructions include a list of the things you need to gather before you start the procedure. This includes equipment, the tools you use in the procedure (such as mixing bowls, spoons, bread pans, hammers, drills, and saws) and supplies, the things that are consumed in the procedure (such as wood, paint, oil, flour, and nails). In instructions, these typically are listed either in a simple vertical list or in a two-column list. Use the two-column list if you need to add some specifications to some or all of the items�for example, brand names, sizes, amounts, types, model numbers, and so on.\r\n"
			+ "\r\n"
			+ "Discussion of the steps:  when you get to the actual writing of the steps, there are several things to keep in mind: (1) the structure and format of those steps, (2) supplementary information that might be needed, and (3) the point of view and general writing style.\r\n"
			+ "\r\n"
			+ "Structure and format:  normally, we imagine a set of instructions as being formatted as vertical numbered lists. And most are in fact. Normally, you format your actual step-by-step instructions this way. There are some variations, however, as well as some other considerations:\r\n"
			+ "\r\n"
			+ "Fixed-order steps are steps that must be performed in the order presented. For example, if you are changing the oil in a car, draining the oil is a step that must come before putting the new oil. These are numbered lists (usually, vertical numbered lists).\r\n"
			+ "Variable-order steps are steps that can be performed in practically any order. Good examples are those troubleshooting guides that tell you to check this, check that where you are trying to fix something. You can do these kinds of steps in practically any order. With this type, the bulleted list is the appropriate format.\r\n"
			+ "Alternate steps are those in which two or more ways to accomplish the same thing are presented. Alternate steps are also used when various conditions might exist. Use bulleted lists with this type, with OR inserted between the alternatives, or the lead-in indicating that alternatives are about to be presented.\r\n"
			+ "Nested steps may be used in  cases when individual steps within a procedure are rather complex in their own right and need to be broken down into sub-steps. In this case, you indent further and sequence the sub-steps as a, b, c, and so on.\r\n"
			+ "�Step-less� instructions. can be used when you really cannot use numbered vertical list or provide straightforward instructional-style directing of the reader. Some situations must be so generalized or so variable that steps cannot be stated.\r\n"
			+ "Supplementary discussion: often, it is not enough simply to tell readers to do this or to do that. They need additional explanatory information such as how the thing should look before and after the step; why they should care about doing this step; what mechanical principle is behind what they are doing; even more micro-level explanation of the step�discussion of the specific actions that make up the step.\r\n"
			+ "\r\n"
			+ "The problem with supplementary discussion, however, is that it can hide the actual step. You want the actual step�the specific actions the reader is to take�to stand out. You don�t want it all buried in a heap of words. There are at least two techniques to avoid this problem: you can split the instruction from the supplement into separate paragraphs; or you can bold the instruction.";
	String aboutStr = "This Program was Developed by Roberto Salazar in  2022 as a part of his Senior Project to \n fulfill the rquarement to graduate in his BS degree in \n Computer Science";
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
	private JTable table_2;
	private JPanel noFound_3;
	private JLabel lblNewLabel_16_3;
	private JLabel lblNewLabel_1_1_1_2;
	private JPanel panel_33;
	private ScrollPane scrollPane_2;


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
	
	private void SetPanelVisible(String panel) {
		HomePanel.setVisible(true);
		if(panel == "AddEndStation") {
			AddEndStation.setVisible(true);
			panel_1.setVisible(false);
			panel_5.setVisible(false);
		}else {
			panel_1.setVisible(false);
			panel_5.setVisible(false);
			AddEndStation.setVisible(false);
		}
		if(panel == "nextStrStation") {
			nextStrStation.setVisible(true);
		}else {
			nextStrStation.setVisible(false);
		}
		if(panel == "goHome") {
			goHome.setVisible(true);
		}else {
			goHome.setVisible(false);
		}
		if(panel == "about") {
			about.setVisible(true);
		}else {
			about.setVisible(false);
		}
		if(panel == "instruction") {
			instruction.setVisible(true);
		}else {
			instruction.setVisible(false);
		}
		if(panel == "loadInventory") {
			loadInventory.setVisible(true);
		}else {
			loadInventory.setVisible(false);
		}
		if(panel == "printS") {
			printS.setVisible(true);
		}else {
			printS.setVisible(false);
		}
		if(panel == "printL") {
			printL.setVisible(true);
		}else {
			printL.setVisible(false);
		}
		if(panel == "printG") {
			printG.setVisible(true);
		}else {
			printG.setVisible(false);
		}
		if(panel == "removeInventory") {
			removeInventory.setVisible(true);
		}else {
			removeInventory.setVisible(false);
		}
		if(panel == "editInventory") {
			editInventory.setVisible(true);
		}else {
			editInventory.setVisible(false);
		}
		if(panel == "addInventory") {
			addInventory.setVisible(true);
		}else {
			addInventory.setVisible(false);
		}
		if(panel == "deleteStation") {
			deleteStation.setVisible(true);
		}else {
			deleteStation.setVisible(false);
		}
		if(panel == "addStation") {
			panel_13.setVisible(false);
			addStation.setVisible(true);
		}else {
			panel_13.setVisible(false);
			addStation.setVisible(false);
		}
		if(panel == "deleteLine") {
			deleteLine.setVisible(true);
		}else {
			deleteLine.setVisible(false);
		}
		if(panel == "editLine") {
			editLine.setVisible(true);
		}else {
			editLine.setVisible(false);
		}
		if(panel == "editStation") {
			editStation.setVisible(true);
		}else {
			editStation.setVisible(false);
		}
		if(panel == "addLine") {
			addLine.setVisible(true);
		}else {
			addLine.setVisible(false);
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 600, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel MainPanel = new JPanel();
		frame.getContentPane().add(MainPanel, "name_1308126600308800");
		MainPanel.setLayout(new BorderLayout(0, 0));
		
		
		
		HomePanel = new JPanel();
		HomePanel.setVisible(true);
		MainPanel.add(HomePanel, BorderLayout.CENTER);
		HomePanel.setLayout(new CardLayout(0, 0));
		
		addLine = new JPanel();
		addLine.setVisible(false);
		HomePanel.add(addLine, "name_1310157411821900");
		addLine.setLayout(null);
		
		lblNewLabel = new JLabel("Line Name");
		lblNewLabel.setBounds(5, 9, 75, 14);
		addLine.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(90, 6, 96, 20);
		addLine.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Line Acronym");
		lblNewLabel_1.setBounds(187, 9, 84, 14);
		addLine.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(281, 6, 96, 20);
		addLine.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Line length");
		lblNewLabel_2.setBounds(387, 9, 84, 14);
		addLine.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(468, 6, 96, 20);
		addLine.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Line Class");
		lblNewLabel_3.setBounds(37, 37, 84, 14);
		addLine.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox(LineClassType);
		comboBox.setBounds(131, 33, 99, 22);
		addLine.add(comboBox);
		
		lblNewLabel_4 = new JLabel("Line Direction");
		lblNewLabel_4.setBounds(241, 36, 95, 14);
		addLine.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox(Direction);
		comboBox_1.setBounds(346, 33, 99, 22);
		addLine.add(comboBox_1);
		
		textArea = new JTextArea();
		textArea.setBounds(21, 59, 484, 184);
		textArea.setColumns(60);
		textArea.setRows(10);
		addLine.add(textArea);
		
		btnNewButton = new JButton("Next");
		btnNewButton.setBounds(510, 139, 66, 41);

		addLine.add(btnNewButton);
		
		editLine = new JPanel();
		HomePanel.add(editLine, "name_1310157420991900");
		GridBagLayout gbl_editLine = new GridBagLayout();
		gbl_editLine.columnWidths = new int[]{586, 0};
		gbl_editLine.rowHeights = new int[] {100, 260, 0};
		gbl_editLine.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_editLine.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		editLine.setLayout(gbl_editLine);
		
		panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		editLine.add(panel_3, gbc_panel_3);
		
		lblNewLabel_15 = new JLabel("Enter Name or Acronym of the Line");
		panel_3.add(lblNewLabel_15);
		
		textField_13 = new JTextField();
		panel_3.add(textField_13);
		textField_13.setColumns(10);
		
		btnNewButton_2 = new JButton("Search");
		panel_3.add(btnNewButton_2);
		
		panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 0;
		gbc_panel_9.gridy = 1;
		editLine.add(panel_9, gbc_panel_9);
		panel_9.setLayout(new CardLayout(0, 0));
		
		noFound = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) noFound.getLayout();
		panel_9.add(noFound, "name_1393384886757600");
		
		lblNewLabel_16 = new JLabel("No Coincidence ...");
		noFound.add(lblNewLabel_16);
		
		found = new JPanel();
		panel_9.add(found, "name_1393413172175100");
		found.setLayout(null);
		
		lblNewLabel_17 = new JLabel("Line Name");
		lblNewLabel_17.setBounds(10, 8, 71, 14);
		found.add(lblNewLabel_17);
		
		textField_14 = new JTextField();
		textField_14.setBounds(86, 5, 96, 20);
		textField_14.setColumns(10);
		found.add(textField_14);
		
		lblNewLabel_1_1 = new JLabel("Line Acronym");
		lblNewLabel_1_1.setBounds(187, 8, 84, 14);
		found.add(lblNewLabel_1_1);
		
		textField_15 = new JTextField();
		textField_15.setBounds(276, 5, 96, 20);
		textField_15.setColumns(10);
		found.add(textField_15);
		
		lblNewLabel_2_1 = new JLabel("Length");
		lblNewLabel_2_1.setBounds(377, 8, 54, 14);
		found.add(lblNewLabel_2_1);
		
		textField_16 = new JTextField();
		textField_16.setBounds(441, 5, 96, 20);
		textField_16.setColumns(10);
		found.add(textField_16);
		
		lblNewLabel_3_1 = new JLabel("Class");
		lblNewLabel_3_1.setBounds(109, 33, 56, 14);
		found.add(lblNewLabel_3_1);
		
		comboBox_6 = new JComboBox(LineClassType);
		comboBox_6.setBounds(171, 30, 127, 20);
		found.add(comboBox_6);
		
		lblNewLabel_4_1 = new JLabel("Line Direction");
		lblNewLabel_4_1.setBounds(303, 33, 84, 14);
		found.add(lblNewLabel_4_1);
		
		comboBox_1_1 = new JComboBox(Direction);
		comboBox_1_1.setBounds(387, 30, 96, 20);
		found.add(comboBox_1_1);
		
		textArea_2 = new JTextArea();
		textArea_2.setBounds(29, 55, 411, 184);
		textArea_2.setRows(10);
		textArea_2.setColumns(60);
		found.add(textArea_2);
		
		btnNewButton_3 = new JButton("Edit");
		btnNewButton_3.setBounds(485, 135, 84, 23);
		found.add(btnNewButton_3);
		
		deleteLine = new JPanel();
		HomePanel.add(deleteLine, "name_1310157432045200");
		GridBagLayout gbl_deleteLine = new GridBagLayout();
		gbl_deleteLine.columnWidths = new int[]{586, 0};
		gbl_deleteLine.rowHeights = new int[] {100, 260, 0};
		gbl_deleteLine.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_deleteLine.rowWeights = new double[]{0.0, 0.0};
		deleteLine.setLayout(gbl_deleteLine);
		
		panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 0;
		deleteLine.add(panel_10, gbc_panel_10);
		
		lblNewLabel_15_1 = new JLabel("Enter Name or Acronym of the Line to DELETE");
		panel_10.add(lblNewLabel_15_1);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		panel_10.add(textField_17);
		
		btnNewButton_2_1 = new JButton("Search");
		panel_10.add(btnNewButton_2_1);
		
		panel_11 = new JPanel();
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 0;
		gbc_panel_11.gridy = 1;
		deleteLine.add(panel_11, gbc_panel_11);
		panel_11.setLayout(new CardLayout(0, 0));
		
		noFound_1 = new JPanel();
		panel_11.add(noFound_1, "name_1394579907728900");
		
		lblNewLabel_16_1 = new JLabel("No Coincidence ...");
		noFound_1.add(lblNewLabel_16_1);
		
		found_1 = new JPanel();
		panel_11.add(found_1, "name_1394579920907200");
		found_1.setLayout(null);
		
		lblNewLabel_17_1 = new JLabel("Line Name: ");
		lblNewLabel_17_1.setBounds(48, 9, 338, 14);
		found_1.add(lblNewLabel_17_1);
		
		lblNewLabel_1_1_1 = new JLabel("Line Acronym: ");
		lblNewLabel_1_1_1.setBounds(48, 34, 338, 14);
		found_1.add(lblNewLabel_1_1_1);
		
		lblNewLabel_2_1_1 = new JLabel("Line length: ");
		lblNewLabel_2_1_1.setBounds(46, 59, 340, 14);
		found_1.add(lblNewLabel_2_1_1);
		
		lblNewLabel_3_1_1 = new JLabel("Line Class: ");
		lblNewLabel_3_1_1.setBounds(50, 84, 336, 14);
		found_1.add(lblNewLabel_3_1_1);
		
		lblNewLabel_4_1_1 = new JLabel("Line Direction:");
		lblNewLabel_4_1_1.setBounds(48, 109, 338, 14);
		found_1.add(lblNewLabel_4_1_1);
		
		btnNewButton_3_1 = new JButton("DELETE");
		btnNewButton_3_1.setBounds(402, 65, 138, 43);
		
		
		lblNewLabel_18 = new JTextArea("Description: ");
		lblNewLabel_18.setEditable(false);
		lblNewLabel_18.setBounds(48, 134, 492, 115);
		found_1.add(lblNewLabel_18);
		found_1.add(btnNewButton_3_1);
		
		addStation = new JPanel();
		HomePanel.add(addStation, "name_1310157443877700");
		addStation.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_12 = new JPanel();
		addStation.add(panel_12);
		panel_12.setLayout(null);
		
		lblNewLabel_19 = new JLabel("Line name");
		lblNewLabel_19.setBounds(10, 9, 99, 14);
		panel_12.add(lblNewLabel_19);
		
		comboBox_7 = new JComboBox();
		comboBox_7.setBounds(119, 5, 96, 22);
		panel_12.add(comboBox_7);
		
		lblNewLabel_5_2 = new JLabel("Type of Station");
		lblNewLabel_5_2.setBounds(251, 9, 152, 14);
		panel_12.add(lblNewLabel_5_2);
		
		label_12 = new JLabel("");
		label_12.setBounds(206, 16, 0, 0);
		panel_12.add(label_12);
		
		label_1_2 = new JLabel("");
		label_1_2.setBounds(211, 16, 0, 0);
		panel_12.add(label_1_2);
		
		label_2_2 = new JLabel("");
		label_2_2.setBounds(216, 16, 0, 0);
		panel_12.add(label_2_2);
		
		label_3_2 = new JLabel("");
		label_3_2.setBounds(221, 16, 0, 0);
		panel_12.add(label_3_2);
		
		label_4_2 = new JLabel("");
		label_4_2.setBounds(226, 16, 0, 0);
		panel_12.add(label_4_2);
		
		label_5_2 = new JLabel("");
		label_5_2.setBounds(231, 16, 0, 0);
		panel_12.add(label_5_2);
		
		label_6_2 = new JLabel("");
		label_6_2.setBounds(236, 16, 0, 0);
		panel_12.add(label_6_2);
		
		label_7_2 = new JLabel("");
		label_7_2.setBounds(241, 16, 0, 0);
		panel_12.add(label_7_2);
		
		label_8_2 = new JLabel("");
		label_8_2.setBounds(246, 16, 0, 0);
		panel_12.add(label_8_2);
		
		label_9_2 = new JLabel("");
		label_9_2.setBounds(251, 16, 0, 0);
		panel_12.add(label_9_2);
		
		label_10_2 = new JLabel("");
		label_10_2.setBounds(256, 16, 0, 0);
		panel_12.add(label_10_2);
		
		comboBox_2_2 = new JComboBox(ClassType);
		comboBox_2_2.setBounds(424, 5, 123, 22);
		panel_12.add(comboBox_2_2);
		
		lblNewLabel_6_2 = new JLabel("Station Name");
		lblNewLabel_6_2.setBounds(10, 63, 99, 14);
		panel_12.add(lblNewLabel_6_2);
		
		textField_18 = new JTextField();
		textField_18.setBounds(119, 60, 96, 20);
		textField_18.setColumns(10);
		panel_12.add(textField_18);
		
		lblNewLabel_7_2 = new JLabel("Station Acronym");
		lblNewLabel_7_2.setBounds(251, 63, 152, 14);
		panel_12.add(lblNewLabel_7_2);
		
		textField_19 = new JTextField();
		textField_19.setBounds(424, 60, 96, 20);
		textField_19.setColumns(10);
		panel_12.add(textField_19);
		
		lblNewLabel_8_2 = new JLabel("Station Direction");
		lblNewLabel_8_2.setBounds(253, 38, 150, 14);
		panel_12.add(lblNewLabel_8_2);
		
		comboBox_3_2 = new JComboBox(Direction);
		comboBox_3_2.setBounds(424, 34, 123, 22);
		panel_12.add(comboBox_3_2);
		
		lblNewLabel_9_2 = new JLabel("Number of lines");
		lblNewLabel_9_2.setBounds(10, 95, 105, 14);
		panel_12.add(lblNewLabel_9_2);
		
		textField_20 = new JTextField();
		textField_20.setBounds(119, 92, 97, 20);
		textField_20.setColumns(10);
		panel_12.add(textField_20);
		
		lblNewLabel_10_2 = new JLabel("Number of cars per line");
		lblNewLabel_10_2.setBounds(251, 95, 159, 14);
		panel_12.add(lblNewLabel_10_2);
		
		textField_21 = new JTextField();
		textField_21.setBounds(424, 92, 96, 20);
		textField_21.setColumns(10);
		panel_12.add(textField_21);
		
		lblNewLabel_20 = new JLabel("Head Station");
		lblNewLabel_20.setBounds(10, 38, 99, 14);
		panel_12.add(lblNewLabel_20);
		
		comboBox_8 = new JComboBox();
		comboBox_8.setBounds(119, 33, 112, 22);
		panel_12.add(comboBox_8);
		
		panel_13 = new JPanel();
		addStation.add(panel_13);
		panel_13.setLayout(new CardLayout(0, 0));
		
		panel_14 = new JPanel();
		panel_13.add(panel_14, "name_1399693335509700");
		panel_14.setLayout(null);
		
		lblNewLabel_12_1_1 = new JLabel("line to change");
		lblNewLabel_12_1_1.setBounds(175, 9, 102, 14);
		panel_14.add(lblNewLabel_12_1_1);
		
		comboBox_5_1_1 = new JComboBox();
		comboBox_5_1_1.setBounds(279, 5, 108, 22);
		panel_14.add(comboBox_5_1_1);
		
		JPanel panel_15 = new JPanel();
		panel_13.add(panel_15, "name_1399693385627100");
		panel_15.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel_13_1_1 = new JLabel("Industry Name");
		panel_15.add(lblNewLabel_13_1_1);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		panel_15.add(textField_22);
		
		lblNewLabel_14_1_1 = new JLabel("Description");
		panel_15.add(lblNewLabel_14_1_1);
		
		textArea_1_1_1 = new JTextArea();
		textArea_1_1_1.setRows(4);
		textArea_1_1_1.setColumns(40);
		panel_15.add(textArea_1_1_1);
		
		panel_16 = new JPanel();
		addStation.add(panel_16);
		panel_16.setLayout(null);
		
		AddStationButton = new JButton("Add Station");
		AddStationButton.setBounds(229, 11, 118, 52);
		
		panel_16.add(AddStationButton);
		
		editStation = new JPanel();
		HomePanel.add(editStation, "name_1310157453290100");
		GridBagLayout gbl_editStation = new GridBagLayout();
		gbl_editStation.columnWidths = new int[]{733, 0};
		gbl_editStation.rowHeights = new int[]{76, 269, 0};
		gbl_editStation.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_editStation.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		editStation.setLayout(gbl_editStation);
		
		panel_17 = new JPanel();
		GridBagConstraints gbc_panel_17 = new GridBagConstraints();
		gbc_panel_17.fill = GridBagConstraints.BOTH;
		gbc_panel_17.insets = new Insets(0, 0, 5, 0);
		gbc_panel_17.gridx = 0;
		gbc_panel_17.gridy = 0;
		editStation.add(panel_17, gbc_panel_17);
		panel_17.setLayout(null);
		
		lblNewLabel_15_2 = new JLabel("Enter Name or Acronym of the Station");
		lblNewLabel_15_2.setBounds(100, 18, 189, 14);
		panel_17.add(lblNewLabel_15_2);
		
		textField_23 = new JTextField();
		textField_23.setBounds(302, 15, 142, 20);
		textField_23.setColumns(10);
		panel_17.add(textField_23);
		
		btnNewButton_2_2 = new JButton("Search");
		btnNewButton_2_2.setBounds(454, 5, 96, 41);
		
		panel_17.add(btnNewButton_2_2);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("Text in text field"+textField_23.getText()+"\n");
				System.out.print("Bool: "+MyRailRoad.searchStation(textField_23.getText(),serachStation,panel_12_1 , noFound_2, noFound_3, panel_15_1, panel_14_1)+" \n");
				if (MyRailRoad.searchStation(textField_23.getText(),serachStation,panel_12_1 , noFound_2, noFound_3, panel_15_1, panel_14_1)) {
					System.out.print("searching station indexGlobal:"+MyRailRoad.searchIndexGlobalIntStation+"\n");
					System.out.print("search station name:"+MyRailRoad.searchTypeGlobalString+"\n");
					MyRailRoad.setTempStationData(MyRailRoad.searchTypeGlobalString, 
							MyRailRoad.searchIndexGlobalIntStation,
							MyRailRoad.searchStNameGlobalString,
							MyRailRoad.searchLnNameGlobalString);
					comboBox_2_2_1.setSelectedIndex(MyRailRoad.getArrayIndex(ClassType,MyRailRoad.searchTypeGlobalString ));
					textField_24.setText(MyRailRoad.nameTemp);
					textField_25.setText(MyRailRoad.acroTemp);
					comboBox_3_2_1.setSelectedIndex(MyRailRoad.getArrayIndex(Direction, classTypeSelected));
					textField_26.setText(Integer.toString(MyRailRoad.numLinesTemp));
					textField_27.setText(Integer.toString(MyRailRoad.numCarsTemp));
					comboBox_7_1.setSelectedIndex(MyRailRoad.getArrayIndex(Direction, MyRailRoad.classTypeSelected)); // tail
					comboBox_5_1_1_1.setSelectedIndex(MyRailRoad.getArrayIndex(Direction, MyRailRoad.classTypeSelected)); //head
					textField_28.setText(MyRailRoad.industreNameTemp);
					textArea_1_1_1_1.setText(MyRailRoad.descriptionTempStation);
				}
			}
		});
		
		panel_18 = new JPanel();
		GridBagConstraints gbc_panel_18 = new GridBagConstraints();
		gbc_panel_18.fill = GridBagConstraints.BOTH;
		gbc_panel_18.gridx = 0;
		gbc_panel_18.gridy = 1;
		editStation.add(panel_18, gbc_panel_18);
		panel_18.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_19 = new JPanel();
		panel_18.add(panel_19);
		panel_19.setLayout(new CardLayout(0, 0));
		
		noFound_2 = new JPanel();
		panel_19.add(noFound_2, "name_1401563056070200");
		noFound_2.setLayout(null);
		
		lblNewLabel_16_2 = new JLabel("No Coincidence ...");
		lblNewLabel_16_2.setBounds(247, 11, 89, 14);
		noFound_2.add(lblNewLabel_16_2);
		
		panel_12_1 = new JPanel();
		panel_19.add(panel_12_1, "name_1401563083982800");
		panel_12_1.setLayout(null);
		
		lblNewLabel_5_2_1 = new JLabel("Type of Station");
		lblNewLabel_5_2_1.setBounds(5, 9, 75, 14);
		panel_12_1.add(lblNewLabel_5_2_1);
		
		label_12_1 = new JLabel("");
		label_12_1.setBounds(85, 16, 0, 0);
		panel_12_1.add(label_12_1);
		
		label_1_2_1 = new JLabel("");
		label_1_2_1.setBounds(90, 16, 0, 0);
		panel_12_1.add(label_1_2_1);
		
		label_2_2_1 = new JLabel("");
		label_2_2_1.setBounds(95, 16, 0, 0);
		panel_12_1.add(label_2_2_1);
		
		label_3_2_1 = new JLabel("");
		label_3_2_1.setBounds(100, 16, 0, 0);
		panel_12_1.add(label_3_2_1);
		
		label_4_2_1 = new JLabel("");
		label_4_2_1.setBounds(105, 16, 0, 0);
		panel_12_1.add(label_4_2_1);
		
		label_5_2_1 = new JLabel("");
		label_5_2_1.setBounds(110, 16, 0, 0);
		panel_12_1.add(label_5_2_1);
		
		label_6_2_1 = new JLabel("");
		label_6_2_1.setBounds(115, 16, 0, 0);
		panel_12_1.add(label_6_2_1);
		
		label_7_2_1 = new JLabel("");
		label_7_2_1.setBounds(120, 16, 0, 0);
		panel_12_1.add(label_7_2_1);
		
		label_8_2_1 = new JLabel("");
		label_8_2_1.setBounds(125, 16, 0, 0);
		panel_12_1.add(label_8_2_1);
		
		label_9_2_1 = new JLabel("");
		label_9_2_1.setBounds(130, 16, 0, 0);
		panel_12_1.add(label_9_2_1);
		
		label_10_2_1 = new JLabel("");
		label_10_2_1.setBounds(135, 16, 0, 0);
		panel_12_1.add(label_10_2_1);
		
		comboBox_2_2_1 = new JComboBox(ClassType);
		comboBox_2_2_1.setBounds(90, 5, 81, 22);
		panel_12_1.add(comboBox_2_2_1);
		
		lblNewLabel_6_2_1 = new JLabel("Station Name");
		lblNewLabel_6_2_1.setBounds(175, 9, 67, 14);
		panel_12_1.add(lblNewLabel_6_2_1);
		
		textField_24 = new JTextField();
		textField_24.setBounds(247, 6, 96, 20);
		textField_24.setColumns(10);
		panel_12_1.add(textField_24);
		
		lblNewLabel_7_2_1 = new JLabel("Station Acronym");
		lblNewLabel_7_2_1.setBounds(362, 9, 81, 14);
		panel_12_1.add(lblNewLabel_7_2_1);
		
		textField_25 = new JTextField();
		textField_25.setBounds(453, 6, 96, 20);
		textField_25.setColumns(10);
		panel_12_1.add(textField_25);
		
		lblNewLabel_8_2_1 = new JLabel("Station Direction");
		lblNewLabel_8_2_1.setBounds(5, 53, 83, 14);
		panel_12_1.add(lblNewLabel_8_2_1);
		
		comboBox_3_2_1 = new JComboBox(new Object[]{});
		comboBox_3_2_1.setBounds(623, 5, 30, 22);
		panel_12_1.add(comboBox_3_2_1);
		
		lblNewLabel_9_2_1 = new JLabel("Number of lines");
		lblNewLabel_9_2_1.setBounds(658, 9, 77, 14);
		panel_12_1.add(lblNewLabel_9_2_1);
		
		textField_26 = new JTextField();
		textField_26.setBounds(100, 50, 96, 20);
		textField_26.setColumns(10);
		panel_12_1.add(textField_26);
		
		lblNewLabel_10_2_1 = new JLabel("Number of cars per line");
		lblNewLabel_10_2_1.setBounds(217, 53, 115, 14);
		panel_12_1.add(lblNewLabel_10_2_1);
		
		textField_27 = new JTextField();
		textField_27.setBounds(342, 50, 96, 20);
		textField_27.setColumns(10);
		panel_12_1.add(textField_27);
		
		lblNewLabel_19_1 = new JLabel("Tail Station");
		lblNewLabel_19_1.setBounds(5, 90, 56, 14);
		panel_12_1.add(lblNewLabel_19_1);
		
		comboBox_7_1 = new JComboBox();
		comboBox_7_1.setBounds(85, 86, 86, 22);
		panel_12_1.add(comboBox_7_1);
		
		btnNewButton_4 = new JButton("Edit Station");
		btnNewButton_4.setBounds(453, 86, 96, 37);
		panel_12_1.add(btnNewButton_4);
		
		panel_20 = new JPanel();
		panel_18.add(panel_20);
		panel_20.setLayout(new CardLayout(0, 0));
		
		panel_14_1 = new JPanel();
		panel_20.add(panel_14_1, "name_1401732706280500");
		panel_14_1.setLayout(null);
		
		lblNewLabel_12_1_1_1 = new JLabel("line to change");
		lblNewLabel_12_1_1_1.setBounds(195, 9, 69, 14);
		panel_14_1.add(lblNewLabel_12_1_1_1);
		
		comboBox_5_1_1_1 = new JComboBox();
		comboBox_5_1_1_1.setBounds(274, 5, 104, 22);
		panel_14_1.add(comboBox_5_1_1_1);
		
		panel_15_1 = new JPanel();
		panel_20.add(panel_15_1, "name_1401732752297000");
		panel_15_1.setLayout(null);
		
		lblNewLabel_13_1_1_1 = new JLabel("Industry Name");
		lblNewLabel_13_1_1_1.setBounds(10, 60, 73, 14);
		panel_15_1.add(lblNewLabel_13_1_1_1);
		
		textField_28 = new JTextField();
		textField_28.setBounds(92, 57, 96, 20);
		textField_28.setColumns(10);
		panel_15_1.add(textField_28);
		
		lblNewLabel_14_1_1_1 = new JLabel("Description");
		lblNewLabel_14_1_1_1.setBounds(198, 60, 56, 14);
		panel_15_1.add(lblNewLabel_14_1_1_1);
		
		textArea_1_1_1_1 = new JTextArea();
		textArea_1_1_1_1.setBounds(254, 31, 324, 76);
		textArea_1_1_1_1.setRows(4);
		textArea_1_1_1_1.setColumns(40);
		panel_15_1.add(textArea_1_1_1_1);
		
		noFound_3 = new JPanel();
		panel_20.add(noFound_3, "name_267675201670499");
		noFound_3.setLayout(null);
		
		lblNewLabel_16_3 = new JLabel("No Coincidence ...");
		lblNewLabel_16_3.setBounds(233, 11, 89, 14);
		noFound_3.add(lblNewLabel_16_3);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyRailRoad.editStation( MyRailRoad.searchIndexGlobalIntStation,MyRailRoad.nameTemp,stlineTemp,  (String)comboBox_2_2_1.getSelectedItem(),  textField_24.getText(),  textField_25.getText(), (String)comboBox_3_2_1.getSelectedItem(),  (String)comboBox_7_1.getSelectedItem(),  tailTemp,  Integer.parseInt(textField_26.getText()),  Integer.parseInt(textField_27.getText()),  textField_28.getText(),  textArea_1_1_1_1.getText(),  station1Temp, station2Temp);
			}
		});
		
		deleteStation = new JPanel();
		HomePanel.add(deleteStation, "name_1310157463020500");
		GridBagLayout gbl_deleteStation = new GridBagLayout();
		gbl_deleteStation.columnWidths = new int[]{586, 0};
		gbl_deleteStation.rowHeights = new int[] {100, 260, 0, 30};
		gbl_deleteStation.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_deleteStation.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		deleteStation.setLayout(gbl_deleteStation);
		
		Search = new JPanel();
		GridBagConstraints gbc_Search = new GridBagConstraints();
		gbc_Search.fill = GridBagConstraints.BOTH;
		gbc_Search.insets = new Insets(0, 0, 5, 0);
		gbc_Search.gridx = 0;
		gbc_Search.gridy = 0;
		deleteStation.add(Search, gbc_Search);
		
		lblNewLabel_15_1_1 = new JLabel("Enter Name or Acronym of the Station to DELETE");
		Search.add(lblNewLabel_15_1_1);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		Search.add(textField_29);
		
		btnNewButton_2_1_1 = new JButton("Search");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_17_1_1.setText("Station's line: ");
				lblNewLabel_3_1_1_1.setText("Station class: ");
				lblNewLabel_1_1_1_1.setText("Station Name: ");	 
				lblNewLabel_1_1_1_2.setText("Station Acronym: ");
				lblNewLabel_2_1_1_1.setText("Station number of lines: ");
				lblNewLabel_18_1.setText("Cars per line: ");
				lblNewLabel_4_1_1_1.setText("Station Direction: ");
				lblNewLabel_22.setText("Tail Station: ");
				if (MyRailRoad.searchStationToDelete(textField_29.getText(),serachStation, Found2, Nofound)) {
					System.out.print("searching station indexGlobal:"+MyRailRoad.searchIndexGlobalIntStation+"\n");
					System.out.print("search station name:"+MyRailRoad.searchTypeGlobalString+"\n");
					MyRailRoad.setTempStationData(MyRailRoad.searchTypeGlobalString, 
							MyRailRoad.searchIndexGlobalIntStation,
							MyRailRoad.searchStNameGlobalString,
							MyRailRoad.searchLnNameGlobalString);
					
				lblNewLabel_17_1_1.setText(lblNewLabel_17_1_1.getText()+MyRailRoad.stlineTemp);
				lblNewLabel_3_1_1_1.setText(lblNewLabel_3_1_1_1.getText()+MyRailRoad.typeTemp);
				lblNewLabel_1_1_1_1.setText(lblNewLabel_1_1_1_1.getText()+MyRailRoad.nameTemp);	 
				lblNewLabel_1_1_1_2.setText(lblNewLabel_1_1_1_2.getText()+MyRailRoad.acroTemp);
				lblNewLabel_2_1_1_1.setText(lblNewLabel_2_1_1_1.getText()+MyRailRoad.numLinesTemp);
				lblNewLabel_18_1.setText(lblNewLabel_18_1.getText()+MyRailRoad.numCarsTemp);
				lblNewLabel_4_1_1_1.setText(lblNewLabel_4_1_1_1.getText()+MyRailRoad.directTemp);
				lblNewLabel_22.setText(lblNewLabel_22.getText()+MyRailRoad.headTemp);
				}
			}
		});
		Search.add(btnNewButton_2_1_1);
		
		Found = new JPanel();
		GridBagConstraints gbc_Found = new GridBagConstraints();
		gbc_Found.insets = new Insets(0, 0, 5, 0);
		gbc_Found.fill = GridBagConstraints.BOTH;
		gbc_Found.gridx = 0;
		gbc_Found.gridy = 1;
		deleteStation.add(Found, gbc_Found);
		Found.setLayout(new CardLayout(0, 0));
		
		Nofound = new JPanel();
		Found.add(Nofound, "name_2111533082968600");
		
		lblNewLabel_16_1_1 = new JLabel("No Coincidence ...");
		Nofound.add(lblNewLabel_16_1_1);
		
		Found2 = new JPanel();
		Found.add(Found2, "name_2111533101014200");
		Found2.setLayout(null);
		
		lblNewLabel_3_1_1_1 = new JLabel("Station Class: ");
		lblNewLabel_3_1_1_1.setBounds(35, 5, 343, 14);
		Found2.add(lblNewLabel_3_1_1_1);
		
		lblNewLabel_17_1_1 = new JLabel("Station's line:");
		lblNewLabel_17_1_1.setBounds(35, 28, 343, 14);
		Found2.add(lblNewLabel_17_1_1);
		
		lblNewLabel_1_1_1_1 = new JLabel("Station Name: ");
		lblNewLabel_1_1_1_1.setBounds(35, 53, 343, 14);
		Found2.add(lblNewLabel_1_1_1_1);
		
		lblNewLabel_1_1_1_2 = new JLabel("Station Acronym: ");
		lblNewLabel_1_1_1_2.setBounds(35, 78, 343, 14);
		Found2.add(lblNewLabel_1_1_1_2);
		
		lblNewLabel_2_1_1_1 = new JLabel("Station number of lines: ");
		lblNewLabel_2_1_1_1.setBounds(35, 131, 343, 14);
		Found2.add(lblNewLabel_2_1_1_1);
		
		lblNewLabel_18_1 = new JLabel("Cars per line: ");
		lblNewLabel_18_1.setBounds(35, 163, 343, 14);
		Found2.add(lblNewLabel_18_1);
		
		lblNewLabel_4_1_1_1 = new JLabel("Station Direction:");
		lblNewLabel_4_1_1_1.setBounds(35, 103, 343, 14);
		Found2.add(lblNewLabel_4_1_1_1);
		
		lblNewLabel_22 = new JLabel("Tail Station");
		lblNewLabel_22.setBounds(35, 198, 343, 14);
		Found2.add(lblNewLabel_22);
		
		btnNewButton_3_1_1 = new JButton("DELETE");
		btnNewButton_3_1_1.setBounds(392, 78, 157, 68);
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_17_1_1.setText("Station's line: ");
				lblNewLabel_3_1_1_1.setText("Station class: ");
				lblNewLabel_1_1_1_1.setText("Station Name: ");	 
				lblNewLabel_1_1_1_2.setText("Station Acronym: ");
				lblNewLabel_2_1_1_1.setText("Station number of lines: ");
				lblNewLabel_18_1.setText("Cars per line: ");
				lblNewLabel_4_1_1_1.setText("Station Direction: ");
				lblNewLabel_22.setText("Tail Station: ");
				MyRailRoad.deleteStation(MyRailRoad.searchIndexGlobalIntLine, MyRailRoad.stlineTemp, MyRailRoad.typeTemp, MyRailRoad.nameTemp);
			}
		});
		Found2.add(btnNewButton_3_1_1);
		
		addInventory = new JPanel();
		HomePanel.add(addInventory, "name_1310157472521300");
		GridBagLayout gbl_addInventory = new GridBagLayout();
		gbl_addInventory.columnWidths = new int[] {586, 0};
		gbl_addInventory.rowHeights = new int[] {260, 100, 30};
		gbl_addInventory.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_addInventory.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		addInventory.setLayout(gbl_addInventory);
		
		panel_21 = new JPanel();
		panel_21.setLayout(null);
		GridBagConstraints gbc_panel_21 = new GridBagConstraints();
		gbc_panel_21.insets = new Insets(0, 0, 5, 0);
		gbc_panel_21.fill = GridBagConstraints.BOTH;
		gbc_panel_21.gridx = 0;
		gbc_panel_21.gridy = 0;
		addInventory.add(panel_21, gbc_panel_21);
		
		lblNewLabel_24 = new JLabel("Station's Line");
		lblNewLabel_24.setBounds(10, 13, 66, 14);
		panel_21.add(lblNewLabel_24);
		
		comboBox_9 = new JComboBox();
		comboBox_9.removeAllItems();
		comboBox_9.setBounds(81, 9, 57, 22);
		panel_21.add(comboBox_9);
		
		lblNewLabel_25 = new JLabel("Start Station");
		lblNewLabel_25.setBounds(141, 13, 62, 14);
		panel_21.add(lblNewLabel_25);
		
		comboBox_10 = new JComboBox();
		comboBox_10.setBounds(213, 9, 72, 22);
		panel_21.add(comboBox_10);
		
		lblNewLabel_26 = new JLabel("End Station");
		lblNewLabel_26.setBounds(295, 13, 57, 14);
		panel_21.add(lblNewLabel_26);
		
		comboBox_11 = new JComboBox();
		comboBox_11.setBounds(353, 9, 72, 22);
		panel_21.add(comboBox_11);
		
		lblNewLabel_27 = new JLabel("Car type");
		lblNewLabel_27.setBounds(435, 13, 41, 14);
		panel_21.add(lblNewLabel_27);
		
		comboBox_12 = new JComboBox(CarType);
		comboBox_12.setBounds(486, 9, 90, 22);
		panel_21.add(comboBox_12);
		
		lblNewLabel_28 = new JLabel("Car code");
		lblNewLabel_28.setBounds(10, 72, 43, 14);
		panel_21.add(lblNewLabel_28);
		
		textField_30 = new JTextField();
		textField_30.setBounds(81, 69, 96, 20);
		panel_21.add(textField_30);
		textField_30.setColumns(10);
		
		lblNewLabel_29 = new JLabel("Car weight");
		lblNewLabel_29.setBounds(240, 72, 53, 14);
		panel_21.add(lblNewLabel_29);
		
		textField_31 = new JTextField();
		textField_31.setBounds(313, 69, 96, 20);
		panel_21.add(textField_31);
		textField_31.setColumns(10);
		
		panel_22 = new JPanel();
		GridBagConstraints gbc_panel_22 = new GridBagConstraints();
		gbc_panel_22.fill = GridBagConstraints.BOTH;
		gbc_panel_22.gridx = 0;
		gbc_panel_22.gridy = 1;
		addInventory.add(panel_22, gbc_panel_22);
		
		lblNewLabel_30 = new JLabel("Status of submission:");
		panel_22.add(lblNewLabel_30);
		
		btnNewButton_5 = new JButton("ADD Car");
		
		panel_22.add(btnNewButton_5);
		
		editInventory = new JPanel();
		HomePanel.add(editInventory, "name_1310157482302200");
		GridBagLayout gbl_editInventory = new GridBagLayout();
		gbl_editInventory.columnWidths = new int[]{586, 0};
		gbl_editInventory.rowHeights = new int[]{74, 283, 0};
		gbl_editInventory.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_editInventory.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		editInventory.setLayout(gbl_editInventory);
		
		panel_23 = new JPanel();
		GridBagConstraints gbc_panel_23 = new GridBagConstraints();
		gbc_panel_23.fill = GridBagConstraints.BOTH;
		gbc_panel_23.insets = new Insets(0, 0, 5, 0);
		gbc_panel_23.gridx = 0;
		gbc_panel_23.gridy = 0;
		editInventory.add(panel_23, gbc_panel_23);
		panel_23.setLayout(null);
		
		lblNewLabel_15_1_1_1 = new JLabel("Enter Code of car to EDIT");
		lblNewLabel_15_1_1_1.setBounds(94, 17, 128, 14);
		panel_23.add(lblNewLabel_15_1_1_1);
		
		textField_34 = new JTextField();
		textField_34.setBounds(232, 14, 136, 20);
		textField_34.setColumns(10);
		panel_23.add(textField_34);
		
		btnNewButton_2_1_1_1 = new JButton("Search");
		btnNewButton_2_1_1_1.setBounds(378, 5, 111, 39);
		panel_23.add(btnNewButton_2_1_1_1);
		
		panel_24 = new JPanel();
		GridBagConstraints gbc_panel_24 = new GridBagConstraints();
		gbc_panel_24.fill = GridBagConstraints.BOTH;
		gbc_panel_24.gridx = 0;
		gbc_panel_24.gridy = 1;
		editInventory.add(panel_24, gbc_panel_24);
		panel_24.setLayout(new CardLayout(0, 0));
		
		panel_28 = new JPanel();
		panel_24.add(panel_28, "name_2600047835335300");
		panel_28.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel_31 = new JLabel("No coincidences...");
		panel_28.add(lblNewLabel_31);
		
		panel_29 = new JPanel();
		panel_24.add(panel_29, "name_2600047882155200");
		panel_29.setLayout(null);
		
		lblNewLabel_24_1 = new JLabel("Station's Line");
		lblNewLabel_24_1.setBounds(28, 27, 66, 14);
		panel_29.add(lblNewLabel_24_1);
		
		comboBox_9_1 = new JComboBox();
		comboBox_9_1.setEnabled(false);
		comboBox_9_1.setBounds(99, 23, 57, 22);
		comboBox_9_1.removeAllItems();
		panel_29.add(comboBox_9_1);
		
		lblNewLabel_25_1 = new JLabel("Start Station");
		lblNewLabel_25_1.setBounds(166, 27, 62, 14);
		panel_29.add(lblNewLabel_25_1);
		
		comboBox_10_1 = new JComboBox();
		comboBox_10_1.setBounds(238, 23, 64, 22);
		panel_29.add(comboBox_10_1);
		
		lblNewLabel_26_1 = new JLabel("End Station");
		lblNewLabel_26_1.setBounds(312, 27, 57, 14);
		panel_29.add(lblNewLabel_26_1);
		
		comboBox_11_1 = new JComboBox();
		comboBox_11_1.setBounds(379, 23, 58, 22);
		panel_29.add(comboBox_11_1);
		
		lblNewLabel_27_1 = new JLabel("Car type");
		lblNewLabel_27_1.setBounds(447, 27, 41, 14);
		panel_29.add(lblNewLabel_27_1);
		
		comboBox_12_1 = new JComboBox(CarType);
		comboBox_12_1.setBounds(498, 23, 78, 22);
		panel_29.add(comboBox_12_1);
		
		lblNewLabel_28_1 = new JLabel("Car code");
		lblNewLabel_28_1.setBounds(28, 96, 43, 14);
		panel_29.add(lblNewLabel_28_1);
		
		textField_32 = new JTextField();
		textField_32.setBounds(99, 93, 96, 20);
		textField_32.setColumns(10);
		panel_29.add(textField_32);
		
		lblNewLabel_29_1 = new JLabel("Car weight");
		lblNewLabel_29_1.setBounds(226, 96, 53, 14);
		panel_29.add(lblNewLabel_29_1);
		
		textField_33 = new JTextField();
		textField_33.setBounds(313, 93, 96, 20);
		textField_33.setColumns(10);
		panel_29.add(textField_33);
		
		lblNewLabel_30_1 = new JLabel("Status of EDITION:");
		lblNewLabel_30_1.setBounds(183, 173, 96, 14);
		panel_29.add(lblNewLabel_30_1);
		
		btnNewButton_5_1 = new JButton("EDIT Car");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_1.setBounds(462, 151, 96, 58);
		panel_29.add(btnNewButton_5_1);
		
		removeInventory = new JPanel();
		HomePanel.add(removeInventory, "name_1310157493252200");
		GridBagLayout gbl_removeInventory = new GridBagLayout();
		gbl_removeInventory.columnWidths = new int[]{586, 0};
		gbl_removeInventory.rowHeights = new int[] {81, 260, 0};
		gbl_removeInventory.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_removeInventory.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		removeInventory.setLayout(gbl_removeInventory);
		
		panel_25 = new JPanel();
		GridBagConstraints gbc_panel_25 = new GridBagConstraints();
		gbc_panel_25.fill = GridBagConstraints.BOTH;
		gbc_panel_25.insets = new Insets(0, 0, 5, 0);
		gbc_panel_25.gridx = 0;
		gbc_panel_25.gridy = 0;
		removeInventory.add(panel_25, gbc_panel_25);
		
		lblNewLabel_15_1_1_1_1 = new JLabel("Enter Code of car to DELETE");
		panel_25.add(lblNewLabel_15_1_1_1_1);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		panel_25.add(textField_35);
		
		btnNewButton_2_1_1_1_1 = new JButton("Search");
		panel_25.add(btnNewButton_2_1_1_1_1);
		
		panel_26 = new JPanel();
		GridBagConstraints gbc_panel_26 = new GridBagConstraints();
		gbc_panel_26.fill = GridBagConstraints.BOTH;
		gbc_panel_26.gridx = 0;
		gbc_panel_26.gridy = 1;
		removeInventory.add(panel_26, gbc_panel_26);
		panel_26.setLayout(new CardLayout(0, 0));
		
		panel_31 = new JPanel();
		panel_26.add(panel_31, "name_2171447686946600");
		
		lblNewLabel_31_1 = new JLabel("No coincidences...");
		panel_31.add(lblNewLabel_31_1);
		
		panel_32 = new JPanel();
		panel_26.add(panel_32, "name_2171447704344899");
		panel_32.setLayout(null);
		
		lblNewLabel_24_1_1 = new JLabel("Station's Line");
		lblNewLabel_24_1_1.setBounds(12, 31, 66, 14);
		panel_32.add(lblNewLabel_24_1_1);
		
		lblNewLabel_25_1_1 = new JLabel("Start Station");
		lblNewLabel_25_1_1.setBounds(16, 56, 62, 14);
		panel_32.add(lblNewLabel_25_1_1);
		
		lblNewLabel_26_1_1 = new JLabel("End Station");
		lblNewLabel_26_1_1.setBounds(16, 81, 57, 14);
		panel_32.add(lblNewLabel_26_1_1);
		
		lblNewLabel_27_1_1 = new JLabel("Car type");
		lblNewLabel_27_1_1.setBounds(16, 106, 41, 14);
		panel_32.add(lblNewLabel_27_1_1);
		
		lblNewLabel_28_1_1 = new JLabel("Car code");
		lblNewLabel_28_1_1.setBounds(16, 135, 43, 14);
		panel_32.add(lblNewLabel_28_1_1);
		
		lblNewLabel_29_1_1 = new JLabel("Car weight");
		lblNewLabel_29_1_1.setBounds(16, 160, 53, 14);
		panel_32.add(lblNewLabel_29_1_1);
		
		lblNewLabel_30_1_1 = new JLabel("Status of DELETION:");
		lblNewLabel_30_1_1.setBounds(194, 160, 104, 14);
		panel_32.add(lblNewLabel_30_1_1);
		
		btnNewButton_5_1_1 = new JButton("DELETE Car");
		btnNewButton_5_1_1.setBounds(413, 84, 143, 66);
		panel_32.add(btnNewButton_5_1_1);
		
		printG = new JPanel();
		HomePanel.add(printG, "name_1310157503782100");
		GridBagLayout gbl_printG = new GridBagLayout();
		gbl_printG.columnWidths = new int[]{586, 0};
		gbl_printG.rowHeights = new int[]{77, 280, 0};
		gbl_printG.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_printG.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		printG.setLayout(gbl_printG);
		
		panel_27 = new JPanel();
		GridBagConstraints gbc_panel_27 = new GridBagConstraints();
		gbc_panel_27.fill = GridBagConstraints.BOTH;
		gbc_panel_27.insets = new Insets(0, 0, 5, 0);
		gbc_panel_27.gridx = 0;
		gbc_panel_27.gridy = 0;
		printG.add(panel_27, gbc_panel_27);
		
		lblNewLabel_32_1_1 = new JLabel("General Report");
		panel_27.add(lblNewLabel_32_1_1);
		
		btnNewButton_6_1_1 = new JButton("General Report");
		btnNewButton_6_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel modelGeneral = new DefaultTableModel(MyRailRoad.createStringsLinesArray(),columnNameGeneral);
				modelGeneral.fireTableDataChanged();
				table_2.setModel(modelGeneral);
			}
		});
		panel_27.add(btnNewButton_6_1_1);
		
		btnNewButton_7_1_1 = new JButton("Excel Report");
		panel_27.add(btnNewButton_7_1_1);
		
		panel_33 = new JPanel();
		GridBagConstraints gbc_panel_33 = new GridBagConstraints();
		gbc_panel_33.fill = GridBagConstraints.BOTH;
		gbc_panel_33.gridx = 0;
		gbc_panel_33.gridy = 1;
		printG.add(panel_33, gbc_panel_33);
		panel_33.setLayout(null);
		
		scrollPane_2 = new ScrollPane();
		table_2 = new JTable(modelGeneral);
		scrollPane_2.add(table_2);
		scrollPane_2.setBounds(0, 0, 586, 280);
		panel_33.add(scrollPane_2);
		
		printL = new JPanel();
		HomePanel.add(printL, "name_1310157514618300");
		GridBagLayout gbl_printL = new GridBagLayout();
		gbl_printL.columnWidths = new int[]{572, 0};
		gbl_printL.rowHeights = new int[]{70, 281, 0, 0};
		gbl_printL.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_printL.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		printL.setLayout(gbl_printL);
		
		panel_30_1 = new JPanel();
		GridBagConstraints gbc_panel_30_1 = new GridBagConstraints();
		gbc_panel_30_1.fill = GridBagConstraints.BOTH;
		gbc_panel_30_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_30_1.gridx = 0;
		gbc_panel_30_1.gridy = 0;
		printL.add(panel_30_1, gbc_panel_30_1);
		
		lblNewLabel_32_1 = new JLabel("Station's Line");
		panel_30_1.add(lblNewLabel_32_1);
		
		comboBox_13_1 = new JComboBox();
		panel_30_1.add(comboBox_13_1);
		
		btnNewButton_6_1 = new JButton("Line Report");
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel modelGeneral = new DefaultTableModel(MyRailRoad.createStringsStationsArry( (String) comboBox_13_1.getSelectedItem()),columnNameStation);
				modelGeneral.fireTableDataChanged();
				table_1.setModel(modelGeneral);
			}
		});
		panel_30_1.add(btnNewButton_6_1);
		
		btnNewButton_7_1 = new JButton("Excel Report");
		panel_30_1.add(btnNewButton_7_1);
		
		scrollPane_1 = new ScrollPane();
		table_1 = new JTable(modelStation);
		scrollPane_1.add(table_1);
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 1;
		printL.add(scrollPane_1, gbc_scrollPane_1);
		
		
		
		printS = new JPanel();
		HomePanel.add(printS, "name_1310157524865700");
		GridBagLayout gbl_printS = new GridBagLayout();
		gbl_printS.columnWidths = new int[]{572, 0};
		gbl_printS.rowHeights = new int[]{72, 283, 0};
		gbl_printS.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_printS.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		printS.setLayout(gbl_printS);
		
		panel_30 = new JPanel();
		GridBagConstraints gbc_panel_30 = new GridBagConstraints();
		gbc_panel_30.fill = GridBagConstraints.BOTH;
		gbc_panel_30.insets = new Insets(0, 0, 5, 0);
		gbc_panel_30.gridx = 0;
		gbc_panel_30.gridy = 0;
		printS.add(panel_30, gbc_panel_30);
		
		lblNewLabel_32 = new JLabel("Station's Line");
		panel_30.add(lblNewLabel_32);
		
		comboBox_13 = new JComboBox();
		comboBox_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_14.removeAllItems();
				for(Object stationObject : MyRailRoad.Lines.get(MyRailRoad.getLineIndex((String)comboBox_13.getSelectedItem())).Stations) {
					if (stationObject.getClass() == InterYard.class) {
						InterYard tempInterYard = (InterYard) stationObject;
						comboBox_14.addItem(tempInterYard.stationName);
					}
					if (stationObject.getClass() == IndusYard.class) {
						IndusYard tempIndusYard= (IndusYard) stationObject;
						comboBox_14.addItem(tempIndusYard.stationName);
					}
					if (stationObject.getClass() == ClassifYard.class) {
						ClassifYard tempClassifYard = (ClassifYard) stationObject;
						comboBox_14.addItem(tempClassifYard.stationName);
					}
					
					
				}
			}
		});
		panel_30.add(comboBox_13);
		
		lblNewLabel_33 = new JLabel("Station Name");
		panel_30.add(lblNewLabel_33);
		
		comboBox_14 = new JComboBox();
		panel_30.add(comboBox_14);
		
		btnNewButton_6 = new JButton("Station Report");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel modelGeneral = new DefaultTableModel(MyRailRoad.createStringStation((String)comboBox_13.getSelectedItem(), (String)comboBox_14.getSelectedItem()),columnNames);
				modelGeneral.fireTableDataChanged();
				table.setModel(modelGeneral);
			}
		});
		panel_30.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("Excel Report");
		panel_30.add(btnNewButton_7);
		scrollPane = new ScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		printS.add(scrollPane, gbc_scrollPane);
		table = new JTable(model);
		table.setFillsViewportHeight(true);
		scrollPane.add(table);
		
		
		
		
		
		
		

		
		loadInventory = new JPanel();
		HomePanel.add(loadInventory, "name_1310157535558300");
		
		instruction = new JPanel();
		HomePanel.add(instruction, "name_1310157546043900");
		instruction.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		
		scrollPane_3 = new ScrollPane();
		instruction.add(scrollPane_3);
		
		textPane = new JTextPane();
		textPane.setText(Instruction);
		scrollPane_3.add(textPane);
		
		about = new JPanel();
		HomePanel.add(about, "name_1310157555789500");
		about.setLayout(new GridLayout(0, 1, 0, 0));
		
		scrollPane_4 = new ScrollPane();
		about.add(scrollPane_4);
		
		textPane_1 = new JTextPane();
		textPane_1.setText(aboutStr);
		scrollPane_4.add(textPane_1);
		
		goHome = new JPanel();
		goHome.setVisible(true);
		goHome.setBackground(Color.blue);
		HomePanel.add(goHome, "name_1310157565987200");
		
		lblNewLabel_21 = new JLabel("Senior Profect APP Yard Organization");
		lblNewLabel_21.setFont(new Font("Verdana", Font.PLAIN, 28));
		goHome.add(lblNewLabel_21);
		
		nextStrStation = new JPanel();
		HomePanel.add(nextStrStation, "name_1315155886210900");
		nextStrStation.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new JPanel();
		nextStrStation.add(panel);
		
		lblNewLabel_5 = new JLabel("Type of Station");
		lblNewLabel_5.setBounds(30, 9, 90, 14);
		
		comboBox_2 = new JComboBox(ClassType);
		comboBox_2.setBounds(130, 5, 147, 22);
		
		lblNewLabel_6 = new JLabel("Station Name");
		lblNewLabel_6.setBounds(30, 40, 96, 14);
		
		textField_3 = new JTextField();
		textField_3.setBounds(150, 37, 96, 20);
		textField_3.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Station Acronym");
		lblNewLabel_7.setBounds(287, 40, 110, 14);
		
		textField_4 = new JTextField();
		textField_4.setBounds(432, 37, 96, 20);
		textField_4.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Station Direction");
		lblNewLabel_8.setBounds(287, 9, 114, 14);
		
		comboBox_3 = new JComboBox(Direction);
		comboBox_3.setBounds(410, 5, 131, 22);
		
		lblNewLabel_9 = new JLabel("Number of lines");
		lblNewLabel_9.setBounds(30, 77, 100, 14);
		
		textField_5 = new JTextField();
		textField_5.setBounds(150, 74, 96, 20);
		textField_5.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Number of cars per line");
		lblNewLabel_10.setBounds(287, 77, 152, 14);
		
		textField_6 = new JTextField();
		textField_6.setBounds(432, 74, 96, 20);
		textField_6.setColumns(10);
		panel.setLayout(null);
		panel.add(lblNewLabel_5);
		
		label = new JLabel("");
		label.setBounds(110, 16, 0, 0);
		panel.add(label);
		
		label_1 = new JLabel("");
		label_1.setBounds(115, 16, 0, 0);
		panel.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setBounds(120, 16, 0, 0);
		panel.add(label_2);
		
		label_3 = new JLabel("");
		label_3.setBounds(125, 16, 0, 0);
		panel.add(label_3);
		
		label_4 = new JLabel("");
		label_4.setBounds(130, 16, 0, 0);
		panel.add(label_4);
		
		label_5 = new JLabel("");
		label_5.setBounds(135, 16, 0, 0);
		panel.add(label_5);
		
		label_6 = new JLabel("");
		label_6.setBounds(140, 16, 0, 0);
		panel.add(label_6);
		
		label_7 = new JLabel("");
		label_7.setBounds(145, 16, 0, 0);
		panel.add(label_7);
		
		label_8 = new JLabel("");
		label_8.setBounds(150, 16, 0, 0);
		panel.add(label_8);
		
		label_9 = new JLabel("");
		label_9.setBounds(155, 16, 0, 0);
		panel.add(label_9);
		
		label_10 = new JLabel("");
		label_10.setBounds(160, 16, 0, 0);
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
		
		panel_1 = new JPanel();
		panel_1.setVisible(false);
		nextStrStation.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		interyard = new JPanel();
		interyard.setVisible(false);
		panel_1.add(interyard, "name_1317477883456400");
		
		lblNewLabel_12 = new JLabel("line to change");
		interyard.add(lblNewLabel_12);
		
		comboBox_5 = new JComboBox();
		interyard.add(comboBox_5);
		
		industryY = new JPanel();
		industryY.setVisible(false);
		panel_1.add(industryY, "name_1317477895157600");
		
		lblNewLabel_13 = new JLabel("Industry Name");
		industryY.add(lblNewLabel_13);
		
		textField_7 = new JTextField();
		industryY.add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel_14 = new JLabel("Description");
		industryY.add(lblNewLabel_14);
		
		textArea_1 = new JTextArea();
		textArea_1.setColumns(40);
		textArea_1.setRows(4);
		industryY.add(textArea_1);
		
		//action lisener optional panels by class of yard
		
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				classTypeSelected = (String)cb.getSelectedItem();
		        System.out.print(classTypeSelected);
		        if (classTypeSelected == "InterchangeYard") {
		        	//industreNameTemp = "";
					//descriptionTempStation = "";
					//station1Temp = "nothing yet"; //to string comboBox_4.getSelectedItem();
					//station2Temp = "nothing yet";// to string comboBox_5.getSelectedItem();
		        	panel_1.setVisible(true);
		        	industryY.setVisible(false);
					interyard.setVisible(true);
					
				}else {
					if (classTypeSelected == "IndustrysupportYard") {
						//industreNameTemp = textField_7.getText();
						//descriptionTempStation = textArea_1.getText();
						//station1Temp = "nothing";
						//station2Temp = "nothing";
						panel_1.setVisible(true);
						industryY.setVisible(true);
						interyard.setVisible(false);
					}else {
						//industreNameTemp = "nothing";
						//descriptionTempStation = "nothing";
						//station1Temp = "nothing";
						//station2Temp = "nothing";
						panel_1.setVisible(false);
						interyard.setVisible(false);
						industryY.setVisible(false);
						
					}
				}
			}
		});
		
		panel_2 = new JPanel();
		nextStrStation.add(panel_2);
		panel_2.setLayout(null);
		
		btnNewButton_1 = new JButton("Next");
		btnNewButton_1.setBounds(221, 29, 131, 52);
		panel_2.add(btnNewButton_1);
		
		AddEndStation = new JPanel();
		HomePanel.add(AddEndStation, "name_1389697286996200");
		AddEndStation.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_4 = new JPanel();
		AddEndStation.add(panel_4);
		panel_4.setLayout(null);
		
		lblNewLabel_5_1 = new JLabel("Type of Station");
		lblNewLabel_5_1.setBounds(30, 9, 96, 14);
		panel_4.add(lblNewLabel_5_1);
		
		label_11 = new JLabel("");
		label_11.setBounds(110, 16, 0, 0);
		panel_4.add(label_11);
		
		label_1_1 = new JLabel("");
		label_1_1.setBounds(115, 16, 0, 0);
		panel_4.add(label_1_1);
		
		label_2_1 = new JLabel("");
		label_2_1.setBounds(120, 16, 0, 0);
		panel_4.add(label_2_1);
		
		label_3_1 = new JLabel("");
		label_3_1.setBounds(125, 16, 0, 0);
		panel_4.add(label_3_1);
		
		label_4_1 = new JLabel("");
		label_4_1.setBounds(130, 16, 0, 0);
		panel_4.add(label_4_1);
		
		label_5_1 = new JLabel("");
		label_5_1.setBounds(135, 16, 0, 0);
		panel_4.add(label_5_1);
		
		label_6_1 = new JLabel("");
		label_6_1.setBounds(140, 16, 0, 0);
		panel_4.add(label_6_1);
		
		label_7_1 = new JLabel("");
		label_7_1.setBounds(145, 16, 0, 0);
		panel_4.add(label_7_1);
		
		label_8_1 = new JLabel("");
		label_8_1.setBounds(150, 16, 0, 0);
		panel_4.add(label_8_1);
		
		label_9_1 = new JLabel("");
		label_9_1.setBounds(155, 16, 0, 0);
		panel_4.add(label_9_1);
		
		label_10_1 = new JLabel("");
		label_10_1.setBounds(160, 16, 0, 0);
		panel_4.add(label_10_1);
		
		comboBox_2_1 = new JComboBox(ClassType);
		comboBox_2_1.setBounds(130, 5, 147, 22);
		panel_4.add(comboBox_2_1);
		
		lblNewLabel_6_1 = new JLabel("Station Name");
		lblNewLabel_6_1.setBounds(30, 41, 105, 14);
		panel_4.add(lblNewLabel_6_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(135, 38, 96, 20);
		textField_8.setColumns(10);
		panel_4.add(textField_8);
		
		lblNewLabel_7_1 = new JLabel("Station Acronym");
		lblNewLabel_7_1.setBounds(287, 41, 115, 14);
		panel_4.add(lblNewLabel_7_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(433, 38, 96, 20);
		textField_9.setColumns(10);
		panel_4.add(textField_9);
		
		lblNewLabel_8_1 = new JLabel("Station Direction");
		lblNewLabel_8_1.setBounds(312, 9, 105, 14);
		panel_4.add(lblNewLabel_8_1);
		
		comboBox_3_1 = new JComboBox(Direction);
		comboBox_3_1.setBounds(430, 5, 131, 22);
		panel_4.add(comboBox_3_1);
		
		lblNewLabel_9_1 = new JLabel("Number of lines");
		lblNewLabel_9_1.setBounds(30, 72, 105, 14);
		panel_4.add(lblNewLabel_9_1);
		
		textField_10 = new JTextField();
		textField_10.setBounds(135, 69, 96, 20);
		textField_10.setColumns(10);
		panel_4.add(textField_10);
		
		lblNewLabel_10_1 = new JLabel("Number of cars per line");
		lblNewLabel_10_1.setBounds(287, 72, 147, 14);
		panel_4.add(lblNewLabel_10_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(433, 69, 96, 20);
		textField_11.setColumns(10);
		panel_4.add(textField_11);
		
		panel_5 = new JPanel();
		AddEndStation.add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		panel_7 = new JPanel();
		panel_5.add(panel_7, "name_1389881066264800");
		
		lblNewLabel_12_1 = new JLabel("Line to change");
		panel_7.add(lblNewLabel_12_1);
		
		comboBox_5_1 = new JComboBox();
		panel_7.add(comboBox_5_1);
		
		panel_8 = new JPanel();
		panel_5.add(panel_8, "name_1389881087703200");
		
		lblNewLabel_13_1 = new JLabel("Industry Name");
		panel_8.add(lblNewLabel_13_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		panel_8.add(textField_12);
		
		lblNewLabel_14_1 = new JLabel("Description");
		panel_8.add(lblNewLabel_14_1);
		
		textArea_1_1 = new JTextArea();
		textArea_1_1.setRows(4);
		textArea_1_1.setColumns(40);
		panel_8.add(textArea_1_1);
		
		panel_6 = new JPanel();
		AddEndStation.add(panel_6);
		panel_6.setLayout(null);
		
		AddLineButton = new JButton("Add Line");
		AddLineButton.setBounds(218, 11, 141, 57);
		panel_6.add(AddLineButton);
		menuBar = new JMenuBar();
		MainPanel.add(menuBar, BorderLayout.NORTH);
		
		Lines = new JMenu("Lines");
		menuBar.add(Lines);
		
		AddLine = new JMenuItem("Add Line");
		AddLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				comboBox_5.removeAllItems();
				comboBox_5_1.removeAllItems();
				for(Line line : MyRailRoad.Lines) {
					comboBox_5.addItem(line.lineName);
						comboBox_5_1.addItem(line.lineName);
				}
				SetPanelVisible("addLine");
			}
		});
		Lines.add(AddLine);
		
		EditLine = new JMenuItem("Edit Line");
		EditLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SetPanelVisible("editLine");
				
			}
		});
		Lines.add(EditLine);
		
		DeleteLine = new JMenuItem("Delete Line");
		DeleteLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_18.setText("Description: ") ;
				lblNewLabel_17_1.setText( "Line Name: "); 
				lblNewLabel_1_1_1.setText("Line Acronym: ") ;
				lblNewLabel_2_1_1.setText( "Line Length: ");
				lblNewLabel_3_1_1.setText("Line Class: ");
				lblNewLabel_4_1_1.setText("Line Direction: ");
				SetPanelVisible("deleteLine");
				
			}
		});
		Lines.add(DeleteLine);
		
		Stations = new JMenu("Stations");
		menuBar.add(Stations);
		
		AddStation = new JMenuItem("Add Station");
		AddStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				comboBox_7.removeAllItems();
				comboBox_5_1_1.removeAllItems();
				for(Line line : MyRailRoad.Lines) {
					
						comboBox_7.addItem(line.lineName);
						comboBox_5_1_1.addItem(line.lineName);
				}
				
				SetPanelVisible("addStation");
			}
		});
		Stations.add(AddStation);
		
		EditStation = new JMenuItem("Edit Station");
		EditStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				comboBox_5_1_1_1.removeAllItems();
				for(Line line : MyRailRoad.Lines) {
					
					comboBox_5_1_1_1.addItem(line.lineName);
				}
				SetPanelVisible("editStation");
			}
		});
		Stations.add(EditStation);
		
		DeleteStation = new JMenuItem("Delete Station");
		DeleteStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePanel.setVisible(false);
				lblNewLabel_17_1_1.setText("Station's line: ");
				lblNewLabel_3_1_1_1.setText("Station class: ");
				lblNewLabel_1_1_1_1.setText("Station Name: ");	 
				lblNewLabel_1_1_1_2.setText("Station Acronym: ");
				lblNewLabel_2_1_1_1.setText("Station number of lines: ");
				lblNewLabel_18_1.setText("Cars per line: ");
				lblNewLabel_4_1_1_1.setText("Station Direction: ");
				lblNewLabel_22.setText("Tail Station: ");
				SetPanelVisible("deleteStation");
			}
		});
		Stations.add(DeleteStation);
		
		Inventory = new JMenu("Inventory");
		menuBar.add(Inventory);
		
		AddInventory = new JMenuItem("Add");
		AddInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_9.removeAllItems();
				for(Line line : MyRailRoad.Lines) {
					
						comboBox_9.addItem(line.lineName);
				}
				SetPanelVisible("addInventory");
			}
		});
		Inventory.add(AddInventory);
		
		EditInventory = new JMenuItem("Edit");
		EditInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				comboBox_9_1.removeAllItems();
//				comboBox_10_1.removeAllItems();
//				comboBox_11_1.removeAllItems();
				SetPanelVisible("editInventory");
			}
		});
		Inventory.add(EditInventory);
		
		RemoveInventory = new JMenuItem("Remove");
		RemoveInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SetPanelVisible("removeInventory");
			}
		});
		Inventory.add(RemoveInventory);
		
		Edit = new JMenu("Edit");
		menuBar.add(Edit);
		
		ReportGprint = new JMenuItem("Print General Report");
		ReportGprint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SetPanelVisible("printG");
			}
		});
		Edit.add(ReportGprint);
		
		ReportLprint = new JMenuItem("Print Line Report");
		ReportLprint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_13_1.removeAllItems();
				for(Line line : MyRailRoad.Lines) {
					
						comboBox_13_1.addItem(line.lineName);
				}
				SetPanelVisible("printL");
			}
		});
		Edit.add(ReportLprint);
		
		ReportSprint = new JMenuItem("Print Station Report");
		ReportSprint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_13.removeAllItems();
				for(Line line : MyRailRoad.Lines) {
					
						comboBox_13.addItem(line.lineName);
				}
				SetPanelVisible("printS");
			}
		});
		Edit.add(ReportSprint);
		
		LoadInventory = new JMenuItem("Load Inventory");
		LoadInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SetPanelVisible("loadInventory");
			}
		});
		Edit.add(LoadInventory);
		
		Help = new JMenu("Help");
		menuBar.add(Help);
		
		Instructions = new JMenuItem("Intrusctions");
		Instructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SetPanelVisible("instruction");
			}
		});
		Help.add(Instructions);
		
		About = new JMenuItem("About");
		About.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SetPanelVisible("about");
			}
		});
		Help.add(About);
		
		Home = new JMenu("HOME");
		menuBar.add(Home);
		
		GoHome = new JMenuItem("Go home");
		GoHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SetPanelVisible("goHome");
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Next in add line to add station of start next
				//System.out.print("tetsing the print");
				lineNameTemp = textField.getText();
				lineAcroTemp = textField_1.getText();
				lineLengthTemp = Float.parseFloat(textField_2.getText());
				lineTypeTemp = (String) comboBox.getSelectedItem();
				directionTemp = (String) comboBox_1.getSelectedItem();
				descripTemp = textArea.getText();
				//System.out.print(lineNameTemp+" , "+ lineAcroTemp+" , "+lineLengthTemp+" , "+ lineTypeTemp+" , "+ directionTemp +" , "+ descripTemp);
				
				SetPanelVisible("nextStrStation");
				
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (classTypeSelected == "InterchangeYard") {
					stlineTemp = lineNameTemp;
					typeTemp = classTypeSelected;
					nameTemp = textField_3.getText(); 
					acroTemp = textField_4.getText();
					directTemp = (String)comboBox_3.getSelectedItem();
					headTemp = "NothingYet";
					tailTemp = "Nothing Yet"; 
					numLinesTemp = Integer.parseInt(textField_5.getText());
					numCarsTemp = Integer.parseInt(textField_6.getText());
		        	industreNameTemp = "nothing";
					descriptionTempStation = "nothing";
					station1Temp = "nothing yet"; //to string comboBox_4.getSelectedItem();
					station2Temp = "nothing yet";// to string comboBox_5.getSelectedItem();
		        	
					
				}else {
					if (classTypeSelected == "IndustrysupportYard") {
						stlineTemp = lineNameTemp;
						typeTemp = classTypeSelected;
						nameTemp = textField_3.getText(); 
						acroTemp = textField_4.getText();
						directTemp = (String)comboBox_3.getSelectedItem();
						headTemp = "NothingYet";
						tailTemp = "Nothing Yet"; 
						numLinesTemp = Integer.parseInt(textField_5.getText());
						numCarsTemp = Integer.parseInt(textField_6.getText());
						industreNameTemp = textField_7.getText();
						descriptionTempStation = textArea_1.getText();
						station1Temp = "nothing";
						station2Temp = "nothing";
						
					}else {
						if (classTypeSelected == "ClassificationYard") {
						stlineTemp = lineNameTemp;
						typeTemp = classTypeSelected;
						nameTemp = textField_3.getText(); 
						acroTemp = textField_4.getText();
						directTemp = (String)comboBox_3.getSelectedItem();
						headTemp = "NothingYet";
						tailTemp = "Nothing Yet"; 
						numLinesTemp = Integer.parseInt(textField_5.getText());
						numCarsTemp = Integer.parseInt(textField_6.getText());
						industreNameTemp = "nothing";
						descriptionTempStation = "nothing";
						station1Temp = "nothing";
						station2Temp = "nothing";
						}
						
					}
				}
				
				SetPanelVisible("AddEndStation");
			}
		});
		
		AddLineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (classTypeSelected2 == "InterchangeYard") {
					stlineTem = lineNameTemp;
					typeTem = classTypeSelected2;
					nameTem = textField_8.getText(); 
					acroTem = textField_9.getText();
					directTem = (String)comboBox_3_1.getSelectedItem();
					headTem = "NothingYet";
					tailTem = "Nothing Yet"; 
					numLinesTem = Integer.parseInt(textField_10.getText());
					numCarsTem = Integer.parseInt(textField_11.getText());
		        	industreNameTem = "nothing";
					descriptionTempStation2 = "nothing";
					station1Tem = "nothing yet"; //to string comboBox_4.getSelectedItem();
					station2Tem = "nothing yet";// to string comboBox_5.getSelectedItem();
		        	
					
				}else {
					if (classTypeSelected2 == "IndustrysupportYard") {
						stlineTem = lineNameTemp;
						typeTem = classTypeSelected2;
						nameTem = textField_8.getText(); 
						acroTem = textField_9.getText();
						directTem = (String)comboBox_3_1.getSelectedItem();
						headTem = "NothingYet";
						tailTem = "Nothing Yet"; 
						numLinesTem = Integer.parseInt(textField_10.getText());
						numCarsTem = Integer.parseInt(textField_11.getText());
						industreNameTem = textField_12.getText();
						descriptionTempStation2 = textArea_1_1.getText();
						station1Tem = "nothing";
						station2Tem = "nothing";
						
					}else {
						if (classTypeSelected2 == "ClassificationYard") {
						stlineTem = lineNameTemp;
						typeTem = classTypeSelected2;
						nameTem = textField_8.getText(); 
						acroTem = textField_9.getText();
						directTem = (String)comboBox_3_1.getSelectedItem();
						headTem = "NothingYet";
						tailTem = "Nothing Yet"; 
						numLinesTem = Integer.parseInt(textField_10.getText());
						numCarsTem = Integer.parseInt(textField_11.getText());
						industreNameTem = "nothing";
						descriptionTempStation2 = "nothing";
						station1Tem = "nothing";
						station2Tem = "nothing";
						}
						
					}
				}
				System.out.print(nameTemp);
				MyRailRoad.addLine(lineNameTemp, lineAcroTemp, lineTypeTemp, directionTemp, lineLengthTemp, nameTemp, nameTem, 0, 0, descripTemp);
				MyRailRoad.addStation( stlineTemp,  typeTemp,  nameTemp,  acroTemp, directTemp,  headTemp,  tailTemp,  numLinesTemp,  numCarsTemp,  industreNameTemp,  descriptionTempStation,  station1Temp,  station2Temp);
				MyRailRoad.addStation( stlineTem,  typeTem,  nameTem,  acroTem, directTem,  headTem,  tailTem,  numLinesTem,  numCarsTem,  industreNameTem,  descriptionTempStation2,  station1Tem,  station2Tem);
				
				MyRailRoad.printLineData();
				SetPanelVisible("goHome");
			}
		});
		comboBox_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
		        classTypeSelected2 = (String)cb.getSelectedItem();
		        System.out.print(classTypeSelected);
		        if (classTypeSelected2 == "InterchangeYard") {
					panel_5.setVisible(true);
		        	panel_7.setVisible(true);
					panel_8.setVisible(false);
				}else {
					if (classTypeSelected2 == "IndustrysupportYard") {
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
		AddStationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (classTypeSelected == "InterchangeYard") {
					stlineTemp = (String)comboBox_7.getSelectedItem();
					typeTemp = classTypeSelected;
					nameTemp = textField_18.getText(); 
					acroTemp = textField_19.getText();
					directTemp = (String)comboBox_3_2.getSelectedItem();
					headTemp = (String) comboBox_8.getSelectedItem();
					tailTemp = "Nothing Yet"; 
					numLinesTemp = Integer.parseInt(textField_20.getText());
					numCarsTemp = Integer.parseInt(textField_21.getText());
		        	industreNameTemp = "nothing";
					descriptionTempStation = "nothing";
					station1Temp = "nothing yet"; //to string comboBox_4_1_1.getSelectedItem();
					station2Temp = "nothing yet";// to string comboBox_5_1_1.getSelectedItem();
		        	
					
				}else {
					if (classTypeSelected == "IndustrysupportYard") {
						stlineTemp =(String)comboBox_7.getSelectedItem();
						typeTemp = classTypeSelected;
						nameTemp = textField_18.getText(); 
						acroTemp = textField_19.getText();
						directTemp = (String)comboBox_3_2.getSelectedItem();
						headTemp = (String) comboBox_8.getSelectedItem();
						tailTemp = "Nothing Yet"; 
						numLinesTemp = Integer.parseInt(textField_20.getText());
						numCarsTemp = Integer.parseInt(textField_21.getText());
						industreNameTemp = textField_22.getText();
						descriptionTempStation = textArea_1_1_1.getText();
						station1Temp = "nothing";
						station2Temp = "nothing";
						
					}else {
						stlineTemp = (String)comboBox_7.getSelectedItem();
						typeTemp = classTypeSelected;
						nameTemp = textField_18.getText(); 
						acroTemp = textField_19.getText();
						directTemp = (String)comboBox_3_2.getSelectedItem();
						headTemp = (String) comboBox_8.getSelectedItem();
						tailTemp = "Nothing Yet"; 
						numLinesTemp = Integer.parseInt(textField_20.getText());
						numCarsTemp = Integer.parseInt(textField_21.getText());
						industreNameTemp = "nothing";
						descriptionTempStation = "nothing";
						station1Temp = "nothing";
						station2Temp = "nothing";
						
					}
				}
				MyRailRoad.addStation( stlineTemp,  typeTemp,  nameTemp,  acroTemp, directTemp,  headTemp,  tailTemp,  numLinesTemp,  numCarsTemp,  industreNameTemp,  descriptionTempStation,  station1Temp,  station2Temp);
				
				SetPanelVisible("goHome");
			}
		});
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				staLineNameTemp =(String) comboBox_9.getSelectedItem();
				staStartNameTemp = (String) comboBox_10.getSelectedItem();
				staEndNameTemp = (String) comboBox_11.getSelectedItem();
				carTypeTemp = (String) comboBox_12.getSelectedItem();
				carCodeTemp = textField_30.getText();
				carWeightTemp = Float.parseFloat(textField_31.getText());
				String temp = MyRailRoad.addCar(staLineNameTemp, carTypeTemp, staStartNameTemp, staEndNameTemp, carCodeTemp, carWeightTemp);
				lblNewLabel_30.setText(temp);
				//SetPanelVisible("goHome");
				
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(textField_13.getText());
				if (MyRailRoad.searchLine(textField_13.getText(), found, noFound)) {
				MyRailRoad.setTempLineData();
				 textArea_2.setText(MyRailRoad.descripTemp) ;
				 textField_14.setText( MyRailRoad.lineNameTemp); 
				 textField_15.setText(MyRailRoad.lineAcroTemp) ;
				 textField_16.setText( Float.toString(MyRailRoad.lineLengthTemp));
				 comboBox_6.setSelectedIndex(MyRailRoad.getArrayIndex(LineClassType, MyRailRoad.lineTypeTemp));
				 comboBox_1_1.setSelectedIndex(MyRailRoad.getArrayIndex(Direction, MyRailRoad.directionTemp));
				}
				
				
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyRailRoad.editLine(MyRailRoad.searchIndexGlobalIntLine,textField_14.getText(), textField_15.getText(), (String) comboBox_6.getSelectedItem(), (String) comboBox_1_1.getSelectedItem(),Float.parseFloat(textField_16.getText()), "nothing", "nothing", 0, 0, textArea_2.getText());
			}
		});
		comboBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_8.removeAllItems();
				for(Object stationObject : MyRailRoad.Lines.get(MyRailRoad.getLineIndex((String)comboBox_7.getSelectedItem())).Stations) {
					if (stationObject.getClass() == InterYard.class) {
						InterYard tempInterYard = (InterYard) stationObject;
						comboBox_8.addItem(tempInterYard.stationName);
					}
					if (stationObject.getClass() == IndusYard.class) {
						IndusYard tempIndusYard= (IndusYard) stationObject;
						comboBox_8.addItem(tempIndusYard.stationName);
					}
					if (stationObject.getClass() == ClassifYard.class) {
						ClassifYard tempClassifYard = (ClassifYard) stationObject;
						comboBox_8.addItem(tempClassifYard.stationName);
					}
					
					
				}
			}
		});
		comboBox_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_10.removeAllItems();
				comboBox_11.removeAllItems();
				for(Object stationObject : MyRailRoad.Lines.get(MyRailRoad.getLineIndex((String)comboBox_9.getSelectedItem())).Stations) {
					if (stationObject.getClass() == InterYard.class) {
						InterYard tempInterYard = (InterYard) stationObject;
						comboBox_10.addItem(tempInterYard.stationName);
						comboBox_11.addItem(tempInterYard.stationName);
					}
					if (stationObject.getClass() == IndusYard.class) {
						IndusYard tempIndusYard= (IndusYard) stationObject;
						comboBox_10.addItem(tempIndusYard.stationName);
						comboBox_11.addItem(tempIndusYard.stationName);
					}
					if (stationObject.getClass() == ClassifYard.class) {
						ClassifYard tempClassifYard = (ClassifYard) stationObject;
						comboBox_10.addItem(tempClassifYard.stationName);
						comboBox_11.addItem(tempClassifYard.stationName);
					}
					
					
				}
			}
		});
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(textField_17.getText());
				lblNewLabel_18.setText("Description: ") ;
				lblNewLabel_17_1.setText( "Line Name: "); 
				lblNewLabel_1_1_1.setText("Line Acronym: ") ;
				lblNewLabel_2_1_1.setText( "Line Length: ");
				lblNewLabel_3_1_1.setText("Line Class: ");
				lblNewLabel_4_1_1.setText("Line Direction: ");
				if (MyRailRoad.searchLine(textField_17.getText(), found_1, noFound_1)) {
				MyRailRoad.setTempLineData();
				lblNewLabel_18.setText(lblNewLabel_18.getText()+MyRailRoad.descripTemp) ;
				lblNewLabel_17_1.setText( lblNewLabel_17_1.getText()+MyRailRoad.lineNameTemp); 
				lblNewLabel_1_1_1.setText(lblNewLabel_1_1_1.getText()+MyRailRoad.lineAcroTemp) ;
				lblNewLabel_2_1_1.setText( lblNewLabel_2_1_1.getText()+Float.toString(MyRailRoad.lineLengthTemp));
				lblNewLabel_3_1_1.setText(lblNewLabel_3_1_1.getText()+MyRailRoad.lineTypeTemp);
				lblNewLabel_4_1_1.setText(lblNewLabel_4_1_1.getText()+MyRailRoad.directionTemp);
				}
			}
		});
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_18.setText("Description: ") ;
				lblNewLabel_17_1.setText( "Line Name: "); 
				lblNewLabel_1_1_1.setText("Line Acronym: ") ;
				lblNewLabel_2_1_1.setText( "Line Length: ");
				lblNewLabel_3_1_1.setText("Line Class: ");
				lblNewLabel_4_1_1.setText("Line Direction: ");
				MyRailRoad.deleteLine(MyRailRoad.searchIndexGlobalIntLine);
			}
		});
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_9_1.removeAllItems();
				comboBox_10_1.removeAllItems();
				comboBox_11_1.removeAllItems();
				if (MyRailRoad.searchCar(textField_34.getText())) {
					
					MyRailRoad.setCarTemporal(MyRailRoad.searchLnNameGlobalString,MyRailRoad.searchStNameGlobalString , MyRailRoad.carGlobalXindex, MyRailRoad.carGlobalYindex);
					
				

					
					for(Object stationObject : MyRailRoad.Lines.get(MyRailRoad.getLineIndex(MyRailRoad.searchLnNameGlobalString)).Stations) {
						if (stationObject.getClass() == InterYard.class) {
							InterYard tempInterYard = (InterYard) stationObject;
							comboBox_10_1.addItem(tempInterYard.stationName);
							comboBox_11_1.addItem(tempInterYard.stationName);
						}
						if (stationObject.getClass() == IndusYard.class) {
							IndusYard tempIndusYard= (IndusYard) stationObject;
							comboBox_10_1.addItem(tempIndusYard.stationName);
							comboBox_11_1.addItem(tempIndusYard.stationName);
						}
						if (stationObject.getClass() == ClassifYard.class) {
							ClassifYard tempClassifYard = (ClassifYard) stationObject;
							comboBox_10_1.addItem(tempClassifYard.stationName);
							comboBox_11_1.addItem(tempClassifYard.stationName);
						}
						
						
					}
					comboBox_9_1.setSelectedItem(MyRailRoad.searchLnNameGlobalString);
					comboBox_10_1.setSelectedIndex(MyRailRoad.getStationIndex(MyRailRoad.staStartNameTemp, MyRailRoad.Lines.get(MyRailRoad.getLineIndex(MyRailRoad.searchLnNameGlobalString))));
					comboBox_11_1.setSelectedIndex(MyRailRoad.getStationIndex(MyRailRoad.staEndNameTemp, MyRailRoad.Lines.get(MyRailRoad.getLineIndex(MyRailRoad.searchLnNameGlobalString))));
					comboBox_12_1.setSelectedIndex(MyRailRoad.getArrayIndex(CarType, MyRailRoad.carTypeTemp));
					textField_32.setText(MyRailRoad.carCodeTemp);
					textField_33.setText(Float.toString(MyRailRoad.carWeightTemp));
					panel_28.setVisible(false);
					panel_29.setVisible(true);
					
					
					System.out.print("pass tru");
				}else {
					System.out.print("NOOOO pass tru");
					panel_28.setVisible(true);
					panel_29.setVisible(false);
				}
			}
		});
		comboBox_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				comboBox_10_1.removeAllItems();
//				comboBox_11_1.removeAllItems();
//				for(Object stationObject : MyRailRoad.Lines.get(MyRailRoad.getLineIndex((String)comboBox_9_1.getSelectedItem())).Stations) {
//					if (stationObject.getClass() == InterYard.class) {
//						InterYard tempInterYard = (InterYard) stationObject;
//						comboBox_10_1.addItem(tempInterYard.stationName);
//						comboBox_11_1.addItem(tempInterYard.stationName);
//					}
//					if (stationObject.getClass() == IndusYard.class) {
//						IndusYard tempIndusYard= (IndusYard) stationObject;
//						comboBox_10_1.addItem(tempIndusYard.stationName);
//						comboBox_11_1.addItem(tempIndusYard.stationName);
//					}
//					if (stationObject.getClass() == ClassifYard.class) {
//						ClassifYard tempClassifYard = (ClassifYard) stationObject;
//						comboBox_10_1.addItem(tempClassifYard.stationName);
//						comboBox_11_1.addItem(tempClassifYard.stationName);
//					}
//					
//					
//				}
				
				
			}
		});
		Home.add(GoHome);
		
		SetPanelVisible("goHome");
	}

}
