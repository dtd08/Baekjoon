import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String strT = sc.next(); // 케이스 개수
		int numT = Integer.parseInt(strT);
		
		for(int i = 0; i < numT; i++) {
			String numS = sc.next();
			String strS = sc.next();
			
			int R = Integer.parseInt(numS);
			String P = "";
			for(int j = 0; j < strS.length(); j++) {
				String trans = Character.toString(strS.charAt(j)).repeat(R);
				P += trans;
			}
			System.out.println(P);
		}
		
		sc.close();
	}
}