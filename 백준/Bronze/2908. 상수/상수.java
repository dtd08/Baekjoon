import java.util.Scanner;

public class Main {
	public int changeNum(int num) {
		int r = 0;
		while(num != 0) {
			r *= 10;
			r += num % 10;
			num /= 10;
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main con = new Main();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(con.changeNum(A) > con.changeNum(B)) System.out.println(con.changeNum(A));
		else System.out.println(con.changeNum(B));
		
		sc.close();
	}
}