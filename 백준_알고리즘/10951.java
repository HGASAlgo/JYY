//EOF 활용하기

import java.util.*;
import java.io.*;
public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input;
		
		while((input = br.readLine()) != null && input.length() != 0) { //EOF
			st = new StringTokenizer(input, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(a+b).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
}
