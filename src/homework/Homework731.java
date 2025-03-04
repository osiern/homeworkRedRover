package homework;

public class Homework731 {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        int resultAdd = add(4, 5);
        int resultSub = sub(4, 5);
        int resultMul = mul(4, 5);
        int resultDiv = div(4, 5);
        System.out.println("Сложение: " + resultAdd);
        System.out.println("Вычитание: " + resultSub);
        System.out.println("Умножение: " + resultMul);
        System.out.println("Деление: " + resultDiv);
    }
}
