package com.example.demo.test;
/*
* 注册式单例模式
* */
public class RegSingleTon {
    private double a;
    protected RegSingleTon(){
        this.a=Math.random();
    }
    public static RegSingleTon getInstance(){
        if (!RegSingletonMap.isRegistried(RegSingleTon.class)){
            RegSingletonMap.registry(RegSingleTon.class);
        }
        return (RegSingleTon) RegSingletonMap.regMap.get(RegSingleTon.class.getName());
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "RegSingleTon{" +
                "a=" + a +
                '}';
    }
}
