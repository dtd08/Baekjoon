import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 바구니 개수
		int M = sc.nextInt(); // 반복 횟수
		int[] a = new int[N];
		for(int x = 0; x < M; x++) {
			int i = sc.nextInt(); // 시작 바구니
			int j = sc.nextInt(); // 끝 바구니
			int k = sc.nextInt(); // 공 번호
			for(int idx = i-1; idx < j; idx++) {
				a[idx] = k;
			}
			
		}
		for(int e : a) System.out.print(e + " ");
		
		sc.close();
	}
	
}