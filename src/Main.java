import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    public static void task1() {
        System.out.println("Вам уже исполнилось 18 лет? (да/нет)");
        Scanner sc = new Scanner(System.in);
        String age = sc.nextLine();

        if(age.equals("да")) {
            System.out.println("Вы совершеннолетний");
        }
        else {
            System.out.println("Вы не достигли совершеннолетия, нужно немного подождать");
        }

    }
    public static void task2() {
        System.out.println("Сколько градусов тепла за окном?");
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();


        if(temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

    }
    public static void task3() {
        System.out.println("Задача 3");
        System.out.println("Введите скорость (км/ч)");
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();

        if(speed >= 60) {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");
        }
        else {
            System.out.println("Можно ездить спокойно");
        }


    }
    public static void task4() {
        System.out.println("Задача 4");
        System.out.println("Сколько человеку лет?");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean kindergarten = (age >= 2 && age <= 6);

        if(kindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if(age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен "  + age + ", то ему нужно ходить в школу");
        }
        else if(age > 18 && age < 24) {
            System.out.println("Если возраст человека равен "  + age + ", то его место в университете");
        }
        else if(age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
        else {
            System.out.println("Вы ввели некорректное значение. Пожалуйста, перезапустите программу");
        }
    }
    public static void task5() {
        System.out.println("Задача 6");
        System.out.println("Сколько ребенку лет?");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else if(age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else if(age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        else {
            System.out.println("Вы ввели некорректное значение. Пожалуйста, перезапустите программу");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        System.out.println("Как много мест в вагоне уже занято? (напишите только число)");
        int trainCapacity = 102;
        int seatsPerCar = 60;
        Scanner sc = new Scanner(System.in);
        int reservedSeats = sc.nextInt();

        if(reservedSeats >= seatsPerCar && reservedSeats <102) {
            System.out.println("В вагоне еще осталось стоячее место");
        }
        else if(reservedSeats < 60 && reservedSeats >= 0) {
            System.out.println("В вагоне еще осталось сидячее место");
        }
        else if(reservedSeats >= 102) {
            System.out.println("Вагон уже полностью забит");
        }
        else {
            System.out.println("Вы ввели некорректное значение. Пожалуйста, перезапустите программу");
        }

    }
    public static void task7() {
        System.out.println("Задача 7");
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if(number1 > number2 && number1 > number3) {
            System.out.println(number1 + " - самое большое число из трех");
        }
        else if(number2 > number1 && number2 > number3) {
            System.out.println(number2 + " - самое большое число из трех");
        }
        else if (number3 > number1 && number3 > number2) {
            System.out.println(number3 + " - самое большое число из трех");
        }
        else if(number1 == number2 && number2 == number3) {
            System.out.println("Числа равны");
        }
        else if(number1 == number2 && number1 > number3) {
            System.out.println(number1 + " и " + number2 + "равны и больше, чем " + number3);
        }
        else if(number1 == number2 && number1 < number3) {
            System.out.println(number3 + " самое больше число из трех");
        }
        else if(number2 == number3 && number3 > number1) {
            System.out.println(number2 + " и " + number3 + "равны и больше, чем " + number1);
        }
        else if(number1 == number3 && number1 > number2) {
            System.out.println(number1 + " и " + number3 + "равны и больше, чем " + number2);
        }
        else if(number1 == number3 && number1 < number3) {
            System.out.println(number3 + " самое больше число из трех");
        }
        else {
            System.out.println("Вы ввели неккоректное значение. Пожалуйста, перезапустите программу");
        }

    }
}