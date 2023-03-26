import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int i = 0;
				
		for(i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		int total = 0;
		
		for(i = 0; i < N; i++) {
			if(a[i] == v) total += 1; 
		}
		System.out.println(total);
		
		sc.close();
	}

}