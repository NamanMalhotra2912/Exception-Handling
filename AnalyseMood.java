package Exception_Handling;

public class AnalyseMood {

	String message;
	
	AnalyseMood(String message) {
		this.message= message;
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		
		AnalyseMood MoodAnalyser = new AnalyseMood("Happy");
		
//		AnalyseMood MoodAnalyser1 = new AnalyseMood("Sad");
			
	}

}
