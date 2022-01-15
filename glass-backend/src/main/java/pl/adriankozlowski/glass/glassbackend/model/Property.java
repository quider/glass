package pl.adriankozlowski.glass.glassbackend.model;

public abstract class Property<T> {

    private String name;
    private T value;

    public abstract void onPropertyValueChange(T oldValue, T newValue);
}
