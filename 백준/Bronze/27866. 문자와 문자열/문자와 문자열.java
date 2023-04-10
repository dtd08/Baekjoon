import java.util.Scanner;

public class Main { // 원하는 문자 찾기
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int idx = sc.nextInt();
		System.out.println(str.charAt(idx-1));
		sc.close();
	}
}