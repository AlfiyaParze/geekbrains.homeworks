package geekbrains_homeworks.Homework1;

import java.util.Scanner;

public class Homework1 {
//

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = (int) (Math.random() * (20 + 1) - 10);
        String name = "";
        System.out.println("Введите номер задания, которое будем проверять (от 1 до 8)");
        int i = scanner.nextInt();
        if (i == 1) {
            System.out.println("Если этот текст виден, проект создан и работает");
        } else if (i == 2) {
            zadanie2();
        } else if (i == 3) {
            zadanie3();
        } else if (i == 4) {
            zadanie4 ();
        } else if (i == 5) {
            zadanie5(a);
        } else if (i == 6) {
            zadanie6(a);
        } else if (i == 7){
            zadanie7(name);
        } else zadanie8();
    }

    public static void zadanie2 () {
        //Создание и инициализация переменных пройденных типов данных
        int a = 10;
        byte b = 2;
        short c = 5;
        char d = 'A';
        long l = (long) 40.7867;
        boolean isTrue = true;
        float f = 454.24525F;
        double dd = 789.390876;
        String s = "Hello world";
        System.out.println("Число byte: " + b);
        System.out.println("Число short: " + c);
        System.out.println("Число int: " + a);
        System.out.println("Число long: " + l);
        System.out.println("Число float: " + f);
        System.out.println("Число double: " + dd);
        System.out.println("Логическое значение Boolean: " + isTrue);
        System.out.println("Символ char: " + d);
        System.out.println("Строка String: " + s);

    }

    public static void zadanie3 (){
        //Создание метода, вычисляющего выражение a * (b + (c / d))
        float a, b, c, d, result;
//"случайно" создаем переменные
        a = (float) Math.random() * 10;
        b = (float) Math.random() * 10;
        c = (float) Math.random() * 10;
        d = (float) Math.random() * 10;
        result = a * (b + (c / d));
        System.out.println("Число a: " + a + "; Число b: " + b
                + "; Число c: " + c + "; Число d: " + d);
        System.out.println("Результат выражения  a * (b + (c / d)) равен: " + result);
    }

    public static void zadanie4 () {
/*
Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
        System.out.println("Проверим входит ли сумма 2х чисел в диапазон от 10 до 20:");
        System.out.println("Введите первое число");
        int a = scanner.nextInt(); //принимаем данные с консоли
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void zadanie5 (int a) {
/*
Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом.
 */
        if (a < 0){
            System.out.println("Число отрицательное: " + a);
        } else if (a >= 0) {
            System.out.println("Число положительное: " + a);
        }
    }

    public static void zadanie6 (int a) {
/*
Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 */
        boolean yes = true;
        if (a > 0) yes = true;
        else yes = false;
        System.out.println(yes);
    }

    public static void zadanie7 (String name) {
/*
Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
 */
        System.out.println("Введите ваше имя:");
        name = scanner.next();
        System.out.println("«Привет, " + name + "!»");
    }

    public static void zadanie8 () {
        /*
         *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
         */
        System.out.println("Введите год: ");
        int a = scanner.nextInt();
        if (a % 4 != 0) {
            System.out.println("Год не високосный");
        } else if (a % 100 != 0) {
            System.out.println("Год високосный");
        }  else if (a % 400 == 0) {
            System.out.println("Год високосный");
        }  else {
            System.out.println("Год не високосный");
        }
    }

//
}
