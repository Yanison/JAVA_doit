package doit01_basicAlgorithm;

public class MultiLoopPractice {

    public static void main(String[] args) {
        System.out.println("직각 삼각형 기본");
        for(int i =0 ; i <=5; i++){
            for(int e =0 ; e <i; e++){
                System.out.print("*");
                if(e == i-1){
                    System.out.println();
                }
            }
        }
        System.out.println("왼쪽 아래가 직각인 삼각형");
        for(int i =0 ; i <=5; i++){
            for(int e =0 ; e <5; e++){
                if(e < (5-i)){
                    System.out.print(" ");
                }
                if(e >= (5-i)){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("왼쪽 위가 직각인 삼각형");
        for(int i =0 ; i <=5; i++){
            for(int e = 0 ; e <5; e++){
               if(i <= e){
                   System.out.print("*");
               }
                if(i > e){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("오른쪽 위가 직각인 삼각형");
        for(int i =0 ; i <5; i++){
            for(int e = 0 ; e <5; e++){
                if((5-i) > e){
                    System.out.print("*");
                }
                if((5-i) < e){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("트리 1");
        for(int i =0 ; i <=5; i++){
            for(int e =0 ; e <5; e++){
                if(e >= (5-i)){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("트리 2");
        for(int i =0 ; i <7; i++){
            for(int e =0 ; e <7; e++){
                if((i%2) != 1){
                    if(e >= (3-(i/2)) && e <= (3+(i/2))){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("트리 3");
        for(int i =0 ; i <4; i++){
            for(int e =0 ; e <7; e++){
                if(e >= (3-i) && e <= (3+i)){
                    System.out.print(i+1);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
