import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Main obj = new Main();
        obj.task1();
        obj.task2();
        obj.task3();
        obj.task4();
        obj.task5();
        obj.task6();
        obj.task7();
        obj.task8();
        obj.task9();
        obj.task10();
    }


    public void task1() {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("1. Please input two integer number:");
        a = sc.nextInt();
        b = sc.nextInt();
        // 1.	Сумма двух чисел, введённых пользователем
        System.out.println(a + " + " + b + " = " + (a+b));
    }


    public void task2() {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("2. Please input two integer number:");
        a = sc.nextInt();
        b = sc.nextInt();
        // 2.	Произведение двух чисел, введённых пользователем
        System.out.println(a + " * " + b + " = " + (a*b));
    }


    public void task3() {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("3. Please input two integer number:");
        a = sc.nextInt();
        b = sc.nextInt();
        // 3.	Сравнение двух чисел, введённых пользователем
        if (a > b){
            System.out.println("a > b");
        }else if (a == b) {
            System.out.println("a = b");
        }else{
            System.out.println("a < b");
        }
    }


    public void task4() {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("4. Please input two integer number:");
        a = sc.nextInt();
        b = sc.nextInt();
        // 4.	Нахождение остатка от деления на число. Значение вводятся пользователем
        System.out.println(a + " % " + b + " = " + (a%b));
    }


    public void task5() {
        Scanner sc = new Scanner(System.in);
        // 5.	Вывести результат выражения x² + y - z:2
        int x;
        int y;
        int z;
        System.out.println("5. Please input three integer number:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        int tmp = x*x + y - z/2;
        System.out.println("x^2 + y - z/2: " + tmp);
    }


    public void task6() {
        Scanner sc = new Scanner(System.in);
        // 6.	Площадь квадрата. Сторона задаётся пользователем.
        int l;
        System.out.println("6. Please input one integer number:");
        l = sc.nextInt();
        System.out.println("s = l^2: " + (l*l));
    }


    public void task7() {
        Scanner sc = new Scanner(System.in);
        // 7.	Площадь круга. Радиус задаётся пользователем.
        int r;
        double s;
        System.out.println("7. Please input one integer number:");
        r = sc.nextInt();
        s = Math.PI * r * r;
        System.out.println("s = Math.PI * r^2: " + s);
    }


    public void task8() {
        Scanner sc = new Scanner(System.in);
        // 8.	Площадь цилиндра.
        int h;
        int r;
        double s;
        System.out.println("8. Please input two integer number:");
        r = sc.nextInt();
        h = sc.nextInt();
        s = 2 * Math.PI * r * h;
        System.out.println("S = 2 * Math.PI * r * h: " + s);
    }


    public void task9() {
        Scanner sc = new Scanner(System.in);
        // 9.	Решение квадратного уравнения через дискриминант.
        int a;
        int b;
        int c;
        System.out.println("9. Please input tree integer number:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int d = b * b - 4 * a * c;
        if (d<0){
            System.out.println("Корней нет");
        }else if (d == 0){
            System.out.println("x = " + ((-1 * b) / (2 * a)));
        }else{
            double x1 = (-1 * b + Math.sqrt(d)) / (2 * a);
            double x2 = (-1 * b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }


    public void task10() {
        Scanner sc = new Scanner(System.in);
        // 10.	Вывести результат выражения
        int x;
        int y;
        System.out.println("10. Please input two integer number:");
        x = sc.nextInt();
        y = sc.nextInt();
        double res = ((x - 2* y) * x)/(-2 * y);
        System.out.println(res);
    }
}