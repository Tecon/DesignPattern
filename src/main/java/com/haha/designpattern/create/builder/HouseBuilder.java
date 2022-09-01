package com.haha.designpattern.create.builder;

/**
 * @author dongpo
 * @date 2022/8/15 12:38
 */
public interface HouseBuilder {

    HouseBuilder buildFloor();

    HouseBuilder buildWall();

    HouseBuilder buildRoof();

    House build();

}
