package LAB9;

import java.sql.*;
import java.util.ArrayList;

public class MobileStore {
    public static void main(String[] args) {

        //step1 : load driver
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Load driver successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //step2 :Create Connction
        ArrayList<MobileStore> myEMP = new ArrayList<MobileStore>();
        String SQCONN ="jdbc:sqlite:SqliteStudio.sqlite";
        try {
            Connection conn = DriverManager.getConnection(SQCONN);
            if (conn == null){
                System.out.println("Could not connect to database.");
            }else {
                System.out.println("Connected to database.");
            }
            //step3 : Create Statement
            Statement stmt = conn.createStatement();
            String sql ="select *from Mobile";
            ResultSet rs = stmt.executeQuery(sql);

            //step4: diasplay data from database
            System.out.println("Mobile Information");

            while (rs.next()){
//                System.out.println("##############################");
//                System.out.println("empID: "+rs.getInt(1));
//                System.out.println("name: "+rs.getInt(2));
//                System.out.println("position: "+rs.getInt(3));
//                System.out.println("salary: "+rs.getInt(4));
                Mobile emp = new Mobile(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4));
                        rs.getString(5);
                myEMP.add(emp);
            }
            //step5: Close Connection
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //D
        System.out.println("Data as object: ");
        for (Mobile e:myEMP) {
            System.out.println(e.toString());

        }




    }//main
}//class
