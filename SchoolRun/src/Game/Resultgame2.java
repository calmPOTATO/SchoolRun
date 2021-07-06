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

public class Resultgame2 {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	ImageIcon backIc;
	int resultScore = 0;
	int resultScore2 = 0;
	User u1 = new User();

	public Resultgame2(int r, int r2) {

		this.resultScore = r;
		this.resultScore2 = r2;

		String winner;

		if (resultScore > resultScore2) {
			winner = "1p";
		} else if (resultScore < resultScore2) {
			winner = "2p";
		} else {
			winner = "무승부";
		}

		// 점수
		JLabel score = new JLabel(winner);
		score.setFont(new Font("메이플스토리", Font.BOLD | Font.ITALIC, 75));
		score.setForeground(Color.WHITE);
		score.setBounds(319, 131, 443, 106);
		panel.add(score);

		// 배경
		backIc = new ImageIcon("..//image//score_dialog.jpg");
		panel.setLayout(null);

		// 게임머니
		JLabel score1 = new JLabel(Integer.toString(resultScore));
		score1.setFont(new Font("메이플스토리", Font.BOLD, 21));
		score1.setForeground(Color.BLACK);
		score1.setBounds(178, 255, 157, 57);
		panel.add(score1);

		// 게임머니
		JLabel score2 = new JLabel(Integer.toString(resultScore2));
		score2.setFont(new Font("메이플스토리", Font.BOLD, 21));
		score2.setForeground(Color.BLACK);
		score2.setBounds(563, 255, 157, 57);
		panel.add(score2);

		// 메인화면으로
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
				frame.dispose();
				Select_Item si = new Select_Item();
				si.setVisible(true);
			}
		});

		// 다시하기
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
				frame.dispose();
				Player2 p2 = new Player2();
			}
		});

		// 배경
		JLabel backimg = new JLabel("");
		backimg.setFont(new Font("1훈새마을운동 R", Font.BOLD, 18));
		backimg.setIcon(new ImageIcon("..\\image\\back_image\\mode2_result.png"));
		backimg.setBounds(0, 0, 802, 511);
		panel.add(backimg);

		// 다이얼로그
		panel.setBounds(0, 0, 815, 535);
		frame.getContentPane().add(panel);

		frame.setBounds(0, 0, 805, 533);
		frame.setVisible(true);
		frame.setLocation(100, 100);
		frame.setResizable(false);
	}

}
