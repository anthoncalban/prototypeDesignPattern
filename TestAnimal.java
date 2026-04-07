public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // Register prototypes
        registry.addPrototype("Sheep", new Sheep("Default"));
        registry.addPrototype("Cow", new Cow());
        registry.addPrototype("Horse", new Horse("Brown"));
        registry.addPrototype("Goat", new Goat());

        // Create and display animals
        Animal dolly = registry.createAnimal("Sheep");
        System.out.println("Created: " + dolly.getType());
        dolly.makeSound();

        Animal bessie = registry.createAnimal("Cow");
        System.out.println("Created: " + bessie.getType());
        bessie.makeSound();

        Animal stallion = registry.createAnimal("Horse");
        System.out.println("Created: " + stallion.getType());
        stallion.makeSound();

        Animal billy = registry.createAnimal("Goat");
        System.out.println("Created: " + billy.getType());
        billy.makeSound();
    }
}
