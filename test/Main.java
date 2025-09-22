package test;
import source.SmartDeviceFactory;
import source.SmartBulb;
import source.SmartLock;

import source.BrandAFactory;
import source.BrandBFactory;

public class Main {
    public static void main(String[] args) {
        SmartDeviceFactory brandA = new BrandAFactory();
        SmartBulb bulbA = brandA.createBulb();
        bulbA.setPowerUsage();

        SmartDeviceFactory brandB = new BrandBFactory();
        SmartLock lockB = brandB.createLock();
        lockB.setBatteryConsumption();
    }
}