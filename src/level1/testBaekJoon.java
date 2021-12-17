package level1;

import java.util.Scanner;

public class testBaekJoon {
	
	//if문 관련
	public static void main(String[] args) {
		
		//시험점수를 입력받아 90~100점은 A, 80~89은 B, 70~79는 C, 60~69는 D, 나머지는 F문을 출력
		
		Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
		
		if(input >= 90 && input <= 100) {
			System.out.println("A");
		}else if(input >= 80 && input <= 89) {
			System.out.println("B");
		} else if(input >= 70 && input <= 79) {
			System.out.println("C");
		} else if (input >= 60 && input <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
