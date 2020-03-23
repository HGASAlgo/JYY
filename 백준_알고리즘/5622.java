/*string을 비교할 때는 변수.equals(비교할 변수) 사용 
*입력받은 문자가 다이얼 어느 번호에 해당하는 판별, 각 번호에 +1초씩 더해준다. 
*/(ex. 'U'는 숫자 8에 해당하고, 8을 누르려면 9초가 걸린다.)

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		String word = br.readLine();
		int sum=0; //총 시간을 더하는 변수 

   		for(int i = 0 ; i < word.length(); i++) {
			int num = word.charAt(i);
			if(num <= 'C')
				sum+=3;
			else if(num <= 'F')
				sum+=4;
			else if(num <= 'I')
				sum+=5;
			else if(num <= 'L')
				sum+=6;
			else if(num <= 'O')
				sum+=7;
			else if(num <= 'S')
				sum+=8;
			else if(num <= 'V')
				sum+=9;
			else
				sum+=10;
		}
		System.out.print(sum);
		br.close();
	}
}
