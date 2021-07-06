package Game;


import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import src.Select_Item;
import src.User;

public class Resultgame {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	ImageIcon backIc;
	int resultScore = 0;
	int resultMoney = 0;
	User u1 = new User();
	
	public Resultgame(int r, int m) {
		
		this.resultScore = r;
		this.resultMoney = m;
		u1.isItem = 0;
		
		System.out.println("게스트 남은 돈 : " + u1.guest_money);
		
		//점수
		JLabel score = new JLabel(Integer.toString(resultScore));
		score.setFont(new Font("메이플스토리", Font.BOLD | Font.ITALIC, 99));
		score.setForeground(Color.BLACK);
		score.setBounds(278, 164, 420, 100);
		panel.add(score);
		
		//배경
		backIc = new ImageIcon("..//image//score_dialog.jpg");
		panel.setLayout(null);
		
		//게임머니
		JLabel money = new JLabel(Integer.toString(resultMoney));
		money.setFont(new Font("메이플스토리", Font.PLAIN, 21));
		money.setForeground(Color.BLACK);
		money.setBounds(338, 267, 157, 74);
		panel.add(money);
		
		//메인화면으로
		JButton gotorobiBtn = new JButton("");
		gotorobiBtn.setIcon(new ImageIcon("..\\image\\btn_image\\okay2_bt.png"));
		gotorobiBtn.setBounds(460, 366, 267, 83);
		gotorobiBtn.setBorderPainted(false);
		gotorobiBtn.setFocusPainted(false);
		gotorobiBtn.setContentAreaFilled(false);
		panel.add(gotorobiBtn);
		gotorobiBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				u1.updateResult(resultScore,  resultMoney);
				frame.dispose();
				Select_Item si = new Select_Item();
				si.setVisible(true);
			}
		});
		
		//다시하기
		JButton restartBtn = new JButton("");
		restartBtn.setIcon(new ImageIcon("..\\image\\btn_image\\replay_bt.png"));
		restartBtn.setBounds(94, 366, 267, 83);
		restartBtn.setBorderPainted(false);
		restartBtn.setFocusPainted(false);
		restartBtn.setContentAreaFilled(false);
		panel.add(restartBtn);
		restartBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				u1.updateResult(resultScore,  resultMoney);
				frame.dispose();
				if(u1.now_stage==1) {
					Stage1 s1 = new Stage1();
				} else if(u1.now_stage==2) {
					Stage2 s2 = new Stage2();
				} else if(u1.now_stage==3) {
					Stage3 s3 = new Stage3();
				}
			}
		});
		
		//배경
		JLabel backimg = new JLabel("");
		backimg.setFont(new Font("1훈새마을운동 R", Font.BOLD, 18));
		backimg.setIcon(new ImageIcon("..\\image\\back_image\\score_bg.png"));
		backimg.setBounds(0, 0, 814, 511);
		panel.add(backimg);
		
		//다이얼로그
		panel.setBounds(0, 0, 815, 535);
		frame.getContentPane().add(panel);
		
		frame.setBounds(0, 0, 820, 540);
		frame.setVisible(true);
		frame.setLocation(100,100);
		frame.setResizable(false);
	}
	
}