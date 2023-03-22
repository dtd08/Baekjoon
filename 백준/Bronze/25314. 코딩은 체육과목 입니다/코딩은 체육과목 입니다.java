import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner scin = new Scanner(System.in);
		
		int x = scin.nextInt();
		int i = x / 4;
		
		if(x % 4 != 0) {
			i += 1;
		}
		
		String l = "";
		
		while(i > 0) {
			l += "long ";
			i--;
		}
		
		l += "int";
		
		System.out.println(l);
		
		scin.close();
	}
}