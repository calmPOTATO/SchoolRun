package src;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Game.CharacterInfo;
import java.awt.Font;

public class Rancking extends JFrame {

	private JPanel contentPane;
	User u1= new User();
	CharacterInfo c_info = new CharacterInfo();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rancking frame = new Rancking();
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
	public Rancking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("메이플스토리", Font.BOLD, 12));
		lblNewLabel.setBounds(97, 142, 92, 93);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(c_info.chStr));
		lblNewLabel_1.setBounds(1050, 280, 200, 300);
		contentPane.add(lblNewLabel_1);
		
		JButton goitem = new JButton("");
		goitem.setIcon(new ImageIcon("..\\image\\btn_image\\ready_bt.png"));
		goitem.setBounds(892, 653, 516, 120);
		goitem.setFocusPainted(false);
		goitem.setBorderPainted(false);
		goitem.setContentAreaFilled(false);
		contentPane.add(goitem);
		
		goitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Select_Item si = new Select_Item();
				si.setVisible(true);
			}
		});
		
		
		JButton closebtn = new JButton("");
		closebtn.setIcon(new ImageIcon("C:\\Users\\\uC774\uBBFC\uC11C\\Downloads\\schoolruntlqkf\\image\\btn_image\\x_bt.png"));
		closebtn.setBorderPainted(false);
		closebtn.setBorderPainted(false);
		closebtn.setContentAreaFilled(false);
		closebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				setResizable(false);
				setLocation(100,100);
				Main_login l1 = new Main_login();
				l1.setVisible(true);
					
			}
		});
		closebtn.setBounds(1387, 22, 70, 90);
		
		contentPane.add(closebtn);
		
		u1.setRank();
		u1.getAll();
		
		JLabel rank1 = new JLabel("1등");
		rank1.setFont(new Font("메이플스토리", Font.BOLD, 45));
		rank1.setBounds(130, 180, 80, 50);
		getContentPane().add(rank1);

		JLabel rank2 = new JLabel("2등");
		rank2.setFont(new Font("메이플스토리", Font.BOLD, 25));
		rank2.setBounds(130, 290, 80, 50);
		getContentPane().add(rank2);

		JLabel rank3 = new JLabel("3등");
		rank3.setFont(new Font("메이플스토리", Font.BOLD, 25));
		rank3.setBounds(130, 400, 80, 50);
		getContentPane().add(rank3);

		JLabel rank4 = new JLabel("4등");
		rank4.setFont(new Font("메이플스토리", Font.BOLD, 25));
		rank4.setBounds(130, 510, 80, 50);
		getContentPane().add(rank4);

		JLabel rank5 = new JLabel("5등");
		rank5.setFont(new Font("메이플스토리", Font.BOLD, 25));
		rank5.setBounds(130, 620, 80, 50);
		getContentPane().add(rank5);

		// 이름
		JLabel rankname1 = new JLabel(u1.rank_id[0]);
		rankname1.setFont(new Font("메이플스토리", Font.BOLD, 45));
		rankname1.setBounds(275, 180, 350, 50);
		contentPane.add(rankname1);

		JLabel rankname2 = new JLabel(u1.rank_id[1]);
		rankname2.setFont(new Font("메이플스토리", Font.BOLD, 25));
		rankname2.setBounds(275, 290, 350, 50);
		contentPane.add(rankname2);

		JLabel rankname3 = new JLabel(u1.rank_id[2]);
		rankname3.setFont(new Font("메이플스토리", Font.BOLD, 25));
		rankname3.setBounds(275, 400, 350, 50);
		contentPane.add(rankname3);

		JLabel rankname4 = new JLabel(u1.rank_id[3]);
		rankname4.setFont(new Font("메이플스토리", Font.BOLD, 25));
		rankname4.setBounds(275, 510, 350, 50);
		contentPane.add(rankname4);

		JLabel rankname5 = new JLabel(u1.rank_id[4]);
		rankname5.setFont(new Font("메이플스토리", Font.BOLD, 25));
		rankname5.setBounds(275, 620, 350, 50);
		contentPane.add(rankname5);

		// 점수
		JLabel rankscore1 = new JLabel(Integer.toString(u1.rank_score[0]));
		rankscore1.setFont(new Font("메이플스토리", Font.BOLD, 45));
		rankscore1.setBounds(580, 180, 200, 50);
		contentPane.add(rankscore1);

		JLabel rankscore2 = new JLabel(Integer.toString(u1.rank_score[1]));
		rankscore2.setFont(new Font("메이플스토리", Font.BOLD, 25));
		rankscore2.setBounds(580, 290, 200, 50);
		contentPane.add(rankscore2);

		JLabel rankscore3 = new JLabel(Integer.toString(u1.rank_score[2]));
		rankscore3.setFont(new Font("메이플스토리", Font.BOLD, 25));
		rankscore3.setBounds(580, 400, 200, 50);
		contentPane.add(rankscore3);

		JLabel rankscore4 = new JLabel(Integer.toString(u1.rank_score[3]));
		rankscore4.setFont(new Font("메이플스토리", Font.BOLD, 25));
		rankscore4.setBounds(580, 510, 200, 50);
		contentPane.add(rankscore4);

		JLabel rankscore5 = new JLabel(Integer.toString(u1.rank_score[4]));
		rankscore5.setFont(new Font("메이플스토리", Font.BOLD, 25));
		rankscore5.setBounds(580, 620, 620, 50);
		contentPane.add(rankscore5);
		
		//돈
		JLabel money_label = new JLabel(String.valueOf(u1.now_money));
		money_label.setFont(new Font("메이플스토리", Font.BOLD, 31));
		money_label.setBounds(1027, 64, 360, 60);
		contentPane.add(money_label);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\\uC774\uBBFC\uC11C\\Downloads\\schoolruntlqkf\\image\\back_image\\coinbar.png"));
		lblNewLabel_2.setBounds(941, 60, 443, 64);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("..\\image\\back_image\\ranking_bg.png"));
		lblNewLabel_4.setBounds(0, 0, 1484, 811);
		contentPane.add(lblNewLabel_4);		
		
	}
}
