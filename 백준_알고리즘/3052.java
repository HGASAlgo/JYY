//10개의 입력받은 숫자를 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력
//나머지를 비교하기 쉽게 Arrays.sort 함수를 이용하여 정렬 후 비교

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] num = new int[10];
		int cnt=0;
		
		for(int i = 0; i< num.length; i++) {
			st = new StringTokenizer(br.readLine());
			num[i] = (Integer.parseInt(st.nextToken())) % 42;
		}
		
		Arrays.sort(num); //나머지가 서로 다른지 비교하기 쉽게 정렬 
		for(int i = 0; i < num.length-1; i++) {
			if(num[i] != num[i+1])
				cnt++;
		}
		System.out.println(cnt+1); //array의 마지막 인덱스 값을 카운트해준다. 
		br.close();
	}
}
