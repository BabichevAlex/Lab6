/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

/**
 *
 * @author 1710502
 */
public class ShipClass extends Ship {
    public ShipClass(String ShipModel, int Years, int Tonnajnist) {
        super(ShipModel, Years, Tonnajnist);
    }

    public static void main(String[] args)
    {   Ship ship1 = new Ship("Seniora",2015,145000);
        Ship ship2 = new Ship("Fuort", 2013, 20000);
        Ship ship3 = new Ship("Sunset", 2012, 25000);
        Ship ship4 = new Ship("Pollart",2014,90424);

        ship1.setTonnajnist(145000);
        ship1.setYear(2015);
        ship2.setTonnajnist(22000);
        ship2.setYear(2011);
        ship3.setTonnajnist(25000);
        ship3.setYear(2012);
        ship4.setName("Pollart");
        ship4.setTonnajnist(132400);
        ship4.setYear(2032);
        ship1.setZapashoduModel(300000);
        ship2.setZapashoduModel(3143161);
        ship3.setZapashoduModel(134135);
        ship4.setZapashoduModel(123413);
        ship1.setName("Seniora");
        ship2.setName("Fuort");
        ship3.setName("Sunset");

        System.out.println("This ship is " + ship1.getName() + ", year " + ship1.getYear() + ", tonnajnist " + ship1.getTonnajnistModel());
        System.out.println("This ship is " + ship2.getName() + ", year " + ship2.getYear() + ", tonnajnist " + ship2.getTonnajnistModel());
        System.out.println("This ship is " + ship3.getName() + ", year " + ship3.getYear() + ", tonnajnist " + ship3.getTonnajnistModel());
        System.out.println("This ship is " + ship4.getName() + ", year " + ship4.getYear() + ", tonnajnist " + ship4.getTonnajnistModel());

        System.out.println("The total ship zapashoduModel is: " + ship1.getZapashoduModel());
        System.out.println("The total ship zapashoduModel: " + ship2.getZapashoduModel());
        System.out.println("The total ship zapashoduModel: " + ship3.getZapashoduModel());
        System.out.println("The total ship zapashoduModel is: " + ship4.getZapashoduModel());

    }
}