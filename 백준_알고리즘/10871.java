//n개의 숫자 중 t보다 작은 것
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            
            if(a < t)
                sb.append(a).append(' ');
        }
        System.out.println(sb);
        br.close();
	}
}
