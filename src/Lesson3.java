import java.util.*;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numIn = scanner.nextLine();

        String[] splitIn = numIn.split(" ");
        int num = Integer.parseInt(splitIn[1]);

        int outNum = sum(num, 0);
        splitIn[1] = outNum == 0 ? "zero" :
                outNum == 1 ? "one" :
                outNum == 2 ? "two" :
                outNum == 3 ? "three" :
                outNum == 4 ? "four" :
                outNum == 5 ? "five" :
                outNum == 6 ? "six" :
                outNum == 7 ? "seven" :
                outNum == 8 ? "eight" :
                outNum == 9 ? "nine" :
                outNum == 10 ? "ten": "bigger than ten";
        System.out.printf("Hello, %s! Sum of digits in a number = %s", splitIn[0], splitIn[1]);

    }

    public static int sum(int n, int sum) {
        sum += (n % 10);
        n = n / 10;
        if (n != 0)
            return sum(n, sum);
        return sum;
    }
}