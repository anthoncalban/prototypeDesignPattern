public class Cow implements Animal {
    private String sound;

    public Cow(String sound) {
        this.sound = sound;
    }

    @Override
    public Animal clone() {
        return new Cow(this.sound);
    }

    @Override
    public String getType() {
        return "Cow makes sound " + sound;
    }

    @Override
    public String getDescription() {
        return "A large domesticated animal raised for milk and beef.";
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
