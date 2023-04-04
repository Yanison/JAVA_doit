package doit01_basicAlgorithm;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a;
       int b;
       int c;
       int d;

        System.out.println("a ::");
        a = sc.nextInt();
        System.out.println("b ::");
        b = sc.nextInt();
        System.out.println("c ::");
        c = sc.nextInt();
        System.out.println("d ::");
        d = sc.nextInt();

        int max = max4(a,b,c,d);
        System.out.println("max num :: " + max);

        int min = min4(a,b,c,d);
        System.out.println("min num :: " + min);
    }
    static int max4(int a, int b, int c, int d){
        int max = a;

        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max;
    }

    static int min4(int a, int b, int c, int d){
        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;
    }
}