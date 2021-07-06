package src;

import java.awt.EventQueue;
import java.awt.Font;
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

import Game.MapInfo;

public class Select_Thema extends JFrame {

	private JPanel contentPane;
	CoinMouseListener classlistener = new CoinMouseListener();
	ScoreMouseListener storelistener = new ScoreMouseListener();
	LifeMouseListener forestlistener = new LifeMouseListener();
	FriendMouseListener hwllistener = new FriendMouseListener();
	BoosterMouseListener xmaslistener = new BoosterMouseListener();
	public static boolean change = false;

	MapInfo m_info = new MapInfo();
	String map_thema[][] = new String[5][5];
	String back, field1, field2, tacle1, tacle2;
	User u1 = new User();
	static String ch_thema = "..//image//label_image//class.png";

	public void setMap_thema() {
		// 순서대로 배경, 발판1, 발판2, 장애물1, 장애물2
		map_thema[0][0] = "..//image//back_image//classback.jpg";
		map_thema[0][1] = "..//image//game_image//class_filed1.png";
		map_thema[0][2] = "..//image//game_image//class_filed2.png";
		map_thema[0][3] = "..//image//game_image//class_obstacle1.png";
		map_thema[0][4] = "..//image//game_image//class_obstacle2.png";

		map_thema[1][0] = "..//image//back_image//storeback.jpg";
		map_thema[1][1] = "..//image//game_image//store_filed1.png";
		map_thema[1][2] = "..//image//game_image//store_filed1.png";
		map_thema[1][3] = "..//image//game_image//store_obstacle2.png";
		map_thema[1][4] = "..//image//game_image//store.obstacle1.png";

		map_thema[2][0] = "..//image//back_image//forestback.jpg";
		map_thema[2][1] = "..//image//game_image//forest_filed1.png";
		map_thema[2][2] = "..//image//game_image//forest_filed1.png";
		map_thema[2][3] = "..//image//game_image//forest_obstacle2.png";
		map_thema[2][4] = "..//image//game_image//forest_obstacle1.png";

		map_thema[3][0] = "..//image//back_image//halloweenback.jpg";
		map_thema[3][1] = "..//image//game_image//halloween_filed1.png";
		map_thema[3][2] = "..//image//game_image//halloween_filed2.png";
		map_thema[3][3] = "..//image//game_image//halloween_obstacle1.png";
		map_thema[3][4] = "..//image//game_image//halloween_obstacle2.png";

		map_thema[4][0] = "..//image//back_image//christmasback.jpg";
		map_thema[4][1] = "..//image//game_image//christmas_filed1.png";
		map_thema[4][2] = "..//image//game_image//christmas_filed2.png";
		map_thema[4][3] = "..//image//game_image//christmas_obstacle1.png";
		map_thema[4][4] = "..//image//game_image//christmas_obstacle2.png";
	}

	// 메인메서드
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select_Thema frame = new Select_Thema();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	class CoinMouseListener implements MouseListener {
		boolean check = false;

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				check = true;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\\store_bt_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt_more.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt_check.png"));
			}
		}

	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////

	public Select_Thema() {
		u1.getAll();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1519, 843);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		this.setMap_thema();

		JButton select = new JButton("");
		select.setFocusPainted(false);
		select.setBorderPainted(false);
		select.setContentAreaFilled(false);
		select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select_Item t1 = new Select_Item();
				t1.setVisible(true);
				setVisible(false);
			}
		});
		select.setIcon(new ImageIcon("..\\image\\btn_image\\READY_bt (2).png"));
		select.setBounds(781, 581, 540, 200);
		contentPane.add(select);

		// 선택한 테마의 사진
		JLabel choose_img = new JLabel("");
		choose_img.setBounds(604, 376, 130, 140);
		contentPane.add(choose_img);
		// 선택한 테마의 설명
		JLabel choose_info = new JLabel("");
		choose_info.setBounds(800, 376, 360, 60);
		choose_info.setFont(new Font("메이플스토리", Font.BOLD, 22));
		contentPane.add(choose_info);
		// 현재 테마
		JLabel map_img = new JLabel("");
		map_img.setBounds(100, 130, 306, 459);
		map_img.setIcon(new ImageIcon(ch_thema));
		contentPane.add(map_img);

		// 교실버튼
		JButton class_btn = new JButton("");
		class_btn.setFocusPainted(false);
		class_btn.setBorderPainted(false);
		class_btn.setContentAreaFilled(false);
		class_btn.addMouseListener(classlistener);
		class_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back = map_thema[0][0];
				field1 = map_thema[0][1];
				field2 = map_thema[0][2];
				tacle1 = map_thema[0][3];
				tacle2 = map_thema[0][4];

				ch_thema = "..//image//label_image//class.png";
				map_img.setIcon(new ImageIcon("..//image//label_image//class.png"));
				choose_img.setIcon(new ImageIcon("..//image//btn_image//class_bt.png"));
				choose_info.setText("교실 테마");
			}
		});
		class_btn.setIcon(new ImageIcon("..\\image\\btn_image\\class_bt.png"));
		class_btn.setBounds(619, 169, 130, 150);
		contentPane.add(class_btn);

		JButton store_btn = new JButton("");
		store_btn.setFocusPainted(false);
		store_btn.setBorderPainted(false);
		store_btn.setContentAreaFilled(false);
		store_btn.addMouseListener(storelistener);
		store_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back = map_thema[1][0];
				field1 = map_thema[1][1];
				field2 = map_thema[1][2];
				tacle1 = map_thema[1][3];
				tacle2 = map_thema[1][4];
				
				ch_thema = "..//image//label_image//store.png";
				map_img.setIcon(new ImageIcon("..//image//label_image//store.png"));
				choose_img.setIcon(new ImageIcon("..//image//btn_image//store_bt.png"));
				choose_info.setText("매점 테마");
			}
		});
		store_btn.setIcon(new ImageIcon("..\\image\\btn_image\\store_bt.png"));
		store_btn.setBounds(779, 169, 138, 150);
		contentPane.add(store_btn);

		JButton forest_btn = new JButton("");
		forest_btn.setFocusPainted(false);
		forest_btn.setBorderPainted(false);
		forest_btn.setContentAreaFilled(false);
		forest_btn.addMouseListener(forestlistener);
		forest_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back = map_thema[2][0];
				field1 = map_thema[2][1];
				field2 = map_thema[2][2];
				tacle1 = map_thema[2][3];
				tacle2 = map_thema[2][4];
				
				ch_thema = "..//image//label_image//forest.png";
				map_img.setIcon(new ImageIcon("..//image//label_image//forest.png"));
				choose_img.setIcon(new ImageIcon("..//image//btn_image//forest_bt.png"));
				choose_info.setText("숲 테마");
			}
		});
		forest_btn.setBounds(947, 169, 130, 150);
		forest_btn.setIcon(new ImageIcon("..\\image\\btn_image\\forest_bt.png"));
		contentPane.add(forest_btn);

		JButton halloween_btn = new JButton("");
		halloween_btn.setFocusPainted(false);
		halloween_btn.setBorderPainted(false);
		halloween_btn.setContentAreaFilled(false);
		halloween_btn.addMouseListener(hwllistener);
		halloween_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back = map_thema[3][0];
				field1 = map_thema[3][1];
				field2 = map_thema[3][2];
				tacle1 = map_thema[3][3];
				tacle2 = map_thema[3][4];
				
				ch_thema = "..//image//label_image//halloween.png";
				map_img.setIcon(new ImageIcon("..//image//label_image//halloween.png"));
				choose_img.setIcon(new ImageIcon("..//image//btn_image//halloween_bt.png"));
				choose_info.setText("할로윈 테마");
			}
		});
		halloween_btn.setIcon(new ImageIcon("..\\image\\btn_image\\halloween_bt.png"));
		halloween_btn.setBounds(1111, 169, 130, 150);
		contentPane.add(halloween_btn);

		JButton winter_btn = new JButton("");
		winter_btn.setFocusPainted(false);
		winter_btn.setBorderPainted(false);
		winter_btn.setContentAreaFilled(false);
		winter_btn.addMouseListener(xmaslistener);
		winter_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back = map_thema[4][0];
				field1 = map_thema[4][1];
				field2 = map_thema[4][2];
				tacle1 = map_thema[4][3];
				tacle2 = map_thema[4][4];
				
				ch_thema = "..//image//label_image//winter.png";
				map_img.setIcon(new ImageIcon("..//image//label_image//winter.png"));
				choose_img.setIcon(new ImageIcon("..//image//btn_image//winter_bt.png"));
				choose_info.setText("크리스마스 테마");
			}
		});
		winter_btn.setIcon(new ImageIcon("..\\image\\btn_image\\winter_bt.png"));
		winter_btn.setBounds(1276, 169, 130, 150);
		contentPane.add(winter_btn);

		JButton apply_btn = new JButton("");
		apply_btn.setFocusPainted(false);
		apply_btn.setBorderPainted(false);
		apply_btn.setContentAreaFilled(false);
		apply_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				m_info.setMap(true, back, field1, field2, tacle1, tacle2);
				System.out.println(m_info.backStr);
				map_img.setIcon(new ImageIcon(ch_thema));
			}
		});
		apply_btn.setIcon(new ImageIcon("..\\image\\btn_image\\apply_bt.png"));
		apply_btn.setBounds(1243, 389, 180, 120);
		contentPane.add(apply_btn);

		JButton backbtn = new JButton("");
		backbtn.setIcon(new ImageIcon("..\\image\\btn_image\\return_bt.png"));
		backbtn.setFocusPainted(false);
		backbtn.setBorderPainted(false);
		backbtn.setContentAreaFilled(false);
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Select_Item sc = new Select_Item();
				sc.setVisible(true);
			}
		});

		backbtn.setBounds(100, 661, 180, 120);
		contentPane.add(backbtn);

		JLabel money_label = new JLabel(String.valueOf(u1.now_money));
		money_label.setBounds(180, 60, 360, 60);
		contentPane.add(money_label);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("..\\image\\game_image\\coin.png"));
		lblNewLabel_3.setBounds(100, 50, 80, 80);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("..\\image\\back_image\\theme_bg.png"));
		lblNewLabel_6.setBounds(12, 0, 1503, 811);
		contentPane.add(lblNewLabel_6);

	}
}
