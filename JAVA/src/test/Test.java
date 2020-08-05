package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println("hello");
        Scanner in= new Scanner(System.in);
//        System.out.println("echo"+in.nextline());
        int amount;
        int price;
        System.out.print("请输入");
        amount=in.nextInt();
        System.out.print("请输入");
        price=in.nextInt();
        System.out.println(amount+"-"+price+"="+(amount-price));
    }
}
