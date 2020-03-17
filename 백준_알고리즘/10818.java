//최대값, 최소값 찾기

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int cnt = Integer.parseInt(br.readLine());

		int min = Integer.MAX_VALUE; // int형의 최대값 임의로 저장 
		int max = Integer.MIN_VALUE; // int형의 최소값 임의로 저장 
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < cnt; i++) {
			int num = Integer.parseInt(st.nextToken());
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		System.out.println(min + " " + max);
		br.close();
	}
}
