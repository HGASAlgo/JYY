#성적 출력하기

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        if (a >= 90 && a<=100)
            System.out.println("A");
        else if (a >= 80)
            System.out.println("B");
        else if (a >= 70)
            System.out.println("C");
        else if (a >= 60)
            System.out.println("D");
        else 
            System.out.println("F");
    }
}
