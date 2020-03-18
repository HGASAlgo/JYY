//OX퀴즈
//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
			
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
			
			int count=0, score=0; //매 테스트케이스마다 초기화 
			for(int j = 0; j <arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O') { //charAt(i) : 문장중에 인덱스 위치에 해당되는 문자 추출하기
					count++;
					score += count;
				}
				else
					count=0; //'0'가 연속으로 나오지 않으면 카운트를 초기화한다. 
			}
			sb.append(score).append("\n");
		}
		System.out.print(sb);
		br.close();
	}
}
