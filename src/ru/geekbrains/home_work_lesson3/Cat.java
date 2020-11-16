package ru.geekbrains.home_work_lesson3;

class Cat extends Animal {

    Cat(String name, String color, int age, int dist, int swin, double jum, int maxrun, int maxswin, double maxjum){
        super(name, color, age, dist, swin, jum, maxrun, maxswin, (int) maxjum);
    }


    @Override
    boolean move(int dist) {
        if (dist > maxrun) {
            System.out.println(name+ " " +color+ " " +age + " не может пробежать " + dist);
            return false;
        }
        System.out.println(name+ " " +color+ " " +age + " пробежит " + dist);
        return true;
    }
    @Override
    boolean swig( int swin) {
        if (swin > maxswin) {
            System.out.println(name+ " " +color+ " " +age + " не умеет плавать");
            return false;
        }
        System.out.println(name+ " " +color+ " " +age + " " + swin + " проплывет.");
        return true;
    }
    @Override
    boolean jump(double jum) {
        if (jum > maxjump) {
            System.out.println(name+ " " +color+ " " +age + " так высоко не прыгает.");
            return false;
        }
        System.out.println(name+ " " +color+ " " +age + " " + jum + " перепрыгнет.");
        return true;

    }
    /*private boolean isAvailableAction(float required, float expected)
    {
        return required <= expected;
    }*/
}
