package source;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public abstract class SmartLock {
    public abstract String getFileName();

    public void setBatteryConsumption() {
        String fileName = getFileName();
        int batteryConcumption = 0;

        System.out.print("Accessing documents... ");

        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            if (lines.size() >= 2) {
                batteryConcumption = Integer.parseInt(lines.get(1).trim()); // index 1 = second line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Battery Consumption is " + batteryConcumption + "mAh");
    }
}