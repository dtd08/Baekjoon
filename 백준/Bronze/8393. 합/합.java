import java.util.Scanner;

public class Main { // 1부터 n까지의 숫자 더하기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scin = new Scanner(System.in);
		
		int n = scin.nextInt();
		int i = 1; 
		int to = 0;
		while(i <= n) {
			to += i;
			i++;
		}
		System.out.println(to);
		
		scin.close();
	}
	
}
