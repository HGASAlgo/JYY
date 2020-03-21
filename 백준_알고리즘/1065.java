/*한수 : 어떤 양의 정수 X의 각 자리가 등차수열을 이룬는 수
*입력받은 자연수까 한수의 개수를 출력 
*/

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); //1000보다 작거나 같은 수 
		
		//두 자리수는 모두 한수. (ex. 12의 등차는 +1, 85의 등차는 -2)
		if(n < 100)
			sb.append(n).append("\n");
		else {
			int count = 99;
			
			for(int i = 100; i <=n; i++) {
				if(check(i)) //한수이면 
					count++;
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
	//한수를 체크하는 함수. 한수이면 true 반환, 아니면 false 반환  
	public static boolean check(int num) {
		int a, b, c;
		
		a = num/100; //num의 백의 자리 
		b = (num%100)/10; //num의 십의 자리 
		c = (num%100)%10; //num의 일의 자리 
		
		if(a-b == b-c)
			return true;
		return false;
	}
}
