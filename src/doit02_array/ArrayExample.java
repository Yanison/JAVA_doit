package doit02_array;

public class ArrayExample {
    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        a[0] = 111;
        a[1] = 131;
        a[2] = 171;
        a[3] = 11;
        a[4] = 113;

        System.out.println("max of Array a is ::" + maxOf(a) );


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
