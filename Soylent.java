import java.util.Scanner;

public class Soylent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iterations = sc.nextInt();

        for (int i = 0; i < iterations; i++) {
            double input = sc.nextInt();
            double answer = input/400;
            System.out.println((int) Math.ceil(answer));
        }
    }
}
