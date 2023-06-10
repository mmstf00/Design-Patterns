package creational.abstractfactory.factories;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * The Factory of Factories known as the "Abstract Factory".
 */
public class AbstractFurnitureFactory {

    private AbstractFurnitureFactory() {
        throw new UnsupportedOperationException("Cannot create instance of utility class!");
    }

    private static final Map<String, Supplier<FurnitureFactory>> FURNITURE_FACTORIES = new HashMap<>();

    static {
        FURNITURE_FACTORIES.put("modern", ModernFurnitureFactory::new);
        FURNITURE_FACTORIES.put("classic", ClassicFurnitureFactory::new);
        FURNITURE_FACTORIES.put("retro", RetroFurnitureFactory::new);
    }

    public static FurnitureFactory createFactory(String factoryType) {

        // Null-check
        if (Objects.isNull(factoryType) || factoryType.isEmpty()) {
            throw new IllegalArgumentException("Please provide a factory type!");
        }

        // To prevent errors while creating with uppercase or etc.
        String lowercaseType = factoryType.toLowerCase();

        Supplier<FurnitureFactory> furnitureFactory = FURNITURE_FACTORIES.get(lowercaseType);

        // Checking if furniture factory exists
        if (furnitureFactory == null) {
            throw new IllegalArgumentException("Unknown factory type!");
        }

        return furnitureFactory.get();

//    This is a good example where the OCP (Open-Closed Principle) can be applied as above
//    If we want to add new factory we have to add new else-if case which is against OCP!
//        if (factoryType.equalsIgnoreCase("modern")) {
//            return new ModernFurnitureFactory();
//        } else if (factoryType.equalsIgnoreCase("classic")) {
//            return new ClassicFurnitureFactory();
//        } else if (factoryType.equalsIgnoreCase("retro")) {
//            return new RetroFurnitureFactory();
//        } else {
//            throw new IllegalArgumentException("Invalid type: " + factoryType);
//        }
    }
}
