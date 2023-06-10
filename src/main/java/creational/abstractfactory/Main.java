package creational.abstractfactory;

import creational.abstractfactory.chair.ArmChair;
import creational.abstractfactory.coffeetable.CoffeeTable;
import creational.abstractfactory.factories.AbstractFurnitureFactory;
import creational.abstractfactory.factories.FurnitureFactory;
import creational.abstractfactory.sofa.Sofa;

/**
 * Intent: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 * The example is just to demonstrate the use case of only Abstract Factory design pattern.
 * In real case the for example ClassicFurnitureFactory has its own factory implementation
 * on how to create the ArmChair, CoffeeTable and Sofa by using the Factory pattern.
 */
public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = AbstractFurnitureFactory.createFactory("modern");
        ArmChair modernArmchair = modernFactory.makeArmChair();
        CoffeeTable modernCoffeeTable = modernFactory.makeCoffeeTable();
        Sofa modernSofa = modernFactory.makeSofa();

        printColors(modernArmchair, modernCoffeeTable, modernSofa);

        FurnitureFactory classicFactory = AbstractFurnitureFactory.createFactory("classic");
        ArmChair classicArmChair = classicFactory.makeArmChair();
        CoffeeTable classicCoffeeTable = classicFactory.makeCoffeeTable();
        Sofa classicSofa = classicFactory.makeSofa();

        printColors(classicArmChair, classicCoffeeTable, classicSofa);

        FurnitureFactory retroFactory = AbstractFurnitureFactory.createFactory("retro");
        ArmChair retroArmchair = retroFactory.makeArmChair();
        CoffeeTable retroCoffeeTable = retroFactory.makeCoffeeTable();
        Sofa retroSofa = retroFactory.makeSofa();

        printColors(retroArmchair, retroCoffeeTable, retroSofa);

    }

    private static void printColors(ArmChair chair, CoffeeTable table, Sofa sofa) {
        System.out.println(chair.getColor());
        System.out.println(table.getColor());
        System.out.println(sofa.getColor());
        System.out.println("---------------------");
    }
}
