package io.amazing.iot;

import com.lockheed.automation.Switch9000;

public class Switch9000Adapter implements Switch {
    private final Switch9000 switch9000;

    public Switch9000Adapter(Switch9000 switch9000) {
        this.switch9000 = switch9000;
    }

    @Override
    public boolean isOn() {
        return switch9000.isOn();
    }
}
