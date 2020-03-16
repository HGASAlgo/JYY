//더하기 사이클

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int newN = num;
		int count = 0;
		
		do {
			int a = newN/10;
			int b = newN%10;
			
			if(a+b < 10) 
				newN = b*10 + (a+b);
			else
				newN = b*10 + (a+b)%10;
			
			count++;
			
		} while(num != newN);

		System.out.println(count);
	}
}
