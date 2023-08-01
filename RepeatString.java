package baekjoon;

import java.util.Scanner;

public class RepeatString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 케이스 개수
		
		for(int i = 0; i < T; i++) {
			String S = sc.nextLine();
			String str[] = S.split(" ");
			String P = "";
			System.out.println(str[0]);
			int R = Integer.parseInt(str[0]);
			for(int j = 0; j < str[1].length(); j++) {
				String trans = Character.toString(str[1].charAt(i)).repeat(R);
				P += trans;
			}
			System.out.println(P);
		}
		
		sc.close();
	}
}
