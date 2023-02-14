import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mushroom[] = new int[10];
		int sum=0;
		int result=0;
		for(int i=0;i<10;i++) {
			mushroom[i] = sc.nextInt();
		}
		for(int i=0;i<10;i++) {
				sum += mushroom[i];
			
			if(Math.abs(100 - result) == Math.abs(100 - sum)){//두개의 절대값이 같을때 조건이 맞으면 result 아니면 sum
				result = (result > sum) ? result:sum;
			}
			else if(Math.abs(100 - result) > Math.abs(100 - sum)){//절대값을 이용해서 전 점수와 현 점수 비교
				result = sum;
			}
		}	
		System.out.println(result);
	}
}