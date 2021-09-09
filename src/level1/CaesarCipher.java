package level1;

import java.util.Arrays;

public class CaesarCipher {
	
	

	public static void main(String[] args) {
//		char a = 'Z';
//		System.out.println((int)a);
//		System.out.println(solution("AaZz",25));
		System.out.println(solution("z",1));
	}
	/*
	 * 카이사르 암호(시저암호)
	 * 1. 어떤 문장의 알파벳을 밀어서 일정 거리만큼의 다른 알파벳으로 바꾸는 암호화 방식
	 * 2. 공백은 아무리 밀어도 공백임
	 * 3. n은 25이하 자연수
	 * 4. s는 알파벳 소문자, 대문자, 공백으로만 이루어짐
	 * 
	 * 아스키 코드
	 * 소문자 a = 97
	 * 소문자 z = 122
	 * 
	 * 대문자 A = 65
	 * 대문자 Z = 90
	 */

	public static String solution (String s, int n) {
		
//		// 1번째 방법 실패.
//		// 1. 입력받은 문자열을 캐릭터 배열로 변경하고 각 배열의 요소를 아스키코드로 int 배열에 넣어줌
//		// 문자 배열로 변경
//		char[] charArr = s.toCharArray();
//		int[] intArr = new int[charArr.length];
//		// 배열의 요소를 아스키 코드로 변환하면서 int 배열에 넣음
//		for(int i=0; i<charArr.length; i++) {
//			intArr[i] = (int)charArr[i];
//		}
//		
//		// 2. 인트배열에 입력받은 숫자만큼 각요소마다 + 해줌
//		for(int i=0; i<intArr.length; i++) {
//			//공백(32)면 넘어가기
//			if(intArr[i]==32) {
//				continue;
//			} else if(intArr[i]+n>97 && intArr[i]+n>122) {
//				intArr[i] = (intArr[i]+n) - intArr[i]+96;
//				continue;
//			} else if(intArr[i]+n>90 && intArr[i]+n>122) {
//				intArr[i] = (intArr[i]+n) - intArr[i]+64;
//				continue;
//			}
//			intArr[i] +=n;
//		}
//		
//		// 3. 인트 배열의 요소들을 캐릭터 배열로 바꾼뒤 문자열에 더해줌
//		for(int i=0; i<charArr.length; i++) {
//			charArr[i] = (char)intArr[i];
//			answer+=charArr[i];
//		}
		
		//다른곳에서 아이디어를 얻어서 구현다시 해봄
		
		//1. 캐릭터 배열생성
		char[] charArr = s.toCharArray();
		//2. 반복문으로 담아줌
		for(int i=0; i<charArr.length; i++) {
			//3. 만약 공백문자면 넘어가고, 공백문가 아닌경우의 로직 구현
			if(charArr[i] != ' ') {
				if(Character.isUpperCase(charArr[i])) {
					//캐릭터에 정수가 더해지면 자동으로 정수로 형변환처리됨
					charArr[i] += n;
					//상기 코드에서 배열에 요구된 n의값을 이미 더함으로써 문자가 Z를 넘어갈 수 있음
					//하기의 조건처럼 Z보다 클경우 A에 넘어간 캐릭터의 값-Z에 1을 더 빼줌으로써 초과된 값만큼 A에 더해줄 수 있음
					if(charArr[i] > 'Z') {
						charArr[i] = (char)('A' + (charArr[i] - 'Z' -1));
					}
				} else {
					charArr[i] += n;
					if(charArr[i] >'z') {
						charArr[i] = (char)('a' + (charArr[i] - 'z' -1));
					}
				}
			}
		}
		//문자열 배열을 스트링으로 바꿔줌
		return String.valueOf(charArr);
	}
}
