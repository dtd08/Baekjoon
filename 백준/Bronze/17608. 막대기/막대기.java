import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 막대기 개수 받기
		
		int bar[] = new int[N]; // 막대기 높이 배열
		int cnt = 1; // 오른쪽에서 보이는 개수
		
		for(int i = 0; i < N; i++) {
			bar[i] =sc.nextInt();
		}
		
		int longest = bar[N-1]; // 제일 마지막거 최대값으로 초기화
		
		for(int i = N-2; i >= 0; i--) {
			if(bar[i] > longest) { // 비교해서 최고 길이보다 길면 
				cnt++; // 카운트 올리고
				longest = bar[i]; // 최고 길이 교체
			}
		}
		System.out.println(cnt);
	} 
}