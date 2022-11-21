import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 20;
        int b = 30;
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " * " + b + " = " + (a*b));

        int c = 40;
        System.out.println("(" + a + " + " + b + ") * " + c + " = " + ((a+b)*c));
        System.out.println(a + " + " + b + " * " + c + " = " + (a+b*c));

        if (a > b){
            System.out.println("a > b");
        }else if (a == b) {
            System.out.println("a = b");
        }else{
            System.out.println("a < b");
        }

        // Practice task 7
        Scanner sc = new Scanner(System.in);
        int a1;
        int b1;
        System.out.println("Please input two integer number:");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        // 1.	Сумма двух чисел, введённых пользователем
        System.out.println(a1 + " + " + b1 + " = " + (a1+b1));

        // 2.	Произведение двух чисел, введённых пользователем
        System.out.println(a1 + " * " + b1 + " = " + (a1*b1));

        // 3.	Сравнение двух чисел, введённых пользователем
        if (a1 > b1){
            System.out.println("a > b");
        }else if (a1 == b1) {
            System.out.println("a = b");
        }else{
            System.out.println("a < b");
        }

        // 4.	Нахождение остатка от деления на число. Значение вводятся пользователем
        System.out.println(a1 + " % " + b1 + " = " + (a1%b1));

        // 5.	Вывести результат выражения x² + y - z:2
        int x;
        int y;
        int z;
        System.out.println("Please input three integer number:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        int tmp = x*x + y - z/2;
        System.out.println("x^2 + y - z/2: " + tmp);

        // 6.	Площадь квадрата. Сторона задаётся пользователем.
        int l;
        System.out.println("Please input one integer number:");
        l = sc.nextInt();
        System.out.println("s = l^2: " + (l*l));

        // 7.	Площадь круга. Радиус задаётся пользователем.
        int r;
        double s;
        System.out.println("Please input one integer number:");
        r = sc.nextInt();
        s = 3.14f * r * r;
        System.out.println("s = Math.PI * r^2: " + s);

        // 8.	Площадь цилиндра.
        int h;
        System.out.println("Please input two integer number:");
        r = sc.nextInt();
        h = sc.nextInt();
        s = 2 * Math.PI * r * h;
        System.out.println("S = 2 * Math.PI * r * h: " + s);

        // 9.	Решение квадратного уравнения через дискриминант.
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

        // 10.	Вывести результат выражения
        System.out.println("10. Please input two integer number:");
        x = sc.nextInt();
        y = sc.nextInt();
        double res = ((x - 2* y) * x)/(-2 * y);
        System.out.println(res);
    }
}