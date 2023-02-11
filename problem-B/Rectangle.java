package object.Homework2;

public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;
    public Rectangle(){

    }
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width=width;
        this.length=length;
        this.setColor(color);
        this.setFilled(filled);
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }
@Override
    public String toString(){
        return String.format("A Rectangle with width=%s" +
                        " and length=%s, which is " +
                        "subclass of %s",
                this.width,this.length,super.toString());
}

}
