import java.util.Scanner;

public class Main {
	public int findNum(String apb) {
		String findStr = "1ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int time = 0;
		int idx;
		
		for(int i = 0; i < apb.length(); i++) {
			idx = findStr.indexOf(apb.charAt(i));
			
			if(idx == 0) {
				time += 2;
			}
			else if(idx <= 3) {
				time += 3;
			}
			else if(idx <= 6) {
				time += 4;
			}
			else if(idx <= 9) {
				time += 5;
			}
			else if(idx <= 12) {
				time += 6;
			}			
			else if(idx <= 15) {
				time += 7;
			}
			else if(idx <= 19) {
				time += 8;
			}
			else if(idx <= 22) {
				time += 9;
			}
			else if(idx <= 26) {
				time += 10;
			}
		}
		return time; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String apb = sc.next();
		
		Main dial = new Main();
		int time = dial.findNum(apb);
		
		System.out.println(time);
		sc.close();
	}
}