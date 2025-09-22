package source;

public class BrandBFactory implements SmartDeviceFactory {
    public SmartBulb createBulb() { return new BrandBBulb(); }
    public SmartLock createLock() { return new BrandBLock(); }
}