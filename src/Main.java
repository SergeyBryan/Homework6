
public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //Задание 2
        System.out.println("Задание 2");
        for (int i1 = 10; i1 >= 0; i1--) {
            System.out.println(i1);
        }
        //Задание 3
        System.out.println("Задание 3");
        int sum = 0;
        for (int i4 = 2; sum <= 17; ) {
            sum = sum + i4;
            System.out.println(sum);
        }
        //Задание 4
        System.out.println("Задание 4");
        for (int i5 = 10; i5 >= -10; i5--) {
            System.out.println(i5);
        }
        //Задание 5
        System.out.println("Задание 5");
        for (int i6 = 1904; i6 <= 2096; i6 = i6 + 4) {
            System.out.println(i6);
        }
        //Задание 6
        System.out.println("Задание 6");
        for (int i7 = 7; i7 <= 98; i7 = i7 + 7) {
            System.out.println(i7);
        }
        //Задание 7
        System.out.println("Задание 7");
        for (int i8 = 1; i8 <= 512; i8 = i8 * 2) {
            System.out.println(i8);
        }
        //Задание 8
        System.out.println("Задание 8");
        int total = 0;
        int salary = 29000;
        for (int i9 = 1; i9 <= 12; i9++) {
            total += salary;
            System.out.println("Месяц " + i9 + " сумма накоплений равна " + total);
        }
        //Задание 9
        System.out.println("Задание 9");
        double total1 = 0;
        int salary1 = 29000;
        double bank = 0.01;
        for (int i10 = 1; i10 <= 12; i10++) {
            total1 = (total1 + salary1) * (1+bank);
            System.out.println("Месяц " + i10 + " сумма накоплений равна " + total1);
        }
    }
}