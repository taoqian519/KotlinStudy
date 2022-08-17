package com.qiantao.kotlinstudy;

import com.qiantao.kotlinstudy.java.Person;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaTest {

    @Test
    public void testReflective() {
        Class<Person> cl1 = Person.class;

        Person person = null;
        try {
            Constructor<Person> constructor = cl1.getConstructor(long.class);
            person = constructor.newInstance(5);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        Field[] fields = cl1.getFields();//只包含私有成员
        Field[] fields1 = cl1.getDeclaredFields();
        for (Field field : fields1) {
            field.setAccessible(true);
            if ("id".equals(field.getName())) {
                try {
                    field.set(person,10);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

                try {
                    long id = (long) field.get(person);
                    System.out.println(id);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        Method[] declaredMethods = cl1.getDeclaredMethods();
        for (Method method : declaredMethods) {
            method.setAccessible(true);
            if ("doSomething".equals(method.getName())) {
            }
        }
    }
}
