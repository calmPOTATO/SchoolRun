package src;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Join extends JFrame {
	//변수선언
	private JFrame frame;
	private JTextField textID;
	private JButton checkIDbtn;
	private JTextField textPW;
	private JTextField textPW_2;
	private JButton joinbtn;
	private JLabel backImg;
	private JLabel message;
	User u1 = new User();
	int checkId = 0; //0이면 중복 확인 안함, 1이면 사용 가능, 2면 중복
	//Music introMusic = new Music("..\\music\\LOGIN_BGM.MP3",true);//뮤직s

	//메인메서드
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join window = new Join();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//생성자
	public Join() {
		initialize();
	}
	//GUI 설계메서드
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 717, 765);
		frame.getContentPane().setLayout(null);
		//아이디 입력
		textID = new JTextField(); 
		textID.setFont(new Font("메이플스토리", Font.BOLD, 32));
		textID.setBounds(138, 212, 352, 50);
		textID.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		frame.getContentPane().add(textID);
		textID.setColumns(10);
		//중복확인 버튼
		checkIDbtn = new JButton(""); 
		checkIDbtn.setIcon(new ImageIcon("..\\image\\btn_image\\doublecheck_bt.png"));
		checkIDbtn.setBounds(527, 205, 106, 69);
		checkIDbtn.setBorderPainted(false);
		checkIDbtn.setContentAreaFilled(false);
		checkIDbtn.setFocusPainted(false);
		frame.getContentPane().add(checkIDbtn);

		
		//비밀번호 입력
		textPW = new JTextField(); 
		textPW.setFont(new Font("메이플스토리", Font.BOLD, 32));
		textPW.setBounds(169, 344, 352, 50);
		textPW.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		frame.getContentPane().add(textPW);
		textPW.setColumns(10);
		//비밀번호 확인
		textPW_2 = new JTextField(); 
		textPW_2.setFont(new Font("메이플스토리", Font.BOLD, 32));
		textPW_2.setBounds(169, 489, 352, 50);
		textPW_2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		frame.getContentPane().add(textPW_2);
		textPW_2.setColumns(10);
		//가입 버튼
		joinbtn = new JButton(""); 
		joinbtn.setIcon(new ImageIcon("..\\image\\btn_image\\signup_bt.png"));
		joinbtn.setBounds(251, 575, 223, 79);
		joinbtn.setBorderPainted(false);
		joinbtn.setContentAreaFilled(false);
		joinbtn.setFocusPainted(false);
		frame.getContentPane().add(joinbtn);
		
		//아이디는 8자 이내
		message = new JLabel("아이디는 8자 이내여야 합니다.");
		message.setFont(new Font("\uBA54\uC774\uD50C\uC2A4\uD1A0\uB9AC", message.getFont().getStyle(), message.getFont().getSize()));
		message.setBounds(206, 174, 284, 20);
		frame.getContentPane().add(message);
		//필드들 뒷배경 라벨
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("..\\image\\back_image\\PW_field.png"));
		lblNewLabel.setBounds(112, 294, 521, 109);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel2 = new JLabel("");
		lblNewLabel2.setIcon(new ImageIcon("..\\image\\back_image\\PWokay_field.png"));
		lblNewLabel2.setBounds(112, 439, 521, 109);
		frame.getContentPane().add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setIcon(new ImageIcon("..\\image\\back_image\\ID_field.png"));
		lblNewLabel3.setBounds(112, 162, 521, 109);
		frame.getContentPane().add(lblNewLabel3);
		
		//배경 이미지
		backImg = new JLabel(""); 
		backImg.setIcon(new ImageIcon("..\\image\\back_image\\newaccount_bg.png"));
		backImg.setBounds(0, 0, 701, 734);
		frame.getContentPane().add(backImg);
		
		//introMusic.start();
		
		
			
//===============================================================================

		
		//중복확인버튼 기능 구현
		checkIDbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newId = textID.getText();
				boolean check = u1.checkID(newId);
				
				if(check==false && newId.length() <= 8 && newId.length() > 0) {
					System.out.println("사용가능");
					message.setText("사용하실 수 있습니다.");
					checkId = 1;
				} else if(newId.length() > 8) {
					System.out.println("8자 초과");
					message.setText("글자수가 초과되었습니다.");
					checkId = 2;
				} else if(newId.length() == 0) {
					System.out.println("입력요망");
					message.setText("아이디를 입력해주세요.");
					checkId = 2;
				} else if(check==true) {
					System.out.println("중복");
					message.setText("중복된 아이디입니다.");
					checkId = 2;
				}
			}
		});

		
		//회원 가입버튼 기능 구현
		joinbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String newId = textID.getText();
				String newPw = textPW.getText();
				String newPw_2 = textPW_2.getText();
				///introMusic.close();
				if(checkId==1&&newPw.equals(newPw_2)) {
					u1.join(newId, newPw);
					frame.setVisible(false);
				}
				else if(checkId==2) {
					System.out.println("사용불가");
					message.setText("아이디를 다시 확인해주세요");
					message.setForeground(Color.red);
				}
				else if(checkId==0) {
					message.setText("아이디 중복확인을 해주세요");
					message.setForeground(Color.red);
					System.out.println("중복확인plz");
				}
				else {
					message.setText("비밀번호가 일치하지않습니다");
					message.setForeground(Color.red);
					System.out.println("일치 X");
				}
			}
		});
	}
}