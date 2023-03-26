import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 출력 횟수
		for(int i = 0; i < n; i++) {
			for(int j = 0; i >= j; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
	
}