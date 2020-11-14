package ru.geekbrains.home_work_lesson3;

public abstract class Animal {

   protected String name;
    protected String color;
    protected int age;
    protected int dist;
    protected int swin;
    protected double jum;
    protected int maxrun;
    protected int maxjump;
    protected int maxswin;

    Animal (String name, String color, int age, int dist, int swin, double jum) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.dist = dist ;
        this.swin = swin ;
        this.jum = jum;
        this.maxrun = maxrun;
        this.maxjump = maxjump;
        this.maxswin = maxswin;
    }
    abstract boolean move(int dist, int maxrun);

    abstract boolean swig(int swin, int maxswin);

    abstract boolean jump(double jum, int maxjump);

}
