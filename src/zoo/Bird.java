package zoo;

abstract class Bird extends Animal implements Flyable {
    public Bird(String name, double age) {
        super(name, age);
    }
}
