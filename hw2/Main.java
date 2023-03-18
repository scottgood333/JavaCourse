package hw2;

import java.util.*;

public class Main {
    public static void printOut(int head, int tail) {
        String s = Integer.toString(head);
        for (int i = head + 1; i < tail; i++) {
            s += "+";
            s += Integer.toString(i);
        }
        s += "+";
        s += Integer.toString(tail);

        System.out.println(s);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("E");
            sc.close();
            return;
        }
        sc.close();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = 0;
            for (int j = i; j <= num; j++) {
                sum += j;
                if (sum == num) {
                    if (i != j)
                        printOut(i, j);
                    else
                        System.out.println(i);
                }
            }
        }
    }

}
