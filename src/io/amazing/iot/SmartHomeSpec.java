package io.amazing.iot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartHomeSpec {
    @org.junit.Test
    public void turns_bulb_off_when_switch_is_off() {
        Switch offSwitch;
        BulbSpy bulb;

        offSwitch = () -> false;

        bulb = new BulbSpy();

        SmartHome smartHome = new SmartHome(offSwitch, bulb);
        smartHome.run();

        assertEquals(true, bulb.turnedOff);
    }

    @Test
    public void turns_bulb_on_when_switch_is_on() {
        Switch onSwitch;
        BulbSpy bulb;

        onSwitch = () -> true;

        bulb = new BulbSpy();

        SmartHome smartHome = new SmartHome(onSwitch, bulb);
        smartHome.run();

        assertEquals(true, bulb.turnedOn);
    }

    private class BulbSpy implements  Bulb {
        private boolean turnedOn;
        private boolean turnedOff;

        @Override
        public void turnOn() {
            this.turnedOn = true;
        }

        @Override
        public void turnOff() {
            this.turnedOff = true;
        }
    }
}
