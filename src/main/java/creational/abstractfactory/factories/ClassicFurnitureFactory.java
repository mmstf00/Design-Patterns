package creational.abstractfactory.factories;

import creational.abstractfactory.chair.ArmChair;
import creational.abstractfactory.chair.ClassicArmChair;
import creational.abstractfactory.coffeetable.ClassicCoffeeTable;
import creational.abstractfactory.coffeetable.CoffeeTable;
import creational.abstractfactory.sofa.ClassicSofa;
import creational.abstractfactory.sofa.Sofa;

public class ClassicFurnitureFactory implements FurnitureFactory {

    @Override
    public ArmChair makeArmChair() {
        return new ClassicArmChair();
    }

    @Override
    public CoffeeTable makeCoffeeTable() {
        return new ClassicCoffeeTable();
    }

    @Override
    public Sofa makeSofa() {
        return new ClassicSofa();
    }
}
