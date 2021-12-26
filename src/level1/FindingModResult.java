package level1;

/*나머지 연산 결과가 1이 되는 자연수 찾기
 * 
 * 1. 자연수 n이 매개변수로 주어짐
 * 2. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return하도록 함수 완성
 * 
 *  * 3 <= n <= 1,000,000
 *  
 *  입출력 예시
 *   n = 10 일떄 result = 3
 *    	-> 10을 3으로 나눈 나머지가 1이고, 3보다 작은 자연수 중 문제 조건을 만족하는 수가 없으므로 3을 리턴
 *   n = 12 일때 result = 11
 *   	-> 12를 11로 나누면 나머지가 1이고, 11보다 작은 자연수 중 문제의 조건을 만족하는 수가 없으므로 11을 리턴 
 * 
 * */
public class FindingModResult {

	public static void main(String[] args) {
			int n = 12;
			System.out.println(solution(n));
		}

	public static int solution (int n) {
		int result =0;
		
		//1. 자연수 n%x했을때 값이 1일때만 참이되도록 설정
		for(int i=1; i<n; i++) {
			if(n%i == 1) {
				result = i;
				break;
			}
		}
		//2. 해당 값중 최소값(min)을 리턴
		
		return result;
	}
}

