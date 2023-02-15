import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();//n개의 정사각형을 받는다
		int cnt = 0;
		
		for(int i=1; i<=n; i++){//두변을 곱했을때 n를 넘지않았을때만 cnt증가, 각변을 1씩 늘려가면서 곱하기
			for(int j=1; j<=i; j++){//j*i는 i*j와 같은 직사각형이므로 j는 i까지만
				if(i*j <= n) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}