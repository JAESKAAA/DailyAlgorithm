package level1;

public class HarshadNumber {
public static void main(String[] args) {
	System.out.println(solution(13));
}

public static boolean solution(int x) {
	boolean answer = true;
	char[] b = String.valueOf(x).toCharArray();
	int sum=0;
	for(int i=0; i<b.length; i++) {
		sum+=Integer.parseInt(String.valueOf(b[i]));
	}
	answer = (x%sum==0)? true : false;
	
    return answer;
}
}
