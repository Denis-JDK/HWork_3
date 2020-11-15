package ru.geekbrains.home_work_lesson3;

class Cat extends Animal {

    Cat(String name, String color, int age, int dist, int swin, double jum){
        super(name, color, age, dist, swin, jum);
    }
    @Override
    boolean move(int dist, int maxrun) {
        if (dist > maxrun) {
            System.out.println(name + color + age + " не может пробежать " + dist);
            return false;
        }
        System.out.println(name + color + age + " пробежит " + dist);
        return true;
    }
    @Override
    boolean swig( int swin, int maxswin) {
        if (swin > maxswin) {
            System.out.println(name + color + age + " не умеет плавать");
            return false;
        }
        System.out.println(name + color + age + swin + " проплывет.");
        return true;
    }
    @Override
    boolean jump(double jum, int maxjump) {
        if (jum > maxjump) {
            System.out.println(name + color + age + " так высоко не прыгает " + maxjump + " предел.");
            return false;
        }
        System.out.println(name + color + age + " " + jum + " перепрыгнет.");
        return true;


    }
}
