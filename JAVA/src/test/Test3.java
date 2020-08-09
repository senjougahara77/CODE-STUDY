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
        int[] numbers = new int [100];
        int x = 0;
        double sum = 0;
        int cnt = 0;
        x = in.nextInt();
        while(x != -1)
        {
            numbers[cnt] = x;
            sum += x;
            cnt ++;
            x = in.nextInt();
        }
        if ( cnt > 0)
        {
            double ave = sum/cnt;
            for (int i=1; i<=cnt; i++)
            {
                if (numbers[i]>=ave)
                {
                   System.out.println(numbers[i]);
                }
            }
            System.out.println(sum/cnt);
        }
    }
}
