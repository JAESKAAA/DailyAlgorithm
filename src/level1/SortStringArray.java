package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortStringArray {

	public static void main(String[] args) {
		String[] arr = {"sun","bed","car"};
		
		System.out.println(Arrays.toString(solution(arr,1)));
	}
	
	//문자열로 구성된 리스트 strings와 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬
	// ex. ["sun","bed","car"] 이고, 인덱스가 1이면, "u","e","a" 를 추출하게 되므로 car, bed, sun순서로 정렬되어야함
	//인덱스에 맞는 문자가 같은 문자열이 여럿이면 사전순으로 앞선 문자를 앞쪽에 위치시키기
	public static String[] solution(String[] strings, int n) {
		//정답 배열 크기 먼저 지정해주기
		String[] answer = new String[strings.length];
		
		ArrayList<String> list = new ArrayList<>();
		
		//리스트에 인덱스 번호의 알파벳을 요소맨앞에 복사해줌
		for(int i=0; i<strings.length; i++) {
			list.add(strings[i].charAt(n)+strings[i]);
		}
		//정렬
		Collections.sort(list);
		//맨앞에 알파벳을 지워주고 정답 제출
		for(int i=0; i<strings.length; i++) {
			//list에서 get메서드를 활용해 인덱스 i번째의 요소를 꺼내와 substring으로 인덱스1부터 끝까지 출력
			//substring을 1로 주는 이유는 0번 인덱스에 27라인에서 붙여뒀던 앞파벳이 붙어있기 때문에
			answer[i] = list.get(i).substring(1);
		}
		return answer;
	}
}
