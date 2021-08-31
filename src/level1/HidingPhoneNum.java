package level1;

public class HidingPhoneNum {

	public static void main(String[] args) {
		System.out.println(solution("01029400649"));
		
	}
	
	//매개변수가 문자열 전화번호로 들어오면(ex."01033333333") 끝번호 4자리를 제외한 모든 숫자를 *으로 치환하기
    public static String solution(String phone_number) {
        
    	String answer = ""; //정답 넣을 그릇
    	//마지막 4자리는 숫자로 살려두기
        String lastDigit = phone_number.substring(phone_number.length()-4, phone_number.length());
        //마지막4자리를 제외한 앞자리수도 따로 저장해두기
        String postDigit = phone_number.substring(0, phone_number.length()-4);
        //앞자리수 길이만큼의 배열 생성
        String[] a = new String[postDigit.length()];
        //앞자리수의 길이만큼 배열에 "*" 넣기
        for(int i=0; i<postDigit.length();i++) {
        	a[i] = "*";
        }
        //배열에 담긴 *들을 문자열 변수에 넣어주기
        String changer = String.join("", a);
        //합치면 끝
        answer = changer+lastDigit;
        
        return answer;
    }
}
