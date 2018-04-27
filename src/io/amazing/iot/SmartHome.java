package io.amazing.iot;

public class SmartHome {
    private final Switch mySwitch;
    private final Bulb bulb;

    public SmartHome(Switch mySwitch, Bulb bulb) {
        this.mySwitch = mySwitch;
        this.bulb = bulb;
    }

    void run() {
        if (mySwitch.isOn()) {
            bulb.turnOn();
        } else {
            bulb.turnOff();
        }
    }
}
