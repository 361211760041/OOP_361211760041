package LAB6;

import java.util.StringTokenizer;

public class ExStringBuffer {
    public static void main(String[] args) {
        //StringBuffer เป็นคลาส ที่มีเมธอดต่างๆ
        //ที่สามารถปรับปรุงแก้ไขข้อมูลที่เป็น String ได้มากกว่าคลาส String ทั่วไป

        StringBuffer strBuf = new StringBuffer("Hello");
        System.out.println(strBuf);

        //append() ใช้สำหรับต่อ String
        strBuf.append("Saiyai");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.delete(0,6);
        System.out.println(strBuf);

        //StringTokenizer
        String s = "Mouy kamonchanok Anansakwong 361211760041 MIT221";

        StringTokenizer tokenizer =new StringTokenizer(s);
        int countWord = tokenizer.countTokens();
        System.out.println("Word count ftom message:"+countWord);

        //word cutting
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }



    }//main
}//Class