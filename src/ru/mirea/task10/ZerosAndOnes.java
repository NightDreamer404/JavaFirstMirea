package ru.mirea.task10;
import java.util.Scanner;


public class ZerosAndOnes {
    private int a;
    private int b;
    private int number;
    private int result;

    ZerosAndOnes(int a, int b){
        this.a = a;
        this.b = b;
        this.number = a + b;
    }

    public void combinations(int q0, int q1, int q2,int q3){
        int signal=0;
        while (true){
            if(q0 == 1){
                if (a-q1!=0) {
                    combinations(0,q1+1,q2,q3+1);
                } else {
                    signal+=1;
                }
                if(b-q2!=0) {
                    combinations(1,q1,q2+1, q3+1);
                } else {
                    signal+=1;
                }
            } else {
                if (b - q2 != 0) {
                    combinations(1, q1, q2 + 1,q3+1);
                } else {
                    signal+=2;
                }
            }
            if ((signal==2)&&(q3==number)){
                result +=1;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число нулей и единиц");
        ZerosAndOnes solution = new ZerosAndOnes(scan.nextInt(), scan.nextInt());
        solution.combinations(0,1,0,1);
        solution.combinations(1,0,1,1);
        System.out.println("Число комбинаций: "+solution.result);
    }

}
