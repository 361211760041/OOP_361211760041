package LAB4;

public class Method_Overloading {
    //Method Overloading คือ เมธอดที่มีชื่อเหมือนกัน
    //แต่มีการรับพารามิตณเตอร์และการคืนค่ากลับแต่งต่างกัน
    public static void main(String[] args) {
        System.out.println(Sum(10,10));
        System.out.println(Sum(10.5,20.5));
        System.out.println(Sum(10,50.50));


    }
    public static  int Sum(int x,int y){
        return x + y;

    }
    public static  int Sum(double x,double y){
        return x+y;
    }
}
