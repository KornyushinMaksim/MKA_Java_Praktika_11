import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //tsk1
        Tasks str1 = new Tasks();
        System.out.println("tsk1");
        System.out.println(str1.tsk1());

        //tsk2
//        Напишите метод, которыый принимает двачисла в качестве параметра и
//        отображает все чётные числа между ними.
        Tasks str2 = new Tasks();
        System.out.println("tsk2");
        System.out.println(str2.tsk2(1,20));

        //tsk3
//        напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
//        Метод принимает в качестве параметра: длину линии,
//        направление, символ.
        Tasks str3 = new Tasks();
        System.out.println("tsk3");
        System.out.println(str3.tsk3(5, 1, '*'));

        //tsk4
//        Напишите метод, который возвращает максимальное
//        из четырёх чисел.Числа передаются в качестве параметров.
        Tasks str4 = new Tasks();
        System.out.print("tsk4:\t");
        System.out.println(str4.tsk4(23,56,7,22));

        //tsk5
//        Напишите метод, который возвращает сумму чисел
//        в указанном диапазоне. Границы диапазона передаются
//        в качестве параметров.
        Tasks str5 = new Tasks();
        System.out.print("tsk5:\t");
        System.out.println(str5.tsk5(3,8));

        //tsk6
//        Напишите метод, который проверяет является ли число
//        простым. Число передаётся в качестве параметра. Если
//        число простое нужно вернуть из метода true, иначе false.
        Tasks str6 = new Tasks();
        System.out.print("tsk6:\t");
        System.out.println(str6.tsk6(11));

        //tsk7
//        Напишите метод, который проверяет является ли
//        шестизначное число «счастливым». Число передаётся
//        в качестве параметра. Если число счастлмвое нужно вернуть
//        из метода true, иначе false.
        Tasks str7 = new Tasks();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String a = in.nextLine();
        System.out.print("tsk7:\t");
        System.out.println(str7.tsk7(a));
    }
}
