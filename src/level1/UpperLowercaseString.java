package level1;

public class UpperLowercaseString {

	public static void main(String[] args) {

		String a = "yYoooopPp";
		System.out.println(a.replaceAll("[yY]", ""));
		System.out.println(solution("pPoooooooYy"));
	}
	//주어진 문자열에 q,y의 숫자가 같으면 true, 다르면 false를 리턴
	//대소문자 상관없음
	public static boolean solution(String s) {
		boolean answer =true;
		String[] strArr = s.split("");
		
		int pCount=0;
		int yCount=0;
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i].equalsIgnoreCase("p")) {
				pCount++;
				
			} else if(strArr[i].equalsIgnoreCase("y")) {
				yCount++;
			}
			
		}
		answer = (pCount == yCount) ? true : false;
		return answer;
		
	}
	// 고수분의 코드를 가져옴
	// 정규식을 이용하였으며, 정규식의 ^는 제외하고라는 의미
	//^yY, ^pP는 yY, pP를 제외하고 전부 "" 공백으로 바꾸라는 의미. 
	//남은 길이끼리 빼서 0이면 true, 아니면 false를 리턴
	public static boolean solution2(String s) {
		boolean answer = true;
		
		return s.replaceAll("[^yY]","").length() - s.replaceAll("[^pP]","").length()==0 ? true : false;
	}
}
