public class Goat implements Animal {
    private String sound;

    public Goat(String sound) {
        this.sound = sound;
    }

    @Override
    public Animal clone() {
        return new Goat(this.sound);
    }

    @Override
    public String getType() {
        return "Goat makes sound " + sound;
    }

    @Override
    public String getDescription() {
        return "A hardy farm animal known for climbing and eating grass.";
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
