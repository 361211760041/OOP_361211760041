package LAB2;

import java.util.Scanner;

public class baskjava2 {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name =sc.nextLine();
//        System.out.println("Your name is "+name);
//
//        System.out.print("Enter your email:");
//        String email =sc.nextLine();
//        System.out.println("Your email is"+email );
//
//        System.out.print("Enter Your Age:");
//        String Age =sc.nextLine();
//        System.out.println("Your Age is"+Age);

        //input integer and floating
        System.out.print("Enter an number: ");
        int num = sc.nextInt();
        System.out.println("Your entered number:"+num);

        System.out.print("Enter a rual number");
        double d =sc.nextDouble();
        System.out.println(d);
    }
}
