package src;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Game.CharacterInfo;
import java.awt.Font;

public class Select_Item extends JFrame {

	private JPanel contentPane;
	User u1 = new User();
	CharacterInfo c_info = new CharacterInfo();
	int item_num = 0;
	CoinMouseListener coinlistener = new CoinMouseListener();
	ScoreMouseListener scorelistener = new ScoreMouseListener();
	LifeMouseListener lifelistener = new LifeMouseListener();
	FriendMouseListener friendlistener = new FriendMouseListener();
	BoosterMouseListener boosterlistener = new BoosterMouseListener();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_Item frame = new Select_Item();
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
	class CoinMouseListener implements MouseListener {
		boolean check = false;

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				check = true;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\coinx2_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\coinx2.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\coinx2_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\coinx2_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\coinx2_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\coinx2.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\coinx2_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\scorex2_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\scorex2.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\scorex2_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\scorex2_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\scorex2_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\scorex2.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\scorex2_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hpx2_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hpx2.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\hpx2_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hpx2_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hpx2_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hpx2.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\hpx2_check.png"));
			}
		}

	}

	class FriendMouseListener implements MouseListener {
		boolean check = false;

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				check = true;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
			}
		}

	}

	class BoosterMouseListener implements MouseListener {
		boolean check = false;

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				check = true;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\booster_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\booster.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\booster_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\booster_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\booster_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\booster.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\booster_check.png"));
			}
		}

	}

	public Select_Item() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton gochracter = new JButton("");
		gochracter.setIcon(new ImageIcon("..\\image\\btn_image\\chacrater_bt.png"));
		gochracter.setBounds(564, 581, 310, 90);
		gochracter.setFocusPainted(false);
		gochracter.setBorderPainted(false);
		gochracter.setContentAreaFilled(false);
		contentPane.add(gochracter);

		gochracter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Select_Character sc = new Select_Character();
				sc.setVisible(true);
			}
		});

		JButton gotheme = new JButton("");
		gotheme.setIcon(new ImageIcon("..\\image\\btn_image\\theme_bt.png"));
		gotheme.setBounds(564, 691, 310, 90);
		gotheme.setFocusPainted(false);
		gotheme.setBorderPainted(false);
		gotheme.setContentAreaFilled(false);
		contentPane.add(gotheme);

		gotheme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Select_Thema sc = new Select_Thema();
				sc.setVisible(true);
			}
		});

		JButton gostage = new JButton("");
		gostage.setIcon(new ImageIcon("..\\image\\btn_image\\start_bt.png"));
		gostage.setBounds(904, 581, 540, 200);
		gostage.setFocusPainted(false);
		gostage.setBorderPainted(false);
		gostage.setContentAreaFilled(false);
		contentPane.add(gostage);

		gostage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Select_Stage sc = new Select_Stage();
				sc.setVisible(true);
			}
		});

		// 선택한 아이템의 사진
		JLabel choose_img = new JLabel("");
		choose_img.setBounds(590, 376, 130, 140);
		contentPane.add(choose_img);
		// 선택한 아이템의 설명
		JLabel choose_info = new JLabel("");
		choose_info.setBounds(800, 376, 362, 120);
		contentPane.add(choose_info);

		JButton money2x = new JButton("");
		money2x.addMouseListener(coinlistener);
		money2x.setIcon(new ImageIcon("..\\image\\btn_image\\coinx2.png"));
		money2x.setBounds(608, 158, 142, 151);
		money2x.setFocusPainted(false);
		money2x.setBorderPainted(false);
		money2x.setContentAreaFilled(false);
		contentPane.add(money2x);
		money2x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 이걸 누르면 돈2배 아이템 정보
				item_num = 1;
				choose_img.setIcon(new ImageIcon("..//image//btn_image//coinx2.png"));
				choose_info.setText("돈이 두배가 됩니다.");
				choose_info.setFont(new Font("메이플스토리", Font.BOLD, 22));
			}

		});

		JButton score2x = new JButton("");
		score2x.setIcon(new ImageIcon("..\\image\\btn_image\\scorex2.png"));
		score2x.setBounds(781, 158, 142, 151);
		score2x.addMouseListener(scorelistener);
		score2x.setFocusPainted(false);
		score2x.setBorderPainted(false);
		score2x.setContentAreaFilled(false);
		contentPane.add(score2x);
		score2x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 이걸 누르면 점수2배 아이템 정보
				item_num = 2;
				choose_img.setIcon(new ImageIcon("..//image//btn_image//scorex2.png"));
				choose_info.setText("점수가 두배가 됩니다.");
				choose_info.setFont(new Font("메이플스토리", Font.BOLD, 22));
			}
		});

		JButton life2x = new JButton("");
		life2x.setIcon(new ImageIcon("..\\image\\btn_image\\hpx2.png"));
		life2x.setBounds(946, 158, 142, 151);
		life2x.addMouseListener(lifelistener);
		life2x.setFocusPainted(false);
		life2x.setBorderPainted(false);
		life2x.setContentAreaFilled(false);
		contentPane.add(life2x);
		life2x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 이걸 누르면 생명2배 아이템 정보
				item_num = 3;
				choose_img.setIcon(new ImageIcon("..//image//btn_image//hpx2.png"));
				choose_info.setText("생명이 두배가 됩니다.");
				choose_info.setFont(new Font("메이플스토리", Font.BOLD, 22));
			}
		});

		JButton friend = new JButton("");
		friend.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode.png"));
		friend.addMouseListener(friendlistener);
		friend.setFocusPainted(false);
		friend.setBorderPainted(false);
		friend.setContentAreaFilled(false);
		friend.setBounds(1111, 158, 142, 151);
		contentPane.add(friend);
		friend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 이걸 누르면 친구 아이템 정보
				item_num = 4;
				choose_img.setIcon(new ImageIcon("..//image//btn_image//friendsmode.png"));
				choose_info.setText("캐릭터가 친구와 함꼐 달릴 수 있습니다.");
				choose_info.setFont(new Font("메이플스토리", Font.BOLD, 22));
			}
		});

		JButton booster = new JButton("");
		booster.setIcon(new ImageIcon("..\\image\\btn_image\\booster.png"));
		booster.setBounds(1275, 158, 150, 151);
		booster.addMouseListener(boosterlistener);
		booster.setFocusPainted(false);
		booster.setBorderPainted(false);
		booster.setContentAreaFilled(false);
		contentPane.add(booster);
		booster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 이걸 누르면 부스터 아이템 정보
				item_num = 5;
				choose_img.setIcon(new ImageIcon("..//image//btn_image//booster.png"));
				choose_info.setText("일정시간동안 무적상태로 빠르게 달립니다.");
				choose_info.setFont(new Font("메이플스토리", Font.BOLD, 22));
			}
		});

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(c_info.chStr));
		lblNewLabel_1.setBounds(180, 250, 200, 309);
		contentPane.add(lblNewLabel_1);

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
				Rancking sc = new Rancking();
				sc.setVisible(true);
			}
		});

		JButton buy_btn = new JButton("");
		buy_btn.setIcon(new ImageIcon("..\\image\\btn_image\\buy.png"));
		buy_btn.setBounds(1243, 389, 180, 120);
		buy_btn.setFocusPainted(false);
		buy_btn.setBorderPainted(false);
		buy_btn.setContentAreaFilled(false);
		contentPane.add(buy_btn);
		buy_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				u1.buyItem(item_num);
			}
		});

		u1.getAll();

		JLabel money_label = new JLabel(String.valueOf(u1.now_money));
		money_label.setFont(new Font("메이플스토리", Font.BOLD, 12));
		money_label.setBounds(150, 75, 150, 30);
		contentPane.add(money_label);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("..\\image\\game_image\\coin.png"));
		lblNewLabel_3.setBounds(100, 50, 80, 80);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("..\\image\\back_image\\ITEM_bg.png"));
		lblNewLabel_6.setBounds(0, 0, 1484, 811);
		contentPane.add(lblNewLabel_6);

	}
}
