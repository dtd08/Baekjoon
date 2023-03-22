import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		int x = scin.nextInt(); //총 금액
		int n = scin.nextInt(); // 물건 종류 수
		int total = 0;
		int i = 0;
	    while(i < n){
		    int a = scin.nextInt();
		    int b = scin.nextInt();
		    total += a * b;
		    i++;
		}
		if(x == total) System.out.println("Yes");
	        else System.out.println("No");
		
	}
}
