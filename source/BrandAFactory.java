package source;

public class BrandAFactory implements SmartDeviceFactory {
    public SmartBulb createBulb() { return new BrandABulb(); }
    public SmartLock createLock() { return new BrandALock(); }
}