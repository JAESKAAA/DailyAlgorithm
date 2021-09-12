package level1;

public class FindStringElement {

	public static void main(String[] args) {
		String[] seoul = {"Seoul","Busan","Daegu","Daejeon","Kim","Gwangju","Incheon"};
		
		System.out.println(solution(seoul));
	}
	
	//스트링 배열을 매개변수로 받아서, seoul의 element중 "kim"을 찾아 "김서방은 x에 있다" 라는 문구 출력해주기
	//Kim은 seoul에 반드시 포함되어 있음
	public static String solution(String[] seoul) {
		String answer="";
		
		//1. 배열의 탐색 - 배열의 길이만큼 Kim이 있는지 검색함
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				//Kim을 찾으면 answer에 i를 넣어줌
				answer = ""+i;
				//브레이크를 넣어줌으로써 Kim의 인덱스를 찾은 후 불필요하게 for문이 도는것을 막을 수있어, 성능 향상을 기대할 수 있음
				break;
			}
		}
		
		return "김서방은 "+answer+ "에 있다.";
	}

}
