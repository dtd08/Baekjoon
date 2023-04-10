import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int rem;
		int cnt = 0;
		for(int i = 0; i < 10; i++) {
			rem = sc.nextInt() % 42;
			if(arr.indexOf(rem) == -1) arr.add(rem);
			else cnt++;
		}
		System.out.println(arr.size());
		sc.close();
	}
}