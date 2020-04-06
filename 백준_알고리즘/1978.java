// 소수 찾기

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int num = 0;
		int count = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n; i++) {
			num = prime(Integer.parseInt(st.nextToken()));
			if(num == 1)
				count++;	
		}	
		System.out.println(count);
		br.close();
	}
	public static int prime(int n) {
		int flag = 1;
		if(n == 1)
			flag = 0;
		
		for(int i = 2; i < n; i++) {
			if(n%i == 0)
				flag = 0;
		}
		return flag;
	}	
}
