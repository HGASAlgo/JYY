//입력받은 숫자를 5와 3을 최소 횟수로 합하여 만들기

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		while(true) {
			if(n%5 == 0) { //사용되는 봉지의 개수가 적어야하므로, 5kg에 먼저 담아준다. 
				sb.append(n/5 + count).append("\n");
				break;
			}
			else if(n <= 0) { //n이 3과 5의 조합으로 만들어지지 않는 경우 -1을 출력한다. 
				sb.append("-1").append("\n");
				break;
			}
			n = n-3; //5로 나눠지지 않거나, 0보다 큰 수 이면 3kg봉지에 담아준다. 만약 n이 3보다 작은 수라면, 다음 반복문에서 -1을 출력하게 된다. 
			count++; //3kg봉지에 하나 담았다는 의미로 count +1해준다. 
		}
		System.out.println(sb);
		br.close();
	}
}
