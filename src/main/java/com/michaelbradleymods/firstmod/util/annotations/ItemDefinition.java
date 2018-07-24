package com.michaelbradleymods.firstmod.util.annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ItemDefinition
{
    boolean hasModel() default false;
}
