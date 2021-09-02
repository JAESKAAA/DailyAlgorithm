package level1;

import java.util.Arrays;

public class GCF_LCM {

	//최대공약수와 최소공배수 구하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(solution(3,5)));
	}
	
	//유클리드 호제법을 참고함
	//2개의 자연수에 대해 mod연산을 반복하여 나머지가 0이 되었을때 마지막 계산에서 나누는데 사용한 수가 두수의 최대 공약수
	 public static int[] solution(int n, int m) {
        int[] answer = new int[2];
       
        int num = (n<m) ? n : m;
        int gcf = 0;
        
        for(int i=1; i<=num; i++){
            if((n%i==0) && (m%i==0)) 
                gcf=i;
        }
        answer[0]=gcf;
        answer[1]=n*m/gcf;
        return answer;
	    }
}
