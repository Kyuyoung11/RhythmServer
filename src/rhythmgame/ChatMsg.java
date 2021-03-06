package rhythmgame;

// ChatMsg.java 채팅 메시지 ObjectStream 용.
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;

class ChatMsg implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String code; // 100:로그인, 400:로그아웃, 200:채팅메시지, 300:Image
	private String data;
	public ImageIcon img;
	
	private String otherUser;

	private int beatNum;
	private String itemType;

	private int num;

	private int room1;
	private int room2;
	private int room3;
	
	private ArrayList<String> userList;

	private String songTitle;
	private int nowSelected;

	private int roomStatus;

	private int otherScore;

	private String judge;

	private String noteType;

	private int appleAttack;
	private int beeAttack;

	public ChatMsg(String id, String code) {
		this.id = id;
		this.code = code;
	}

	public ChatMsg(String id, String code, String msg) {
		this.id = id;
		this.code = code;
		this.data = msg;
	}
	
	public ArrayList<String> getUserList() {
		return userList;
	}
	public void setUserList(ArrayList<String> userList) {
		this.userList = userList;
	}
	
	public String getOtherUser() {
		return otherUser;
	}

	public void setOtherUser(String otherUser) {
		this.otherUser = otherUser;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public int getBeatNum() {
		return beatNum;
	}

	public void setBeatNum(int beatNum) {
		this.beatNum = beatNum;
	}

	public String getJudge() {
		return judge;
	}

	public void setJudge(String judge) {
		this.judge = judge;
	}

	public String getnoteType() {
		return noteType;
	}

	public void setnoteType(String noteType) {
		this.noteType = noteType;
	}

	public int getRoom1() {
		return room1;
	}

	public int getRoom2() {
		return room2;
	}

	public int getRoom3() {
		return room3;
	}

	public int getNowSelected() {
		return nowSelected;
	}

	public int getOtherScore() {
		return otherScore;
	}

	public int getAppleAttack() {
		return appleAttack;
	}

	public void setRoom1(int room1) {
		this.room1 = room1;
	}

	public void setRoom2(int room2) {
		this.room2 = room2;
	}

	public void setRoom3(int room3) {
		this.room3 = room3;
	}

	public void setNowSelected(int nowSelected) {
		this.nowSelected = nowSelected;
	}

	public void setOtherScore(int score) {
		this.otherScore = score;
	}

	public void setAppleAttack(int appleAttack) {
		this.appleAttack = appleAttack;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getData() {
		return data;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	public void setroomStatus(int roomStatus) {
		this.roomStatus = roomStatus;
	}

	public int getroomStatus() {
		return roomStatus;
	}

	public void setBeeAttack(int BeeAttack) {
		this.beeAttack = BeeAttack;
	}

	public int getBeeAttack() {
		return beeAttack;
	}
}