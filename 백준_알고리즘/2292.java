/*1번 : 1 (1개)
 *2번 : 2~7 (6개)
 *3번 : 8~19 (12개)
 *4번 : 20~37 (18개)
 *6->12-> 18개 순서로 늘어난다. 
 */
 
import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int room = Integer.parseInt(br.readLine()); //찾을 방 번호 
		int n=2; // 2, 8, 20 ... 거쳐야할 방 개수가 +1 될때마다 시작 숫자 
		int count = 1; //거쳐야할 방 개수 
		
		if(n==1) //1번방부터 시작이므로 1번방은 count 1
			count=1;
		
		while(n <= room) { //찾을 방 번호가 시작 숫자보다 작거나 같을 때 멈춘다. 
			n += 6*(count++); //시작 숫자는 6의 배수로 늘어난다. 
		}

		System.out.println(count);
		br.close();
	}
}
