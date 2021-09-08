package level1;

public class SumOfDivisor {

	public static void main(String[] args) {
		System.out.println(solution(12));
	}
	
	//1. 입력받은 정수 n의 모든 약수를 더한 값을 구하시오
	public static int solution(int n) {
		int solution=0;
		
		
		//1. 약수 구하기 -> for문을 이용해 해당 숫자까지 나머지가 0인 값들을 구함
		for(int i=1; i<=n; i++) {
			// 1-2 나온 약수중 나누어 떨어지는 수는 솔루션에 더해주기
			if(n%i==0) {
				solution+=i;
			}
		}
		
		return solution;
	}
}
