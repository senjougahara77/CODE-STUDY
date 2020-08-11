package test;

import java.util.Scanner;

public class Test4 {
    //判断素数
    public static boolean isPrime(int i)
    {
        boolean isPrime = true;
        for (int k=2; k<i; k++){
            if (i % k == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] primes =new int[50];
        primes[0] = 2;
        int cnt = 1;
        main_loop:
        for (int x=3; cnt <50; x++) {
            for (int i=1; i<cnt; i++){
                if (x % primes[i]==0) {
                    continue main_loop;
                }
            }
            primes[cnt++]=x;
        }
        for (int k: primes){
            System.out.print(k+" ");
        }
    }
}