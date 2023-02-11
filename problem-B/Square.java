package object.Homework2;

public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side){
        this.setSide(side);
    }
    @Override
    public void setWidth(double side){
        this.setWidth(side);
    }
    @Override
    public void setLength(double side) {
        this.setLength(side);
    }
    public String toString(){
        return String.format("A square with side=%s, which is a subclass of %s",this.getWidth(),super.toString());
    }
    }
