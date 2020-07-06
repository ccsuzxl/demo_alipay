package com.example.demo.test;

import java.util.HashMap;
import java.util.Map;
/*
* 注册式单例管理类
* */
public class RegSingletonMap {
    public static final Map<String,Object> regMap = new HashMap<>();
    /*
    * 注册
    * */
    public static synchronized boolean registry(String className){
        if (isRegistried(className)){
            return true;
        }
        try {
            Object o = Class.forName(className).newInstance();
            regMap.put(className,o);
            return true;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static synchronized boolean registry(Class clazz){
        return registry(clazz.getName());
    }

    public static boolean isRegistried(String className){
        if (regMap.containsKey(className)){
            return true;
        }
        return false;
    }

    public static boolean isRegistried(Class clazz){
        return isRegistried(clazz.getName());
    }


}
