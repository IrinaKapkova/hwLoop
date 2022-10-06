public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №1");
        task1_1();
        task1_2();
        task1_3();
        task1_4();
        System.out.println("Домашнее задание №2");
        task2_1();
        task2_2();
        task2_3();
        System.out.println("Домашнее задание №3");
        task3_1();
        task3_2();
    }
//homework1
    public static void task1_1() {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task1_2() {
        System.out.println("Задание 2");
        for (int i = 10; i>= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task1_3() {
        System.out.println("Задание 3");
        for (int i = 0; i<= 17; i++) {
            if (i % 2==0) {
                System.out.println(i);
            }
        }
    }

    public static void task1_4() {
        System.out.println("Задание 4");
        for (int i = 10; i>= -10; i--) {
             System.out.println(i);
            }
        }
        //homework2
        public static void task2_1() {
            System.out.println("Задание 1");
            for (int i = 1904; i <= 2096; i++) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                    System.out.println(i + " год является високосным");
                }
            }
        }

    public static void task2_2() {
        System.out.println("Задание 2");
        for (int i = 7; i<=98; ) {
         System.out.println(i);
            i=i+7;
        }
    }

    public static void task2_3() {
        System.out.println("Задание 3");
        for (int i = 1; i<=512; ) {
            System.out.println(i);
            i=i*2;
        }
    }
    //homework3
    public static void task3_1() {
        System.out.println("Задание 1");
        int storage=0;
        for (int i = 1; i <= 12; i++) {
            storage=storage+29000;
            System.out.println("Месяц "+i + " сумма накоплений равна " + storage+" рублей");
            }
        }
    public static void task3_2() {
        System.out.println("Задание 2");
        int deposit=0;
        int interestRate = 12;
        for (int i = 1; i <= 12; i++) {
            deposit=deposit+29000+deposit/12*interestRate/100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + deposit+" рублей");
        }
    }

}