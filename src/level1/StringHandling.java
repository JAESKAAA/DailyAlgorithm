package level1;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution("12345"));
		
		
		
	}
	
	//입력받은 문자열의 길이는 4 또는 6이며, 숫자로만 구성되어 있는지 확인해 주는 함수 작성
	//"a123" -> false
	public static boolean solution(String s) {
		boolean answer=true;
		
		//배열 길이 설정(4또는 6)
		char[] arr = s.toCharArray();
		if(arr.length !=4 && arr.length !=6) {
			return false;
		}
		//배열 길이만큼 for문
		for(int i=0; i<arr.length; i++) {
			//arr[i]값을 숫자로바꾼 값이 10보다 크거나 같으면 false
			if(Character.getNumericValue(arr[i]) >= 10) {
				answer = false;
			}
		}
		
		return answer;
	}
}
