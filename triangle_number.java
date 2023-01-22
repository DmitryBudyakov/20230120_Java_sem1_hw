import java.util.Scanner;

// Написать программу вычисления n-ого треугольного числа.

/**
 * Вычисление треугольного числа
 */
public class triangle_number {
public static void main(String[] args) {
    System.out.println("Вычисление треугольного числа\n" +
                        "-----------------------------");
    int number = getIntFromTerm("Введите натуральное число: ");

    int triangle_num = getTriangleNumber(number);
    System.out.printf("Треугольное число для n = %d -> %d", number, triangle_num);
}

/**
 * Получает целое число int из терминала
 * @param prompt
 * @return
 */
public static int getIntFromTerm(String prompt) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf(prompt);
    int number = iScanner.nextInt();
    iScanner.close();
    return number;
}

/**
 * Вычисляет треугольное число
 * @param num
 * @return int
 */
public static int getTriangleNumber(int num) {
    int triangle_num = num * (num + 1) / 2;
    return triangle_num;
}


}