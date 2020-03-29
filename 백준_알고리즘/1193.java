/*지그재그 이해하는데 시간 오래 걸림..
 *1/1 (1개)
 *1/2 -> 2/1 (오른쪽 위-> 왼쪽 아래) (2개)
 *3/1 -> 2/2 -> 1/3 (왼쪽 아래 -> 오른쪽 위) (3개)
 *1/4 -> 2/3 -> 3/2 -> 4/1 (오른쪽 위 -> 왼쪽 아래) (4개)
 *5/1 -> 4/2 -> 3/3 -> 2/4 -> 1/5 (왼쪽 아래 -> 오른쪽 위) (5개)
 *짝수번째 줄 : 1/n -> ... -> n/1 (n개)
 *홀수번째 줄 : n/1 -> ... -> 1/n (n개)
 */

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int line = 1; // 몇번째 줄인지 
		int count = 1; // 몇번째 순서로 나오는지 
		int sum = 1;
		int n=0, m=0;//분수 표현 n/m
		
		//줄 구하기 
		while(x > sum) {
			line++;
			sum += line;
		}
		
		//순서 구하기 
		sum = 0; 
		for(int i = 1; i < line; i++) {
			sum += i;
		}
		count = x - sum;
		
		if(line % 2 == 0) {
			n = count;
			m = line - count + 1;
			
		}
		else {
			n = line - count + 1;
			m = count;
		}
		
		System.out.println(n+ "/" + m);
		br.close();
	}
}
