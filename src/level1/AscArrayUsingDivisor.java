package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AscArrayUsingDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,9,7,10};
		
		System.out.println(Arrays.toString(solution(arr,5)));
	}

	//입력받은 정수 배열의 요소 중 입력받은 정수 n으로 나누어 떨어지는 요소를 배열에 담고 오름차순 정렬
	//나누어 떨어지는 값이 없으면 -1을 넣어줘야함
	public static int[] solution (int[] arr, int n) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		//1. 입력받은 매개변수로 나누어 떨어지는지 for문 돌리기
		for(int i=0; i<arr.length; i++) {
			
			//1-1. 조건 검사 divisor로 나누어 떨어지는 값만 정답 배열에 담아주기
			if(arr[i]%n==0) {
				list.add(arr[i]);
			}
		}
		//1-2 list에 들어간 값이 없는 경우 -1로 넣어줌
		if(list.isEmpty()) {
			list.add(-1);
		}
		//2. 오름차순 정렬
		Collections.sort(list);
		
		int[] answer = new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) != 0) {
				answer[i]=list.get(i);
			}
		}
		return answer;
	}
	
	//다른분이 풀이하신것 가져옴
	//스트림을 이용해 int 배열을 스트림배열로 만들어주고, filter를 이용해 매개변수 factor가 n으로 나누어떨어지는 것만 뽑아 냈으며, toArray최종 연산을 통해 int 배열로 다시 변환해줬음
	public static int[] solution1 (int[] arr, int n) {
		return Arrays.stream(arr).filter(factor -> factor % n == 0).toArray();

	}
}
