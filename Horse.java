public class Horse implements Animal {
    private String sound = "Neigh";
    private String color;

    public Horse() {}
    public Horse(String color) {
        this.color = color;
    }

    @Override
    public Animal clone() {
        return new Horse(this.color);
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    @Override
    public String getSound() {
        return sound;
    }
}
