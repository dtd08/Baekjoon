import java.util.Scanner;

public class Main { // 바구니 뒤집기
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 바구니 개수
		int m = sc.nextInt(); // 반복 횟수
		int N[] = new int[n];
		
		for(int i = 0; i < n; i++) N[i] = i+1; // 바구니 배열 초기화
		
		int idx1;
		int idx2;
		int temp;
		
		for(int j = 0; j < m; j++) {
			idx1 = sc.nextInt()-1;
			idx2 = sc.nextInt()-1;
			for(int i = 0; i < ((idx2-idx1)+1)/2; i++) {
				temp = N[idx1+i];
				N[idx1+i] = N[idx2-i];
				N[idx2-i] = temp;
			}
		}
		for(int k : N) System.out.print(k + " ");
		
		
		sc.close();
	}
}