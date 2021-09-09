package level1;

public class LoopString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(11));
	}
	//문자열에 수박수박 반복하기
	//입력받은 숫자만큼 수,박이 반복되어야 함
	public static String solution(int n) {
		String answer= "";

    for(int i=0; i<n; i++){
    	answer += i%2==0 ? "수" : "박";
    }
    return answer;
	}
}
