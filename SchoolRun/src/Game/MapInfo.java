package Game;

import src.Select_Thema;
import src.User;

public class MapInfo {
	User u1 = new User();

	public static String backStr;
	static String field1Str;
	static String field2Str;
	static String tacle1Str;
	static String tacle2Str;
	static String musicStr;
	static boolean change = false;
	public static int check = 0;

	public MapInfo() {
		u1.getAll();

		if (this.change == false) {
			if (this.check == 0) {
				if (u1.now_stage == 1) {
					this.backStr = "..//image//back_image//classback.jpg";
					this.field1Str = "..//image//game_image//class_filed1.png";
					this.field2Str = "..//image//game_image//class_filed2.png";
					this.tacle1Str = "..//image//game_image//class_obstacle2.png";
					this.tacle2Str = "..//image//game_image//class_obstacle1.png";
					this.musicStr = "..\\music\\STAGE1.MP3";
				} else if (u1.now_stage == 2) {
					this.backStr = "..//image//back_image//storeback.jpg";
					this.field1Str = "..//image//game_image//store_filed1.png";
					this.field2Str = "..//image//game_image//store_filed2.png";
					this.tacle1Str = "..//image//game_image//store_obstacle2.png";
					this.tacle2Str = "..//image//game_image//store_obstacle1.png";
					this.musicStr = "..\\music\\STAGE2.MP3";
				} else if (u1.now_stage == 3) {
					this.backStr = "..//image//game_image//forestback.jpg";
					this.field1Str = "..//image//game_image//forest_field1.png";
					this.field2Str = "..//image//game_image//forest_field1.png";
					this.tacle1Str = "..//image//game_image//forest_obstacle2.png";
					this.tacle2Str = "..//image//game_image//forest_obstacle1.png";
					this.musicStr = "..\\music\\STAGE3.MP3";
				}
			}
		}
	}

	public void setMap(boolean c, String back, String field1, String field2, String tacle1, String tacle2) {
		this.change = c;
		this.backStr = back;
		this.field1Str = field1;
		this.field2Str = field2;
		this.tacle1Str = tacle1;
		this.tacle2Str = tacle2;
	}
}
