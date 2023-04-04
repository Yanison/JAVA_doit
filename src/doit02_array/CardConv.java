package doit02_array;

import java.util.Scanner;

public class CardConv {
    /**
     * @param x 정숫값
     * @param r 진수
     * @param d 배열
     * @return
     */
    static int cardConv(int x, int r,char[] d){
        int digits = 0; // 변환 후 자릿수
        String dchar ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r); // charAt(n) 문자열에서 n번째 자리 반환.
            x /= r; // /= 좌항x에 우항 r로 나눈 후 다시 좌항 x에 대입 -> r로 나눈 나머지 계속 저장.
        }while (x != 0);

        for(int i = 0; i <digits/2; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i -1] = t;
        }; // 배열 d의 숫자 문자열을 역순으로 정령 16진수로 정렬

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;// 변환하는 정수
        int cd;// 기수
        int dno;// 변환 후의 자릿수
        int retry;// 다시 한번?
        char[] cno = new char[32];
        System.out.println("10진수를 기수로 변환합니다.");

        do{
            //변환할 정수 no 입력
            do{
                System.out.println("변환할 음이 아닌 정수를 입력해주세요 ");
                no = sc.nextInt();
            }while (no < 0);

            // 변환할 기수 cd 입력
            do {
                System.out.println("어떤 진수로 변환할까요? (2~36): ");
                cd = sc.nextInt();
            }while (cd < 2 || cd > 36);

            dno = cardConv(no,cd,cno); // no 를 cd 진수로 변환

            System.out.println(cd + " 진수로");
            for (int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
            }

            System.out.println("한번 더 할까요? (yes::1 / no::0)");
            retry = sc.nextInt();
        }while (retry == 1);
    }
}
