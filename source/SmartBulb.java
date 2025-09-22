package source;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public abstract class SmartBulb {
    public abstract String getFileName();

    public void setPowerUsage() {
        String fileName = getFileName();
        int powerUsage = 0;

        System.out.print("Accessing documents... ");

        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            if (lines.size() >= 1) {
                powerUsage = Integer.parseInt(lines.get(0).trim()); // index 1 = second line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Power Usage is " + powerUsage + "W");
    }
}