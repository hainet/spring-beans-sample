package com.hainet.spring.beans.sample.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Components {

    // Field injection
    @Autowired
    private AutowiredComponent fieldInjection;

    public AutowiredComponent getFieldInjection() {
        return fieldInjection;
    }

    // Setter injection
    private AutowiredComponent setterInjection;

    @Autowired
    public void setSetterInjection(final AutowiredComponent autowiredComponent) {
        this.setterInjection = autowiredComponent;
    }

    public AutowiredComponent getSetterInjection() {
        return setterInjection;
    }

    // Constructor injection
    private final AutowiredComponent constructorInjection;

    @Autowired
    public Components(final AutowiredComponent autowiredComponent) {
        this.constructorInjection = autowiredComponent;
    }

    public AutowiredComponent getConstructorInjection() {
        return constructorInjection;
    }

    // Constructor injection (Omitted)
    // private final AutowiredConfig constructorInjectionOmitted;
}
