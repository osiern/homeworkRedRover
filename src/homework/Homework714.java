package homework;

/*
Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.


*/

public class Homework714 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double a = 0;

        for (int i = 0; i < array.length; i++) {
            a += array[i];
        }
        a = a / array.length;
        System.out.println(a);
    }
}
