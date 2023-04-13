import java.util.Scanner;

public class Main { // 숫자더하기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt(); // 숫자 개수
		String N = sc.next();
		int total = 0;
		
		for(int i = 0; i < cnt; i++) {
			if(N.charAt(i) - 48 != 0)
				total += N.charAt(i) - 48;
		}
		System.out.println(total);
		
		sc.close();
	}
}