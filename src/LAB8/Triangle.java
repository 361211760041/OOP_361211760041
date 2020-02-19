package LAB8;

public class Triangle extends GraphicObject {

    private  double base;
    private  double heifht;

    @Override
    public void findArea() {
        double area = 0.5*base*heifht;
        System.out.println("The area of Triangle:"+area);

    }
    //getter ang setter


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeifht() {
        return heifht;
    }

    public void setHeifht(double heifht) {
        this.heifht = heifht;
    }
}

