package level1;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(7)));
		System.out.println(7%10);
		System.out.println("다른방법의 코드="+Arrays.toString(solution1(98521478521L)));
	}

	public static long[] solution(long n) {
        
         	long num = 0;
        	int count =0;
        	
        	
        	//1. 입력받은 숫자의 자리수 구하기
        	num=n;
        	while(num!=0) {
        		num/=10;
        		count++;
        	}
        	//2 . 입력받은 숫자의 자리수를 끊어서 배열에 역순으로 담기
        	long[] answer = new long[count];
        	num=n;
        	//2-1. 자릿수가 한자리의 수일때 바로 배열에 담기
        	if(num<10) {
        		answer[count-1]= num;
        	}else {
        	for(int i=0; i<count-1; i++) {
        		answer[i] = num%10;
        		num/=10;
        		// 2-2. 마찬가지로 자리수가 한자리 남았을때 바로 배열끝 인덱스에 담아주기
        		if(num<10) {
            		answer[count-1]= num;
            	}
        	}
        	}
        return answer;
    }



	//다른 분이 풀었던 좋은 코드 공부용으로 참고
	public static int[] solution1(long n) {
		//공백+매개변수로 바로 문자열에 담아주었음
	    String a = "" + n;
	    //정답 배열의 크기는 문자열의 길이만큼 지정
	      int[] answer = new int[a.length()];
	      int cnt=0;
	      
	      while(n>0) {
	    	  //0번째 배열부터 n의 모드연산 값을 넣어줌(끝자리부터 들어가게됨)
	          answer[cnt]=(int)(n%10);
	          //n에 끝자리를 제외한 나머지값들이 저장됨
	          n/=10;
	          System.out.println(n);
	          //배열의 커서를 다음으로 넘겨줌
	          cnt++;
	      }
	    return answer;
	}
}