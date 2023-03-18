package pkg;

import java.util.*;

public class Test {
    public static int binToDec(int num) {
        int dec = 0;
        int i = 1;
        while (num > 0) {
            dec += (num % 2) * i;
            num = num / 10;
            i *= 2;
        }
        return dec;
    }

    public static int decToBin(int num) {
        int bin = 0;
        int i = 1;
        while (num > 0) {
            bin += (num % 2) * i;
            num = num / 2;
            i *= 10;
        }

        return bin;
    }

    public static void main(String[] args) {
        int decimal = 651;
        int binary = decToBin(decimal);
        System.out.println(binary);
        System.out.println(binToDec(binary));

    }
}
