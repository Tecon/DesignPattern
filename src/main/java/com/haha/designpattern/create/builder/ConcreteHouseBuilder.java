package com.haha.designpattern.create.builder;

/**
 * @author dongpo
 * @date 2022/8/15 12:42
 */
public class ConcreteHouseBuilder implements HouseBuilder {

    private House house;

    public ConcreteHouseBuilder() {
        house = new House();
    }


    @Override
    public HouseBuilder buildFloor() {
        house.setFloor("concrete");
        return this;
    }

    @Override
    public HouseBuilder buildWall() {
        house.setWall("concrete");
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        house.setRoof("concrete");
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
