public class Horse implements Animal {
    private String color;

    public Horse(String color) {
        this.color = color;
    }

    @Override
    public Animal clone() {
        return new Horse(this.color);
    }

    @Override
    public String getType() {
        return "Horse has color " + color;
    }

    @Override
    public String getDescription() {
        return "A strong animal often used for riding and farm work.";
    }

    public void setColor(String color) {
        this.color = color;
    }
}
