#입력받은 수만큼 a+b 반복

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a+b);
        }
    }
}
