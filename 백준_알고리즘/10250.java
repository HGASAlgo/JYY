//각 층에 W 개의 방이 있는 H 층 건물, N 번째 온 손님에게 방 배정 

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); //테스트 케이스 개수 
		int count = 1;
		int room = 0; //손님에게 배정될 방 번호 
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt (st.nextToken()); //층수 
			int w = Integer.parseInt (st.nextToken()); //호수 
			int n = Integer.parseInt (st.nextToken()); //손님 순서 
			
			if(n <= h)
				room = n*100 + 1;
			
			while (true) {
				if(n <= h) {
					room = n*100 + count; //100 곱하는 이유 : count가 1~9일 경우 01~09로 표시해야하기 때문.
					break;
				}
				n = n-h;
				count++;
			}
			sb.append(room).append("\n");
			count = 1; //카운트 초기화 
		}
		System.out.print(sb);
		br.close();
	}
}
