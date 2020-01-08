package LAB4;

public class MethodsEx {
    //1.No return No parameter : เมธอดที่ไม่มีการรับค่าพารามิเตอรื และคืนค่าพารามิตเตอร์
    //และไม่คืนค่าใดกลับ procrss แล้ว
    //2.์ No return l or more parameter : เมธอดที่มีการรับพารามิตเตอร์ตั้งแต่ 1 หรือมากกว่า 1
    //3.Return 1 value, 1 or more parameter : เมธอดที่มีการรับพารามิตเตอรืตั้งแต่ 1 หรือมากกว่า
    //และมีการคืนกลับไปยังส่วนที่รเียกใช้ (เรียกใช้จากที่ใหน คืนค่าไปที่ไหน)
    public static void main(String[] args) {   //mainเป็นคำสั่งที่เรียกใช้งานก่อนเสมอ

        System.out.println("Hello from Mainn().");
        //calling method A()
        A();
        A();
        A();
        //calling method B()
        B("MIT","RUTS");
        //1. ประกาศตัวแปรชนิดเดียวกันมาคืนค่าที่เมดธอดส่งคืนกลับมาให้
        int summation = C(10,20);
        System.out.println("The summation of x and y:"+summation);
        //2. เรียกใชัเมดธอดโดยไม่ประกาศตัวแปรใดๆ มาเก็บค่าที่ส่งกลับมา
        System.out.println("The summation of x of y (2):"+C(50,50) );


    }//main
    public static  void A(){
        System.out.println("Hello from A().");



    }//A
    public static void B(String msg,String msg2){
        System.out.println("Hello from B().");
        System.out.println("Message:"+msg);
        System.out.println("Message2:"+msg2);

    }//B
    public static int C(int x, int y){
        System.out.println("Hello from C().");
        int sum = x+y;
        return  sum;
    }//C

}//class

