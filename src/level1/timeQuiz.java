package level1;

public class timeQuiz {

	public static void main(String[] args) {
		
		String p = "PM 01:00:00";
		int n = 10;
		System.out.println(solution(p, n));
	}

	private static String solution(String p, int n) {
			String result="";
		
			String time = p.substring(3);
			
			String amPm = p.substring(0, 2);
			
			String[] splits = time.split(":");

	        int hour=Integer.parseInt(splits[0]);

	        int min=Integer.parseInt(splits[1]);

	        int sec=Integer.parseInt(splits[2]);



	       if(hour>= 12 && sec>0) {
	    	   amPm = "PM";
	       }
	       if(hour<12) {
	    	   amPm = "AM";
	       }
	       


	       // System.out.printf("%%02d:%02d:%02d", hour, min, sec);
	       result = amPm+" "+hour+min+sec;
		return result;
	}
}
