package ru.geekbrains.home_work_lesson3;

class Cat extends Animal {

    Cat(String name, String color, int age, int dist, int swin, double jum){
        super(name, color, age, dist, swin, jum);
    }

    boolean move(int dist, int maxrun) {
        if (dist > maxrun) {
            System.out.println(name + " не может пробежать " + dist);
            return false;
        }
        System.out.println(name + " пробежит " + dist);
        return true;
    }
    boolean swig( int swin, int maxswin) {
        if (swin > maxswin) {
            System.out.println(name + " не умеет плавать");
            return false;
        }
        System.out.println(name + swin + " проплывет.");
        return true;
    }

    boolean jump(double jum, int maxjump) {
        if (jum > maxjump) {
            System.out.println(name + " так высоко не прыгает " + maxjump + " предел.");
            return false;
        }
        System.out.println(name + " " + jum + " перепрыгнет.");
        return true;


    }
}
