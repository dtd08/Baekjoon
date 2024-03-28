import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();		
		String word= sc.nextLine();
		int idx = 0;
		int cnt = 0;
		while(idx < str.length()) {
			if(str.indexOf(word,idx) != -1) {
				idx = str.indexOf(word,idx)+ word.length();
				cnt++;
			} else {
				idx++;
			}
		}
		System.out.println(cnt);
	}
}