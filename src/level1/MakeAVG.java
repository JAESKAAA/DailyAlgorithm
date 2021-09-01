package level1;

import java.util.Arrays;

public class MakeAVG {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(solution(arr));
	}

		//arr 배열값을 매개변수로 받아 해당 배열의 값의 평균을 구해주는 메소드
	public static double solution(int[] arr) {
        double answer = 0;
      
        //내가 풀어본 코드
//        for(int i=0; i<arr.length; i++) {
//        	sum += arr[i];
//        }
//        answer = (double)sum / arr.length;
        
        
        //스트림을 이용하여 한코드로 정리가능함
        //배열이므로 Arrays에서 매개변수 arr을 스트림으로 불러와 중간연산은 average 실행하고 orElse를 통해 값이 있으면 값을 반환, 없으면 0을 반환하도록 최종 연산함
        return Arrays.stream(arr).average().orElse(0);
    }
}
