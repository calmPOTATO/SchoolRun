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

import Game.CharacterInfo;

public class Select_Accessories1 extends JFrame {

	private JPanel contentPane;
	CoinMouseListener coinlistener = new CoinMouseListener();
	ScoreMouseListener scorelistener = new ScoreMouseListener();
	LifeMouseListener lifelistener = new LifeMouseListener();
	String character_accessories [][] = new String [3][5];
	CharacterInfo c_info = new CharacterInfo();
	String character_now = c_info.now;
	String now,ch,run,jump,doublejump,fall,slide;
	static String choose_accessories = "";
	
	User u1 = new User();
	
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

	public void setCharacter_accessories() {
			System.out.println("애기");
			//짤랑이
			character_accessories[0][0] = "..//image//game_image//baby_t_run.gif";
			character_accessories[0][1] = "..//image//game_image//baby_t_jump.png";
			character_accessories[0][2] = "..//image//game_image//baby_doublejump.gif";
			character_accessories[0][3] = "..//image//game_image//baby_t_bump.png";
			character_accessories[0][4] = "..//image//game_image//baby_t_slide.png";
			//망토
			character_accessories[1][0] = "..//image//game_image//baby_s_run.gif";
			character_accessories[1][1] = "..//image//game_image//baby_s_jump.png";
			character_accessories[1][2] = "..//image//game_image//baby_doublejump.gif";
			character_accessories[1][3] = "..//image//game_image//baby_s_bump.png";
			character_accessories[1][4] = "..//image//game_image//baby_s_slide.png";
			//팬티
			character_accessories[2][0] = "..//image//game_image//baby_p_run.gif";
			character_accessories[2][1] = "..//image//game_image//baby_p_jump.png";
			character_accessories[2][2] = "..//image//game_image//baby_doublejump.gif";
			character_accessories[2][3] = "..//image//game_image//baby_p_bump.png";
			character_accessories[2][4] = "..//image//game_image//baby_p_slide.png";
	}
	
	
	class CoinMouseListener implements MouseListener{
		boolean check = false;
		@Override
		public void mouseClicked(MouseEvent e) {
			if(check==false) {
				check = true;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt_check.png"));
			}
			else {
				check = false;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			//JButton b = (JButton)e.getSource();
			//b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override//마우스가 안으로 
		public void mouseEntered(MouseEvent e) {
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt_more.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt_check.png"));
			}
		}

		@Override//마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt_check.png"));
			}
		}
	}
	class ScoreMouseListener implements MouseListener{

		boolean check = false;
		
		@Override
		public void mouseClicked(MouseEvent e) {
			if(check==false) {
				check = true;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt_check.png"));
			}
			else {
				check = false;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			//JButton b = (JButton)e.getSource();
			//b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override//마우스가 안으로 
		public void mouseEntered(MouseEvent e) {
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt_more.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt_check.png"));
			}
		}

		@Override//마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt_check.png"));
			}
		}
	}
	class LifeMouseListener implements MouseListener{
		boolean check = false;
		@Override
		public void mouseClicked(MouseEvent e) {
			if(check==false) {
				check = true;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt_check.png"));
			}
			else {
				check = false;
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt_check.png"));
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			//JButton b = (JButton)e.getSource();
			//b.setIcon(new ImageIcon("..\\image\\btn_image\\friendsmode_check.png"));
		}

		@Override//마우스가 안으로 
		public void mouseEntered(MouseEvent e) {
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt_more.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt_check.png"));
			}
		}

		@Override//마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			if(check==false) {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt.png"));
			}
			else {
				JButton b = (JButton)e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt_check.png"));
			}
		}
	    
	}
	
	//프레임 제작
	public Select_Accessories1() {
		u1.getAll();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.setCharacter_accessories();
		
		JButton readybtn = new JButton("");
		readybtn.setFocusPainted(false);
		readybtn.setBorderPainted(false);
		readybtn.setContentAreaFilled(false);
		readybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select_Item t1 = new Select_Item();
				t1.setVisible(true);
				setVisible(false);
			}
		});
		readybtn.setIcon(new ImageIcon("..\\image\\btn_image\\READY_bt (2).png"));
		readybtn.setBounds(741, 578, 540, 200);
		contentPane.add(readybtn);
		
		//선택한 악세사리의 사진
		JLabel choose_img = new JLabel("");
		choose_img.setBounds(590, 376, 130, 140);
		contentPane.add(choose_img);
		//선택한 악세사리의 설명
		JLabel choose_info = new JLabel("");
		choose_info.setBounds(800, 376, 360, 60);
		choose_info.setFont(new Font("메이플스토리", Font.BOLD, 22));
		contentPane.add(choose_info);
		//현재 선택한 이미지
		JLabel character_img = new JLabel("");
		character_img.setIcon(new ImageIcon(c_info.chStr));
		character_img.setBounds(180, 250, 200, 300);
		contentPane.add(character_img);
		

		JButton toy_btn = new JButton("");
		toy_btn.addMouseListener(coinlistener);
		toy_btn.setFocusPainted(false);
		toy_btn.setBorderPainted(false);
		toy_btn.setContentAreaFilled(false);
		toy_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now = character_now;
				ch = "..//image//game_image//baby_t_run_label.png";
				run = character_accessories[0][0];
				jump = character_accessories[0][1];
				doublejump = character_accessories[0][2];
				fall = character_accessories[0][3];
				slide = character_accessories[0][4];
				
				character_img.setIcon(new ImageIcon(ch));
				choose_img.setIcon(new ImageIcon("..//image//btn_image//meme_bt.png"));
				choose_info.setText("짤랑이");
			}
		});
		toy_btn.setIcon(new ImageIcon("..\\image\\btn_image\\meme_bt.png"));
		toy_btn.setBounds(728, 169, 140, 153);
		contentPane.add(toy_btn);
		
		JButton clock_btn = new JButton("");
		clock_btn.addMouseListener(scorelistener);
		clock_btn.setFocusPainted(false);
		clock_btn.setBorderPainted(false);
		clock_btn.setContentAreaFilled(false);
		clock_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now = character_now;
				ch = "..//image//game_image//baby_s_run_label.png";
				run = character_accessories[1][0];
				jump = character_accessories[1][1];
				doublejump = character_accessories[1][2];
				fall = character_accessories[1][3];
				slide = character_accessories[1][4];
				
				character_img.setIcon(new ImageIcon(ch));
				choose_img.setIcon(new ImageIcon("..//image//btn_image//cloack_bt.png"));
				choose_info.setText("망토");
			}
		});
		clock_btn.setIcon(new ImageIcon("..\\image\\btn_image\\cloack_bt.png"));
		clock_btn.setBounds(929, 169, 140, 153);
		contentPane.add(clock_btn);
		
		JButton pants_btn = new JButton("");
		pants_btn.addMouseListener(lifelistener);
		pants_btn.setFocusPainted(false);
		pants_btn.setBorderPainted(false);
		pants_btn.setContentAreaFilled(false);
		pants_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now = character_now;
				ch = "..//image//game_image//baby_p_run_label.png";
				run = character_accessories[2][0];
				jump = character_accessories[2][1];
				doublejump = character_accessories[2][2];
				fall = character_accessories[2][3];
				slide = character_accessories[2][4];
				
				character_img.setIcon(new ImageIcon(ch));
				choose_img.setIcon(new ImageIcon("..//image//btn_image//panties_bt.png"));
				choose_info.setText("바지");
			}
		});
		pants_btn.setIcon(new ImageIcon("..\\image\\btn_image\\panties_bt.png"));
		pants_btn.setBounds(1130, 169, 140, 153);
		contentPane.add(pants_btn);
		
	
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
		
		JButton aply_btn = new JButton("");
		aply_btn.setFocusPainted(false);
		aply_btn.setBorderPainted(false);
		aply_btn.setContentAreaFilled(false);
		aply_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_info.setCharacter(now, ch, run, jump, doublejump, fall, slide);
				character_img.setIcon(new ImageIcon(c_info.chStr));
			}
		});
		aply_btn.setIcon(new ImageIcon("..\\image\\btn_image\\apply_bt.png"));
		aply_btn.setBounds(1243, 389, 180, 120);
		contentPane.add(aply_btn);
		
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
