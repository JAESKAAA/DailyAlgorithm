package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class DeduplicationInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,3,3,0,1,1};
		System.out.println(Arrays.toString(solution(arr)));
	}
	//주어진 배열에서 연속적으로 나오는 값만 제거한 후 배열 반환해주기
	// ex. [1,1,3,3,0,1,1] -> [1,3,0,1] 로 반환해줘야함
	
	public static int[] solution (int[] arr) {
		
		//1.가변 배열 생성
		ArrayList<Integer> list = new ArrayList<>();
		
		//2. 정수 조건이 0~9이기 때문에 10으로 넣어주었음
		int tempNum = 10;
		//3. 향상된 for문 이용해 배열의 값을 모두 순회할 수 있게 해줌
		for(int num : arr) {
			//배열의 값이 초기값과 같지않으면 일단 list에 담아줌
			if(tempNum!=num) {
				list.add(num);
			}
			//담은 값을 tempNum에 다시 담아 중복 검사가 가능하게끔 함
			tempNum=num;
		}
		//list를 스트림으로 만들고 mapToInt를 통해 intStream으로 만든 뒤 toArray하여 int 배열로 만듬
		return list.stream().mapToInt(Integer::intValue).toArray();
	
	}
}
