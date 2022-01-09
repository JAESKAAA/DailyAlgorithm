package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * 
 * 임의의 자연수 N의 각 자리수 정렬 후 합계 도출
 * 
 *  ex. N = 1354 일때
 *  오름차순  = 1345
 *  내림차순 = 5431
 *  합계 = 6776
 *  
 *
 */
public class SortNum {

	public static void main(String[] args) {
		
		long n = 2613;
		System.out.println(solution(n));
	}

	private static long solution(long n) {
		long result= 0;
		
		 Integer[] list = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
		
		 Arrays.sort(list);
		 String str = "";
		 for(Integer value : list) {
			 str += value.toString();
		 }
		 int ascValue	=  Integer.parseInt(str);
		 str="";
		 
		Arrays.sort(list, Collections.reverseOrder());
		
		for(Integer value : list) {
			str += value.toString();
		}
		int descValue = Integer.parseInt(str);
		
		result = ascValue + descValue;
			
		
		return result;
	}
	

}
