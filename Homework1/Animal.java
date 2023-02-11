package object.Homework1;



    public class Animal {
   private String name;
        public Animal(String name){
            this.name=name;
        }

        @Override
        public String toString(){
            return String.format("Animal[name=%s]",this.name);

        }
    }
    class Mammal extends Animal{
        public Mammal(String name){
            super(name);
        }

        @Override
        public String toString(){
            return String.format("Mammal[%s]", super.toString());
        }
    }

    class Cat extends Mammal {
        public Cat(String name){

            super(name);
        }
        public void greets(){
            System.out.print("Meow");
        }
        @Override
        public String toString(){
            return String.format("Cat[%s]", super.toString());
        }

    }
    class Dog extends Mammal{
        public Dog(String name){
            super(name);
        }
        public void greets(){
            System.out.print("Woof");
        }
        public void greets(Dog another){
            System.out.print("Woof");
        }
        @Override
        public String toString(){
            return String.format("Dog[%s]", super.toString());
        }
    }


