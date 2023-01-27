import java.util.Scanner;

// Написать программу вычисления n-ого треугольного числа.

/**
 * Вычисление треугольного числа
 */
public class TriangleNumber {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String header = "Вычисление треугольного числа";
        for (int i = 0; i < header.length(); i++) {
            sb.append("-");
        }
        System.out.println(header + "\n" + sb);
        // System.out.println("Вычисление треугольного числа\n" +
        // "-----------------------------");
        int number = getIntFromTerm("Введите натуральное число: ");

        int triangleNum = getTriangleNumber(number);
        System.out.printf("Треугольное число для n = %d -> %d", number, triangleNum);
    }

    /**
     * Получает целое число int из терминала
     * 
     * @param prompt
     * @return
     */
    public static int getIntFromTerm(String prompt) {
        while (true) {
            System.out.printf(prompt);
            while (!sc.hasNextInt()) {
                System.out.printf(prompt);
                sc.next();
            }
            int number = sc.nextInt();
            if (number > 0) {
                return number;
            }
        }
    }

    /**
     * Вычисляет треугольное число
     * 
     * @param num
     * @return int
     */
    public static int getTriangleNumber(int num) {
        return num * (num + 1) / 2;
    }

}