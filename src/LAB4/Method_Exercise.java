package LAB4;

import java.util.Scanner;

public class Method_Exercise {
    //เขียนโปรแกรมเพื่อรับค่าจำนวนจริง 2 จำนวน จากนั้นสรา้งเมธอดสำหรับ
    //บอก ลบ คูณ หาร แสดงทางจอภาพ
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number 1:");
        double x = sc.nextDouble();
        System.out.print("Entet number 2:");
        double y = sc.nextDouble();
        //display
        System.out.println("The summation of "+x+" and"+y+":"+sum(x,y));
        System.out.println("The summation of "+x+" and"+y+":"+Sub(x,y));
        System.out.println("The summation of "+x+" and"+y+":"+mul(x,y));
        System.out.println("The summation of "+x+" and"+y+":"+div(x,y));


    }//main
    //บวก
    public static double sum (double x, double y){
        return  x+y;

    }//ลบ
    public static double Sub (double x,double y){
        return x-y;
    }//คูณ
    public static double mul (double x,double y){
        return x*y;
    }//หาร
    public static double div (double x,double y) {
        return x / y;
    }

}//class
