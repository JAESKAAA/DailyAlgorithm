package level1;

import java.util.ArrayList;

public class InterEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//입력받은 2차원배열의 행(i)은 본인이 평가한 상대의 점수, 열(j)은 본인이 평가받은 점수의 배열임
	// 자기 자신이 평가한 점수가 유일한 최고점이거나 유일한 최저점인 경우 해당 점수를 제외하고 평균을 구해야함
	//제외할 점수를 제외하고 평균을 구한뒤 하기 기준에 맞춰 학점 부여하고 하나의 문자열로 만들어 리턴하시오.
	/*
	 * 90점 이상: A
	 * 80점 이상 ~ 90점 미만 : B
	 * 70점 이상 ~ 80점 미만 : C
	 * 50점 이상 ~ 70점 미만 : D
	 * 50점 미만 : F
	 */
	//0번의 학생부터 차례대로 이어붙인 하나의 문자열 리턴하기
	
	//2중 for문으로 풀어내야 하는데, 시간이 없어서 다 못품 내일 마저 풀기
	public static String solution (int[][] scores) {
		String answer="";
		
		int[] sumArr = new int[scores.length];
		
		int sum =0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		//1. 반복문으로 행마다 합계 구해주기
		for(int i=0; i<scores.length; i++) {
			int myScore = scores[i][i];
			int max = scores[0][i];
			for(int j=0; j<scores.length; j++) {
					list.add(scores[j][i]);
				}
			}
		
		
		
		return answer;
	}
}
