//하노이탑

import java.util.*;
import java.io.*;
public class Main {
	static int count; //원반을 옮긴 최소 횟수 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		hanoi(n, 1, 2, 3, sb); //이동 횟수를 먼저 출력해야함으로 StringBuilder도 함께 인수로. 
		System.out.println(count);
		System.out.print(sb);
		br.close();
	}
	
	public static void hanoi(int n, int from, int tmp, int to, StringBuilder sb) {
		count++;
		if(n == 1)
			sb.append(from + " " + to).append("\n"); //원판이 하나이면 종료 
		else {
			hanoi(n-1, from, to, tmp, sb);
			sb.append(from + " " + to).append("\n");
			hanoi(n-1, tmp, from, to, sb);
		}	
	}
}
