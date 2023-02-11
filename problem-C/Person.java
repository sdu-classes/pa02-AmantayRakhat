package object.Homework3;

public class Person {
    private String name;
    private String address;

    //-----------Constructor--------
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    //-------------Getter---------
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    //-------Setter----------
    public void setAddress(String address){
        this.address = address;
    }
    //----------ToString-----------
    @Override
    public String toString(){
        return "Person[name=" + this.name + ",address=" + this.address + "]";
    }
}

