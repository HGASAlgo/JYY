//세 자리수 두개를 입력받은 후, 각 숫자를 거꾸로 읽었을 때 큰 수 출력

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] num = br.readLine().split(" ");

		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		a = (a%10)*100 + (a%100/10)*10 + (a/100);
		b = (b%10)*100 + (b%100/10)*10 + (b/100);
		
		sb.append(a>b? a : b ).append("\n");
		
		System.out.print(sb);
		br.close();
	}
}
