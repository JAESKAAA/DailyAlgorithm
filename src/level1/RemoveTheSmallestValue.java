package level1;

import java.util.Arrays;

public class RemoveTheSmallestValue {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {1,2,3,4})));
		
	}
	
	//1. 정수배열을 입력받은 뒤 배열에서 가장 작은 값을 제거후 나머지 요소를 배열로 리턴
	//2. 리턴하려는 배열이 빈배열이 되는 경우 [-1]을 리턴
	 public static int[] solution(int[] arr) {
		 //정답 배열의 크기를 입력받은 배열 길이 -1로 설정해줌 (최소값만 하나 뺄거니까)
	        int[] answer = new int[arr.length-1];
	        
	        //제한조건 중 배열은 길이 1이상인 배열이어야 하고, 배열 길이가 1인 경우 최소값을 구할 수 없으니 -1을 대입하고 배열을 리턴해줘야함
	        if(arr.length==1) {
	        	arr[0]=-1;
	        	return arr;
	        }
	        
	        //최소값을 arr의 첫번째 인덱스값으로 기준 잡음
	        int min = arr[0];
	        // 최소값의 인덱스를 저장하기 위한 변수
	        int idx = 0;

	        for(int i=0; i<arr.length; i++) {
	        	if(min > arr[i]) { //i 인덱스의 배열요소가 기준 min값 보다 작으면 해당값을 min에 저장 후 inx 위치 저장
	        		min = arr[i];
	        		idx = i;
	        	}
	        }
	        
	        //정답 배열에 최소값을 제외하고 나머지 요소를 넣어줄 예정
	        int index=0;
	        for(int i=0; i<arr.length; i++) {
	        	if(i==idx) { //위에서 구한 최소값의 인덱스가 반복문 차례에 오면 배열에 넣지않고 넘어감
	        		continue;
	        	}
	        	//정답 배열의 인덱스를 후위연산 해주면 배열의 길이를 설정하지 않고 for문의 길이만큼 인덱스 설정 가능함
	        	answer[index++]=arr[i];
	        }
	        
	        return answer;
	    }

}
