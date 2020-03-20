/*공백없이 숫자 N개를 입력받아 각 숫자의 합 구하기
*아스키코드를 이용하여 숫자값 추출 숫자0이 아스키코드로 48을 의미하므로, 각각의 숫자는 아스키코드 값에서 0을 의미하는 48을 빼주면 된다. 
*/

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int sum=0;
		
		for(int i = 0; i < n; i++) 
			sum+=num.charAt(i)-'0';
		System.out.println(sum);
	}
}
