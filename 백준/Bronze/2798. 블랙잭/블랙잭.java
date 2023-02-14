import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N개의 카드
		int M = sc.nextInt(); // 블랙잭 숫자M
		int res = 0;
		
		int[] arr = new int[N];//N개의 배열
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

	
		for (int i = 0; i < N - 2; i++) { //3명이서 해서 3개 고르기
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int temp = arr[i] + arr[j] + arr[k];
					//3개를 더해서 M이 나오면 종료
					if(M == temp) {
						res = temp;
						break;
					}
					// 세 카드의 합이 이전 합보다 크면서 M 보다 작을 경우 
					else if(res < temp && temp < M) {
						res = temp;
					}
					else;
				}
			}
		}
		System.out.println(res);
	}
}