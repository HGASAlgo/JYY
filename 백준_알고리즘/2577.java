//a*b*c 결과에서 0부터 9까지 각 숫자가 몇 번 사용되었는지 출력

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		int num=1;
		int[] count = new int[10];

		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		num = a*b*c;
		
		while(num > 0) {
			count[num%10]++; //사용된 숫자 인덱스에 count++
			num=num/10;
		}
		for(int i = 0; i<count.length; i++) 
			System.out.println(count[i]);
		
		br.close();
	}
}
