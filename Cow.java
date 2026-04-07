public class Cow implements Animal {
    private String sound = "Moo";

    @Override
    public Animal clone() {
        return new Cow();
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public String getSound() {
        return sound;
    }
}
