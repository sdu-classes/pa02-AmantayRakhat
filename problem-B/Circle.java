package object.Homework2;

public class Circle extends Shape{
    private double radius=1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
//        super(color,filled);
        this.setColor(color);
        this.setFilled(filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return (int)(Math.PI*100)/100.0*Math.pow(radius,2);

    }
    public double getPerimeter(){
        return 2*(int)(Math.PI*100)/100.0*radius;
    }
@Override
    public String toString(){
        return String.format("A Circle with radius=%s, which subclass of %s",this.radius,super.toString());
    }

}

