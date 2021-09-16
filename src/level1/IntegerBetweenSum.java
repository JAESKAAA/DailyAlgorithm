package level1;

public class IntegerBetweenSum {

	public static void main(String[] args) {

		System.out.println(solution2(1,6));
	}
	
	//두 정수 사이의 합을 구하기
	//ex. 3,5인 경우 3+4+5 = 12를 리턴
	public static long solution (int a, int b) {
		long answer =0;
		
		//두 수중 더 큰수를 구함
		long max = Math.max(a, b);
		long min = Math.min(a, b);
		
		
		//범위를 작은값~큰값까지
		for(long i=min; i<=max; i++) {
			answer+=i;
		}
		
		
		return answer;
	}
	//등차수열의 공식 이용하면 시간복잡도를 더 효율적으로 하여 풀어낼 수 있음
	public static long solution2 (int a, int b) {
		long answer =0;
		
		//두 수중 더 큰수를 구함
		long max = Math.max(a, b);
		long min = Math.min(a, b);
	
		//등차수열의 공식 
		answer = (min+max) * (max-min-1)/2;
		return answer;
	}
}
