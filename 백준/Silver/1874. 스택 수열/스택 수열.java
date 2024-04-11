import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>(); // 스택 선언
		StringBuffer bf = new StringBuffer(); // +,- 저장할 버퍼
		
		int N = sc.nextInt(); // 수열의 갯수
		int[] arr = new int[N]; // 수열을 받는 배열
		int num = 1; // 스택에 들어갈 수
		boolean yes = true; // 수열을 만들 수 있는지 체크할 변수
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt(); // 값 받기
		}
		
		for(int i=0; i<N; i++) {
			if(num <= arr[i]) { // 만약 넣을 값이 수열수보다 작다면 
				while(num <= arr[i]) { 
                    stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
			  bf.append("-\n"); // 수열수과 스택에 들어간 값이 같은 상태
			}
			else { // 넣을 값이 수열보다 크다면
				if(stack.pop() == arr[i]) {									 // 때문에 pop과 수열 수가 같다면 다음 수열로, 다르다면 바로 될 수 없음을 알리고 break로 모든 과정을 빠져나옴
				  bf.append("-\n");
				}
				else {
					yes = false; // 수열 생성 안됨 체크
					break; // for문(수열 순회) 종료
				}
			}
		}
		System.out.println(yes ? bf.toString() : "NO"); // break 됐다면 NO가 나올 것이고, 진행이 잘 됐다면 +- 결과가 나올 것임
	}
}
