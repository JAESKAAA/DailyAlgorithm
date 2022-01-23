package level1;

import java.util.Arrays;

//배열에서 중복되는 순서가 가장 빠른 수 리턴하기
//없으면 -1 리턴
public class FastestDuplicate {
	public static void main(String[] args) {
		
		int[] arr = {2,1,3,1,4,2,1,3};
		//System.out.println(solution(arr));
		
		System.out.println(Arrays.asList(arr).indexOf(1));
	}

	private static int solution(int[] arr) {
		int result = 0;
		
		int [] list = new int[arr.length];
		
		int cnt = 0;
		
		//배열 순회를 통해 현재 내 값이 인덱스 있는 지 찾아야함
		
//		  for (int i=0; i<arr.length; i++)
//			   //if (arr[i] == )
//			    return i;
//			   
//			  return -1;
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			
			index = Arrays.asList(arr).indexOf(arr[i]);
			
		
		}
//		for(int i=0; i<arr.length; i++) {
//			for(int k=i+1; k<arr.length; k++) {
//				cnt++;
//				if(arr[i] == arr[k]) {
//					break;
//				}
//			}
//			list[i] = cnt;
//			cnt = 0;
//		}
		list[arr.length-1] = arr.length+1;
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		result = list[0] == 0 ? -1 : list[0];
		
		return result;
	}
}
