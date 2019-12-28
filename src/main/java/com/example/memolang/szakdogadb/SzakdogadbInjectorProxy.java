package com.example.memolang.szakdogadb;

import com.speedment.common.injector.InjectorProxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * The default {@link com.speedment.common.injector.InjectorProxy}
 * implementation class for the {@link com.speedment.runtime.config.Project}
 * named szakdogadb.
 * <p>
 * An InjectorProxy is used to reduce the required number of {@code exports} in
 * the module-info.java file for a Speedment project
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class SzakdogadbInjectorProxy implements InjectorProxy {
    
    @Override
    public boolean isApplicable(Class<?> clazz) {
        return InjectorProxy.samePackageOrBelow(SzakdogadbInjectorProxy.class).test(clazz);
    }
    
    @Override
    public void set(
            Field field,
            Object instance,
            Object value) throws IllegalAccessException {
        field.set(instance, value);
    }
    
    @Override
    public <T> T newInstance(Constructor<T> constructor, Object... args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        return constructor.newInstance(args);
    }
    
    @Override
    public Object invoke(
            Method method,
            Object obj,
            Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return method.invoke(obj, args);
    }
}