/* 3층 2호에 사려면 3층 1호에 사는 사람수와 2층 2호에 사는 사람수를 더하면 되기 때문에 재귀함수 사용.
* 재귀함수을 사용하니까 시간이 오래걸린다. (재귀함수 안 쓰고 풀어보기)
*/

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int a = Integer.parseInt(br.readLine()); //층 
			int b = Integer.parseInt(br.readLine()); //호수 
			sb.append(count (a, b)).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
	public static int count(int a, int b) {
		if(b == 1) //1호는 모두 1명이다. 
			return 1;
		
		if(a == 0) //0층 사람들은 각 호수 숫자만큼 살고 있다.  
			return b;
		else
			return count(a, b-1) + count(a-1, b); 
	}
}
