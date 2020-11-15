package ru.geekbrains.home_work_lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /*private static Scanner scanner = new Scanner(System.in);*/


    public static void main(String[] args) {
        Cat cat = new Cat("Маня", "Серо-белая", 4, 200,2,4 );
        Cat cat1 = new Cat("Багира", "Перламутр", 2, 450, 8,2);
        Dog dog = new Dog("Престиж", "Светлый", 3, 400,10,1 );
        Dog dog1 = new  Dog("Шарик", "Черный", 4,150,200,2);

        boolean a = dog.move(200, 400);
        System.out.println(a);
        boolean b = dog1.swig(200,50);
        System.out.println(b);
        boolean c = dog.jump(200,2);
        System.out.println(c);
        boolean d = cat.swig(150,5);
        System.out.println(d);
        boolean r = cat1.jump(50,10);
        System.out.println(r);
        boolean s = cat.move(200,400);
        System.out.println(s);
    }
}

        /*Random random = new Random();
        int size = random.nextInt(10);

        playGuessNumber(size);

    }

    private static void playGuessNumber(int number) {
        Random rand = new Random();

        int next = rand.nextInt(10);
        int score = 0;
        int restart;


        do {
            do {

                System.out.println("Угадайте число от 0 до 9. С трех попыток");
                score++;


                int input_number = scanner.nextInt();

                if (input_number == number) {
                    System.out.println("Вы угадали");
                    break;
                } else if (input_number > number) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }


            } while (score < 3);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            restart = scanner.nextInt();
            if (restart == 1) {
                playGuessNumber(next);
            }
        } while (restart == 1 && restart != 0);
        System.out.println("Использовано попыток: " + score);

    }
    /*static void testInt() {
        Scanner scanner = new Scanner(System.in);
        do {
            if (scanner.hasNextInt()) {
            scanner.nextInt();
            }
            System.out.println("Введите целое число");
            scanner.nextLine();
        }while (false);
        }*/



    /*class guessWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int d = random.nextInt(25);
        String word[] = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Угадайте загадное слово ");
        String user_tx = scan.nextLine();


        do {
            for (int i = d; i < word.length; i++) {
                if (user_tx.equals(word[d])) {
                    System.out.print("Вы угадали " + word[d]);
                    break;
                } else {
                    String str = word[d];
                    char s = str.charAt(0);
                    char f = str.charAt(1);
                    System.out.print(s);
                    System.out.println(f + "###############");
                }
            }
        } while (true);
    }//не смог сделать цикл
}*/
