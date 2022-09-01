package com.haha.designpattern.create.builder;

/**
 * @author dongpo
 * @date 2022/8/15 12:47
 */
public class HouseBuildDirector {
    private HouseBuilder houseBuilder;

    public HouseBuildDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House construct(){
        return houseBuilder.buildFloor().buildWall().buildRoof().build();
    }
}
