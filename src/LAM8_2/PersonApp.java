package LAM8_2;

public class PersonApp {
    public static  void main (String[]args){

        //create objects
        Person P1 = new Person("kamonchanok Anansakwong","1996");
        Person P2 = new Sheriff("mouy","1995","Thungsong");
        Person P3 = new Police("bank","1996","nabon");

        P1.introduce();
        P2.introduce();
        P3.introduce();



    }
}
