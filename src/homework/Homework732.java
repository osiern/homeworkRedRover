package homework;

public class Homework732 {
    public static String countingSheep(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += i + 1 + " sheep...";
        }
        return result;
    }

    public static void main(String[] args) {
        //   "1 sheep...2 sheep...3 sheep..."
        System.out.println(countingSheep(3));
    }
}
