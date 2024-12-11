package in.ineuron.com;

import java.util.Date;

// Target class
public class WishMessageGenerator {
	private Date date;
	
	static {
		System.out.println("WishMessageGenerator.enclosing_method()");
	}
	
	public void wishMessageGenerator() {
		System.out.println("WishMessageGenerator.wishMessageGenerator()");
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public String generateMessage(String userName) {
		@SuppressWarnings("deprecation")
		int hours = date.getHours();
		
		if(hours < 12) {
			return "Good Morning :: " +userName;
		}else if(hours < 16) {
			return "Good Afternoon :: " +userName;
		}else if(hours < 20) {
			return "Good Evening :: " +userName;
		}else 
		{
			return "Good Night :: " +userName;
		}
		
		
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
}
