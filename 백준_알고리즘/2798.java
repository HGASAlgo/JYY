// 브루트포스 문제 : 조합 가능한 모든 경우의 수를 다 대입해보는 것. 최적화나 효율과는 거리가 멀다.

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //카드의 개수
		int m = Integer.parseInt(st.nextToken()); //카드 3장의 합과 가장 가까워야할 수.
		int max = 0, sum=0, count = 0;
		
		int [] card = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken()); //입력받은 숫자 카드 배열에 저장 
		}
		
		//카드 3장의 합을 최대로 만들기 위한 반복문 
		for(int i = 0; i < n-2; i++) {
			for(int j = i+1; j < n-1; j++) {
				for(int k = j+1; k < n; k++) {
					sum = card[i] + card[j] + card[k];
					
					if(sum <= m) 
						max = Math.max(max, sum); //새로운 합이 생길 때 마다 max값 갱신 
					
					if (max == m) break; //만약 max가 원하는 값과 같으면 반복문 종료 
					
				}
			}
		}
		System.out.print(max);
		br.close();
	}
}
