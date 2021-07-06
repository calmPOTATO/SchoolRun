package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Game.CharacterInfo;
import src.Select_Item.BoosterMouseListener;
import src.Select_Item.CoinMouseListener;
import src.Select_Item.FriendMouseListener;
import src.Select_Item.LifeMouseListener;
import src.Select_Item.ScoreMouseListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Select_Accessories3 extends JFrame {

	private JPanel contentPane;
	CoinMouseListener coinlistener = new CoinMouseListener();
	ScoreMouseListener scorelistener = new ScoreMouseListener();
	LifeMouseListener lifelistener = new LifeMouseListener();
	String character_accessories[][] = new String[3][5];
	CharacterInfo c_info = new CharacterInfo();
	String character_now = c_info.now;
	String now, ch, run, jump, doublejump, fall, slide;
	User u1 = new User();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_Accessories1 frame = new Select_Accessories1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// 경로 설정
	public void setCharacter_accessories() {
		// 모자
		character_accessories[0][0] = "..//image//game_image//santa_h_run.gif";
		character_accessories[0][1] = "..//image//game_image//santa_h_jump.png";
		character_accessories[0][2] = "..//image//game_image//santa_doublejump.gif";
		character_accessories[0][3] = "..//image//game_image//santa_h_bump.png";
		character_accessories[0][4] = "..//image//game_image//santa_h_slide.png";
		// 머리띠
		character_accessories[1][0] = "..//image//game_image//santa_r_run.gif";
		character_accessories[1][1] = "..//image//game_image//santa_r_jump.png";
		character_accessories[1][2] = "..//image//game_image//santa_doublejump.gif";
		character_accessories[1][3] = "..//image//game_image//santa_r_bump.png";
		character_accessories[1][4] = "..//image//game_image//santa_r_slide.png";
		// 장갑
		character_accessories[2][0] = "..//image//game_image//santa_g_run.gif";
		character_accessories[2][1] = "..//image//game_image//santa_g_jump.png";
		character_accessories[2][2] = "..//image//game_image//santa_doublejump.gif";
		character_accessories[2][3] = "..//image//game_image//santa_g_bump.png";
		character_accessories[2][4] = "..//image//game_image//santa_g_slide.png";
	}

	class CoinMouseListener implements MouseListener {
		boolean check = false;

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				check = true;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\gloves_bt_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\gloves_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\gloves_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			// JButton b = (JButton)e.getSource();
			// b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override // 마우스가 안으로
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\gloves_bt_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\gloves_bt_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\gloves_bt.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\gloves_bt_check.png"));
			}
		}
	}

	class ScoreMouseListener implements MouseListener {

		boolean check = false;

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				check = true;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hat_bt_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hat_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\hat_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			// JButton b = (JButton)e.getSource();
			// b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override // 마우스가 안으로
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hat_bt_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hat_bt_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hat_bt.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hat_bt_check.png"));
			}
		}
	}

	class LifeMouseListener implements MouseListener {
		boolean check = false;

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				check = true;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hairband_bt_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hairband_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\hairband_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			// JButton b = (JButton)e.getSource();
			// b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override // 마우스가 안으로
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hairband_bt_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hairband_bt_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hairband_bt.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hairband_bt_check.png"));
			}
		}

	}

	/**
	 * Create the frame.
	 */
	public Select_Accessories3() {
		u1.getAll();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		this.setCharacter_accessories();

		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setFocusPainted(false);
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select_Item t1 = new Select_Item();
				t1.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1_1_1.setIcon(new ImageIcon("..\\image\\btn_image\\READY_bt (2).png"));
		btnNewButton_1_1_1.setBounds(741, 578, 540, 200);
		contentPane.add(btnNewButton_1_1_1);

		// 선택한 악세사리의 사진
		JLabel choose_img = new JLabel("");
		choose_img.setBounds(590, 376, 130, 140);
		contentPane.add(choose_img);
		// 선택한 악세사리의 설명
		JLabel choose_info = new JLabel("");
		choose_info.setBounds(800, 376, 360, 60);
		choose_info.setFont(new Font("메이플스토리", Font.BOLD, 22));
		contentPane.add(choose_info);
		// 현재 캐릭터
		JLabel character_img = new JLabel("");
		character_img.setBounds(180, 250, 200, 300);
		character_img.setIcon(new ImageIcon(c_info.chStr));
		contentPane.add(character_img);

		// 장갑아이템
		JButton gloves_btn = new JButton("");
		gloves_btn.addMouseListener(coinlistener);
		gloves_btn.setFocusPainted(false);
		gloves_btn.setBorderPainted(false);
		gloves_btn.setContentAreaFilled(false);
		gloves_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now = character_now;
				run = character_accessories[2][0];
				jump = character_accessories[2][1];
				doublejump = character_accessories[2][2];
				fall = character_accessories[2][3];
				slide = character_accessories[2][4];
				
				character_img.setIcon(new ImageIcon(ch));
				choose_img.setIcon(new ImageIcon("..//image//btn_image//gloves_bt.png"));
				choose_info.setText("장갑");
			}
		});
		gloves_btn.setIcon(new ImageIcon("..\\image\\btn_image\\gloves_bt.png"));
		gloves_btn.setBounds(728, 169, 140, 153);
		contentPane.add(gloves_btn);

		// 모자
		JButton hat_btn = new JButton("");
		hat_btn.addMouseListener(scorelistener);
		hat_btn.setFocusPainted(false);
		hat_btn.setBorderPainted(false);
		hat_btn.setContentAreaFilled(false);
		hat_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now = character_now;
				run = character_accessories[0][0];
				jump = character_accessories[0][1];
				doublejump = character_accessories[0][2];
				fall = character_accessories[0][3];
				slide = character_accessories[0][4];
				
				character_img.setIcon(new ImageIcon(ch));
				choose_img.setIcon(new ImageIcon("..//image//btn_image//hat_bt.png"));
				choose_info.setText("모자");
			}
		});
		hat_btn.setIcon(new ImageIcon("..\\image\\btn_image\\hat_bt.png"));
		hat_btn.setBounds(929, 169, 140, 153);
		contentPane.add(hat_btn);

		JButton hairband_btn = new JButton("");
		hairband_btn.addMouseListener(lifelistener);
		hairband_btn.setFocusPainted(false);
		hairband_btn.setBorderPainted(false);
		hairband_btn.setContentAreaFilled(false);
		hairband_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now = character_now;
				run = character_accessories[1][0];
				jump = character_accessories[1][1];
				doublejump = character_accessories[1][2];
				fall = character_accessories[1][3];
				slide = character_accessories[1][4];
				
				character_img.setIcon(new ImageIcon(ch));
				choose_img.setIcon(new ImageIcon("..//image//btn_image//hairband_bt.png"));
				choose_info.setText("루돌프 머리띠");
			}
		});
		hairband_btn.setIcon(new ImageIcon("..\\image\\btn_image\\hairband_bt.png"));
		hairband_btn.setBounds(1130, 169, 140, 153);
		contentPane.add(hairband_btn);


		JButton backbtn = new JButton("");
		backbtn.setIcon(new ImageIcon("..\\image\\btn_image\\return_bt.png"));
		backbtn.setFocusPainted(false);
		backbtn.setBorderPainted(false);
		backbtn.setContentAreaFilled(false);
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Select_Character sc = new Select_Character();
				sc.setVisible(true);
			}
		});
		backbtn.setBounds(100, 661, 180, 120);
		contentPane.add(backbtn);

		JButton apply_btn = new JButton("");
		apply_btn.setFocusPainted(false);
		apply_btn.setBorderPainted(false);
		apply_btn.setContentAreaFilled(false);
		apply_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_info.setCharacter(now, ch, run, jump, doublejump, fall, slide);
				character_img.setIcon(new ImageIcon(c_info.chStr));
			}
		});
		apply_btn.setIcon(new ImageIcon("..\\image\\btn_image\\apply_bt.png"));
		apply_btn.setBounds(1243, 389, 180, 120);
		contentPane.add(apply_btn);


		JLabel money_label = new JLabel(String.valueOf(u1.now_money));
		money_label.setBounds(150, 75, 150, 30);
		contentPane.add(money_label);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("..\\image\\game_image\\coin.png"));
		lblNewLabel_3.setBounds(100, 50, 80, 80);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("..\\image\\back_image\\accessories__bg.png"));
		lblNewLabel_6.setBounds(0, 0, 1484, 811);
		contentPane.add(lblNewLabel_6);

	}
}
