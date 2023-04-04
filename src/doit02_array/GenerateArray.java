package doit02_array;

import java.util.Arrays;
import java.util.Random;

public class GenerateArray {
    public int[] generateArr(int num){
        Random random = new Random();
        int[] a = new int[num];
        for(int i = 0 ; i < a.length ; i ++) {
            a[i] = 100 + random.nextInt(90); // 0~ 90 사이 난수 생성
        }
        System.out.println("generated Array = " + Arrays.toString(a));
        return a;
    }
}
