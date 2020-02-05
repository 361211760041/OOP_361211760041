package LAB7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBookApp {
    public static void main(String[] args) {
        List<NoteBook> mylist = new ArrayList<NoteBook>();
        System.out.println(mylist);
        mylist = arrayList(mylist);

        System.out.println(mylist);

        System.out.println(mylist);
        mylist = arrayList(mylist);






    }//main

    private static List<NoteBook> arrayList(List<NoteBook> mylist) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Brand:");
        String brand = sc.nextLine();
        System.out.println("Enter Model: ");
        String model = sc.nextLine();
        System.out.println("Enter CPU: ");
        String cpu = sc.nextLine();
        System.out.println("Enter GPU: ");
        String gpu = sc.nextLine();
        System.out.println("Enter RAM: ");
        String ram = sc.nextLine();
        System.out.println("Enter Display: ");
        String display = sc.nextLine();
        System.out.println("Enter HDD: ");
        String hdd = sc.nextLine();
        System.out.println("Enter OS: ");
        String os = sc.nextLine();
        System.out.println("Enter Peice: ");
        double price  = sc.nextDouble();

        //create object
        NoteBook np = new NoteBook(brand,model,cpu,gpu,ram,display,hdd,os,price);
        //add object into List
        mylist.add(np);

        return mylist;

    }
}//class
