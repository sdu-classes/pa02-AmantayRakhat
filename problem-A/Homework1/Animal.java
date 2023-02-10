package object.Homework1;



    public class Animal {
        public static void main(String[] args) {
        Animal animal=new Animal("Wolf");
        Mammal mammal=new Mammal("Panda");
        Cat cat=new Cat("Margau");
        Dog dog=new Dog("Mars");
        Dog dog2=new Dog("Kutzhol");
        cat.greets();
        System.out.println();
        dog.greets(dog2);
        System.out.println();
            System.out.println(animal);
            System.out.println(mammal);
            System.out.println(cat);
            System.out.println(dog);

    }
    String name;
        public Animal(){

        }
        public Animal(String name){
            this.name=name;
        }

        @Override
        public String toString(){
            return "Animal[name="+name+"]";

        }
    }
    class Mammal extends Animal{
        String name;
        public Mammal(String name){
            this.name=name;
        }
        public Mammal(){

        }

        @Override
        public String toString(){
            return "Mammal[Animal[name="+name+"]]";
        }
    }

    class Cat extends Mammal {
        public Cat(String name){

            this.name=name;
        }
        public void greets(){
            System.out.print("Meow");
        }
        @Override
        public String toString(){
            return "Cat[Mammal[Animal[name="+name+"]]]";
        }

    }
    class Dog extends Mammal{
        public Dog(String name){
            this.name=name;
        }
        public void greets(){
            System.out.print("Woof");
        }
        public void greets(Dog another){
            System.out.print("Woof");
        }
        @Override
        public String toString(){
            return "Dog[Mammal[Animal[name="+name+"]]]";
        }
    }


