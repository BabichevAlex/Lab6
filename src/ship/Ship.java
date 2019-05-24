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
public class Ship {
    private int yearModel;
    private String name;
    private int tonnajnistModel;
    private int zapashoduModel;
    private int speed;

    public Ship(String n, int year, int tonnajnist, int zapashodu, int speed) {
        yearModel = year;
        name = n;
        tonnajnistModel = tonnajnist;
        zapashoduModel = zapashodu;


    }

    public Ship(String ShipModel, int Years, int Tonnajnist) {
    }

    public int getYear() {
        return yearModel;
    }

    public String getName() {
        return name;
    }

    public int getTonnajnistModel() {
        return tonnajnistModel;
    }

    public int getZapashoduModel() {
        return zapashoduModel;
    }

    public void setYear(int year) {
        yearModel = year;
    }

    public void setName(String shipName) {
        name = shipName;
    }

   // @SuppressWarnings("unused")
    public void setTonnajnist(int tonnajnist) {
        tonnajnistModel = tonnajnist;


    }
    public void setZapashoduModel(int zapashodu) {
        zapashoduModel = zapashodu;


    }
}
