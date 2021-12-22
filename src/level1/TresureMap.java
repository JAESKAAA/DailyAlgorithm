package level1;

import java.util.Arrays;

public class TresureMap {

	/* [지도 암호 해독 관련 알고리즘]
	 * 
	 * 1. 지도는 한변의 길이가 n인 정사각형 배열 형태이며, 각 칸은 공백("") 또는 벽("#") 두 종류로 이루어져 있음
	 * 2. 전체 지도는 두장의 지도를 겹처서 얻을 수 있음.
	 * 	2-1  지도1과 지도2가 있을때, 어느 한 부븐이라도 벽인 부분은 전체 지도에서 벽임, 공백인 경우도 마찬가지
	 * 3. 지도 1과 지도 2는 각각 정수 배열로 암호화 되어 있음
	 * 4. 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백부분을 0으로 암호화 했을 때 얻어지는 이진수에 해당하는 값의 배열임
	 * */
	public static void main(String[] args) {

		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		String[] ssar = {};
		
		String str = "1";
		String str1 = "2";
		String str2 = "3";
		
		
		char[] strArr = str.toCharArray();
		System.out.println(Arrays.toString(solution2(n,arr1,arr2)));
		
	//	System.out.println(strArr[0]==1);
		
		
	}

	/*수정할 부분
	 * 
	 * 1. 이진수를 5자리로 맞춰줘야함
	 * 2. String map을 마지막에 한번씩 담아주는 코드 있어야함
	 * */
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		
		//0. 배열의 크기는 n으로 설정해야함
		String[] strArr1 = new String[n];
		String[] strArr2 = new String[n];
		
		
		//1. 들어온 정수값을 전부 2진수로 바꿔줘야함
		for(int i=0; i<arr1.length; i++) {
			
			//1-1. 이진수 자릿값은 전부 5자리로 맞추고 공백은 0으로  채우기
			String result = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i])));
			System.out.println("arr1의 이진수  =  "+result);
			
			strArr1[i] = result;
		}
		for(int i=0; i<arr2.length; i++) {
			
			String result = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr2[i])));
			System.out.println("arr2의 이진수 =  "+result);
			
			strArr2[i] = result;
		}
			
			//해독한 문자열을 담는 변수
			String map1 = "";
			
			for(int i=0; i<n; i++) {
				System.out.println("strArr의 길이 = "+strArr1.length);
				
				//이진수를 한글자씩 char 배열에 저장
				char[] charArr1 = strArr1[i].toCharArray();
				char[] charArr2 = strArr2[i].toCharArray();
				
					for(int k=0; k<n; k++) {
						
						//분기처리_이진수 char배열의 값이 1이면 # / 아니면 공백으로 저장
						charArr1[k] = (charArr1[k] == '1') ? '#' : ' ';
						charArr2[k] = (charArr2[k] == '1') ? '#' : ' ';
						
						//두번째 분기처리_ 저장된 두 이진수 배열값이 모두 공백이면 map에 공백을 담기
						if(charArr1[k]== ' ' && charArr2[k]== ' ') {
							map1 += ' ';
						}else {
							map1 += '#';
						}
					}
					answer[i] = map1;
					map1="";
			}
		return answer;
	}
	
	//다른분의 풀이법. 훨씬 깔끔한 코드로 풀어내셨음
	public static String[] solution2(int n, int[] arr1, int[] arr2) {
		        String[] result = new String[n];
		        System.out.println(arr1[0] | arr2[0]);
		        for (int i = 0; i < n; i++) {
		        	//keypoint, 비트연산(OR연산) 처리로 둘다 0이 아닐경우 전부 1로 바꿔버렸음
		            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
		        }

		        for (int i = 0; i < n; i++) {
		            result[i] = String.format("%" + n + "s", result[i]);
		            result[i] = result[i].replaceAll("1", "#");
		            result[i] = result[i].replaceAll("0", " ");
		        }

		        return result;
	}
}
