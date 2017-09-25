package com.petter.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author hongxf
 * @since 2017-09-20 9:55
 */
public class TestMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = TestClass.class;

        String testClassPac = "com.petter.reflect.TestClass";
        Class aClass = Class.forName(testClassPac);

        //获取类名
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());

        //获取修饰符
        int modifiers = aClass.getModifiers();
        boolean aPublic = Modifier.isPublic(modifiers);
        System.out.println(aPublic);

        //获取包信息
        Package aPackage = aClass.getPackage();
        System.out.println(aPackage.getName());

        //获取父类
        Class superclass = aClass.getSuperclass();
        System.out.println(superclass.getSimpleName());

        //获取实现的接口
        Class[] interfaces = aClass.getInterfaces();
        System.out.println(interfaces.length);

        //获取构造器（只能是public的）
        Constructor[] constructors = aClass.getConstructors();
        System.out.println(constructors.length);

        try {
            Constructor constructor = aClass.getConstructor(new Class[]{TestClass.class});
            System.out.println(constructor.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        //获取方法
        Method[] methods = aClass.getMethods();

        //获取成员变量(只能获取public的成员变量)
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println("field -- " + field.getName());
        }

        //获取注解
        Annotation[] annotations = aClass.getAnnotations();

    }
}
