package src;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import java.awt.SystemColor;
import java.awt.Font;
import javax.print.attribute.standard.Media;
import javax.swing.ImageIcon;

public class HowToPlay extends JFrame implements ActionListener{
	JFrame frame;
	User u1 = new User(); // 로그인 클래스
	private JButton btn;
	
	public HowToPlay() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1500, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton closebtn = new JButton("");
		closebtn.setBorderPainted(false);
		closebtn.setBorderPainted(false);
		closebtn.setContentAreaFilled(false);
		closebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				frame.setResizable(false);
				frame.setLocation(100,100);
				Main_login l1 = new Main_login();
				l1.setVisible(true);
					
			}
		});
		closebtn.setIcon(new ImageIcon("C:\\Users\\\uC774\uBBFC\uC11C\\Downloads\\schoolruntlqkf\\image\\btn_image\\x_bt.png"));
		closebtn.setBounds(1386, 37, 70, 90);
		frame.getContentPane().add(closebtn);
		
		btn = new JButton();
		btn.setBorderPainted(false);
		btn.setOpaque(false);
		btn.setBounds(0, 0, 9, 9);
		getContentPane().add(btn);
		btn.addActionListener(this);
		btn.doClick();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\\uC774\uBBFC\uC11C\\Downloads\\schoolruntlqkf\\image\\back_image\\Gamerule.jpg"));
		lblNewLabel.setBounds(0, 0, 1500, 811);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
		frame.setLocation(100,100);
		frame.setResizable(false);
		
		btn = new JButton();
		btn.setBorderPainted(false);
		btn.setOpaque(false);
		btn.setBounds(0, 0, 9, 9);
		getContentPane().add(btn);
		btn.addActionListener(this);
		btn.doClick();
	}
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						HowToPlay window = new HowToPlay();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}