
public class Inheritance {

    public static void main(String[] args) {
     Fish shark=new Fish();
     shark.eat();
     shark.breathe();
     shark.Swim();
     shark.fins = 2;
     System.out.println(shark.fins);
    }
}

class Animal {

    // String color;
    void eat() {
        System.out.println("Eats");
    }
    void breathe() {
        System.out.println("Breathe");
    }
}
// Derived class

class Fish extends Animal {
     int fins;
    void Swim() {
        System.out.println("Swims");
    }
}
