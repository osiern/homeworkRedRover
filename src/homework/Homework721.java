package homework;

/*
Вывести следующие строки с соответствующим форматированием (как пирамиды):

Задача №2

0  1  2  3  4  5  6  7  8  9
   0  1  2  3  4  5  6  7  8
      0  1  2  3  4  5  6  7
         0  1  2  3  4  5  6
            0  1  2  3  4  5
               0  1  2  3  4
                  0  1  2  3
                     0  1  2
                        0  1
                           0
*/


public class Homework721 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++ ) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}