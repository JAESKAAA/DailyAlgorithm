package level1;

public class GoGetTheCenterString {

	public static void main(String[] args) {

		System.out.println(solution("qwer"));
	}
	//String s의 가운데 문자 가져오기
	// 문자열이 짝수면 가운데 2글자를 가져오면 됨
	public static String solution(String s) {
		String answer="";
		//입력받은 문자열을 배열로 생성
		String[] str = s.split("");
		
		//짝수면 배열길이 /2 -1의 값과 /2한 인덱스의 요소를 정답 문자열에 담고
		if(s.length()%2==0) {
			answer = str[(s.length()/2)-1]+str[s.length()/2];
		} else {
			//홀수면 가운데만 담으면 되니까 length가 5인경우 2.5 -> 2만 저장되므로 가운데 숫자인 2가 인덱스로 들어가게됨
			answer = str[s.length()/2];
		}
		
		return answer;
	}
}
