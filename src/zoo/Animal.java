package zoo;

interface Viviparous {}
interface Oviparous {}
interface Flyable {}

abstract class Animal {
    private String name;
    private double age;

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }
    public abstract void makeSound();

    public Animal(String name, double age) {
        this.name = name;
        this.age = age;
    }
}