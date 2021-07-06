package src;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Game.CharacterInfo;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Select_Character extends JFrame {

	private JPanel contentPane;
	CharacterInfo c_info = new CharacterInfo();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 Select_Character frame = new  Select_Character();
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
	public  Select_Character() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton Closet1 = new JButton("");
		Closet1.setIcon(new ImageIcon("..\\image\\btn_image\\accessories_bt.png"));
		Closet1.setFocusPainted(false);
		Closet1.setBorderPainted(false);
		Closet1.setContentAreaFilled(false);
		Closet1.setLocation(414,141);
		Closet1.setSize(100, 100);
		contentPane.add(Closet1);
		Closet1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Select_Accessories1 a1 = new  Select_Accessories1();
				 a1.setVisible(true);
				 setVisible(false);
			}
		});
		
		JButton Closet2 = new JButton("");
		Closet2.setBounds(832, 141, 100, 100);
		Closet2.setIcon(new ImageIcon("..\\image\\btn_image\\accessories_bt.png"));
		Closet2.setFocusPainted(false);
		Closet2.setBorderPainted(false);
		Closet2.setContentAreaFilled(false);
		contentPane.add(Closet2);
		Closet2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Select_Accessories2 a2 = new  Select_Accessories2();
				 a2.setVisible(true);
				 setVisible(false);
			}
		});
		
		JButton Closet3 = new JButton("");
		Closet3.setBounds(1259, 141, 100, 100);
		Closet3.setIcon(new ImageIcon("..\\image\\btn_image\\accessories_bt.png"));
		Closet3.setFocusPainted(false);
		Closet3.setBorderPainted(false);
		Closet3.setContentAreaFilled(false);
		contentPane.add(Closet3);
		Closet3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Select_Accessories3 a3 = new  Select_Accessories3();
				 a3.setVisible(true);
				 setVisible(false);
			}
		});
		
		
		JButton chracter1 = new JButton("");
		chracter1.setBounds(180, 186, 300, 440);
		chracter1.setFocusPainted(false);
		chracter1.setBorderPainted(false);
		chracter1.setContentAreaFilled(false);
		chracter1.setOpaque(false);
		contentPane.add(chracter1);
		chracter1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String now = "애기";
				String ch = "..//image//game_image//baby_run_label.png";
				String run = "..//image//game_image//baby_run.gif";
				String jump = "..//image//game_image//baby_jump.jpg";
				String doubleJump = "..//image//game_image//baby_doubleJump.gif";
				String fall = "..//image//game_image//baby_bump.png";
				String slide = "..//image//game_image//baby_slide.jpg";
				c_info.setCharacter(now, ch, run, jump, doubleJump, fall, slide);
				CharacterSetResult s1 = new CharacterSetResult();
				s1.setVisible(true);
				System.out.println(c_info.now);
			}
		});
		
		JButton character2 = new JButton("");
		character2.setBounds(603, 186, 300, 440);
		character2.setFocusPainted(false);
		character2.setBorderPainted(false);
		character2.setContentAreaFilled(false);
		character2.setOpaque(false);
		contentPane.add(character2);
		character2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String now = "학생";
				String ch = "..//image//game_image//student_run_label.png";
				String run = "..//image//game_image//student_run.gif";
				String jump = "..//image//game_image//student_jump.jpg";
				String doubleJump = "..//image//game_image//student_doubleJump.gif";
				String fall = "..//image//game_image//student_bump.png";
				String slide = "..//image//game_image//student_slide.jpg";
				c_info.setCharacter(now, ch, run, jump, doubleJump, fall, slide);
				CharacterSetResult s1 = new CharacterSetResult();
				s1.setVisible(true);
				System.out.println(c_info.now);
			}
		});
		
		JButton character3 = new JButton("");
		character3.setBounds(1023, 186, 300, 440);
		contentPane.add(character3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("..\\image\\back_image\\character_bg.png"));
		lblNewLabel.setBounds(0, 0, 1484, 811);
		character3.setFocusPainted(false);
		character3.setBorderPainted(false);
		character3.setContentAreaFilled(false);
		character3.setOpaque(false);
		contentPane.add(lblNewLabel);
		character3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String now = "영감";
				String ch = "..//image//game_image//santa_run_label.png";
				String run = "..//image//game_image//santa_run.gif";
				String jump = "..//image//game_image//santa_jump.jpg";
				String doubleJump = "..//image//game_image//santa_doubleJump.gif";
				String fall = "..//image//game_image//santa_bump.jpg";
				String slide = "..//image//game_image//santa_slide.jpg";
				c_info.setCharacter(now, ch, run, jump, doubleJump, fall, slide);
				CharacterSetResult s1 = new CharacterSetResult();
				s1.setVisible(true);
				System.out.println(c_info.now);
			}
		});
	}
}
