#구구단

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i;
        for (i = 1; i <=9; i++) {
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}
