package src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Game.CharacterInfo;
import java.awt.Font;

class CharacterSetResult extends JFrame{
	JPanel p;
	JLabel result;
	CharacterInfo info = new CharacterInfo();
	private JLabel label;
	private JButton okbtn;
	private JLabel lblNewLabel;
	
	public CharacterSetResult() {
		p = new JPanel();
		p.setBounds(0, 0, 394, 30);
		result = new JLabel("");
		result.setBounds(88, 29, 185, 41);
		result.setFont(new Font("메이플스토리", Font.PLAIN, 15));
		p.setBackground(Color.WHITE);
		
		if(info.now.equals("학생")) {
			result.setText("옥임이를 선택했습니다.");
		} else if(info.now.equals("애기")) {
			result.setText("숙자를 선택했습니다.");
		} else if(info.now.equals("영감")) {
			result.setText("호걸산타를 선택했습니다.");
		}
		
		okbtn = new JButton("");
		okbtn.setBounds(253, 33, 78, 35);
		okbtn.setIcon(new ImageIcon("..\\image\\btn_image\\okay_result.png"));
		okbtn.setBorderPainted(false);
		okbtn.setBorderPainted(false);
		okbtn.setContentAreaFilled(false);
		okbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		p.setLayout(null);
		p.add(okbtn);
		p.add(result);
		

		setResizable(false);
		getContentPane().add(p);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 394, 98);
		lblNewLabel.setIcon(new ImageIcon("..\\image\\back_image\\result.jpg"));
		p.add(lblNewLabel);
		setSize(405, 127);
		setLocation(570,550);
		setVisible(true);
		
	}
}