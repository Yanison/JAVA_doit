package doit02_array;

import java.util.Random;

public class MaxOfArrayRand {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[7];

        for(int i = 0 ; i < a.length ; i ++){
            a[i] = 100 +rand.nextInt(90); // 0~ 90 사이 난수 생성
            System.out.println(a[i] + " = " + a[i]);
        }

        System.out.println("max is :: " + maxOf(a));
    }
    static int maxOf(int[] a){
        int max = a[0];
        for(int i = 1; i< a.length ;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
