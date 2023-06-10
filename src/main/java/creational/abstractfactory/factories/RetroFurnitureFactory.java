package creational.abstractfactory.factories;

import creational.abstractfactory.chair.ArmChair;
import creational.abstractfactory.chair.RetroArmChair;
import creational.abstractfactory.coffeetable.CoffeeTable;
import creational.abstractfactory.coffeetable.RetroCoffeeTable;
import creational.abstractfactory.sofa.RetroSofa;
import creational.abstractfactory.sofa.Sofa;

public class RetroFurnitureFactory implements FurnitureFactory {
    @Override
    public ArmChair makeArmChair() {
        return new RetroArmChair();
    }

    @Override
    public CoffeeTable makeCoffeeTable() {
        return new RetroCoffeeTable();
    }

    @Override
    public Sofa makeSofa() {
        return new RetroSofa();
    }
}
