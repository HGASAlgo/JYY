/*통과한 답
*목표 높이에 도달하면 더이상 미끄러지지 않기때문에 목표 높이에서 밤에 미끄러지는 높이를 뺀 (v-a)가 목표를 달성하는 날 낮에 도달할 수 있는 높이이다.
*목표를 달성하는 날 낮에 도달할 수 있는 높이(v-a)를 하루에 도달할 수 있는 높이 (a-b)로 나눠주면 며칠 째 낮에 목표를 달성하는지 알 수 있다.
*만약 이 공식이 0으로 나눠떨어지지 않는다면 하루가 더 걸린다는 뜻이므로 count에 +1을 해준다.
*/

import java.util.*;
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); //낮에 올라가는 높이 
		int b = Integer.parseInt(st.nextToken()); //밤에 미끄러지는 높이 
		int v = Integer.parseInt(st.nextToken()); //목표 높이 
		
		int count = (v-b)/(a-b); //목표 높이에 도달하면 더이상 미끄러지지 않기때문에 목표 높이에서 밤에 미끄러지는 높이를 뺀 (v-a)가 낮에 도달할 수 있는 높이이다.
		if((v-b)%(a-b) != 0)
			count++;
		
		System.out.println(count);
		br.close();
	}
}

