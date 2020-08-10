package test;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        double sum = 0.0;
//        for (int i = 1; i<=n; i++)
//        {
//            sum+=1.0/i;
//        }
//        System.out.printf("%.2f",sum);
        double sum = 0;
        int cnt = 0;
        cnt = in.nextInt();
        if (cnt > 0) {
            int[] numbers = new int[cnt];
            for (int i=0; i<cnt; i++){
                numbers[i] = in.nextInt();
                sum += numbers[i];
        }
        double ave = sum / cnt;
        for (int i=0; i< numbers.length; i++) {
                if (numbers[i] >= ave) {
                    System.out.println(numbers[i]);
                }
        }
        System.out.println(ave);
        }
//        数组遍历：
//        int[] data= {1,2,3,4};
//        for (int k : data){
//            break;
//        }

    }
}
