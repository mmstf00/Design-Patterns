package creational.abstractfactory.factories;

import creational.abstractfactory.chair.ArmChair;
import creational.abstractfactory.coffeetable.CoffeeTable;
import creational.abstractfactory.sofa.Sofa;

/**
 * Each factory will return its furniture type implementation.
 */
public interface FurnitureFactory {
    ArmChair makeArmChair();

    CoffeeTable makeCoffeeTable();

    Sofa makeSofa();
}
