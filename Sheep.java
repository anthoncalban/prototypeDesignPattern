public class Sheep implements Animal {
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    @Override
    public Animal clone() {
        return new Sheep(this.name);
    }

    @Override
    public String getType() {
        return "Sheep name is " + name;
    }

    @Override
    public String getDescription() {
        return "A gentle farm animal with woolly fleece.";
    }

    public void setName(String name) {
        this.name = name;
    }
}
