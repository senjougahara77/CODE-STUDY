public class test {public static void main(String[] args){
    System.out.println("helloworld!!");
    Scanner in = new Scanner(System.in);
//        System.out.println("echo:" + in.nextLine());
    int amount=100;
    int price=0;
    price=in.nextInt();
    System.out.println(amount+"-"+price+"="+(amount-price));
}
}
