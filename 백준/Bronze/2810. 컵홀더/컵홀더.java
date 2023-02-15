import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();


		int count = 1;//왼쪽에 무조건 한개
		for (int i = 0; i < N; i++){
			if (input.charAt(i) == 'S'){//S이면 오른쪽 하나증가
				count++;
			} else if (input.charAt(i) == 'L'){//L이면 i증가 후 오른쪽 하나증가
				i++;
				count++;
			}
		}
		if(count>N){
			System.out.println(N);//count가 N명보다 초과하면 N명출력
		}
		else{
			System.out.println(count);//아니면 count출력
		}
	}
}