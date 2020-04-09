/* 피보나치 수
* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597 ...
*/

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //n번째 피보나치 수 출력
		int result = fibo(n);
		
		System.out.println(result);
		br.close();
	}

	private static int fibo(int n) {
		if(n==0)
			return 0;
		else if(n==1 || n==2)
			return 1;
		else
			return fibo(n-1) + fibo(n-2);
	}
}
