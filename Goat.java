public class Goat implements Animal {
    private String sound = "Maaah";

    @Override
    public Animal clone() {
        return new Goat();
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Goat";
    }

    @Override
    public String getSound() {
        return sound;
    }
}
