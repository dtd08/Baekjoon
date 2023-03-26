import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 횟수
		for(int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d ", i+1, A, B, A+B);
		}
		
		sc.close();
	}
	
}