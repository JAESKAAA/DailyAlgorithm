package level1;

public class UpperAndLowerCase {

	public static void main(String[] args) {

		System.out.println((solution("try hello world")));

		System.out.println((solution2("try hello world")));
	}
	//1. 공백 기준 단어의 짝수번째 문자는 대문자로 표기
	//2. 첫번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리하기
	public static String solution(String s) {
		String answer ="";
		//문자열 배열로 만들어줬음
		char[] arr = s.toCharArray();
		String[] temp = new String[arr.length];
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			temp[i]=String.valueOf(arr[i]);
		}
		
		for(int i=0; i<temp.length; i++) {
			
			if(temp[i].equals(" ")) {
				count = 0;
				answer +=temp[i];
				continue;
			}
			//인덱스가 0이거나 짝수면 대문자로 바꿔서 answer에 추가
			if(count==0 || count%2==0) {
				answer += temp[i].toUpperCase();
				count++;
			}else {
				answer += temp[i].toLowerCase();
				count++;
			}
		}
		return answer;
	}
	//다른분이 푼 해결방안
	//코드가 깔끔해서 공부 해보고 싶음
	public static String solution2 (String s) {
		String answer="";
		int count = 0;
		//split("")메서드를 실행하면 한글자씩 배열에 담기게 됨
		String[] arr = s.split("");
		
		//향상된 for문을 통해 arr 배열의 요소 만큼 ss변수에 담아주고 있음
		for(String ss : arr) {
			//ss에 공백이 있으면 count를 0으로 초기화하고, 없으면 +1을해서 인덱스 역할 하게 해줌
			count = ss.contains(" ") ? 0 : count+1;
			//카운트를 mod연산하여 0이거나 짝수가 아닌경우 대문자로, 문자에서 인덱스가 홀수이면 소문자로 answer에 담아줌 
			answer += count%2==0 ? ss.toLowerCase() : ss.toUpperCase();
		}
		return answer;
	}
}
