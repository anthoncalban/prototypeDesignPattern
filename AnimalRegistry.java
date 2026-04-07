import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {
    private Map<String, Animal> prototypes = new HashMap<>();

    // Register a prototype at runtime
    public void addPrototype(String type, Animal prototype) {
        prototypes.put(type, prototype);
    }

    // Clone a registered prototype
    public Animal createAnimal(String type) {
        Animal prototype = prototypes.get(type);
        if (prototype != null) {
            return prototype.clone();
        }
        throw new IllegalArgumentException("No prototype registered for type: " + type);
    }
}
