public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // Register prototypes
        registry.addPrototype("Sheep", new Sheep("Dolly"));
        registry.addPrototype("Cow", new Cow("Moo"));
        registry.addPrototype("Horse", new Horse("Brown"));
        registry.addPrototype("Goat", new Goat("Maaah"));

        // Print originals
        Animal sheep = registry.createAnimal("Sheep");
        System.out.println(sheep.getType());
        System.out.println("Description: " + sheep.getDescription());

        Animal cow = registry.createAnimal("Cow");
        System.out.println(cow.getType());
        System.out.println("Description: " + cow.getDescription());

        Animal horse = registry.createAnimal("Horse");
        System.out.println(horse.getType());
        System.out.println("Description: " + horse.getDescription());

        Animal goat = registry.createAnimal("Goat");
        System.out.println(goat.getType());
        System.out.println("Description: " + goat.getDescription());

        System.out.println("\nCloning animals...\n");

        // Clone and modify
        Sheep clonedSheep = (Sheep) sheep.clone();
        clonedSheep.setName("Shaun");

        Cow clonedCow = (Cow) cow.clone();
        clonedCow.setSound("Moo Moo");

        Horse clonedHorse = (Horse) horse.clone();
        clonedHorse.setColor("Black");

        Goat clonedGoat = (Goat) goat.clone();
        clonedGoat.setSound("Maaah Maaah");

        // Print clones
        System.out.println(clonedSheep.getType());
        System.out.println("Description: " + clonedSheep.getDescription());

        System.out.println(clonedCow.getType());
        System.out.println("Description: " + clonedCow.getDescription());

        System.out.println(clonedHorse.getType());
        System.out.println("Description: " + clonedHorse.getDescription());

        System.out.println(clonedGoat.getType());
        System.out.println("Description: " + clonedGoat.getDescription());
    }
}
