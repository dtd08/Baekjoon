import java.util.Scanner;

public class Main {
    static int k, cnt = 0;  // 교환 횟수, 체크
    static int[] a;

    public static void swap(int i, int j) {  // 값 교환 함수
        if (i!=j) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        cnt++;

        if (cnt == k) {
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.exit(0);
        }
    }

    public static int partition(int p, int r) {
        int x = a[r];  // 제일 끝 값 (일단 기준)
        int i = p-1;  // 제일 작은 위치 (작은 것이 위치할 곳이자 기준보다 작은 수 갯수)

        for (int j = p; j < r; j++) {  // 기준 전까지 반복
            if (a[j] <= x) {  // 기준값보다 작다면
                i++;  // 작은 수 체크

                // 값 교환 (다음 작은 값이 위치할 곳과 현재 값의 위치 교환)
                swap(i, j);
            }
        }

        if ((i+1) != r) {  // 작은 수의 갯수가 총 원소의 수와 같은지 체크
            // 다르면 기준값보다 큰 값이 있었다는 뜻이니 교환
            swap(i+1, r);
        }

        return i+1; // r과 같든 다르든 i를 기준으로 정렬된 것이니 그 다음부터 정렬
    }

    public static void quickSort(int p, int r) {
        if (p < r) {  // 꼬리가 머리보다 커지면 종료
            int q = partition(p, r);  // 기준 나누기
            quickSort(p, q-1);  // 기준에서 왼편 정렬
            quickSort(q+1, r);  // 기준에서 오른편 정렬
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 배열 크기
        k = sc.nextInt();

        a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        sc.close();

        quickSort(0, n-1);

        System.out.println(-1);
    }
}
