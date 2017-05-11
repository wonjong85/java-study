package main.java.ex.uml;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish eat pond scum.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish swim in their tanks all day.");
    }

    public void walk() {
        super.walk();
        System.out.println("Fish, of course, can't walk; they swim.");

    }

}
