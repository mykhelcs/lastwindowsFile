package MultipleInheritance;

public class Dog implements Animal, Sound {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
