package level1;

public class HidingPhoneNum2 {

	public static void main(String[] args) {
		System.out.println(solution("01029400649"));
		
	}
	
	//매개변수가 문자열 전화번호로 들어오면(ex."01033333333") 끝번호 4자리를 제외한 모든 숫자를 *으로 치환하기
	//다른사람이 푼 문제를 가져와봄. 너무 간단히 풀어주셔서 코드 뜯어볼 예정
    public static String solution(String phone_number) {
        
    	//매개변수 문자열을 캐릭터타입으로 바꿔 캐릭터배열에 담는다
    	char[] ch = phone_number.toCharArray();
    	//캐릭터 배열에 담긴 숫자 -4 만큼 ch배열에 *을 담아줌
    	for(int i=0; i<ch.length-4; i++) {
    		ch[i]='*';
    	}
    	
    	        
        return String.valueOf(ch);
    }
}
