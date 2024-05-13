package models;

public class Cat extends Animal {
    private final String name;
    private final String favouriteFood;

    public Cat(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    @Override
    public String explainSelf() {
        return String.format("Meow, meow! I am a %s and my favourite food is %s", this.name, this.favouriteFood);
    }
}