import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {
    private Map<String, Animal> prototypes = new HashMap<>();

    public void addPrototype(String type, Animal prototype) {
        prototypes.put(type, prototype);
    }

    public Animal createAnimal(String type) {
        Animal prototype = prototypes.get(type);
        if (prototype != null) {
            return prototype.clone();
        }
        throw new IllegalArgumentException("No prototype registered for type: " + type);
    }
}
