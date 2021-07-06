package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
	String url = "jdbc:mysql://127.0.0.1:3306/schoolrun?serverTimezone = UTC";
	String driver = "com.mysql.cj.jdbc.Driver";
	String id = "root";
	String pw = "mirim";
	String sql;
	boolean check;
	Connection conn;
	Statement stmt;
	
	//사용자 정보를 담는 변수 (로그인 했을 때)
	static String now_id, now_pw; //아이디, 비밀번호
	static int now_money, now_level, now_score; //돈, 레벨, 점수
	//사용자 정보를 담는 변수 (게스트 모드)
	public static int guest_money = 2000, guest_level = 1;
	//게임 플레이 때 필요한 변수
	public static int isItem, now_stage = 1; //0=없음    1=점수 2배     2=돈 2배    3=생명 2배    4=친구모드   5=부스터모드
	static String [] rank_id = new String[5];
	static int [] rank_score = new int[5];
	
	
	//DB 연결하는 메서드
	public void connectDB() {
		try {
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 연결");
			stmt = conn.createStatement();
		} catch(Exception e) {
			e.toString();
		}	
	}
	
	//회원가입하는 메서드
	public void join(String user_id, String user_pw) { 
		try {
			this.connectDB();
			sql = "insert into user_info(u_id, u_pw) values('" + user_id + "', '" + user_pw + "')";
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.toString();
		}
	}
	
	//로그인하는 메서드
	public Boolean login(String user_id, String user_pw) { 
		check = false;
		
		try {
			this.connectDB();
			sql = "select u_pw from user_info where u_id = '" + user_id + "'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				if(rs.getString("u_pw").equals(user_pw)) {
					check = true;
					this.now_id = user_id;
					this.now_pw = user_pw;
				}
			}
		} catch (Exception e) {
			e.toString();
		}
		return check;
	}
	
	//아이디 중복체크 하는 메서드
	public Boolean checkID(String user_id) { 
		check = false;
		
		try {
			this.connectDB();
			sql = "select u_id from user_info where u_id = '" + user_id + "'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) { //true면 중복
				if(rs.getString("u_id") != null && rs.getString("u_id").equals(user_id))
					check = true;
			}
		} catch (Exception e) {
			e.toString();
		}
		return check;
	}

	//사용자의 돈, 레벨, 아이템, 랭킹을 가져오는 메서드
	public void getAll() { 
		try {
			this.connectDB();

			//돈
			sql = "select u_money from user_info where u_id='" + this.now_id + "';";
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				this.now_money = rs.getInt("u_money");
				System.out.println(now_money);
			}

			//레벨
			sql = "select u_level from user_info where u_id='" + this.now_id + "';";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				this.now_level = rs.getInt("u_level");
				System.out.println(now_level);
			}
			
			//점수
			sql = "select u_score from user_info where u_id='" + this.now_id + "';";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				this.now_score = rs.getInt("u_score");
				System.out.println(now_score);
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//게임 후 결과 넣는 메서드
	public void updateResult(int score, int money) {
		try {
			if(now_id != null ) {
				this.connectDB();
				this.getAll();
			
				if(score > now_score) {
					sql = "UPDATE user_info SET u_score = " + score + " WHERE u_id = '" + this.now_id + "';";
					stmt.executeUpdate(sql);
				}
				
				sql = "UPDATE user_info SET u_money = " + (now_money+money) + " WHERE u_id = '" + this.now_id + "';";
				stmt.executeUpdate(sql);
			} else {
				guest_money += money;
			}
			
		} catch (Exception e) {
			e.toString();
		}
	}
	
	
	//랭킹
	public void setRank() {
		try {
			int i = 0;
			this.connectDB();
			sql = "select * from user_info order by u_score desc;";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				if(i>=5) { 
					break;
				}
			
				rank_id[i] = rs.getString("u_id");
				rank_score[i] = rs.getInt("u_score");
				
				i++;
			}
			
			
		} catch (Exception e) {
			e.toString();
		}
	}
	
	
	//아이템 구매 메서드
	public void buyItem(int item_num) {
		try {
			
			
			if(this.now_id!=null) {
				this.connectDB();
				getAll();
				if(item_num==1 && now_money >= 400) {
					sql = "UPDATE user_info SET u_money = " + (this.now_money - 400) + " WHERE u_id='" + this.now_id + "'";
					stmt.executeUpdate(sql);
					this.isItem = 1;
				} else if(item_num==2 && now_money >= 400) {
					sql = "UPDATE user_info SET u_money = " + (this.now_money - 400) + " WHERE u_id='" + this.now_id + "'";
					stmt.executeUpdate(sql);
					this.isItem = 2;
				} else if(item_num==3 && now_money >= 400) {
					sql = "UPDATE user_info SET u_money = " + (this.now_money - 400) + " WHERE u_id='" + this.now_id + "'";
					stmt.executeUpdate(sql);
					this.isItem = 3;
				} else if(item_num==4 && now_money >= 720) {
					sql = "UPDATE user_info SET u_money = " + (this.now_money - 720) + " WHERE u_id='" + this.now_id + "'";
					stmt.executeUpdate(sql);
					this.isItem = 4;
				} else if(item_num==5 && now_money >= 650){
					sql = "UPDATE user_info SET u_money = " + (this.now_money - 650) + " WHERE u_id='" + this.now_id + "'";
					stmt.executeUpdate(sql);
					this.isItem = 5;
				}
			} else {
				if(item_num==1 && guest_money >= 400) {
					this.isItem = 1;
					guest_money -= 400;
				} else if(item_num==2 && guest_money >= 400) {
					this.isItem = 2;
					guest_money -= 400;
				} else if(item_num==3 && guest_money >= 400) {
					this.isItem = 3;
					guest_money -= 400;
				} else if(item_num==4 && guest_money >= 720) {
					this.isItem = 4;
					guest_money -= 720;
				} else if(item_num==5 && guest_money >= 650) {
					this.isItem = 5;
					guest_money -= 650;
				}
			}
			
		} catch (Exception e) {
			e.toString();
		}
	}
	

	//플레이할 스테이지
	public boolean setStage(int choice_stage) {
		boolean check = false;
		
		if(this.now_id != null) {
			try {
				this.connectDB();
				this.getAll();
				
				if(this.now_level >= choice_stage) {
					this.now_stage = choice_stage;
					check = true;
				} else {
					System.out.println("레벨 안됨");
				}
			} catch (Exception e) {
				e.toString();
			}
		} else {
			if(this.guest_level >= choice_stage) {
				this.now_stage = choice_stage;
				check = true;
			} else {
				System.out.println("레벨 안됨");
			}
		}
		return check;
	}
	
	
	//레벨 올려주는 메서드
	public void setLevel(int level) {
		if(this.now_id != null) {
			try {
				this.connectDB();
				this.getAll();
				
				if(level==1 || level==2) {
					sql = "UPDATE user_info SET u_level = " + (level+1) + " WHERE u_id = '" + this.now_id +"'";
					stmt.executeUpdate(sql);
					System.out.println(sql);
				}
			} catch (Exception e) {
				e.toString();
			}
		} else {
			if(level == 1 || level == 2) {
				this.guest_level += level;
			}
		}
	}
	

}
