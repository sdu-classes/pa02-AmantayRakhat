package object.Homework1;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal("Wolf");
        System.out.println(animal);
        Mammal mammal=new Mammal("Panda");
        System.out.println(mammal);
        Cat cat=new Cat("Margau");
        System.out.println(cat);

        cat.greets();
        System.out.println();
        Dog dog=new Dog("Mars");
        System.out.println(dog);
        Dog dog2=new Dog("Kutzhol");
        dog.greets();
        System.out.println();
        dog.greets(dog2);


    }
}
