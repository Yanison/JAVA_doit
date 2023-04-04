package doit02_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MakeArrayReverse {
    //배열의 요소 위치를 swap하는 메소드
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    //배열의 정렬을 역으로 정렬하는 메소드
    static void reverse(int[] a){
        for(int i = 0 ; i < a.length/2; i ++){
            swap(a,i,a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[7];

        for(int i = 0 ; i < a.length ; i ++) {
            a[i] = 100 + rand.nextInt(90); // 0~ 90 사이 난수 생성
            System.out.println(a[i] + " = " + a[i]);
        }

        System.out.println("init arr a = "+ Arrays.toString(a));

        reverse(a);

        System.out.println("reversed arr a = " + Arrays.toString(a));
    }
}
