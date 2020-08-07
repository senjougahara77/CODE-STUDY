package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
//        int foot;
//        double inch;
//        System.out.println(1.2-1.1);
        Scanner in = new Scanner(System.in);
//        int x;
//        int y;
//        int z;
//        System.out.println("请输入：");
//        x = in.nextInt();
//        y = in.nextInt();
//        z = in.nextInt();
//        int max=0;
//        if (x>y) {
//            if (x>z){
//                max=x;
//            }
//            else{
//                max=z;
//            }
//        }
//        else {
//            if (y > z) {
//                max = y;
//            } else {
//                max = z;
//
//            }
//        }
//        System.out.println(max);
//        foot = in.nextInt();
//        inch = in.nextInt();
//        System.out.println((int)((foot+inch/12.0)*30.48));
//        if (amount>=10)
//        {
//            System.out.println("请投币");
//            System.out.println("*******");
//            System.out.println("铁路专线");
//            System.out.println("票价10元");
//            System.out.println("*******");
//            System.out.println("找零" + (amount - 10));
//        }
//        int type;
//        type = in.nextInt();
//        switch (type){
//            case 1:
//                System.out.println("chi");
//                break;
//            case 2:
//                System.out.println("chu");
//                break;
//            default:
//                System.out.println("c");
//                break;
//        }
//           int n = in.nextInt();


// 输出100以内的素数 前50个素数
        int k=0;
           for (int n=2; ; n++)
          {
              int isprime = 1;
              for (int i = 2; i < n; i++)
               {
                   if (n % i == 0)
                   {
                       isprime = 0;
//                       System.out.println("不是素数");
                       break;
                   }
               }
               if (isprime == 1)
               {
                   System.out.print(n+" ");
                   k+=1;
               }
               if (k == 50)
               {
                   break;
               }
           }


//           {
//           number = number/10;
//           count = count+1;
//           }while ( number > 0 );
//            System.out.println(count);
    }

}
