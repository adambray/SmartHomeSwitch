package io.amazing.iot;

import com.hathaway.lighting.Bulb9000;
import com.lockheed.automation.Switch9000;

public class App {
    public static void main(String args) {
        Switch9000Adapter switch9000Adapter = new Switch9000Adapter(new Switch9000());
        Bulb9000 bulb9000 = new Bulb9000();

        new SmartHome(switch9000Adapter, bulb9000).run();
    }
}
