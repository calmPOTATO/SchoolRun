package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Game.Player2;
import Game.Stage1;
import Game.Stage2;
import Game.Stage3;
import src.Select_Accessories2.ScoreMouseListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChooseMode extends JFrame {
	private JPanel contentPane;
	static int stage = 0;
	Mode1MouseListener mode1listener = new  Mode1MouseListener();
	Mode2MouseListener mode2listener = new  Mode2MouseListener();

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
	
	class Mode1MouseListener implements MouseListener {
		boolean check = false;

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				check = true;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\mode1_btn_check.png"));
			} else {
				check = false;
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\mode1_btn.png"));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\mode1_btn_check.png"));
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
				b.setIcon(new ImageIcon("..\\image\\btn_image\\mode1_btn_check.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\mode1_btn_check.png"));
			}
		}

		@Override // 마우스가 버튼 밖으로
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (check == false) {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\mode1_btn.png"));
			} else {
				JButton b = (JButton) e.getSource();
				b.setIcon(new ImageIcon("..\\image\\btn_image\\mode1_btn_check.png"));
			}
		}
	}	
	

class Mode2MouseListener implements MouseListener {
	boolean check = false;

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (check == false) {
			check = true;
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\mode2_btn_check.png"));
		} else {
			check = false;
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\mode2_btn.png"));
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		b.setIcon(new ImageIcon("..\\image\\btn_image\\mode2_btn_check.png"));
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
			b.setIcon(new ImageIcon("..\\image\\btn_image\\mode2_btn_check.png"));
		} else {
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\mode2_btn_check.png"));
		}
	}

	@Override // 마우스가 버튼 밖으로
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (check == false) {
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\mode2_btn.png"));
		} else {
			JButton b = (JButton) e.getSource();
			b.setIcon(new ImageIcon("..\\image\\btn_image\\mode2_btn_check.png"));
		}
	}
}
	/**
	 * Create the frame.
	 */
	public ChooseMode() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton player1btn = new JButton("");
		player1btn.setIcon(new ImageIcon("..\\image\\btn_image\\mode1_btn.png"));
		player1btn.addMouseListener(mode1listener);
		player1btn.setBounds(362, 309, 350, 350);
		player1btn.setFocusPainted(false);
		player1btn.setBorderPainted(false);
		player1btn.setContentAreaFilled(false);
		contentPane.add(player1btn);
		
		
		JButton player2btn = new JButton("");
		player2btn.setIcon(new ImageIcon("..\\image\\btn_image\\mode2_btn.png"));
		player2btn.addMouseListener(mode2listener);
		player2btn.setBounds(863, 309, 350, 350);
		player2btn.setFocusPainted(false);
		player2btn.setBorderPainted(false);
		player2btn.setContentAreaFilled(false);
		contentPane.add(player2btn);
		
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
				Select_Stage s = new Select_Stage();
				s.setVisible(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("..\\image\\back_image\\ChooseMode_Back.png"));
		lblNewLabel.setBounds(0, 0, 1484, 811);
		contentPane.add(lblNewLabel);
		
		
		player1btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(stage==1) {
					Stage1 s1 = new Stage1();
				} else if(stage==2) {
					Stage2 s1 = new Stage2();
				} else if(stage==3) {
					Stage3 s1 = new Stage3();
				}
			}
		});
		
		player2btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Player2 p2 = new Player2();
			}
		});
		
		
	}
}
