// 손익분기점 계산
// 21억 이하의 자연수를 입력받으므로 long형 사용 

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		long[] price = new long[3]; //price[0]은 고정 비용, price[1]은 가변 비용, price[2]는 측정 가격 
		long total = 0; //총 생산비용 
		long n = 0; //손익분기점 생산 대수 
		
		String[] a = br.readLine().split(" ");
		for(int i = 0; i < 3; i++) {
			price[i] = Long.parseLong(a[i]);
		}
		
		if(price[1] >= price[2])
			sb.append("-1").append("\n");
		
		else {
			n = price[0] / (price[2]-price[1]) + 1; //손익분기점 계산
			sb.append(n).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
