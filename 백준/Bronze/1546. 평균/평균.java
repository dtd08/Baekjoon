import java.util.Scanner;

public class Main { // 바구니 뒤집기
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 과목 개수
		int m = 0; // 최고 점수
		int subScore[] = new int[n];
		
		for(int i = 0; i < subScore.length; i++) {
			subScore[i] = sc.nextInt(); // 과목 점수 세팅
			if(subScore[i] > m) m = subScore[i]; // 최고점 구하기
		}
		
		double avg = 0;
		for(int i : subScore) {
			avg += (double)i/m * 100;
		}
		
		System.out.println(avg/n);
		
		sc.close();
	}
}