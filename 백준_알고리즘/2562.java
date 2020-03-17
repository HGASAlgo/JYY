//숫자 9개 입력받고, 최대값과 그 순서 출력하기

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = 0;
		int max = 0;
		
		for(int i = 1; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > max) {
				max = num;
				count = i;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}
