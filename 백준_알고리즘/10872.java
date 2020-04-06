/*팩토리얼 구하기
* 재귀함수로 풀기
*/

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = fact(n);
		
		System.out.println(result);
		br.close();
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n > 0) 
			return n*fact(n-1);
		else
			return 1;
	}
}
