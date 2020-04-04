/* 규칙 찾는데 오래 걸렸다. 처음과 끝은 항상 1씩만 움직일 수 있다. 
* 12343321 -> 이런식으로 인접한 두 수는 1씩만 차이가 나야함.
* 이동한 거리 : 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ...
* 최소 움직임 : 1 2 3 3 4 4 5 5 5  6  6  6  7  7  7  7  8  8  8  8 ...
* 움직임이 바뀔 때 : 1, 2, 3, 5, 7, 10, 13, 17, ...
* 차이          :   1  1  2  2  3   3   4, ...    
* 다음 차이 : 4, 다음 움직임이 바뀔 때 : 21, 다음 최소 움직임 : 9
*/

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine()); //테스트케이스 개수
		for(int i = 0 ; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			long x = Long.parseLong(st.nextToken()); //현재 위치
			long y = Long.parseLong(st.nextToken()); //목표 위치
			long length = y-x;
			long result=1, plus=0;
			
			while(plus < length) {
				result++;
				plus += result/2;
			}
			sb.append(result-1).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
}
