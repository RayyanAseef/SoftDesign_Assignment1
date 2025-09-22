package source;

public interface SmartDeviceFactory {
    public abstract SmartBulb createBulb();
    public abstract SmartLock createLock();
} 