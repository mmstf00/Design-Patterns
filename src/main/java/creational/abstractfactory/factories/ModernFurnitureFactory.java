package creational.abstractfactory.factories;

import creational.abstractfactory.chair.ArmChair;
import creational.abstractfactory.chair.ModernArmChair;
import creational.abstractfactory.coffeetable.CoffeeTable;
import creational.abstractfactory.coffeetable.ModernCoffeeTable;
import creational.abstractfactory.sofa.ModernSofa;
import creational.abstractfactory.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public ArmChair makeArmChair() {
        return new ModernArmChair();
    }

    @Override
    public CoffeeTable makeCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa makeSofa() {
        return new ModernSofa();
    }
}
