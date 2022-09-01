package com.haha.designpattern.create.builder;

/**
 * @author dongpo
 * @date 2022/8/15 12:40
 */
public class WoodenHouseBuilder implements HouseBuilder {

    private House house;

    public WoodenHouseBuilder() {
        this.house = new House();
    }

    @Override
    public HouseBuilder buildFloor() {
        house.setFloor("wooden");
        return this;
    }

    @Override
    public HouseBuilder buildWall() {
        house.setWall("wooden");
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        house.setRoof("wooden");
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
