package com.xworkz.Harshitha.JavaCode;
import com.xworkz.JavaProgram.RailwayStation;

public class Station {
    public static void main(String[] args) {
        System.out.println("This is a First Program in Intellij");
        MetroStation metroStation = new MetroStation("Jayadeva Hospital","jayadev Hospital","Mejestic");
        metroStation.info();
        RailwayStation railwayStation = new RailwayStation("Krantiveera Sangollirayanna Railway Station",100);
        railwayStation.stationInfo();

    }
}
