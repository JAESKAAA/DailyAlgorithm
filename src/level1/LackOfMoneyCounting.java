package level1;

public class LackOfMoneyCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(3,20,4));
	}
	/*
	 * [부족한 금액 계산하기]
	 * 1. 놀이기구를 n번째 이용한다면 원래 이용료에 n배를 부과함
	 * 2. 놀이기구를 count번 타게되면 현재 자신이 가진 금액에서 얼마가 모자라는지 리턴하시오
	 * 3. 단, 금액이 부족하지 않으면 0을 리턴
	 * 
	 * *놀이 기구 이용료 1<= price <= 2,500
	 * *처음 가지고 있는 돈 -> 1~1,000,000
	 * *카운트 횟수 1~2,500
	 * ex. 가격 =3 잔액=20 횟수=4 면 10을 리턴해야함
	 * (3,6,9,12)-20 = -10 이므로
	 */
	
	//for문 이용한 풀이 (시간복잡도 : 0.02ms ~ 0.13ms)
	public static long solution (int price, int money, int count) {		
		//count에 따른 배열 생성
		long[] arr = new long[count];
		
		long sum =0;
		//카운트 횟수만큼 sum에 더해줌
		for(int i=0; i<count; i++) {
			sum+= price*(i+1);
		}
		//잔액여부에 따른 분기
		return (money-sum) < 0 ? sum-money : 0;
	}
	
	//1에서 ~ count 까지의 합을 구하는 공식
	// 1~n = n(n+1)/2 활용 (시간복잡도 : 0.02ms ~ 0.04ms)
	public static long solution1 (int price, int money, int count) {
		long answer = -1;
		answer = (long)price*count*(count+1)/2 -money;
		return answer <= 0 ? 0 : answer;
	}
}
