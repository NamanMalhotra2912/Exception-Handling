package Exception_Handling;

public class Annalyse_Mood {
	
	String message;
	
	Annalyse_Mood(String message) {
		this.message= message;
	}
	
	public static void main(String[] args) {
		
		Annalyse_Mood MoodAnalyser = new Annalyse_Mood(null);
		System.out.println(MoodAnalyser.analyseMood());
		
	}
	
	public String analyseMood() {
		
		try {
			if (message.contains("sad") )
				return "sad";
			else
				return "very happy";
		}
		catch(Exception exe) {
			return "Happy";
		}
		
	}

}
