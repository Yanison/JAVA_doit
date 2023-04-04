package doit02_array;

import java.util.Arrays;

public class Prac_Q2_Q5 {
    // 배열 요소들의 합
    static int sumOf(int[] a){
        int sum = 0;
        for(int i = 0 ; i < a.length; i ++){
            sum += a[i];
        }
        return sum;
    }
    // 배열 b의 모든 요소를 배열 a에 복사
    static void copy(int[] a,int[] b){
        for(int i = 0 ; i < a.length; i ++){
            a[i] = b[i];
        }
    }
    // 배열 b의 모든 요소를 배열 a에 역순으로 복사
    static void rcopy(int[] a,int[] b){
        for(int i = 0 ; i < b.length/2; i ++){
            swap(b,i,b.length - i - 1);
        }
        copy(a,b);
    }
    static void swap(int[] arr,int idx1,int idx2){
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new GenerateArray().generateArr(10);

        System.out.println("Q3 배열 a의 모든 요소의 합계를 구하시오");
        System.out.println("Q3 result ::" + sumOf(b));

        System.out.println("Q4 배열 b의 모든 요소를 배열 a에 복사하시오");
        copy(a,b);
        System.out.println("Q4 result ::" + Arrays.toString(a));

        System.out.println("Q5 배열 b의 모든 요소를 배열 a에 역순으로 복사하시오");
        rcopy(a,b);
        System.out.println("Q5 result ::" + Arrays.toString(a));
    }
}
