//반복문을 사용하면 시간초과

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); //낮에 올라가는 높이 
		int b = Integer.parseInt(st.nextToken()); //밤에 미끄러지는 높이 
		int v = Integer.parseInt(st.nextToken()); //목표 높이 
		
		int total = 0; //총 올라간 높이 
		int count = 0; //걸린 날 
		
		while(total < v) {
			count++;
			total += a;
			if(total == v)
				break;
			total -= b;
		}
		System.out.println(count);
		br.close();
	}
}
