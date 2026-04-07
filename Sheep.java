public class Sheep implements Animal {
    private String sound = "Baaa";
    private String food = "Grass";
    private String name;

    public Sheep() {}
    public Sheep(String name) {
        this.name = name;
    }

    @Override
    public Animal clone() {
        return new Sheep(this.name);
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    @Override
    public String getSound() {
        return sound;
    }
}
