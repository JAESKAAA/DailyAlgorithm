package level1;

public class PrimeNumberCounting {

	public static void main(String[] args) {

			System.out.println(solution(25));
	}
	
	//주어진 숫자 사이에 소수를 구하여라.
	//*소수는 1과 자신으로만 나누어 떨어지는 숫자를 말함
	//에라토스테네스의 체 이용함 **추가로 복습 요망 **
	public static int solution(int n) {
		int answer=0;
		
		int[] number = new int[n+1];
		
		//0,1은 소수가 아니기에 배열에서 아예 배제함
		for(int i=2; i<=n; i++) {
			number[i]=i;
		}
		//배열의 요소가 0이면 조건문으로 회귀
		for(int i=2; i<=n; i++) {
			if(number[i]==0) continue;
			
			//처음엔 2의배수 4부터~ 그다음 턴에 3의배수 6부터~ 그다음턴에 4~ 5~쭉쭉 이어갈것
			for(int j=2*i; j<=n; j+=i) {
				number[j]=0;
			}
		}
		
		//배열에서 0이 아닌것들을 세어줌
		for(int i=0; i<number.length; i++) {
			if(number[i]!=0) {
				answer++;
			}
		}
		return answer;
	}

}
