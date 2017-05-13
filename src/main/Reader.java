package main;

public class Reader
{
	public Reader(){
	}
	
	
	public String getRoom(String QRText){
		String[] parts = QRText.split("\n");
		String room = parts[3].replace("Room: ", "");
		return room;
	}
	public String getBulding(String QRText){
		String room;
		room = this.getRoom(QRText);
		if(room.contains("E"))
			return "Engineering Bulding";
		if(room.contains("F"))
			return "Block F";
		if(room.contains("B"))
			return "Science Bulding";
		if(room.contains("D"))
			return "Business Bulding";
		if(room.contains("A"))
			return "Main Block";
		return "";
	}
	public String getSubject(String QRText){
		String[] parts = QRText.split("\n");
		String subject = parts[2].replace("Subject: ", "");
		return subject;
	}
	public String getTime(String QRText){
		String[] parts = QRText.split("\n");
		String time = parts[1].replace("Time: ", "");
		return time;
	}
	public String getDay(String QRText){
		String[] parts = QRText.split("\n");
		String day = parts[0].replace("Day: ", "");
		return day;
	}
}