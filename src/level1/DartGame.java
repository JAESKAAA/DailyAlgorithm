package level1;

public class DartGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dartResult = "1D2S#10S";
		
		
			System.out.println(solution(dartResult));
	}
	//다트 점수 계산 로직
	/**
	 * 1. 게임은 총 3번의 기회
	 * 2. 1회당 얻을 수 있는 점수는 0~10점
	 * 3. 점수와 함께 싱글(S) 더블(D) 트리플(T) 영역이 존재하고 각 영역 당첨시 1제곱/2제곱/3제곱(점수^1 /점수^2/ 점수^3)으로 계산됨
	 * 4. 옵션으로 스타상(*) / 아차상(#)이 존재하며, 스타상은 해당 점수와 직전의 점수를 각각2배로만듬
	 * 4-1 아차상 당첨시 해당 점수가 마이너스 됨
	 * 5. 스타상은 첫번째 기회에서도 나올 수 있음 (이 경우 첫번째 기회의 점수만 2배)
	 * 6. 스타상의 효과는 다른 스타상 효과와 중첩 될 수 있음(이 경우 4배로 적용)
	 * 7. 스타상의 효과는 아차상과도 중첩됨 (이경우 직전의 점수가 -2배가 됨)
	 * 8. S/D/T는 점수마다 하나씩 존재함
	 * 9. 스타상과 아차상은 점수마다 둘중 하나만 존재 가능하며, 존재하지 않을 수도 있음
	 * -> 0~10의 정수와 문자 S,D,T,*,#로 구성된 문자열이 입력될 시 총 좀수를 반환하는 메소드 만들기
	 *
	 */
	
	
	//옵션 부분에서 막혀 다른분의 풀이를 참고하면서 풀어냈음
	//다시 혼자 힘으로 풀어보기
	public static int solution(String dartResult) {
		int [] answer = new int[3];
		int idx =0;
		int count=0;
		
		for(int i=0; i<dartResult.length(); i++) {
			//문자열의 값 하나를 char로 변환
			char input = dartResult.charAt(i);
			//변환된 char를 유니코드로 변환해서 문자인지 숫자인지 판별함
			int dartInt = Character.getNumericValue(input);
			
			//다트의 숫자(유니코드가) 0~9이면 하기 조건절로
			if(dartInt >= 0 && dartInt <= 10) {
				
			//dartInt에 1이 들어오면 그 뒤에 값이 0인지 확인후 0이 맞다면 10을 대입해줌
			if(dartInt ==1) {
				if(Character.getNumericValue(dartResult.charAt(i+1))==0) {
					//다트값에 10담아주고 i증가시켜 다음 값은 넘어가게 함
					dartInt=10;
					i++;
				}
			}
			//현재 인덱스에 다트값 담아주고 던진 횟수 증가시킴
			answer[idx] = dartInt;
			count++;
			//다트 값이 10보다 큼 즉, 숫자가 아니면 하기 조건절로 
			}else {
				//옵션 부분
				//현재 인덱스에 옵션을 부여해서 다시 담아주고 인덱스 증가 시켜 다음 값으로 넘어감
				switch(input) {
				case 'S' :
					answer[idx] = (int)Math.pow(answer[idx],1);
					idx++;
					break;
				case 'D' :
					answer[idx] = (int)Math.pow(answer[idx],2);
					idx++;
					break;
				case 'T' :
					answer[idx] = (int)Math.pow(answer[idx],3);
					idx++;
					break;
					//스타상이나 아차상이 나오면 인덱스를 다시 빼줘야함
				case '*' :
					//인덱스 값 -2가 음수면 0을 리턴하고, 클 경우 idx-2를 리턴
					idx = idx-2<0 ? 0 : idx-2;
					while(idx<count) {
						answer[idx] = answer[idx] *2;
						idx++;
					}
					break;
				case '#' :
					answer[idx-1] = answer[idx-1]*-1;
					break;
				}
			}
		}
		
		return answer[0]+answer[1]+answer[2];
	}
}
