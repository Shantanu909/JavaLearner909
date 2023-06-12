class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

class Labrador extends Dog {
    public Labrador(String name) {
        super(name);
    }

    public void playFetch() {
        System.out.println(name + " is playing fetch.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.eat();

        Dog dog = new Dog("Dog");
        dog.eat();
        dog.bark();

        Labrador labrador = new Labrador("Labrador");
        labrador.eat();
        labrador.bark();
        labrador.playFetch();

        Cat cat = new Cat("Cat");
        cat.eat();
        cat.meow();
    }
}
