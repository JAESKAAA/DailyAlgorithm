package level1;

public class GuessCollatz {

	public static void main(String[] args) {

		System.out.println(solution(626331));
	}
	
	//콜라츠 추측. 주어진 수가 1이될때까지 하기 작업을 반복하면 모든 수를 1로 만들 수 있다는 추측
	/*
	 * 1-1 입력된 수가 짝수라면 2로 나눔
	 * 1-2 입력된 수가 홀수라면 3을 곱하고 1을 더함
	 * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복
	 * 500번이 반복되어도 1이 되지 않을 경우 -1 리턴
	 */
	
	//하기는 while문을 이용해 풀이한 내용임
	public static int solution(int num) {
//        int answer = 0;
//        
//        while(num!=1 && answer !=500) {
//          if(num%2==0) {
//        	  num /=2;
//          }else if(num%2==1) {
//        	  num = (num*3)+1;
//      		}
//         answer++;
//         }
//        if(answer==500) {
//        	answer = -1;
//        }
//        
//        return answer;
//    }
	
	//for문을 이용할 경우 삼항식을 이용해 더 간단히 풀 수 있음
	long n = (long)num;
	for(int i=0; i<500; i++) {
		if(n==1) return i;
		n = (n%2==0) ? n/2 : (n*3)+1;
	}
	//500번 끝나는 대로 -1 리턴
	return -1;
	}
}

