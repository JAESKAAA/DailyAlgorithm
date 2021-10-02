package level1;

import java.util.Arrays;

public class FindingNumberOfK {

	public static void main(String[] args) {

			int[][] commands = {
					{2,5,3},{4,4,1},{1,7,3}
			};
			int[] array = {1,5,2,6,3,7,4};
			
			System.out.println(Arrays.toString(solution(array,commands)));
	}

	//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고  정렬했을때  k번째의 수를 구하시오.
	//ex . [1,5,2,6,3,7,4] -> i=2, j=5, k=3 이면 
	//  배열에서 2번째~5번째 까지 숫자는 [5,2,6,3] 
	//  해당 배열을 정렬하면 [2,3,5,6]
	//  정렬된 배열에서 3번째 수는 5이기 때문에 답은 5.
	public static int[] solution (int[] array, int[][] commands) {
		int[] answer= new int[commands.length];
		
		//첫번째 i값 가져오기
		for(int i=0; i<commands.length; i++) {
			int[] copyArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(copyArray);
			answer[i] = copyArray[commands[i][2]-1];
		}
		
		return answer;
	}
}
