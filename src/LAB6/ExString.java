package LAB6;

public class ExString {
    //String เป็นข้อมูลชนิดข้อความ แต่ในภาษาจาวา String เป็นคลาส
    //ดังนั้นการประกาศตัวแปรชนิด String เป็นการประกาศ Object ของคลาส
    //จึงสามารถเรียกใช้เมธอดต่างๆ ที่อยู่ในคลาส String ได้
    public static void main(String[] args) {
        String msg = "Hollo, Saiyai !!!";

        //length()ใช้ในการนับจำนวนตัวอักษรในข้อความ ส่งกลับคืนมาเป็นจำนวนเต็ม (ing)
        int len = msg.length();
        System.out.println(len);

        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.charAt(5));//แสดงตัวอังกฤษตำแหน่งที่ 5 ของข้อความ

        //concatenating String คือ การต่อข้อความ
        //1. ใช้เครื่องหมาย +
        String mag2 = "RUTS";
        String msgCon = msg+mag2;
        System.out.println(msgCon);
        //2.ใช้ concet()
        String msgCon2 = msg.concat(mag2);
        System.out.println(msgCon2);

        //compare String คือ การเปรีบยเทียบข้อความ 2 ข้อความ
        String m1 = "Saiyai RUTS";
        String m2 = "Saiyai ";
        //1. ใช้เครื่องหมาย == เหมือนกัน true ต่างกันเป็น false
        if (m1 == m2){
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }

        System.out.println(m1==m2? "Yes":"No");
        //2. equals() การทำงานจะเหมือนกับการใช้เครื่องหมาย ==
        System.out.println(m1.equals(m2)? "Yes":"No");
        if (m1 == m2){
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }
        //3.compareTo() ถ้าข้อความเหมือนกันเป๊ะ 0, ข้อความทางซ้ายมากกว่า 1, ข้อความทางขวามากกว่า -1
        int x =m1.compareTo(m2);
        System.out.println(x);





    }//main
}//class
