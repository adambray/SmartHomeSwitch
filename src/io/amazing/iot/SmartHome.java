package io.amazing.iot;

import com.hathaway.lighting.Bulb9000;
import com.lockheed.automation.Switch9000;

public class SmartHome {
    private Bulb9000 bulb;
    private Switch9000 mySwitch;

    public static void main(String args) {
        new SmartHome().run();
    }

    void run() {
        bulb = new Bulb9000();
        mySwitch = new Switch9000();

        while (true) {
            if (mySwitch.isOn()) {
                bulb.turnOn();
            } else {
                bulb.turnOff();
            }
        }
    }
}
