//public class ProstoClass {
//    public static void main(String[] args) {
//        double num_1 =  1.1f;
//        System.out.println(num_1);
//
////        char first_char = 'F';
////        int first_num = first_char + 1;
////        System.out.println(first_num);
////        System.out.println(first_char);
//    }
//}


//import java.util.Scanner;
//
//public class DisplayTime {
//    public static void main(String[] args) {
//        int seconds, minutes, remainingSeconds;
//
//        Scanner input = new Scanner(System.in);
//
//        // Получить общее время в секундах
//        System.out.print("Введите общее время в секундах: ");
//        seconds = input.nextInt();
//
//        // Вычислить врем®я в минутах
//        minutes = seconds / 60;
//
//        // Вычислить оставшееся кол-во секунд в минуте
//        remainingSeconds = seconds % 60;
//
//        // Отобразить время в минутах и оставшихся секундах
//        System.out.println(seconds + " сек. содержит " + minutes +
//                " мин. и " + remainingSeconds + " сек.");
//    }
//}

//import java.util.Scanner;
//
//public class InputData {
//    public static void main(String[] args) {
//        Scanner input = new Scanner()
//    }
//}


//преобразование типов

//public class Modul1 {
//    public static void main(String[] args) {
//        long aa = 1234567890;
//        float bb = (float) aa;
//        long cc = (long) bb;
//        System.out.println(aa);
//// вывод 1234567890
//
//        System.out.println(bb);
//// вывод 1.23456794E9
//
//        System.out.println(cc);
//// вывод 1234567936
//        double double_cc = (double) cc;
//        byte byte_cc = (byte) cc;
//        short short_cc = (short) cc;
//        short short_aa = (short) aa;
//        System.out.println("double_cc = " + double_cc);
//        System.out.println("byte_cc = " + byte_cc);
//        System.out.println("short_cc = " + short_cc);
//        System.out.println("short_aa = " + short_aa);
//    }
//}

//public class Modul1 {
//    public static void main(String[] args) {
//        int a = 6;
//        int b = a++;
//        System.out.println(a);
//        System.out.println(b);
//        a = 6;
//        b = ++a;
//        System.out.println(a);
//        System.out.println(b);
//    }
//}

//public class Modul1 {
//    public static void main(String[] args) {
//        int x = 10;
//        System.out.println(x>0);
//        boolean first = x>0;
//        System.out.println(first);
//    }
//}

//public class Modul1 {
//    public static void main(String[] args) {
//        System.out.println(56%6);
//        System.out.println(78%-4);
//        System.out.println(-34/5);
//        System.out.println(1%5);
//        System.out.println(2 * (5 / 2 + 5 / 2));
//        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
//        System.out.println(2 * (5 / 2));
//        System.out.println(2 * 5 / 2);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        char num1 = 'D';
//        System.out.println((int) (num1));
//        long num2 = 2147483647;
//        long result = num1 + num2 + 1;
////        int result = (int) (num1) + num2 + 1;
//        System.out.println("Result " + result);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//    byte a = 127;
//    byte b = 1;
//    byte c = a + b;
//        System.out.println(a+b);
////        System.out.println((byte) (a+b));
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        short a = 6400;
//        System.out.println(a);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        char firstChar = 128;
//        System.out.println(firstChar);
//        char secondChar = 'T';
//        System.out.println(secondChar);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        char firstChar = 'g';
//        int firstNum =  firstChar + 2;
//        System.out.println("first char is " + firstChar);
//        System.out.println("first number is " + firstNum);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        boolean isNurCold = true;
//        System.out.println(isNurCold);
//        boolean isCarFast = false;
//        System.out.println(isCarFast);
//        System.out.println(isCarFast);
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        int seconds, minutes, remainingSeconds;
//
//        Scanner input = new Scanner(System.in);
//
//        // Получить общее время в секундах
//        System.out.print("Введите общее время в секундах: ");
//        seconds = input.nextInt();
//
//        // Вычислить время в минутах
//        minutes = seconds / 60;
//
//        // Вычислить оставшееся кол-во секунд в минуте
//        remainingSeconds = seconds % 60;
//
//        // Отобразить время в минутах и оставшихся секундах
//        System.out.println(seconds + " сек. содержит " + minutes +
//                " мин. и " + remainingSeconds + " сек.");
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner input1 = new Scanner(System.in);
//
//        System.out.println("Input byte num");
//        byte byteNum = input1.nextByte();
//        System.out.println("byte num is " + byteNum);
//
//        System.out.println("Input float num");
//        float floatNum = input1.nextFloat();
//        System.out.println("float num is " + floatNum);
//
//        System.out.println("Input boolean value");
//        boolean boolValue =  input1.nextBoolean();
//        System.out.println("Boolean value is " + boolValue);
//
//
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        System.out.println(Math.pow(2, 3)); // Отображает 8.0
//        System.out.println(Math.pow(4, 0.5)); // Отображает 2.0
//        System.out.println(Math.pow(2.5, 2)); // Отображает 6.25
//        System.out.println(Math.pow(2.5, -2)); // Отображает 0.16
//    }
//
//}

//class Main {
//    public static void main(String[] args) {
//        int a = 8;
//        a += 8;
//        System.out.println(a);
//
//        a = 20;
//        a %= 3;
//        System.out.println(a);

//        int i = 2;
//        int b = ++i;
//        System.out.println(b);
//        System.out.println(i);

//        a = 3;
//        System.out.println(a>2);

//    }
//}

//class Main {
//    public static void main(String[] args) {
//        long a = 12345342;
//        double b = (double) a;
//        float c = (float) a;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int a = 6;
//        int b = a++;
//        System.out.println(a);
//        System.out.println(b);
//        a = 6;
//        b = ++a;
//        System.out.println(a);
//        System.out.println(b);
//    }
//}


//1.6 Классы
//class Dog {
//    String breed;
//    int age;
//
//    // Параметризованный конструктор
//    Dog(String breed, int age) {
//        this.breed = breed;
//        this.age = age;
//    }
//
//    void display() {
//        System.out.println("Breed: " + breed + ", Age: " + age);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Dog dog = new Dog("Labrador", 3);  // Создание объекта с параметризованным конструктором
//        dog.display();  // Вывод: Breed: Labrador, Age: 3
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        System.out.println(returnSum(20,20,"aaa"));
//    }
//    private static int returnSum(int a, int b, String c) {
//        return a+b;
//    }
//}

//Как легко генерировать методы в IDEA
//class Main {
//    public static void main(String[] args) {
//        printName();
//    }
//
//    private static void printName() {
//        System.out.println("Lenar");
//    }
//}

//Задание 1.7.4
//class Main {
//    public static void main(String[] args) {
//    build();
//    }
//    private static void build () {
//        System.out.println("You must build a new car");
//    }
//}

//Задание 1.7.5
//class Main {
//
//    private static void build(){
//        System.out.println("You must build a new car");
//    }
//
//    public static void main(String[] args) {
//        Main newCar = new Main();
//        newCar.build();
//    }
//}


//Задание 1.7.7
//class Main {
//    public static void main(String[] args) {
//        Car.build();
//        Car.buy();
//    }
//}

/*
dasfsafd
afsd
fad
 */

//public class Loader {
//    public static void main(String[] args) {
//        int value = add(3, 4);
//        int result = add(value, 10);
//        System.out.println(result);
//    }
//
//    public static int add(int x, int y) {
//        int result = x + y;return result;
//    }
//}



//2.1 Модуль 2. Основные синтаксические конструкции и операторы.
//public class Main {
//    public static final double a = 3.1d;
//
//    public static void main(String[] args) {
//        a = 3;
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 25;
//        int c = 0;
//        System.out.println(a + b * 10 >= 255 && 4 << 1 <= 14) ;
//        System.out.println(4 << 1);
//    }
//
//}

//2.3 Условия
//class Main {
//    public static final int a = 40;
//    public static int b = 0;
//    public static void main(String[] args) {
//        if (10>5) {
//            System.out.println("True");
//        }

//        if (1>20) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//        if (a > 20) {
//            System.out.println(20);
//        } else if (a > 10) {
//            System.out.println(10);
//        } else if (a > 5) {
//            System.out.println(5);
//        }
//        if (a > 10) {
//            if (b > 10) {
//                System.out.println("a and b > 10");
//            } else {
//                System.out.println("a > 10");
//            }
//        }
//    }
//}

//class Main {
//    static int a = 3;
//    public static void main(String[] args) {
//        switch (a) {
//            case 5:
//                System.out.println("Отлично");
//                break;
//            case 4:
//                System.out.println("хорошо");
//                break;
//            default:
//                System.out.println("Incorrect value");
//        }
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner input =  new Scanner(System.in);
//        System.out.println("Input t");
//        int t = input.nextInt();
//
//        if (t > 15) {
//            if (t > 35) {
//                System.out.println("Stay at home");
//            } else {
//                System.out.println("put on summer clothes");
//            }
//        } else {
//            if (t < -15) {
//                System.out.println("put on winter clothes");
//            } else {
//                System.out.println("put on warmer");
//            }
//        }
//
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        boolean deadline;
//        int t;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter deadline (true or false)");
//        deadline = input.nextBoolean();
//
//        System.out.println("Enter t");
//        t = input.nextInt();
//
//        if (t > 15 && deadline == false) {
//            System.out.println("go out");
//        } else {
//            System.out.println("stay at home");
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int a = 0;
//        String answer = (a == 0) ? "yes" : "no";
//        System.out.println(answer);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i<10; i++) {
//            System.out.println(i);
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 100; i+=10) {
//            System.out.println(i);
//            if (i == 80) {
//                break;
//            }
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 100; i+=10) {
//            if (i == 50) {
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 20;
//        } while (i < 100);
//    }
//}

//import javax.swing.*;
//import java.awt.desktop.SystemEventListener;
//import java.util.Scanner;
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        float a;
//        Scanner input = new Scanner(System.in);
//
//        do {
//            System.out.println("Input value from 1 to 5");
//            a = input.nextFloat();
//        } while (a < 1 || a > 5);
//        System.out.println("You entered eight number");
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        // Отобразить название таблицы
//        System.out.println("\t\t\t\tТАБЛИЦА УМНОЖЕНИЯ\n");
//
//        // Отобразить имена столбцов
//        for (int j = 1; j <= 9; j++)
//            System.out.print("\t" + j);
//
//        System.out.println("\n\t_\t_\t_\t_\t_\t_\t_\t_\t_");
//
//        // Отобразить имена строк и произведение
//        for (int i = 1; i <= 9; i++) {
//            System.out.print(i + "   |");
//            for (int j = 1; j <= 9; j++) {
//                System.out.printf("\t" + i * j);
//            }
//            System.out.println();
//        }
//    }
//}


//Задание 2.5.1
/* Исправьте ошибки в следующей программе таким образом, чтобы она отображала числа, кратные 5, от 0 до 100 включительно.
Также улучшите удобочитаемость программы, используя стиль программирования.
 */
//public class Main {
//    public static void main(String[] args) {
//        int mult;
//        for (mult = 0; mult <= 100; mult += 5) {
//            System.out.println(mult);
//        }
//    }
//}

//Задание 2.5.2
/*Напишите вложенные циклы, которые отображают следующие выходные данные:
 */
//class Main {
//    public static void main(String[] args) {
//        int i, j;
//        for (i = 1; i <= 6; ++i) {
//            for (j = 0; j < i; ++j) {
//                System.out.print("  " + j);
//            }
//            System.out.println();
//        }
//
//        for (i = 6; i >= 1; i--) {
//            for (j = 0; j < i; j++) {
//                System.out.print("  " + j);
//            }
//            System.out.println();
//        }
//    }
//}

//Задание 2.5.3
//Перепишите следующее предложение с помощью условного оператора.
//class Main {
//    public static void main(String[] args) {
//        int ages = 0;
//        int ticketPrice;
//        if (ages >= 16) {
//            ticketPrice = 20;
//        } else {
//            ticketPrice = 10;
//        }
//        System.out.println(ticketPrice);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int ticketPrice, ages = 5;
//        ticketPrice = (ages >= 16) ? 20 : 10;
//        System.out.println(ticketPrice);
//    }
//}

//Задание 2.5.4
//Напишите программу, которая определяет, является ли введенный год високосным или нет.
//// Високосный год, кратный 4
//isLeapYear = (year % 4 == 0);
//// Високосный год, кратный 4, но не кратный 100
//isLeapYear = isLeapYear && (year % 100 != 0);
//// Високосный год, кратный 4, но не кратный 100, или кратный 400
//isLeapYear = isLeapYear || (year % 400 == 0);
//class Main {
//    public static void main(String[] args) {
//        int year = 2023;
//        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        System.out.println(isLeapYear);
//    }
//}

//Задание 2.5.5
/*Напишите программу которая считывает символ + и = в char и выводит сообщение на экран,
в зависимости от ввода: “Считан плюс” или “Считано равно”.
 */
//class Main {
//    public static void main(String[] args) {
//        char symbol;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter symbol");
//        symbol = input.next().charAt(0);
//        if (symbol == '+') {
//            System.out.println("Считан плюс");
//        } else if (symbol == '=') {
//            System.out.println("Считано равно");
//        } else {
//            System.out.println("Введен некорректный символ");
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        char symbol;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter symbol");
//        symbol = input.next().charAt(0);
//        if (symbol == '+') {
//            System.out.println("Считан плюс");
//        } else if (symbol == '=') {
//            System.out.println("считано равно");
//        }
//    }
//}

//Задание 2.5.7
/*Напишите логическое выражение, которое равно true, если число, сохраненное в переменной num,
находится в диапазоне от 1 до 100 не включительно или если число является отрицательным.
 */
//class Main {
//    public static void main(String[] args) {
//        float num = -1;
//        boolean isTrue = ((num > 0 && num < 100) && (num > 0));
//        System.out.println(isTrue);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        boolean exp;
//        float num;
//        num = 99;
//        exp = (num > 1 && num < 100) || (num < 0);
//        System.out.println(exp);
//    }
//}

//Задание 2.5.8
//Перепишите следующий код с использованием тернарного оператора:
//public class Main {
//
//    public static void main(String args[]) {
//        int variable = 0;
//        variable = variable > 10 ? variable - 10 : variable + 30;
////        if (variable > 10) {
////            variable = variable - 10;
////        } else {
////            variable = variable + 10;
////        }
//        System.out.println(variable);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int variable = 11;
//        variable = (variable > 10) ? variable - 10 : variable + 10;
//        System.out.println(variable);
//    }
//}

//Задание 2.5.9
/*Как запрограммировать светофор? Выполнением действия при определенном условии будет являться вывод на экран:
остановиться (при красном сигнале светофора);
ехать (при зеленом сигнале);
подождать (при желтом сигнале).
 */

//class Main {
//    public static void main(String[] args) {
//        String color = "green";
//        if (color == "red") {
//            System.out.println("stop");
//        } else if (color == "yellow") {
//            System.out.println("wait");
//        } else if (color == "green") {
//            System.out.println("go");
//        } else {
//            System.out.println("incorrect");
//        }
//    }
//}


/*Задание 2.5.10
С помощью оператора switch реализуйте метод «дешифратор»,
используя программу IntelliJ IDEA.
 */
//public class Main {
//
//    public static void main(String[] args) {
//            char ch1 = 'h';
//        char ch2 = 'i';
//        char ch3 = 'b';
//
//        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
//    }
//
//    public static String decode(char ch) {
//
//        //Писать код здесь
//
//        switch (ch1)
//    }
//}

//Задание 2.5.11
//        Создайте цикл, выводящий на экран чётные цифры из диапазона от 2 до 10 включительно.
//class Main {
//    public static void main(String[] args) {
//        int i;
//        for (i = 2; i <= 10; i += 2) {
//            System.out.println(i);
//        }
//    }
//}

//Задание 2.5.12
//Необходимо вычислить индекс массы тела человека. Указать на проблему, если индекс показал критическое значение,
//вывести сообщение о проблеме (если таковая имеется). Самостоятельно найдите формулу расчета и реализуйте алгоритм
//с использованием изученного ранее материала.
//class Main {
//    public static void main(String[] args) {
//        float massKg = 50;
//        float heighMeter = 1.82f;
//        float index = massKg / (heighMeter*heighMeter);
//        if (index < 18) {
//            System.out.println("low mass");
//        } else if (index > 30) {
//            System.out.println("high mass");
//        } else {
//            System.out.println("norm");
//        }
//    }
//}

//Задание 2.5.14


import com.sun.source.tree.IfTree;

import java.util.Arrays;
import java.util.Scanner;

//Модуль 3
//Размер массива менять нельзя
//public class Main {
//    public static void main(String[] args) {
//        int[] array = new int[5]; // Создаем массив из 5 элементов
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        System.out.println(Arrays.toString(array)); // Выводим содержимое массива
//        // Попытка изменить размер массива приведет к ошибке компиляции
//         array.length = 7;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        int[] nums = new int[10];
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String [] newArray = new String[5];
//        newArray[0] = "asdfa";
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println(newArray[i]);
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        boolean[] newArray = new boolean[5];
//        newArray[1] = true;
//
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println(newArray[i]);
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int[] nums = new int[4];
//        nums[0] = 1;
//
//        for (int i = 0; i <= nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int[] array1 = {1,2,3,4};
//        System.out.println(array1.length);
//        int[] array2 = Arrays.copyOf(array1, 4);
//        System.out.println(Arrays.toString(array2));
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int[] array1 = {1,2,3,4};
//        int[] array2 = Arrays.copyOfRange(array1,1,4);
//        System.out.println(Arrays.toString(array2));
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int[] array1 = {1234,123,65,3425235,32};
//        Arrays.sort(array1);
//        System.out.println(Arrays.sort(array1));
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String text;
//        Scanner inputText = new Scanner(System.in);
//        System.out.println("Enter text");
//        text = inputText.nextLine();
//        System.out.println(text);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String text1, text2, text3;
//        Scanner input_text = new Scanner(System.in);
//        System.out.println("Enter three words through space");
//        text1 = input_text.next();
//        text2 = input_text.next();
//        text3 = input_text.next();
//        System.out.println(text1 + " " + text2 + " " + text3);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String text1;
//        System.out.println("Enter one line");
//        Scanner inputText = new Scanner(System.in);
//        text1 = inputText.nextLine();
//        System.out.println(text1);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String text1 = "Hello my friend";
//        System.out.println(text1.substring(0,6) + "Vasya");
//    }
//}


//class Main {
//    public static void main(String[] args) {
//        String text1 = "adsfjsakdfashf";
//        System.out.println(text1.length());
//        System.out.println("adsfasdfasfhsafdhasddfsdaf".length());
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String text1 = "asdfasdf";
//        System.out.println(text1.charAt(2));
//        System.out.println("Hello".concat(" sadfds"));
//        System.out.println("Hello".equals("hello"));
//        System.out.println("Hello".equalsIgnoreCase("hello"));
//        System.out.println("Hellllo".indexOf("l"));
//        System.out.println("Hellllo".indexOf("lo"));
//        System.out.println("string length is " + "Hellllo".length());
//        System.out.println("Hellllo".replace("ll", "r"));
//        System.out.println("Hellllo".replaceAll("ll", "r"));
//        System.out.println("Hellllo".replaceFirst("ll", "r"));
//        System.out.println(Arrays.toString("Adam, Ed, Tot".split(",")));
//        System.out.println("Hellllo".substring(3,5));
//        System.out.println("Hellllo".substring(2));
//        System.out.println("HellLotasdfT".toLowerCase());
//        System.out.println("HellLotasdfT".toUpperCase());
//        System.out.println("  sdaffdsa   sadfsaf   ".trim());
//        System.out.println(String.valueOf(5) + 50);
//
//
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        System.out.println("3124" + 100);
//        System.out.println(Integer.parseInt("3124") + 100);
//        System.out.println(Double.parseDouble("422423.2342") + 100);
//
//        System.out.println(Integer.parseInt("a12313123"));
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        System.out.println("asdfsafdsfs".indexOf("sd"));
//        System.out.println("asdfsafdsfs".indexOf("11"));
//        System.out.println("asdfsafdsfsdf".indexOf("sd", 4));
//        System.out.println("ttasfdfsadtt".lastIndexOf("tt"));
//        System.out.println("attasfdfsadtt".lastIndexOf("tt", 5));
//
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String str = "Sometimes";
//        System.out.println(str.charAt(2));
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String a = "123";
//        String b = "123";
//        String c = "12";
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(c.hashCode());
//        System.out.println();
//
//        Main main1 = new Main();
//        Main main2 = new Main();
//        System.out.println(main1.hashCode());
//        System.out.println(main2.hashCode());
//        System.out.println();
//
//        Main main3 = new Main();
//        Main main4 = main3;
//        System.out.println(main3.hashCode());
//        System.out.println(main4.hashCode());
//
//    }
//}


//class Main {
//    public static void main(String[] args) {
//        String name = "Lenar";
//        int age = 26;
//        String profession = "geologist";
//
//        String text1 = "Меня зовут " + name + ", мне " + age + " лет, моя профессия " + profession;
//        System.out.println(text1);
//
//        String text2 = String.format("Меня зовут %s, мне %d лет, моя профессия %s", name, age, profession);
//        System.out.println(text2);
//
//        System.out.printf("Меня зовут %s, мне %d лет, моя профессия %s", name, age, profession);
//    }
//}


//class Main {
//    public static void main(String[] args) {
//        String s1 = new String("Строка тоже объект");  // Создается новая строка
//        String s2 = "Строка тоже объект";              // Ссылается на строку в пуле строк
//        String s3 = "Строка тоже объект";              // Ссылается на ту же строку, что и s2
//        String s4 = s1;                                // s4 ссылается на ту же строку, что и s1
//        String s5 = new String(s1);                    // Создается копия строки s1
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());
//        System.out.println(s5.hashCode());
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String s1 = "Hello";
//        String s2 = "Hello";
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//
//        System.out.println(s1 == s2);
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String s1 = "Hello";
//        String s2 = new String("Hello");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String s1 = "Hello";
//        String s2 = "hello";
//        System.out.println("equalsIgnoreCare " + s1.equalsIgnoreCase(s2));
//        s2 = "hello hello";
//        System.out.println(s2.compareTo(s1));
//        System.out.println(s2.compareToIgnoreCase(s1));
//        System.out.println(s1.startsWith("He"));
//        System.out.println(s1.endsWith("Lo"));
//        System.out.println(s1.endsWith("lo"));
//        s2 = "Hello hello";
//        System.out.println("s2 contains s1 " + s2.contains(s1));
//    }
//}

//class Main {
//    static String mulString(String p, int n) {
//        String result = "";
//        for (int i = 0; i < n; i++) {
//            result += p;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(mulString("A", 100));
//    }
//}


//Задание 3.3.2
//Можно ли пользователю выбрать себе имя "Иван Иванов", если уже есть другой пользователь с именем "иван иванов", считая, что регистр важен для вашей системы?
//
//        Напишите код, который сравнивает эти имена и выводит результат сравнения.

//class Main {
//    public static void main(String[] args) {
//        String name1 = "Иван Иванов";
//        String name2 = "иван иванов";
//        if (name1.equalsIgnoreCase(name2)) {
//            System.out.println("Выберите дургое имя пользователя");
//        } else {
//            System.out.println("Отличное имя!");
//        }
//    }
//}

//Задание 3.3.5
//Измените код из предыдущего задания так, чтобы вся проверка имени была выделена в отдельный метод с именем, например checkUserName().

//class Main {
//    static String checkUserName(String name11, String name22) {
//        String output;
//        if (name11.equalsIgnoreCase(name22)) {
//            output = "Выберите дургое имя пользователя";
//        } else {
//            output = "Отличное имя!";
//        }
//        return output;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(checkUserName("Leanar", "Lenar"));
//    }
//
//}


//Задание 3.3.6
//Измените код из предыдущего задания так, чтобы в случае, если имя пользователя уникальное, пользователю также сообщалось бы "Ваше имя имеет длину <длина имени> символов", где вместо <длина имени> стоит соответствующее число. Проверьте, что ваша программа работает корректно, заменив имя "Иван" на другое, например "Вова". В задании используйте методы из таблицы выше.

//class Main {
//    static String checkUserName(String name11, String name22) {
//        String output;
//        int nameLength;
//        if (name11.equalsIgnoreCase(name22)) {
//            output = "Выберите дургое имя пользователя";
//        } else {
//            output = "Отличное имя!";
//            nameLength = name22.length();
//            output = output + " Ваше имя имеет длину " + nameLength + " символов.";
//        }
//        return output;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(checkUserName("Leanar", "Lenar"));
//    }
//
//}

//Задание 3.3.7
//Измените код из предыдущего задания так, чтобы после надписи о длине имени добавлялось замечание "А без пробелов ваше имя занимает <число> символов". Организуйте код таким образом, чтобы даже если имя состоит из трех слов, программа работала корректно. В задании используйте методы из таблицы выше.
//class Main {
//    static String checkUserName(String name11, String name22) {
//        String output;
//        int nameLength;
//        int nameLengthWithoutSpace;
//        if (name11.equalsIgnoreCase(name22)) {
//            output = "Выберите дургое имя пользователя";
//        } else {
//            output = "Отличное имя!";
//            nameLength = name22.length();
//            output = output + " Ваше имя имеет длину " + nameLength + " символов.";
//            nameLengthWithoutSpace = name22.replace(" ", "").length();
//            output += " А без пробелов ваше имя длину " + nameLengthWithoutSpace + " символов.";
//        }
//        return output;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(checkUserName("Leanar", "Lenar asdfasdfs ads"));
//    }
//
//}

//class Main {
//    public static void main(String[] args) {
//        int[] sourceArray = {1,2,33,44};
//        int[] targetArray = new int[sourceArray.length];
//        for (int i = 0; i < sourceArray.length; i++) {
//            targetArray[i] = sourceArray[i];
//        }
//        System.out.println(Arrays.toString(targetArray));
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int[] sourceArray = {1,2,33,55};
//        int[] targetArray = new int[sourceArray.length];
//        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
//        System.out.println(Arrays.toString(sourceArray));
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        double[] myArray = new double[10];
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter n values");
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = input.nextDouble();
//        }
//        System.out.println(Arrays.toString(myArray));
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int[] myArray = {1,2,3,4,5};
//        int total = 0;
//        for (int i = 0; i < myArray.length; i++) {
//            total += myArray[i];
//        }
//        System.out.println(total);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        double[] myArray = {1.2,2.3,2,15};
//        double max = myArray[0];
//        for (int i = 1; i < myArray.length; i++) {
//            if (max < myArray[i]) {
//                max = myArray[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int[] myArray = {1,2,3,4};
//        for (int i = 1; i < myArray.length; i++) {
//            myArray[i - 1] = myArray[i];
//        }
//        myArray[myArray.length-1] = myArray[0];
//        System.out.println(Arrays.toString(myArray));
//    }
//}

//Задание 3.2.1
//        Напишите программу, в которой будет массив, заполненный элементами от 5 до 15, и напечатайте все элементы массива.

//class Main {
//    public static void main(String[] args) {
////        int[] myArray = {5,6,7,8,9,10,11,12,13,14,15};
//        int[] myArray = new int[11];
//        int value = 5;
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = value + i;
//        }
//
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
//        System.out.println(Arrays.toString(myArray));
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int[] myArray = {1,2,3,4,5};
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.print(myArray[i] + " ");
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int[] myArray = {6, 3, 3, 3, 7, 1, 6};
//        int index = 0;
//        int max = myArray[0];
//        for (int i = 0; i < myArray.length; i++) {
//            if (max < myArray[i]) {
//                max = myArray[i];
//                index = i;
//            }
//        }
//        System.out.println(max);
//        System.out.println(index);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        double[] myList = {6, 3, 3, 3, 7, 1, 6};
//        double max = myList[0];
//        int indexOfMax = 0;
//        for (int i = 1; i < myList.length; i++) {
//            if (myList[i] > max) {
//                max = myList[i];
//                indexOfMax = i;
//            }
//        }
//        System.out.println(max);
//        System.out.println(indexOfMax);
//    }
//}
//3.4.1
//class Main {
//    public static void main(String[] args) {
//        int[] list = {1, 2, 3, 5, 4};
//        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
//// Переставить list[i] и list[j]
//            int temp = list[i];
//            list[i] = list[j];
//            list[j] = temp;
//        }
//        System.out.println(Arrays.toString(list));
//    }
//}


//3.4.2
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
//    }
//
//    private static String removeWhiteSpaces(String str) {
//
//        return str.replaceAll(" ", "");
//    }
//}

//3.4.3
//class Main {
//    public static void main(String[] args) {
//        int[] myArray = {5, 24, 3, 66, 38, 16, 27};
//        Arrays.sort(myArray);
//        System.out.println(Arrays.toString(myArray));
//        System.out.println(myArray[2]);
//    }
//}

//3.4.4
class Main {
    public static void main(String[] args) {
        String login = "lenar";
        String password  = "12345678";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password, length from 8 to 15 symbols");
        String inputPassword = input.nextLine();

        if (inputPassword.equals(password)) {
            System.out.println(login + " " + password);
        } else {
            System.out.println("Incorrect password");
        }
//        if ((password.length() < 8 || password.length() > 15) || )
    }
}