package com.hainet.spring.beans.sample.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InjectionTest {

    @Autowired
    private Components components;

    @Test
    public void injectionTest() {
        assertThat(
                components.getFieldInjection(),
                is(components.getConstructorInjection())
        );
        assertThat(
                components.getConstructorInjection(),
                is(components.getSetterInjection())
        );
        assertThat(
                components.getSetterInjection(),
                is(components.getFieldInjection())
        );
    }
}
