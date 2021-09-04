package level1;

public class SquareRoot {

	public static void main(String[] args) {

		System.out.println(solution(3));
	}
		//정수의 제곱근 판별 
		//1. 임의의 양의 정수 n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴
		//2. n이 양의 정수 x의 제곱이 아니라면 -1을 리턴
	   public static long solution(long n) {
	        long answer = 0;
	        
	        //Math클래스의 sqrt이용 제곱근을 구함, 이때 매개변수를 더블로 받기 때문에 long타입으로 형변환(원래 자동형변환 됨)
	        double value = Math.sqrt((double)n);
	        
	        //제곱근이 정수여야 하니까 소수점이 있으면 안되는것으로 판단, 1로 mod연산했을때 나머지가 0이어야함. 따라서, 0이 아니면 -1을 리턴
	        if(value%1!=0) {
	        	answer=-1;
	        } else if(value%1==0) {
	        	//마찬가지로 Math클래스의 pow를 이용해 제곱을 구해줬음. 리턴타입이 더블이라 Long으로 형변환
	        	answer=(long) Math.pow(value+1, 2);
	        }
	        //코드 단순화를 위해 삼항연산자도 활용해봄
//	        answer = (value%1==0) ? (long)Math.pow(value+1,2) : -1;
	        
	        return answer;
	   }
	   
	   

}
