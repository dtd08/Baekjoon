import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		// trim() : 앞 뒤 공백 제거
		String str = sc.nextLine().trim();
		String strarr[] = str.split(" ");
        
        if(strarr.length == 1 && strarr[0] == "") System.out.println(0);
		else System.out.println(strarr.length);
        
		sc.close();
	}
}