package level1;

import java.util.Arrays;
import java.util.Collections;

public class StringSortDesc {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("abcdF"));
		System.out.println(solution2("abcdF"));

	}
	//문자열 내림차순 구하기.
	//대문자가 소문자보다 작다는 가정임
	public static String solution(String s) {
		String answer="";
		//문자열을 하나씩 배열에 담음
		String[] arr = s.split("");
		//배열정렬을 하는데, Collections의 메소드를 이용함
		Arrays.sort(arr, Collections.reverseOrder());
		//배열의 요소들을 문자열에 차례로 담아줌
		for(int i=0; i<arr.length; i++) {
			answer +=arr[i];
		}
		
		return answer;
	}
	
	//StringBuilder 사용
	public static String solution2(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		//스트링 빌더로 arr를 String으로 만들고 reverse로 역순 정렬하고 출력
		 return new StringBuilder(new String(arr)).reverse().toString();
	}
}
