import java.util.Scanner;

public class Main { // 문자열 (백준 9086번)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스 개수
		char idxFirst;
		char idxLast;
		
		for(int i = 0; i < T; i++) {
			String str = sc.next();
			idxFirst = (char)str.charAt(0);
			idxLast = (char)str.charAt(str.length()-1);
			System.out.print(idxFirst+""+""+idxLast+"\n");
		}
		
		sc.close();
	}
}