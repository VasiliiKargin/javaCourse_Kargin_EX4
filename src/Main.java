import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[][] arr = new int[4][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Введи строку массива " + i + ", и столбца массива:" + j);
                arr[i][j] = scr.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) { //Задание 1
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Строка " + (i + 1) + ". Сумма: " + sum);
        }
        for (int i = 0; i < arr[i].length; i++) { //Задание 2
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println("Столбец " + (i + 1) + ". Сумма: " + sum);
        }
        for (int i = 0; i < arr.length; i++) { //Задание 4
            int sum = 0;
            int str = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                str = sum / arr[i].length;
            }
            System.out.println("Строка " + (i + 1) + ". Среднее арифметическое: " + str);
        }
        for (int i = 0; i < arr.length; i++) { //Задание 3
            for (int j = 0; j < arr[i].length; j++) {
                {
                    if (arr[i][j] % 2 == 0)
                        arr[i][j] = 0;
                    else
                        arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}