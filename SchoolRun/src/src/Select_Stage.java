package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Game.Stage1;
import Game.Stage2;
import Game.Stage3;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class Select_Stage extends JFrame {

	private JPanel contentPane;
	int level;
	User u1 = new User();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_Stage frame = new Select_Stage();
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
	public Select_Stage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton stage1btn = new JButton();
		stage1btn.setIcon(new ImageIcon("..\\image\\btn_image\\stage1_bt.png"));
		stage1btn.setFocusPainted(false);
		stage1btn.setBorderPainted(false);
		stage1btn.setContentAreaFilled(false);
		stage1btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level = 1;
				if(u1.setStage(level)) {
					setVisible(false);
					ChooseMode cm = new ChooseMode();
					cm.setVisible(true);
					cm.stage = 1;
				} else {
					System.out.println("레벨이 안됩니다.");
				}
			}
		});
		stage1btn.setBounds(134, 221, 309, 329);
		contentPane.add(stage1btn);	
		
		
		JButton stage2btn = new JButton();
		stage2btn.setIcon(new ImageIcon("..\\image\\btn_image\\stage2_bt.png"));
		stage2btn.setFocusPainted(false);
		stage2btn.setBorderPainted(false);
		stage2btn.setContentAreaFilled(false);
		stage2btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level = 2;
				if(u1.setStage(level)) {
					setVisible(false);
					ChooseMode cm = new ChooseMode();
					cm.setVisible(true);
					cm.stage = 2;
				} else {
					System.out.println("레벨이 안됩니다.");
				}	
			}
		});
		stage2btn.setBounds(592, 381, 309, 329);
		contentPane.add(stage2btn);
		
		
		JButton stage3btn = new JButton();
		stage3btn.setIcon(new ImageIcon("..\\image\\btn_image\\stage3_bt.png"));
		stage3btn.setFocusPainted(false);
		stage3btn.setBorderPainted(false);
		stage3btn.setContentAreaFilled(false);
		stage3btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level = 3;
				if(u1.setStage(level)) {
					setVisible(false);
					ChooseMode cm = new ChooseMode();
					cm.setVisible(true);
					cm.stage = 3;
				} else {
					System.out.println("레벨이 안됩니다.");
				}
			}
		});
		stage3btn.setBounds(1053, 221, 309, 329);
		contentPane.add(stage3btn);
		
		JButton backbtn = new JButton("");
		backbtn.setIcon(new ImageIcon("..\\image\\btn_image\\return_bt.png"));
		backbtn.setBounds(100, 661, 180, 120);
		backbtn.setFocusPainted(false);
		backbtn.setBorderPainted(false);
		backbtn.setContentAreaFilled(false);
		contentPane.add(backbtn);

		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Select_Item sc = new Select_Item();
				sc.setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("..\\image\\back_image\\STAGE_bg.png"));
		lblNewLabel.setBounds(0, 0, 1484, 811);
		contentPane.add(lblNewLabel);

	}
}
