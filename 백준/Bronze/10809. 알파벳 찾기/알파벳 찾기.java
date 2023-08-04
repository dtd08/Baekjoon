import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int idx = 0;
		
		for(char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
			idx = S.indexOf(alphabet);
			System.out.print(idx + " ");
		}
		sc.close();
	}
}