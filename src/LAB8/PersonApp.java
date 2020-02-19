package LAB8;

public class PersonApp {
    public static void main(String[] args) {
        //create object
        Student stdl = new Student("11196666525441",
                "kamonchanok Anansakwong",
                "SSD000",
                "Information");
        Person p1 = new Person("12121215678242",
                "kanda somsong");

        System.out.println(stdl.getName());
        System.out.println(p1.getName());

        System.out.println(stdl.toString());
        System.out.println(p1.toString());
    }
}
