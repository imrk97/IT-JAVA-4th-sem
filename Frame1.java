import java.util.Vector;
import java.util.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Frame1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Library management system");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 664, 50);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Admin Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame2 F2=new Frame2();
				F2.setVisible(true);
			}
		});
		btnNewButton.setBounds(52, 96, 145, 72);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registration");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminRegistration F6=new AdminRegistration();
				F6.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(267, 96, 145, 72);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Contact Us");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton_2, "for query call on 9876543210 \n\n or you can mail us at abc@gmail.com");
			}
		});
		btnNewButton_2.setBounds(468, 96, 145, 72);
		contentPane.add(btnNewButton_2);
		 try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	            PreparedStatement ps = con.prepareStatement("select BOOK_NAME from LIBRARY");
	            ResultSet rs = ps.executeQuery();
	            Vector v = new Vector();
	            while (rs.next())
	            {
	                String s = rs.getString(1);
	                v.add(s);
	            }
	 
	        } catch (Exception ex) {
	            System.out.println(ex);
	        }
	}
}
