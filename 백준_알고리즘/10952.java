//0 0이 입력될 때까 A+B

import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0)
				break;
			
			sb.append(a+b).append("\n");
		}
		System.out.print(sb);
		br.close();
		
	}
}
