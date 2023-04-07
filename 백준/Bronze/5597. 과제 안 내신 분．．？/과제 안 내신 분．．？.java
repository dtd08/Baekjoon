import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		int[] checkList = new int[31]; // 1번방 ~ 30번방 사용
		
		for(int i = 0; i < 28; i++) { 
			int check = sc.nextInt();
			checkList[check] = 1;
			// 확인한 번호의 방에 체크 표시(1)
		}
		
		for(int i = 1; i < checkList.length; i++) { // 0번방은 사용하지 않으므로 1부터 시작 
			if(checkList[i] != 1) System.out.println(i); // 체크를 1로 했기 때문에 1이 들어가 있는지 확인
		}
		
		sc.close();
	}
}