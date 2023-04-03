import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for(int i = 1; i <= 9; i++) {
			int n = sc.nextInt();
			if(n >= max) {
				max = n; // 입력받은 값과 max값 비교 후 대입 
				idx = i; // max 위치 기억
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}

}