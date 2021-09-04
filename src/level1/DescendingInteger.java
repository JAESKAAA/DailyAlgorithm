package level1;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingInteger {

	public static void main(String[] args) {
		long num =1234;
		System.out.println(solution(num));
	}

	//입력된 정수값의 각 자리수를 뽑아내서 숫자가 큰것에서 작은순서로 오도록 정렬한 새로운 정수 리턴
	
	public static long solution(long n) {
		
		//값을 담아줄 변수들
		int count=0; //배열의 길이가 될 변수임
		long num=n; //나머지 연산 외 앞자리수를 담을 변수임
		
		//1. 입력받은 값을 자리수별로  배열에 담아줘야함 
		//1-1 자릿수 계산
		while(num!=0) {
			num /=10;
			count++;
		}
		
		//1-2 배열에 담기
		Long[] arr = new Long[count];
		num=n;
		for(int i=arr.length-1; i>=0; i--) {
			arr[i]=num%10;
			num/=10;
		}
		
		//2. 배열을 내림차순으로 정렬하기
		Arrays.sort(arr, Comparator.reverseOrder());
		//3. 배열을 다시 정수값으로 변환해주기
		//정규식 사용, [^0-9] -> 0~9가 아니면, ""으로 대체하겠다는 의미임
		String str = Arrays.toString(arr).replaceAll("[^0-9]","");
		long answer = Long.parseLong(str);
		return answer;
	}
	
}
