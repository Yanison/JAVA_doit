package doit02_array;

public class Prime {
    public static void main(String[] args) {
        int count = 0; // 나눗셈을 행한 횟수
        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                count++ ;
                if(n % i == 0){ // 소수 판별, 나머지가 0일경우 n 탈출
                    break;
                }
                if(n == i){
                    System.out.println(n); // 나머지가 0이 아닌 경우 n 자기 자신까지 순차가 옴 -> 소수
                }
            }
        }
        System.out.println("나눗셈을 행한 횟수는 :: " + count);
    }
}
