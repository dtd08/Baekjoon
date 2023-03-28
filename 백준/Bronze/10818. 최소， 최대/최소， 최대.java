import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 배열 길이
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);
		System.out.println(a[0] + " " + a[n-1]);
	}
	
}