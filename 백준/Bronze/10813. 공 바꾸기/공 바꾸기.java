import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 바구니 개수
		int M = sc.nextInt(); // 반복 횟수
		int[] a = new int[N];
		
		for(int w = 0; w < N; w++) a[w] = w+1;
		
		for(int x = 0; x < M; x++) {
			int i = sc.nextInt(); // 시작 바구니
			int j = sc.nextInt(); // 끝 바구니
			int temp;
			temp = a[i-1];
			a[i-1] = a[j-1];
			a[j-1] = temp;
		}
		
		for(int y : a) System.out.print(y + " ");
		
		sc.close();
	}
	
}