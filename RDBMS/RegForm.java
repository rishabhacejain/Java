package comm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;


import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;

public class RegForm {

	private JFrame freg;
	private JTextField textField_Id;
	private JTextField textField_Name;
	private JTextField textField_Address;
	private JTextField textField_Contact;
	private static JTable Regtable;
	private JRadioButton rdbtn_Male;
	private JRadioButton rdbtn_Female;
	private String gender;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegForm window = new RegForm();
					window.freg.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegForm() {
		
		initialize();
		connection();
		load();
	}
	
	static Connection cn = null;
	public static void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rdbms1", "root","!Rishabhjain66");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public static void load() {
		try {
			PreparedStatement ps = cn.prepareStatement("SELECT * FROM Regform");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) Regtable.getModel();
			
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		freg = new JFrame();
		freg.setResizable(false);
		freg.setTitle("REGISTRATION FORM");
		freg.getContentPane().setBackground(SystemColor.control);
		freg.setBounds(100, 100, 832, 412);
		freg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		freg.getContentPane().setLayout(null);
//		freg.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		
		
		JLabel regfLable = new JLabel("Registration Form");
		regfLable.setFont(new Font("Times New Roman", Font.BOLD, 14));
		regfLable.setBounds(40, 20, 126, 13);
		freg.getContentPane().add(regfLable);
		
		JLabel idLable = new JLabel("ID");
		idLable.setFont(new Font("Tahoma", Font.BOLD, 11));
		idLable.setBounds(20, 50, 45, 13);
		freg.getContentPane().add(idLable);
		
		JLabel nameLable = new JLabel("Name");
		nameLable.setFont(new Font("Tahoma", Font.BOLD, 11));
		nameLable.setBounds(20, 80, 45, 13);
		freg.getContentPane().add(nameLable);
		
		JLabel genderLable = new JLabel("Gender");
		genderLable.setFont(new Font("Tahoma", Font.BOLD, 11));
		genderLable.setBounds(20, 112, 45, 13);
		freg.getContentPane().add(genderLable);
		
		JLabel addressLable = new JLabel("Address");
		addressLable.setFont(new Font("Tahoma", Font.BOLD, 11));
		addressLable.setBounds(20, 140, 55, 13);
		freg.getContentPane().add(addressLable);
		
		JLabel contactLable = new JLabel("Contact");
		contactLable.setFont(new Font("Tahoma", Font.BOLD, 11));
		contactLable.setBounds(20, 170, 55, 13);
		freg.getContentPane().add(contactLable);
		
		textField_Id = new JTextField();
		textField_Id.setBounds(80, 46, 110, 25);
		freg.getContentPane().add(textField_Id);
		textField_Id.setColumns(10);
		
		textField_Name = new JTextField();
		textField_Name.setColumns(10);
		textField_Name.setBounds(80, 76, 110, 25);
		freg.getContentPane().add(textField_Name);
		
		textField_Address = new JTextField();
		textField_Address.setColumns(10);
		textField_Address.setBounds(80, 136, 110, 25);
		freg.getContentPane().add(textField_Address);
		
		textField_Contact = new JTextField();
		textField_Contact.setColumns(10);
		textField_Contact.setBounds(80, 166, 110, 25);
		freg.getContentPane().add(textField_Contact);
		
	    rdbtn_Male = new JRadioButton("Male");
		rdbtn_Male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender = "Male";
				if(rdbtn_Male.isSelected()) {
					rdbtn_Female.setSelected(false);
				}
				
			}
		});
		rdbtn_Male.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdbtn_Male.setBackground(SystemColor.control);
		rdbtn_Male.setBounds(80, 106, 52, 25);
		freg.getContentPane().add(rdbtn_Male);
		
		rdbtn_Female = new JRadioButton("Female");
		rdbtn_Female.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender = "Female";
				if(rdbtn_Female.isSelected()) {
					rdbtn_Male.setSelected(false);
				}
				
			}
		});
		rdbtn_Female.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdbtn_Female.setBackground(SystemColor.control);
		rdbtn_Female.setBounds(130, 106, 103, 25);
		freg.getContentPane().add(rdbtn_Female);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null,"Are You Sure You Want To Exit?","Select an Option.....",JOptionPane.YES_NO_OPTION);
				
				if(a== JOptionPane.YES_OPTION) {
					freg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					System.exit(0);
				
					
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnExit.setBounds(40, 220, 85, 25);
		freg.getContentPane().add(btnExit);
		
		JButton btnRegister = new JButton("Register");
				btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID = textField_Id.getText();
				String Name = textField_Name.getText();
				String Gender = gender;
				String Address = textField_Address.getText();
				String Contact = textField_Contact.getText();
				String msg ="" + Name + " ";
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("Driver Loaded");

					String url = "jdbc:mysql://localhost:3306/rdbms1";
					String user = "root";
					String password = "!Rishabhjain66";

					Connection con = DriverManager.getConnection(url, user, password);
					System.out.println("Connection Established");

					
					PreparedStatement ps1 = con.prepareStatement("insert into regform(ID, Name, Gender,Address,Contact) value(?,?,?,?,?)");
					
					ps1.setString(1, ID);
					ps1.setString(2, Name);
					ps1.setString(3, Gender);
					ps1.setString(4, Address);
					ps1.setString(5, Contact);
			
					int i = ps1.executeUpdate();

					if (i > 0) {
						
						JOptionPane.showMessageDialog(btnRegister, "Welcome,"+ msg + "Your account is registered");
					
					}

				} catch (SQLException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
				
			
		});
		
		
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRegister.setBounds(148, 220, 85, 25);
		freg.getContentPane().add(btnRegister);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDelete.setEnabled(false);
		btnDelete.setBounds(40, 250, 85, 25);
		freg.getContentPane().add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnUpdate.setEnabled(false);
		btnUpdate.setBounds(148, 250, 85, 25);
		freg.getContentPane().add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnReset.setEnabled(false);
		btnReset.setBounds(95, 280, 85, 25);
		freg.getContentPane().add(btnReset);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(314, 20, 472, 310);
		freg.getContentPane().add(scrollPane);
		
		Regtable = new JTable();
		Regtable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "Name", "Gender", "Address", "Contact"
			}
		));
		scrollPane.setViewportView(Regtable);
		Regtable.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Regtable.setBackground(SystemColor.control);
		
		JButton btnRefreshTable = new JButton("Refresh Table");
		btnRefreshTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("Driver Loaded");

					String url = "jdbc:mysql://localhost:3306/rdbms1";
					String user = "root";
					String password = "!Rishabhjain66";

					Connection con = DriverManager.getConnection(url, user, password);
					System.out.println("Connection Established");
					
					

					PreparedStatement ps1 = con.prepareStatement("Select * From regform");
					ResultSet rs = ps1.executeQuery();
					Regtable.setModel(DbUtils.resultSetToTableModel(rs));

				
				} catch (SQLException | ClassNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
			
		});
		btnRefreshTable.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRefreshTable.setBounds(478, 340, 171, 25);
		freg.getContentPane().add(btnRefreshTable);
	}
}
