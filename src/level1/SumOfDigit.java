package level1;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution(12345));
	}
	
	//입력받은 수에서 각자리수의 합을 구해서 리턴
	public static int solution(int n) {
		int answer = 0;
		
		while(n>0) {
			answer += n%10;
			n/=10;
		}
		return answer;
	}

}
