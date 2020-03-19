//배열 a의 합계를 구하는 함수 만들기

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(sum(a));
	}

  //정답은 이 부분만 제출
  public static long sum(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) 
			sum+= a[i];
		return sum;
	}
}
