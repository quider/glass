package pl.adriankozlowski.glass.glassbackend.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public abstract class Device<T> {
    private String name;
    private T value;


    public abstract void onValueChange(T oldValue, T newValue);
}
