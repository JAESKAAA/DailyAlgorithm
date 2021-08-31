package level1;

public class HarshadNumber {
public static void main(String[] args) {
	System.out.println(solution(13));
}
//하샤드 수 검증하는 코드 만들기
//하샤드수 => ex. 12의 경우 1+2=3이고, 3으로 12를 나누면 나누어 떨어지므로 하샤드 수임
public static boolean solution(int x) {
	boolean answer = true;
	//매개변수인 x를 문자열로 바꿔 캐릭터 배열에 넣음
	char[] b = String.valueOf(x).toCharArray();
	int sum=0;
	//캐릭터 배열의 수만큼 반복하는데, sum변수에는 캐릭터 변수를 문자열로 변환후, 다시 정수값으로 변환해 넣어줬음
	//캐릭터 배열 b에 담긴 수가 sum에 누적되는 구조임
	for(int i=0; i<b.length; i++) {
		sum+=Integer.parseInt(String.valueOf(b[i]));
	}
	//매개변수 x를 sum으로 나눠 나머지가 0이면 true, 그외엔 false를 반환하여 answer에 저장
	answer = (x%sum==0)? true : false;
	
    return answer;
}
}
