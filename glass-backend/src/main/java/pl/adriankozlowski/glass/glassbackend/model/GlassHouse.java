package pl.adriankozlowski.glass.glassbackend.model;

import java.util.List;

public class GlassHouse {
    private List<Device> devices;
    private List<Property> properties;

    public GlassHouse(List<Device> devices) {
        this.devices = devices;
    }

}
