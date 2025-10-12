package ooppractice;

import ooppractice.model.Animal;
import ooppractice.model.Car;
import ooppractice.model.Cat;
import ooppractice.model.Circle;
import ooppractice.model.Dog;
import ooppractice.model.Person;
import ooppractice.model.Rectangle;
import ooppractice.model.Shape;
import ooppractice.util.MathUtils;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Pedro", 18);
        p1.sayHello();

        Car c1 = new Car("Toyota");
        c1.accelerate(50);
        c1.showSpeed();

        System.out.println("Square of 5: " + MathUtils.square(5));

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.makeSound();
        a2.makeSound();

        Shape s1 = new Circle(3);
        Shape s2 = new Rectangle(4, 6);
        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle area: " + s2.area());
    }
}
