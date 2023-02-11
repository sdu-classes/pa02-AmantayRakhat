package object.Homework2;

public class Main {
    public static void main(String[] args) {
        Shape s1=new Shape();
        Shape s2=new Shape("blue",false);
        System.out.println(s2.getColor());
        System.out.println(s2.isFilled());
        s2.setColor("green");
        s2.setFilled(true);
        System.out.println(s1);
        System.out.println(s2);
        Circle c=new Circle(5.5, "red",false);
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c.getColor());
        System.out.println(c.isFilled());
        System.out.println(c.getRadius());



        Rectangle r=new Rectangle(3.8,2.5,"green",false);
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.getColor());
        System.out.println(r.getLength());


        Square s=new Square(6.6);
        System.out.println(s);
        System.out.println(s.getArea());
        System.out.println(s.getColor());
        System.out.println(s.getSide());

    }
}
