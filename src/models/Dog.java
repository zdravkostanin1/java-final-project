package models;

public class Dog extends Animal {
    private final String name;
    private final String favouriteFood;

    public Dog(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    @Override
    public String explainSelf() {
        return String.format("Bark, bark! I am a %s and my favourite food is %s", this.name, this.favouriteFood);
    }
}